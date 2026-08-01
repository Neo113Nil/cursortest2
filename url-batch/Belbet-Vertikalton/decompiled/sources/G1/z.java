package G1;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import s.AbstractC0380e;

/* loaded from: classes.dex */
public final class z implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f454f = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final M1.o f455a;

    /* renamed from: b, reason: collision with root package name */
    public final M1.f f456b;

    /* renamed from: c, reason: collision with root package name */
    public int f457c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f458d;
    public final C0004e e;

    public z(M1.o oVar) {
        j1.h.e(oVar, "sink");
        this.f455a = oVar;
        M1.f fVar = new M1.f();
        this.f456b = fVar;
        this.f457c = 16384;
        this.e = new C0004e(fVar);
    }

    public final synchronized void B(boolean z2, int i, ArrayList arrayList) {
        if (this.f458d) {
            throw new IOException("closed");
        }
        this.e.d(arrayList);
        long j = this.f456b.f827b;
        long min = Math.min(this.f457c, j);
        int i2 = j == min ? 4 : 0;
        if (z2) {
            i2 |= 1;
        }
        q(i, (int) min, 1, i2);
        this.f455a.n(this.f456b, min);
        if (j > min) {
            long j2 = j - min;
            while (j2 > 0) {
                long min2 = Math.min(this.f457c, j2);
                j2 -= min2;
                q(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                this.f455a.n(this.f456b, min2);
            }
        }
    }

    public final synchronized void D(int i, int i2, boolean z2) {
        if (this.f458d) {
            throw new IOException("closed");
        }
        q(0, 8, 6, z2 ? 1 : 0);
        this.f455a.q(i);
        this.f455a.q(i2);
        this.f455a.flush();
    }

    public final synchronized void E(int i, int i2) {
        AbstractC0001b.j("errorCode", i2);
        if (this.f458d) {
            throw new IOException("closed");
        }
        if (AbstractC0380e.a(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        q(i, 4, 3, 0);
        this.f455a.q(AbstractC0380e.a(i2));
        this.f455a.flush();
    }

    public final synchronized void F(int i, long j) {
        if (this.f458d) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        q(i, 4, 8, 0);
        this.f455a.q((int) j);
        this.f455a.flush();
    }

    public final synchronized void a(D d2) {
        try {
            j1.h.e(d2, "peerSettings");
            if (this.f458d) {
                throw new IOException("closed");
            }
            int i = this.f457c;
            int i2 = d2.f345a;
            if ((i2 & 32) != 0) {
                i = d2.f346b[5];
            }
            this.f457c = i;
            if (((i2 & 2) != 0 ? d2.f346b[1] : -1) != -1) {
                C0004e c0004e = this.e;
                int i3 = (i2 & 2) != 0 ? d2.f346b[1] : -1;
                c0004e.getClass();
                int min = Math.min(i3, 16384);
                int i4 = c0004e.e;
                if (i4 != min) {
                    if (min < i4) {
                        c0004e.f363c = Math.min(c0004e.f363c, min);
                    }
                    c0004e.f364d = true;
                    c0004e.e = min;
                    int i5 = c0004e.i;
                    if (min < i5) {
                        if (min == 0) {
                            C0002c[] c0002cArr = c0004e.f365f;
                            X0.j.o0(c0002cArr, 0, c0002cArr.length);
                            c0004e.f366g = c0004e.f365f.length - 1;
                            c0004e.f367h = 0;
                            c0004e.i = 0;
                        } else {
                            c0004e.a(i5 - min);
                        }
                    }
                }
            }
            q(0, 0, 4, 1);
            this.f455a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f458d = true;
        this.f455a.close();
    }

    public final synchronized void d(boolean z2, int i, M1.f fVar, int i2) {
        if (this.f458d) {
            throw new IOException("closed");
        }
        q(i, i2, 0, z2 ? 1 : 0);
        if (i2 > 0) {
            j1.h.b(fVar);
            this.f455a.n(fVar, i2);
        }
    }

    public final synchronized void flush() {
        if (this.f458d) {
            throw new IOException("closed");
        }
        this.f455a.flush();
    }

    public final void q(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = f454f;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(false, i, i2, i3, i4));
        }
        if (i2 > this.f457c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f457c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(AbstractC0001b.e("reserved bit set: ", i).toString());
        }
        byte[] bArr = A1.c.f19a;
        M1.o oVar = this.f455a;
        j1.h.e(oVar, "<this>");
        oVar.d((i2 >>> 16) & 255);
        oVar.d((i2 >>> 8) & 255);
        oVar.d(i2 & 255);
        oVar.d(i3 & 255);
        oVar.d(i4 & 255);
        oVar.q(i & Integer.MAX_VALUE);
    }

    public final synchronized void z(int i, int i2, byte[] bArr) {
        AbstractC0001b.j("errorCode", i2);
        if (this.f458d) {
            throw new IOException("closed");
        }
        if (AbstractC0380e.a(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        q(0, bArr.length + 8, 7, 0);
        this.f455a.q(i);
        this.f455a.q(AbstractC0380e.a(i2));
        if (bArr.length != 0) {
            M1.o oVar = this.f455a;
            if (oVar.f845c) {
                throw new IllegalStateException("closed");
            }
            oVar.f844b.J(0, bArr.length, bArr);
            oVar.a();
        }
        this.f455a.flush();
    }
}
