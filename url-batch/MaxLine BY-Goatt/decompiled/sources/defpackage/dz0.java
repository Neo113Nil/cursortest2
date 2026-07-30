package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dz0 implements Closeable {
    public static final Logger r = Logger.getLogger(my0.class.getName());
    public final oq m;
    public final fq n;
    public int o;
    public boolean p;
    public final fy0 q;

    public dz0(n62 n62Var) {
        n62Var.getClass();
        this.m = n62Var;
        fq fqVar = new fq();
        this.n = fqVar;
        this.o = 16384;
        this.q = new fy0(fqVar);
    }

    public final synchronized void b(tj2 tj2Var) {
        try {
            tj2Var.getClass();
            if (this.p) {
                throw new IOException("closed");
            }
            int i = this.o;
            int i2 = tj2Var.a;
            if ((i2 & 32) != 0) {
                i = tj2Var.b[5];
            }
            this.o = i;
            if (((i2 & 2) != 0 ? tj2Var.b[1] : -1) != -1) {
                fy0 fy0Var = this.q;
                int i3 = (i2 & 2) != 0 ? tj2Var.b[1] : -1;
                fy0Var.getClass();
                int min = Math.min(i3, 16384);
                int i4 = fy0Var.d;
                if (i4 != min) {
                    if (min < i4) {
                        fy0Var.b = Math.min(fy0Var.b, min);
                    }
                    fy0Var.c = true;
                    fy0Var.d = min;
                    int i5 = fy0Var.h;
                    if (min < i5) {
                        if (min == 0) {
                            kx0[] kx0VarArr = fy0Var.e;
                            ni.k(0, kx0VarArr.length, null, kx0VarArr);
                            fy0Var.f = fy0Var.e.length - 1;
                            fy0Var.g = 0;
                            fy0Var.h = 0;
                        } else {
                            fy0Var.a(i5 - min);
                        }
                    }
                }
            }
            m(0, 0, 4, 1);
            this.m.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.p = true;
        this.m.close();
    }

    public final synchronized void f(boolean z, int i, fq fqVar, int i2) {
        if (this.p) {
            throw new IOException("closed");
        }
        m(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            oq oqVar = this.m;
            fqVar.getClass();
            oqVar.u(i2, fqVar);
        }
    }

    public final synchronized void flush() {
        if (this.p) {
            throw new IOException("closed");
        }
        this.m.flush();
    }

    public final void m(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = r;
        if (logger.isLoggable(level)) {
            logger.fine(my0.a(false, i, i2, i3, i4));
        }
        if (i2 > this.o) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.o + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            lh.c(in1.k(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = n33.a;
        oq oqVar = this.m;
        oqVar.getClass();
        oqVar.writeByte((i2 >>> 16) & 255);
        oqVar.writeByte((i2 >>> 8) & 255);
        oqVar.writeByte(i2 & 255);
        oqVar.writeByte(i3 & 255);
        oqVar.writeByte(i4 & 255);
        oqVar.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void n(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        if (this.p) {
            throw new IOException("closed");
        }
        if (q40.u(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        m(0, bArr.length + 8, 7, 0);
        this.m.writeInt(i);
        this.m.writeInt(q40.u(i2));
        if (bArr.length != 0) {
            this.m.write(bArr);
        }
        this.m.flush();
    }

    public final synchronized void o(boolean z, int i, ArrayList arrayList) {
        if (this.p) {
            throw new IOException("closed");
        }
        this.q.d(arrayList);
        long j = this.n.n;
        long min = Math.min(this.o, j);
        int i2 = j == min ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        m(i, (int) min, 1, i2);
        this.m.u(min, this.n);
        if (j > min) {
            long j2 = j - min;
            while (j2 > 0) {
                long min2 = Math.min(this.o, j2);
                j2 -= min2;
                m(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                this.m.u(min2, this.n);
            }
        }
    }

    public final synchronized void p(int i, int i2, boolean z) {
        if (this.p) {
            throw new IOException("closed");
        }
        m(0, 8, 6, z ? 1 : 0);
        this.m.writeInt(i);
        this.m.writeInt(i2);
        this.m.flush();
    }

    public final synchronized void q(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        if (this.p) {
            throw new IOException("closed");
        }
        if (q40.u(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        m(i, 4, 3, 0);
        this.m.writeInt(q40.u(i2));
        this.m.flush();
    }

    public final synchronized void s(long j, int i) {
        if (this.p) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        m(i, 4, 8, 0);
        this.m.writeInt((int) j);
        this.m.flush();
    }
}
