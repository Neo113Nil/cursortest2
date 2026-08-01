package y1;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import s.AbstractC0267e;

/* loaded from: classes.dex */
public final class x implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f4294f = Logger.getLogger(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final E1.o f4295a;

    /* renamed from: b, reason: collision with root package name */
    public final E1.f f4296b;

    /* renamed from: c, reason: collision with root package name */
    public int f4297c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final d f4298e;

    public x(E1.o oVar) {
        g1.d.e(oVar, "sink");
        this.f4295a = oVar;
        E1.f fVar = new E1.f();
        this.f4296b = fVar;
        this.f4297c = 16384;
        this.f4298e = new d(fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d = true;
        this.f4295a.close();
    }

    public final synchronized void flush() {
        if (this.d) {
            throw new IOException("closed");
        }
        this.f4295a.flush();
    }

    public final synchronized void g(J.i iVar) {
        try {
            g1.d.e(iVar, "peerSettings");
            if (this.d) {
                throw new IOException("closed");
            }
            int i = this.f4297c;
            int i2 = iVar.f373a;
            if ((i2 & 32) != 0) {
                i = ((int[]) iVar.f374b)[5];
            }
            this.f4297c = i;
            if (((i2 & 2) != 0 ? ((int[]) iVar.f374b)[1] : -1) != -1) {
                d dVar = this.f4298e;
                int i3 = (i2 & 2) != 0 ? ((int[]) iVar.f374b)[1] : -1;
                dVar.getClass();
                int min = Math.min(i3, 16384);
                int i4 = dVar.f4211e;
                if (i4 != min) {
                    if (min < i4) {
                        dVar.f4210c = Math.min(dVar.f4210c, min);
                    }
                    dVar.d = true;
                    dVar.f4211e = min;
                    int i5 = dVar.i;
                    if (min < i5) {
                        if (min == 0) {
                            b[] bVarArr = dVar.f4212f;
                            X0.i.i0(bVarArr, 0, bVarArr.length);
                            dVar.f4213g = dVar.f4212f.length - 1;
                            dVar.h = 0;
                            dVar.i = 0;
                        } else {
                            dVar.a(i5 - min);
                        }
                    }
                }
            }
            i(0, 0, 4, 1);
            this.f4295a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void h(boolean z2, int i, E1.f fVar, int i2) {
        if (this.d) {
            throw new IOException("closed");
        }
        i(i, i2, 0, z2 ? 1 : 0);
        if (i2 > 0) {
            g1.d.b(fVar);
            this.f4295a.b(fVar, i2);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = f4294f;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i, i2, i3, i4));
        }
        if (i2 > this.f4297c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f4297c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(X0.a.e("reserved bit set: ", i).toString());
        }
        byte[] bArr = s1.b.f3607a;
        E1.o oVar = this.f4295a;
        g1.d.e(oVar, "<this>");
        oVar.h((i2 >>> 16) & 255);
        oVar.h((i2 >>> 8) & 255);
        oVar.h(i2 & 255);
        oVar.h(i3 & 255);
        oVar.h(i4 & 255);
        oVar.i(i & Integer.MAX_VALUE);
    }

    public final synchronized void j(int i, int i2, byte[] bArr) {
        X0.a.h("errorCode", i2);
        if (this.d) {
            throw new IOException("closed");
        }
        if (AbstractC0267e.a(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        i(0, bArr.length + 8, 7, 0);
        this.f4295a.i(i);
        this.f4295a.i(AbstractC0267e.a(i2));
        if (bArr.length != 0) {
            E1.o oVar = this.f4295a;
            if (oVar.f219c) {
                throw new IllegalStateException("closed");
            }
            oVar.f218b.r(0, bArr.length, bArr);
            oVar.g();
        }
        this.f4295a.flush();
    }

    public final synchronized void k(boolean z2, int i, ArrayList arrayList) {
        if (this.d) {
            throw new IOException("closed");
        }
        this.f4298e.d(arrayList);
        long j2 = this.f4296b.f202b;
        long min = Math.min(this.f4297c, j2);
        int i2 = j2 == min ? 4 : 0;
        if (z2) {
            i2 |= 1;
        }
        i(i, (int) min, 1, i2);
        this.f4295a.b(this.f4296b, min);
        if (j2 > min) {
            long j3 = j2 - min;
            while (j3 > 0) {
                long min2 = Math.min(this.f4297c, j3);
                j3 -= min2;
                i(i, (int) min2, 9, j3 == 0 ? 4 : 0);
                this.f4295a.b(this.f4296b, min2);
            }
        }
    }

    public final synchronized void l(int i, int i2, boolean z2) {
        if (this.d) {
            throw new IOException("closed");
        }
        i(0, 8, 6, z2 ? 1 : 0);
        this.f4295a.i(i);
        this.f4295a.i(i2);
        this.f4295a.flush();
    }

    public final synchronized void m(int i, int i2) {
        X0.a.h("errorCode", i2);
        if (this.d) {
            throw new IOException("closed");
        }
        if (AbstractC0267e.a(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        i(i, 4, 3, 0);
        this.f4295a.i(AbstractC0267e.a(i2));
        this.f4295a.flush();
    }

    public final synchronized void n(int i, long j2) {
        if (this.d) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
        i(i, 4, 8, 0);
        this.f4295a.i((int) j2);
        this.f4295a.flush();
    }
}
