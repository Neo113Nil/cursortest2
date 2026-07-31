package H2;

import N2.C0150f;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import m.AbstractC0600j;

/* loaded from: classes.dex */
public final class y implements Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f2049i = Logger.getLogger(g.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final N2.x f2050d;

    /* renamed from: e, reason: collision with root package name */
    public final C0150f f2051e;

    /* renamed from: f, reason: collision with root package name */
    public int f2052f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2053g;

    /* renamed from: h, reason: collision with root package name */
    public final e f2054h;

    public y(N2.x xVar) {
        Z1.i.f(xVar, "sink");
        this.f2050d = xVar;
        C0150f c0150f = new C0150f();
        this.f2051e = c0150f;
        this.f2052f = 16384;
        this.f2054h = new e(c0150f);
    }

    public final synchronized void a(C c3) {
        try {
            Z1.i.f(c3, "peerSettings");
            if (this.f2053g) {
                throw new IOException("closed");
            }
            int i3 = this.f2052f;
            int i4 = c3.f1925a;
            if ((i4 & 32) != 0) {
                i3 = c3.f1926b[5];
            }
            this.f2052f = i3;
            if (((i4 & 2) != 0 ? c3.f1926b[1] : -1) != -1) {
                e eVar = this.f2054h;
                int i5 = (i4 & 2) != 0 ? c3.f1926b[1] : -1;
                eVar.getClass();
                int min = Math.min(i5, 16384);
                int i6 = eVar.f1948e;
                if (i6 != min) {
                    if (min < i6) {
                        eVar.f1946c = Math.min(eVar.f1946c, min);
                    }
                    eVar.f1947d = true;
                    eVar.f1948e = min;
                    int i7 = eVar.f1952i;
                    if (min < i7) {
                        if (min == 0) {
                            C0081c[] c0081cArr = eVar.f1949f;
                            M1.k.c0(c0081cArr, 0, c0081cArr.length);
                            eVar.f1950g = eVar.f1949f.length - 1;
                            eVar.f1951h = 0;
                            eVar.f1952i = 0;
                        } else {
                            eVar.a(i7 - min);
                        }
                    }
                }
            }
            e(0, 0, 4, 1);
            this.f2050d.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(boolean z3, int i3, C0150f c0150f, int i4) {
        if (this.f2053g) {
            throw new IOException("closed");
        }
        e(i3, i4, 0, z3 ? 1 : 0);
        if (i4 > 0) {
            Z1.i.c(c0150f);
            this.f2050d.g(c0150f, i4);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f2053g = true;
        this.f2050d.close();
    }

    public final void e(int i3, int i4, int i5, int i6) {
        Level level = Level.FINE;
        Logger logger = f2049i;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(false, i3, i4, i5, i6));
        }
        if (i4 > this.f2052f) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f2052f + ": " + i4).toString());
        }
        if ((Integer.MIN_VALUE & i3) != 0) {
            throw new IllegalArgumentException(AbstractC0080b.h("reserved bit set: ", i3).toString());
        }
        byte[] bArr = B2.c.f415a;
        N2.x xVar = this.f2050d;
        Z1.i.f(xVar, "<this>");
        xVar.b((i4 >>> 16) & 255);
        xVar.b((i4 >>> 8) & 255);
        xVar.b(i4 & 255);
        xVar.b(i5 & 255);
        xVar.b(i6 & 255);
        xVar.e(i3 & Integer.MAX_VALUE);
    }

    public final synchronized void flush() {
        if (this.f2053g) {
            throw new IOException("closed");
        }
        this.f2050d.flush();
    }

    public final synchronized void h(byte[] bArr, int i3, int i4) {
        AbstractC0080b.s("errorCode", i4);
        if (this.f2053g) {
            throw new IOException("closed");
        }
        if (AbstractC0600j.a(i4) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        e(0, bArr.length + 8, 7, 0);
        this.f2050d.e(i3);
        this.f2050d.e(AbstractC0600j.a(i4));
        if (bArr.length != 0) {
            N2.x xVar = this.f2050d;
            if (xVar.f2971f) {
                throw new IllegalStateException("closed");
            }
            xVar.f2970e.O(bArr, 0, bArr.length);
            xVar.a();
        }
        this.f2050d.flush();
    }

    public final synchronized void i(boolean z3, int i3, ArrayList arrayList) {
        if (this.f2053g) {
            throw new IOException("closed");
        }
        this.f2054h.d(arrayList);
        long j3 = this.f2051e.f2929e;
        long min = Math.min(this.f2052f, j3);
        int i4 = j3 == min ? 4 : 0;
        if (z3) {
            i4 |= 1;
        }
        e(i3, (int) min, 1, i4);
        this.f2050d.g(this.f2051e, min);
        if (j3 > min) {
            long j4 = j3 - min;
            while (j4 > 0) {
                long min2 = Math.min(this.f2052f, j4);
                j4 -= min2;
                e(i3, (int) min2, 9, j4 == 0 ? 4 : 0);
                this.f2050d.g(this.f2051e, min2);
            }
        }
    }

    public final synchronized void j(int i3, int i4, boolean z3) {
        if (this.f2053g) {
            throw new IOException("closed");
        }
        e(0, 8, 6, z3 ? 1 : 0);
        this.f2050d.e(i3);
        this.f2050d.e(i4);
        this.f2050d.flush();
    }

    public final synchronized void k(int i3, int i4) {
        AbstractC0080b.s("errorCode", i4);
        if (this.f2053g) {
            throw new IOException("closed");
        }
        if (AbstractC0600j.a(i4) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        e(i3, 4, 3, 0);
        this.f2050d.e(AbstractC0600j.a(i4));
        this.f2050d.flush();
    }

    public final synchronized void m(long j3, int i3) {
        if (this.f2053g) {
            throw new IOException("closed");
        }
        if (j3 == 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j3).toString());
        }
        e(i3, 4, 8, 0);
        this.f2050d.e((int) j3);
        this.f2050d.flush();
    }
}
