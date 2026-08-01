package G1;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import q.AbstractC0309e;

/* loaded from: classes.dex */
public final class z implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f469f = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final M1.o f470a;

    /* renamed from: b, reason: collision with root package name */
    public final M1.f f471b;

    /* renamed from: c, reason: collision with root package name */
    public int f472c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final C0004e f473e;

    public z(M1.o oVar) {
        k1.e.e(oVar, "sink");
        this.f470a = oVar;
        M1.f fVar = new M1.f();
        this.f471b = fVar;
        this.f472c = 16384;
        this.f473e = new C0004e(fVar);
    }

    public final synchronized void a(D d) {
        try {
            k1.e.e(d, "peerSettings");
            if (this.d) {
                throw new IOException("closed");
            }
            int i = this.f472c;
            int i2 = d.f363a;
            if ((i2 & 32) != 0) {
                i = d.f364b[5];
            }
            this.f472c = i;
            if (((i2 & 2) != 0 ? d.f364b[1] : -1) != -1) {
                C0004e c0004e = this.f473e;
                int i3 = (i2 & 2) != 0 ? d.f364b[1] : -1;
                c0004e.getClass();
                int min = Math.min(i3, 16384);
                int i4 = c0004e.f381e;
                if (i4 != min) {
                    if (min < i4) {
                        c0004e.f380c = Math.min(c0004e.f380c, min);
                    }
                    c0004e.d = true;
                    c0004e.f381e = min;
                    int i5 = c0004e.i;
                    if (min < i5) {
                        if (min == 0) {
                            C0002c[] c0002cArr = c0004e.f382f;
                            Y0.i.l0(c0002cArr, 0, c0002cArr.length);
                            c0004e.f383g = c0004e.f382f.length - 1;
                            c0004e.h = 0;
                            c0004e.i = 0;
                        } else {
                            c0004e.a(i5 - min);
                        }
                    }
                }
            }
            j(0, 0, 4, 1);
            this.f470a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d = true;
        this.f470a.close();
    }

    public final synchronized void d(boolean z2, int i, M1.f fVar, int i2) {
        if (this.d) {
            throw new IOException("closed");
        }
        j(i, i2, 0, z2 ? 1 : 0);
        if (i2 > 0) {
            k1.e.b(fVar);
            this.f470a.i(fVar, i2);
        }
    }

    public final synchronized void flush() {
        if (this.d) {
            throw new IOException("closed");
        }
        this.f470a.flush();
    }

    public final void j(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = f469f;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(false, i, i2, i3, i4));
        }
        if (i2 > this.f472c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f472c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(AbstractC0001b.f("reserved bit set: ", i).toString());
        }
        byte[] bArr = A1.c.f13a;
        M1.o oVar = this.f470a;
        k1.e.e(oVar, "<this>");
        oVar.d((i2 >>> 16) & 255);
        oVar.d((i2 >>> 8) & 255);
        oVar.d(i2 & 255);
        oVar.d(i3 & 255);
        oVar.d(i4 & 255);
        oVar.j(i & Integer.MAX_VALUE);
    }

    public final synchronized void k(int i, int i2, byte[] bArr) {
        AbstractC0001b.j("errorCode", i2);
        if (this.d) {
            throw new IOException("closed");
        }
        if (AbstractC0309e.a(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        j(0, bArr.length + 8, 7, 0);
        this.f470a.j(i);
        this.f470a.j(AbstractC0309e.a(i2));
        if (bArr.length != 0) {
            M1.o oVar = this.f470a;
            if (oVar.f816c) {
                throw new IllegalStateException("closed");
            }
            oVar.f815b.x(0, bArr.length, bArr);
            oVar.a();
        }
        this.f470a.flush();
    }

    public final synchronized void p(boolean z2, int i, ArrayList arrayList) {
        if (this.d) {
            throw new IOException("closed");
        }
        this.f473e.d(arrayList);
        long j2 = this.f471b.f799b;
        long min = Math.min(this.f472c, j2);
        int i2 = j2 == min ? 4 : 0;
        if (z2) {
            i2 |= 1;
        }
        j(i, (int) min, 1, i2);
        this.f470a.i(this.f471b, min);
        if (j2 > min) {
            long j3 = j2 - min;
            while (j3 > 0) {
                long min2 = Math.min(this.f472c, j3);
                j3 -= min2;
                j(i, (int) min2, 9, j3 == 0 ? 4 : 0);
                this.f470a.i(this.f471b, min2);
            }
        }
    }

    public final synchronized void r(int i, int i2, boolean z2) {
        if (this.d) {
            throw new IOException("closed");
        }
        j(0, 8, 6, z2 ? 1 : 0);
        this.f470a.j(i);
        this.f470a.j(i2);
        this.f470a.flush();
    }

    public final synchronized void s(int i, int i2) {
        AbstractC0001b.j("errorCode", i2);
        if (this.d) {
            throw new IOException("closed");
        }
        if (AbstractC0309e.a(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        j(i, 4, 3, 0);
        this.f470a.j(AbstractC0309e.a(i2));
        this.f470a.flush();
    }

    public final synchronized void t(int i, long j2) {
        if (this.d) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
        j(i, 4, 8, 0);
        this.f470a.j((int) j2);
        this.f470a.flush();
    }
}
