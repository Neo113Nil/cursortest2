package t1;

import X.V;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import q.AbstractC0288e;

/* loaded from: classes.dex */
public final class x implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f3849f = Logger.getLogger(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final z1.o f3850a;

    /* renamed from: b, reason: collision with root package name */
    public final z1.f f3851b;

    /* renamed from: c, reason: collision with root package name */
    public int f3852c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3853e;

    public x(z1.o oVar) {
        b1.d.e(oVar, "sink");
        this.f3850a = oVar;
        z1.f fVar = new z1.f();
        this.f3851b = fVar;
        this.f3852c = 16384;
        this.f3853e = new d(fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d = true;
        this.f3850a.close();
    }

    public final synchronized void flush() {
        if (this.d) {
            throw new IOException("closed");
        }
        this.f3850a.flush();
    }

    public final synchronized void g(H.j jVar) {
        try {
            b1.d.e(jVar, "peerSettings");
            if (this.d) {
                throw new IOException("closed");
            }
            int i = this.f3852c;
            int i2 = jVar.f220a;
            if ((i2 & 32) != 0) {
                i = ((int[]) jVar.f221b)[5];
            }
            this.f3852c = i;
            if (((i2 & 2) != 0 ? ((int[]) jVar.f221b)[1] : -1) != -1) {
                d dVar = this.f3853e;
                int i3 = (i2 & 2) != 0 ? ((int[]) jVar.f221b)[1] : -1;
                dVar.getClass();
                int min = Math.min(i3, 16384);
                int i4 = dVar.f3766e;
                if (i4 != min) {
                    if (min < i4) {
                        dVar.f3765c = Math.min(dVar.f3765c, min);
                    }
                    dVar.d = true;
                    dVar.f3766e = min;
                    int i5 = dVar.i;
                    if (min < i5) {
                        if (min == 0) {
                            C0316b[] c0316bArr = dVar.f3767f;
                            T0.g.m0(c0316bArr, 0, c0316bArr.length);
                            dVar.f3768g = dVar.f3767f.length - 1;
                            dVar.h = 0;
                            dVar.i = 0;
                        } else {
                            dVar.a(i5 - min);
                        }
                    }
                }
            }
            i(0, 0, 4, 1);
            this.f3850a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void h(boolean z2, int i, z1.f fVar, int i2) {
        if (this.d) {
            throw new IOException("closed");
        }
        i(i, i2, 0, z2 ? 1 : 0);
        if (i2 > 0) {
            b1.d.b(fVar);
            this.f3850a.c(fVar, i2);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = f3849f;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i, i2, i3, i4));
        }
        if (i2 > this.f3852c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f3852c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(V.d("reserved bit set: ", i).toString());
        }
        byte[] bArr = n1.b.f3286a;
        z1.o oVar = this.f3850a;
        b1.d.e(oVar, "<this>");
        oVar.h((i2 >>> 16) & 255);
        oVar.h((i2 >>> 8) & 255);
        oVar.h(i2 & 255);
        oVar.h(i3 & 255);
        oVar.h(i4 & 255);
        oVar.i(i & Integer.MAX_VALUE);
    }

    public final synchronized void j(int i, int i2, byte[] bArr) {
        V.g("errorCode", i2);
        if (this.d) {
            throw new IOException("closed");
        }
        if (AbstractC0288e.a(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        i(0, bArr.length + 8, 7, 0);
        this.f3850a.i(i);
        this.f3850a.i(AbstractC0288e.a(i2));
        if (bArr.length != 0) {
            z1.o oVar = this.f3850a;
            if (oVar.f4285c) {
                throw new IllegalStateException("closed");
            }
            oVar.f4284b.r(0, bArr.length, bArr);
            oVar.g();
        }
        this.f3850a.flush();
    }

    public final synchronized void k(boolean z2, int i, ArrayList arrayList) {
        if (this.d) {
            throw new IOException("closed");
        }
        this.f3853e.d(arrayList);
        long j2 = this.f3851b.f4268b;
        long min = Math.min(this.f3852c, j2);
        int i2 = j2 == min ? 4 : 0;
        if (z2) {
            i2 |= 1;
        }
        i(i, (int) min, 1, i2);
        this.f3850a.c(this.f3851b, min);
        if (j2 > min) {
            long j3 = j2 - min;
            while (j3 > 0) {
                long min2 = Math.min(this.f3852c, j3);
                j3 -= min2;
                i(i, (int) min2, 9, j3 == 0 ? 4 : 0);
                this.f3850a.c(this.f3851b, min2);
            }
        }
    }

    public final synchronized void l(int i, int i2, boolean z2) {
        if (this.d) {
            throw new IOException("closed");
        }
        i(0, 8, 6, z2 ? 1 : 0);
        this.f3850a.i(i);
        this.f3850a.i(i2);
        this.f3850a.flush();
    }

    public final synchronized void m(int i, int i2) {
        V.g("errorCode", i2);
        if (this.d) {
            throw new IOException("closed");
        }
        if (AbstractC0288e.a(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        i(i, 4, 3, 0);
        this.f3850a.i(AbstractC0288e.a(i2));
        this.f3850a.flush();
    }

    public final synchronized void n(int i, long j2) {
        if (this.d) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
        i(i, 4, 8, 0);
        this.f3850a.i((int) j2);
        this.f3850a.flush();
    }
}
