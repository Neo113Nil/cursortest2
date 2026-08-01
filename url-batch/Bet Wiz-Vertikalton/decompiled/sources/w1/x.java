package w1;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import q.AbstractC0285e;

/* loaded from: classes.dex */
public final class x implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f4179f = Logger.getLogger(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final C1.o f4180a;

    /* renamed from: b, reason: collision with root package name */
    public final C1.f f4181b;

    /* renamed from: c, reason: collision with root package name */
    public int f4182c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final d f4183e;

    public x(C1.o oVar) {
        e1.d.e(oVar, "sink");
        this.f4180a = oVar;
        C1.f fVar = new C1.f();
        this.f4181b = fVar;
        this.f4182c = 16384;
        this.f4183e = new d(fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d = true;
        this.f4180a.close();
    }

    public final synchronized void flush() {
        if (this.d) {
            throw new IOException("closed");
        }
        this.f4180a.flush();
    }

    public final synchronized void g(H.j jVar) {
        try {
            e1.d.e(jVar, "peerSettings");
            if (this.d) {
                throw new IOException("closed");
            }
            int i = this.f4182c;
            int i2 = jVar.f273a;
            if ((i2 & 32) != 0) {
                i = ((int[]) jVar.f274b)[5];
            }
            this.f4182c = i;
            if (((i2 & 2) != 0 ? ((int[]) jVar.f274b)[1] : -1) != -1) {
                d dVar = this.f4183e;
                int i3 = (i2 & 2) != 0 ? ((int[]) jVar.f274b)[1] : -1;
                dVar.getClass();
                int min = Math.min(i3, 16384);
                int i4 = dVar.f4096e;
                if (i4 != min) {
                    if (min < i4) {
                        dVar.f4095c = Math.min(dVar.f4095c, min);
                    }
                    dVar.d = true;
                    dVar.f4096e = min;
                    int i5 = dVar.i;
                    if (min < i5) {
                        if (min == 0) {
                            b[] bVarArr = dVar.f4097f;
                            W0.g.r0(bVarArr, 0, bVarArr.length);
                            dVar.f4098g = dVar.f4097f.length - 1;
                            dVar.h = 0;
                            dVar.i = 0;
                        } else {
                            dVar.a(i5 - min);
                        }
                    }
                }
            }
            i(0, 0, 4, 1);
            this.f4180a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void h(boolean z2, int i, C1.f fVar, int i2) {
        if (this.d) {
            throw new IOException("closed");
        }
        i(i, i2, 0, z2 ? 1 : 0);
        if (i2 > 0) {
            e1.d.b(fVar);
            this.f4180a.f(fVar, i2);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = f4179f;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i, i2, i3, i4));
        }
        if (i2 > this.f4182c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f4182c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(T0.c.d("reserved bit set: ", i).toString());
        }
        byte[] bArr = q1.b.f3491a;
        C1.o oVar = this.f4180a;
        e1.d.e(oVar, "<this>");
        oVar.h((i2 >>> 16) & 255);
        oVar.h((i2 >>> 8) & 255);
        oVar.h(i2 & 255);
        oVar.h(i3 & 255);
        oVar.h(i4 & 255);
        oVar.i(i & Integer.MAX_VALUE);
    }

    public final synchronized void j(int i, int i2, byte[] bArr) {
        T0.c.g("errorCode", i2);
        if (this.d) {
            throw new IOException("closed");
        }
        if (AbstractC0285e.a(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        i(0, bArr.length + 8, 7, 0);
        this.f4180a.i(i);
        this.f4180a.i(AbstractC0285e.a(i2));
        if (bArr.length != 0) {
            C1.o oVar = this.f4180a;
            if (oVar.f199c) {
                throw new IllegalStateException("closed");
            }
            oVar.f198b.r(0, bArr.length, bArr);
            oVar.g();
        }
        this.f4180a.flush();
    }

    public final synchronized void k(boolean z2, int i, ArrayList arrayList) {
        if (this.d) {
            throw new IOException("closed");
        }
        this.f4183e.d(arrayList);
        long j2 = this.f4181b.f182b;
        long min = Math.min(this.f4182c, j2);
        int i2 = j2 == min ? 4 : 0;
        if (z2) {
            i2 |= 1;
        }
        i(i, (int) min, 1, i2);
        this.f4180a.f(this.f4181b, min);
        if (j2 > min) {
            long j3 = j2 - min;
            while (j3 > 0) {
                long min2 = Math.min(this.f4182c, j3);
                j3 -= min2;
                i(i, (int) min2, 9, j3 == 0 ? 4 : 0);
                this.f4180a.f(this.f4181b, min2);
            }
        }
    }

    public final synchronized void l(int i, int i2, boolean z2) {
        if (this.d) {
            throw new IOException("closed");
        }
        i(0, 8, 6, z2 ? 1 : 0);
        this.f4180a.i(i);
        this.f4180a.i(i2);
        this.f4180a.flush();
    }

    public final synchronized void m(int i, int i2) {
        T0.c.g("errorCode", i2);
        if (this.d) {
            throw new IOException("closed");
        }
        if (AbstractC0285e.a(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        i(i, 4, 3, 0);
        this.f4180a.i(AbstractC0285e.a(i2));
        this.f4180a.flush();
    }

    public final synchronized void n(int i, long j2) {
        if (this.d) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
        i(i, 4, 8, 0);
        this.f4180a.i((int) j2);
        this.f4180a.flush();
    }
}
