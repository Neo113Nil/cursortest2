package p1;

import X.V;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import q.AbstractC0290e;

/* loaded from: classes.dex */
public final class x implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f3500f = Logger.getLogger(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final v1.o f3501a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.f f3502b;

    /* renamed from: c, reason: collision with root package name */
    public int f3503c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3504e;

    public x(v1.o oVar) {
        X0.d.e(oVar, "sink");
        this.f3501a = oVar;
        v1.f fVar = new v1.f();
        this.f3502b = fVar;
        this.f3503c = 16384;
        this.f3504e = new d(fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d = true;
        this.f3501a.close();
    }

    public final synchronized void e(H.j jVar) {
        try {
            X0.d.e(jVar, "peerSettings");
            if (this.d) {
                throw new IOException("closed");
            }
            int i = this.f3503c;
            int i2 = jVar.f227a;
            if ((i2 & 32) != 0) {
                i = ((int[]) jVar.f228b)[5];
            }
            this.f3503c = i;
            if (((i2 & 2) != 0 ? ((int[]) jVar.f228b)[1] : -1) != -1) {
                d dVar = this.f3504e;
                int i3 = (i2 & 2) != 0 ? ((int[]) jVar.f228b)[1] : -1;
                dVar.getClass();
                int min = Math.min(i3, 16384);
                int i4 = dVar.f3417e;
                if (i4 != min) {
                    if (min < i4) {
                        dVar.f3416c = Math.min(dVar.f3416c, min);
                    }
                    dVar.d = true;
                    dVar.f3417e = min;
                    int i5 = dVar.i;
                    if (min < i5) {
                        if (min == 0) {
                            C0285b[] c0285bArr = dVar.f3418f;
                            Q0.g.g0(c0285bArr, 0, c0285bArr.length);
                            dVar.f3419g = dVar.f3418f.length - 1;
                            dVar.h = 0;
                            dVar.i = 0;
                        } else {
                            dVar.a(i5 - min);
                        }
                    }
                }
            }
            g(0, 0, 4, 1);
            this.f3501a.flush();
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
            this.f3501a.c(fVar, i2);
        }
    }

    public final synchronized void flush() {
        if (this.d) {
            throw new IOException("closed");
        }
        this.f3501a.flush();
    }

    public final void g(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = f3500f;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i, i2, i3, i4));
        }
        if (i2 > this.f3503c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f3503c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(V.d("reserved bit set: ", i).toString());
        }
        byte[] bArr = j1.b.f2603a;
        v1.o oVar = this.f3501a;
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
        if (AbstractC0290e.a(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        g(0, bArr.length + 8, 7, 0);
        this.f3501a.g(i);
        this.f3501a.g(AbstractC0290e.a(i2));
        if (bArr.length != 0) {
            v1.o oVar = this.f3501a;
            if (oVar.f4089c) {
                throw new IllegalStateException("closed");
            }
            oVar.f4088b.p(0, bArr.length, bArr);
            oVar.e();
        }
        this.f3501a.flush();
    }

    public final synchronized void i(boolean z2, int i, ArrayList arrayList) {
        if (this.d) {
            throw new IOException("closed");
        }
        this.f3504e.d(arrayList);
        long j2 = this.f3502b.f4073b;
        long min = Math.min(this.f3503c, j2);
        int i2 = j2 == min ? 4 : 0;
        if (z2) {
            i2 |= 1;
        }
        g(i, (int) min, 1, i2);
        this.f3501a.c(this.f3502b, min);
        if (j2 > min) {
            long j3 = j2 - min;
            while (j3 > 0) {
                long min2 = Math.min(this.f3503c, j3);
                j3 -= min2;
                g(i, (int) min2, 9, j3 == 0 ? 4 : 0);
                this.f3501a.c(this.f3502b, min2);
            }
        }
    }

    public final synchronized void j(int i, int i2, boolean z2) {
        if (this.d) {
            throw new IOException("closed");
        }
        g(0, 8, 6, z2 ? 1 : 0);
        this.f3501a.g(i);
        this.f3501a.g(i2);
        this.f3501a.flush();
    }

    public final synchronized void k(int i, int i2) {
        V.g("errorCode", i2);
        if (this.d) {
            throw new IOException("closed");
        }
        if (AbstractC0290e.a(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        g(i, 4, 3, 0);
        this.f3501a.g(AbstractC0290e.a(i2));
        this.f3501a.flush();
    }

    public final synchronized void l(int i, long j2) {
        if (this.d) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
        g(i, 4, 8, 0);
        this.f3501a.g((int) j2);
        this.f3501a.flush();
    }
}
