package N2;

import T2.C0231f;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class y implements Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f3706i = Logger.getLogger(f.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final T2.x f3707d;

    /* renamed from: e, reason: collision with root package name */
    public final C0231f f3708e;

    /* renamed from: f, reason: collision with root package name */
    public int f3709f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3710g;

    /* renamed from: h, reason: collision with root package name */
    public final C0206d f3711h;

    public y(T2.x xVar) {
        f2.j.f(xVar, "sink");
        this.f3707d = xVar;
        C0231f c0231f = new C0231f();
        this.f3708e = c0231f;
        this.f3709f = 16384;
        this.f3711h = new C0206d(c0231f);
    }

    public final synchronized void a(C c2) {
        try {
            f2.j.f(c2, "peerSettings");
            if (this.f3710g) {
                throw new IOException("closed");
            }
            int i3 = this.f3709f;
            int i4 = c2.f3577a;
            if ((i4 & 32) != 0) {
                i3 = c2.f3578b[5];
            }
            this.f3709f = i3;
            if (((i4 & 2) != 0 ? c2.f3578b[1] : -1) != -1) {
                C0206d c0206d = this.f3711h;
                int i5 = (i4 & 2) != 0 ? c2.f3578b[1] : -1;
                c0206d.getClass();
                int min = Math.min(i5, 16384);
                int i6 = c0206d.f3600e;
                if (i6 != min) {
                    if (min < i6) {
                        c0206d.f3598c = Math.min(c0206d.f3598c, min);
                    }
                    c0206d.f3599d = true;
                    c0206d.f3600e = min;
                    int i7 = c0206d.f3604i;
                    if (min < i7) {
                        if (min == 0) {
                            C0204b[] c0204bArr = c0206d.f3601f;
                            S1.k.r0(c0204bArr, null, 0, c0204bArr.length);
                            c0206d.f3602g = c0206d.f3601f.length - 1;
                            c0206d.f3603h = 0;
                            c0206d.f3604i = 0;
                        } else {
                            c0206d.a(i7 - min);
                        }
                    }
                }
            }
            d(0, 0, 4, 1);
            this.f3707d.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(boolean z3, int i3, C0231f c0231f, int i4) {
        if (this.f3710g) {
            throw new IOException("closed");
        }
        d(i3, i4, 0, z3 ? 1 : 0);
        if (i4 > 0) {
            f2.j.c(c0231f);
            this.f3707d.p(c0231f, i4);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f3710g = true;
        this.f3707d.close();
    }

    public final void d(int i3, int i4, int i5, int i6) {
        Level level = Level.FINE;
        Logger logger = f3706i;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i3, i4, i5, i6));
        }
        if (i4 > this.f3709f) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f3709f + ": " + i4).toString());
        }
        if ((Integer.MIN_VALUE & i3) != 0) {
            throw new IllegalArgumentException(A.k.h("reserved bit set: ", i3).toString());
        }
        byte[] bArr = H2.b.f2632a;
        T2.x xVar = this.f3707d;
        f2.j.f(xVar, "<this>");
        xVar.b((i4 >>> 16) & 255);
        xVar.b((i4 >>> 8) & 255);
        xVar.b(i4 & 255);
        xVar.b(i5 & 255);
        xVar.b(i6 & 255);
        xVar.d(i3 & Integer.MAX_VALUE);
    }

    public final synchronized void e(byte[] bArr, int i3, int i4) {
        A.k.s("errorCode", i4);
        if (this.f3710g) {
            throw new IOException("closed");
        }
        if (AbstractC0625j.b(i4) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        d(0, bArr.length + 8, 7, 0);
        this.f3707d.d(i3);
        this.f3707d.d(AbstractC0625j.b(i4));
        if (bArr.length != 0) {
            T2.x xVar = this.f3707d;
            if (xVar.f4451f) {
                throw new IllegalStateException("closed");
            }
            xVar.f4450e.z(bArr, 0, bArr.length);
            xVar.a();
        }
        this.f3707d.flush();
    }

    public final synchronized void flush() {
        if (this.f3710g) {
            throw new IOException("closed");
        }
        this.f3707d.flush();
    }

    public final synchronized void g(boolean z3, int i3, ArrayList arrayList) {
        if (this.f3710g) {
            throw new IOException("closed");
        }
        this.f3711h.d(arrayList);
        long j3 = this.f3708e.f4409e;
        long min = Math.min(this.f3709f, j3);
        int i4 = j3 == min ? 4 : 0;
        if (z3) {
            i4 |= 1;
        }
        d(i3, (int) min, 1, i4);
        this.f3707d.p(this.f3708e, min);
        if (j3 > min) {
            long j4 = j3 - min;
            while (j4 > 0) {
                long min2 = Math.min(this.f3709f, j4);
                j4 -= min2;
                d(i3, (int) min2, 9, j4 == 0 ? 4 : 0);
                this.f3707d.p(this.f3708e, min2);
            }
        }
    }

    public final synchronized void h(int i3, int i4, boolean z3) {
        if (this.f3710g) {
            throw new IOException("closed");
        }
        d(0, 8, 6, z3 ? 1 : 0);
        this.f3707d.d(i3);
        this.f3707d.d(i4);
        this.f3707d.flush();
    }

    public final synchronized void l(int i3, int i4) {
        A.k.s("errorCode", i4);
        if (this.f3710g) {
            throw new IOException("closed");
        }
        if (AbstractC0625j.b(i4) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        d(i3, 4, 3, 0);
        this.f3707d.d(AbstractC0625j.b(i4));
        this.f3707d.flush();
    }

    public final synchronized void n(long j3, int i3) {
        if (this.f3710g) {
            throw new IOException("closed");
        }
        if (j3 == 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j3).toString());
        }
        d(i3, 4, 8, 0);
        this.f3707d.d((int) j3);
        this.f3707d.flush();
    }
}
