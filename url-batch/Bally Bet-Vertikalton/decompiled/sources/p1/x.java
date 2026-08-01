package p1;

import X.V;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import q.AbstractC0291e;

/* loaded from: classes.dex */
public final class x implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f3484f = Logger.getLogger(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final v1.o f3485a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.f f3486b;

    /* renamed from: c, reason: collision with root package name */
    public int f3487c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3488e;

    public x(v1.o oVar) {
        X0.d.e(oVar, "sink");
        this.f3485a = oVar;
        v1.f fVar = new v1.f();
        this.f3486b = fVar;
        this.f3487c = 16384;
        this.f3488e = new d(fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d = true;
        this.f3485a.close();
    }

    public final synchronized void e(H.j jVar) {
        try {
            X0.d.e(jVar, "peerSettings");
            if (this.d) {
                throw new IOException("closed");
            }
            int i = this.f3487c;
            int i2 = jVar.f227a;
            if ((i2 & 32) != 0) {
                i = ((int[]) jVar.f228b)[5];
            }
            this.f3487c = i;
            if (((i2 & 2) != 0 ? ((int[]) jVar.f228b)[1] : -1) != -1) {
                d dVar = this.f3488e;
                int i3 = (i2 & 2) != 0 ? ((int[]) jVar.f228b)[1] : -1;
                dVar.getClass();
                int min = Math.min(i3, 16384);
                int i4 = dVar.f3401e;
                if (i4 != min) {
                    if (min < i4) {
                        dVar.f3400c = Math.min(dVar.f3400c, min);
                    }
                    dVar.d = true;
                    dVar.f3401e = min;
                    int i5 = dVar.i;
                    if (min < i5) {
                        if (min == 0) {
                            C0286b[] c0286bArr = dVar.f3402f;
                            Q0.g.g0(c0286bArr, 0, c0286bArr.length);
                            dVar.f3403g = dVar.f3402f.length - 1;
                            dVar.h = 0;
                            dVar.i = 0;
                        } else {
                            dVar.a(i5 - min);
                        }
                    }
                }
            }
            g(0, 0, 4, 1);
            this.f3485a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(boolean z2, int i, v1.f fVar, int i2) {
        if (this.d) {
            throw new IOException("closed");
        }
        g(i, i2, 0, z2 ? 1 : 0);
        if (i2 > 0) {
            X0.d.b(fVar);
            this.f3485a.c(fVar, i2);
        }
    }

    public final synchronized void flush() {
        if (this.d) {
            throw new IOException("closed");
        }
        this.f3485a.flush();
    }

    public final void g(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = f3484f;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i, i2, i3, i4));
        }
        if (i2 > this.f3487c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f3487c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(V.d("reserved bit set: ", i).toString());
        }
        byte[] bArr = j1.b.f2587a;
        v1.o oVar = this.f3485a;
        X0.d.e(oVar, "<this>");
        oVar.f((i2 >>> 16) & 255);
        oVar.f((i2 >>> 8) & 255);
        oVar.f(i2 & 255);
        oVar.f(i3 & 255);
        oVar.f(i4 & 255);
        oVar.g(i & Integer.MAX_VALUE);
    }

    public final synchronized void h(int i, int i2, byte[] bArr) {
        V.g("errorCode", i2);
        if (this.d) {
            throw new IOException("closed");
        }
        if (AbstractC0291e.a(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        g(0, bArr.length + 8, 7, 0);
        this.f3485a.g(i);
        this.f3485a.g(AbstractC0291e.a(i2));
        if (bArr.length != 0) {
            v1.o oVar = this.f3485a;
            if (oVar.f4073c) {
                throw new IllegalStateException("closed");
            }
            oVar.f4072b.p(0, bArr.length, bArr);
            oVar.e();
        }
        this.f3485a.flush();
    }

    public final synchronized void i(boolean z2, int i, ArrayList arrayList) {
        if (this.d) {
            throw new IOException("closed");
        }
        this.f3488e.d(arrayList);
        long j2 = this.f3486b.f4057b;
        long min = Math.min(this.f3487c, j2);
        int i2 = j2 == min ? 4 : 0;
        if (z2) {
            i2 |= 1;
        }
        g(i, (int) min, 1, i2);
        this.f3485a.c(this.f3486b, min);
        if (j2 > min) {
            long j3 = j2 - min;
            while (j3 > 0) {
                long min2 = Math.min(this.f3487c, j3);
                j3 -= min2;
                g(i, (int) min2, 9, j3 == 0 ? 4 : 0);
                this.f3485a.c(this.f3486b, min2);
            }
        }
    }

    public final synchronized void j(int i, int i2, boolean z2) {
        if (this.d) {
            throw new IOException("closed");
        }
        g(0, 8, 6, z2 ? 1 : 0);
        this.f3485a.g(i);
        this.f3485a.g(i2);
        this.f3485a.flush();
    }

    public final synchronized void k(int i, int i2) {
        V.g("errorCode", i2);
        if (this.d) {
            throw new IOException("closed");
        }
        if (AbstractC0291e.a(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        g(i, 4, 3, 0);
        this.f3485a.g(AbstractC0291e.a(i2));
        this.f3485a.flush();
    }

    public final synchronized void l(int i, long j2) {
        if (this.d) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
        g(i, 4, 8, 0);
        this.f3485a.g((int) j2);
        this.f3485a.flush();
    }
}
