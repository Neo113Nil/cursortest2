package p1;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import q.AbstractC0319e;

/* loaded from: classes.dex */
public final class x implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f3881f = Logger.getLogger(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final v1.p f3882a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.f f3883b;

    /* renamed from: c, reason: collision with root package name */
    public int f3884c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3885d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3886e;

    public x(v1.p pVar) {
        X0.f.e(pVar, "sink");
        this.f3882a = pVar;
        v1.f fVar = new v1.f();
        this.f3883b = fVar;
        this.f3884c = 16384;
        this.f3886e = new d(fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f3885d = true;
        this.f3882a.close();
    }

    public final synchronized void flush() {
        if (this.f3885d) {
            throw new IOException("closed");
        }
        this.f3882a.flush();
    }

    public final synchronized void g(H.j jVar) {
        try {
            X0.f.e(jVar, "peerSettings");
            if (this.f3885d) {
                throw new IOException("closed");
            }
            int i = this.f3884c;
            int i2 = jVar.f240a;
            if ((i2 & 32) != 0) {
                i = ((int[]) jVar.f241b)[5];
            }
            this.f3884c = i;
            if (((i2 & 2) != 0 ? ((int[]) jVar.f241b)[1] : -1) != -1) {
                d dVar = this.f3886e;
                int i3 = (i2 & 2) != 0 ? ((int[]) jVar.f241b)[1] : -1;
                dVar.getClass();
                int min = Math.min(i3, 16384);
                int i4 = dVar.f3790e;
                if (i4 != min) {
                    if (min < i4) {
                        dVar.f3788c = Math.min(dVar.f3788c, min);
                    }
                    dVar.f3789d = true;
                    dVar.f3790e = min;
                    int i5 = dVar.i;
                    if (min < i5) {
                        if (min == 0) {
                            C0314b[] c0314bArr = dVar.f3791f;
                            O0.g.x0(c0314bArr, 0, c0314bArr.length);
                            dVar.f3792g = dVar.f3791f.length - 1;
                            dVar.h = 0;
                            dVar.i = 0;
                        } else {
                            dVar.a(i5 - min);
                        }
                    }
                }
            }
            i(0, 0, 4, 1);
            this.f3882a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void h(boolean z2, int i, v1.f fVar, int i2) {
        if (this.f3885d) {
            throw new IOException("closed");
        }
        i(i, i2, 0, z2 ? 1 : 0);
        if (i2 > 0) {
            X0.f.b(fVar);
            this.f3882a.d(fVar, i2);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = f3881f;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i, i2, i3, i4));
        }
        if (i2 > this.f3884c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f3884c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(X0.e.d("reserved bit set: ", i).toString());
        }
        byte[] bArr = j1.b.f2971a;
        v1.p pVar = this.f3882a;
        X0.f.e(pVar, "<this>");
        pVar.h((i2 >>> 16) & 255);
        pVar.h((i2 >>> 8) & 255);
        pVar.h(i2 & 255);
        pVar.h(i3 & 255);
        pVar.h(i4 & 255);
        pVar.i(i & Integer.MAX_VALUE);
    }

    public final synchronized void j(int i, int i2, byte[] bArr) {
        X0.e.g("errorCode", i2);
        if (this.f3885d) {
            throw new IOException("closed");
        }
        if (AbstractC0319e.a(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        i(0, bArr.length + 8, 7, 0);
        this.f3882a.i(i);
        this.f3882a.i(AbstractC0319e.a(i2));
        if (bArr.length != 0) {
            v1.p pVar = this.f3882a;
            if (pVar.f4508c) {
                throw new IllegalStateException("closed");
            }
            pVar.f4507b.r(0, bArr.length, bArr);
            pVar.g();
        }
        this.f3882a.flush();
    }

    public final synchronized void k(boolean z2, int i, ArrayList arrayList) {
        if (this.f3885d) {
            throw new IOException("closed");
        }
        this.f3886e.d(arrayList);
        long j2 = this.f3883b.f4488b;
        long min = Math.min(this.f3884c, j2);
        int i2 = j2 == min ? 4 : 0;
        if (z2) {
            i2 |= 1;
        }
        i(i, (int) min, 1, i2);
        this.f3882a.d(this.f3883b, min);
        if (j2 > min) {
            long j3 = j2 - min;
            while (j3 > 0) {
                long min2 = Math.min(this.f3884c, j3);
                j3 -= min2;
                i(i, (int) min2, 9, j3 == 0 ? 4 : 0);
                this.f3882a.d(this.f3883b, min2);
            }
        }
    }

    public final synchronized void l(int i, int i2, boolean z2) {
        if (this.f3885d) {
            throw new IOException("closed");
        }
        i(0, 8, 6, z2 ? 1 : 0);
        this.f3882a.i(i);
        this.f3882a.i(i2);
        this.f3882a.flush();
    }

    public final synchronized void m(int i, int i2) {
        X0.e.g("errorCode", i2);
        if (this.f3885d) {
            throw new IOException("closed");
        }
        if (AbstractC0319e.a(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        i(i, 4, 3, 0);
        this.f3882a.i(AbstractC0319e.a(i2));
        this.f3882a.flush();
    }

    public final synchronized void n(int i, long j2) {
        if (this.f3885d) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
        i(i, 4, 8, 0);
        this.f3882a.i((int) j2);
        this.f3882a.flush();
    }
}
