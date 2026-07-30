package com.anythink.core.common.n.b.a.e;

import com.anythink.basead.exoplayer.k.p;
import com.anythink.core.common.n.b.a.e.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class j implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f15470b = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final d.b f15471a;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.n.c.d f15472c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15473d;

    /* renamed from: e, reason: collision with root package name */
    private final com.anythink.core.common.n.c.c f15474e;

    /* renamed from: f, reason: collision with root package name */
    private int f15475f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15476g;

    public j(com.anythink.core.common.n.c.d dVar, boolean z8) {
        this.f15472c = dVar;
        this.f15473d = z8;
        com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
        this.f15474e = cVar;
        this.f15471a = new d.b(cVar);
        this.f15475f = 16384;
    }

    public final synchronized void a() {
        try {
            if (this.f15476g) {
                throw new IOException("closed");
            }
            if (this.f15473d) {
                Logger logger = f15470b;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(com.anythink.core.common.n.b.a.c.a(">> CONNECTION %s", e.f15319a.g()));
                }
                this.f15472c.d(e.f15319a.k());
                this.f15472c.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        if (this.f15476g) {
            throw new IOException("closed");
        }
        this.f15472c.flush();
    }

    public final int c() {
        return this.f15475f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f15476g = true;
        this.f15472c.close();
    }

    public final synchronized void b(m mVar) {
        try {
            if (!this.f15476g) {
                int i = 0;
                a(0, mVar.b() * 6, (byte) 4, (byte) 0);
                while (i < 10) {
                    if (mVar.a(i)) {
                        this.f15472c.k(i == 4 ? 3 : i == 7 ? 4 : i);
                        this.f15472c.i(mVar.b(i));
                    }
                    i++;
                }
                this.f15472c.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(m mVar) {
        try {
            if (!this.f15476g) {
                this.f15475f = mVar.c(this.f15475f);
                if (mVar.c() != -1) {
                    this.f15471a.a(mVar.c());
                }
                a(0, 0, (byte) 4, (byte) 1);
                this.f15472c.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void b(int i, long j9) {
        while (j9 > 0) {
            int min = (int) Math.min(this.f15475f, j9);
            long j10 = min;
            j9 -= j10;
            a(i, min, (byte) 9, j9 == 0 ? (byte) 4 : (byte) 0);
            this.f15472c.a(this.f15474e, j10);
        }
    }

    public final synchronized void a(int i, int i4, List<c> list) {
        if (!this.f15476g) {
            this.f15471a.a(list);
            long b9 = this.f15474e.b();
            int min = (int) Math.min(this.f15475f - 4, b9);
            long j9 = min;
            a(i, min + 4, (byte) 5, b9 == j9 ? (byte) 4 : (byte) 0);
            this.f15472c.i(i4 & Integer.MAX_VALUE);
            this.f15472c.a(this.f15474e, j9);
            if (b9 > j9) {
                b(i, b9 - j9);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i, b bVar) {
        if (!this.f15476g) {
            if (bVar.f15280l != -1) {
                a(i, 4, (byte) 3, (byte) 0);
                this.f15472c.i(bVar.f15280l);
                this.f15472c.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(boolean z8, int i, com.anythink.core.common.n.c.c cVar, int i4) {
        if (!this.f15476g) {
            a(i, i4, (byte) 0, z8 ? (byte) 1 : (byte) 0);
            if (i4 > 0) {
                this.f15472c.a(cVar, i4);
            }
        } else {
            throw new IOException("closed");
        }
    }

    private void a(int i, byte b9, com.anythink.core.common.n.c.c cVar, int i4) {
        a(i, i4, (byte) 0, b9);
        if (i4 > 0) {
            this.f15472c.a(cVar, i4);
        }
    }

    public final synchronized void a(boolean z8, int i, int i4) {
        if (!this.f15476g) {
            a(0, 8, (byte) 6, z8 ? (byte) 1 : (byte) 0);
            this.f15472c.i(i);
            this.f15472c.i(i4);
            this.f15472c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i, b bVar, byte[] bArr) {
        try {
            if (!this.f15476g) {
                if (bVar.f15280l != -1) {
                    a(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f15472c.i(i);
                    this.f15472c.i(bVar.f15280l);
                    if (bArr.length > 0) {
                        this.f15472c.d(bArr);
                    }
                    this.f15472c.flush();
                } else {
                    throw e.a("errorCode.httpCode == -1", new Object[0]);
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(int i, long j9) {
        if (this.f15476g) {
            throw new IOException("closed");
        }
        if (j9 != 0 && j9 <= 2147483647L) {
            a(i, 4, (byte) 8, (byte) 0);
            this.f15472c.i((int) j9);
            this.f15472c.flush();
        } else {
            throw e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j9));
        }
    }

    private void a(int i, int i4, byte b9, byte b10) {
        Logger logger = f15470b;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.a(false, i, i4, b9, b10));
        }
        int i9 = this.f15475f;
        if (i4 > i9) {
            throw e.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i9), Integer.valueOf(i4));
        }
        if ((Integer.MIN_VALUE & i) == 0) {
            a(this.f15472c, i4);
            this.f15472c.l(b9 & 255);
            this.f15472c.l(b10 & 255);
            this.f15472c.i(i & Integer.MAX_VALUE);
            return;
        }
        throw e.a("reserved bit set: %s", Integer.valueOf(i));
    }

    private static void a(com.anythink.core.common.n.c.d dVar, int i) {
        dVar.l((i >>> 16) & p.f8630b);
        dVar.l((i >>> 8) & p.f8630b);
        dVar.l(i & p.f8630b);
    }

    public final synchronized void a(boolean z8, int i, List<c> list) {
        if (!this.f15476g) {
            this.f15471a.a(list);
            long b9 = this.f15474e.b();
            int min = (int) Math.min(this.f15475f, b9);
            long j9 = min;
            byte b10 = b9 == j9 ? (byte) 4 : (byte) 0;
            if (z8) {
                b10 = (byte) (b10 | 1);
            }
            a(i, min, (byte) 1, b10);
            this.f15472c.a(this.f15474e, j9);
            if (b9 > j9) {
                b(i, b9 - j9);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
