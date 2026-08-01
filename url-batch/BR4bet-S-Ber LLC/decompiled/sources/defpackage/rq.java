package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class rq implements Closeable {
    public static final Logger k = Logger.getLogger(zp.class.getName());
    public final i9 f;
    public final h9 g;
    public int h;
    public boolean i;
    public final sp j;

    public rq(d10 d10Var) {
        d10Var.getClass();
        this.f = d10Var;
        h9 h9Var = new h9();
        this.g = h9Var;
        this.h = 16384;
        this.j = new sp(h9Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.i = true;
        this.f.close();
    }

    public final synchronized void f(b50 b50Var) {
        try {
            b50Var.getClass();
            if (this.i) {
                throw new IOException("closed");
            }
            int i = this.h;
            int i2 = b50Var.a;
            if ((i2 & 32) != 0) {
                i = b50Var.b[5];
            }
            this.h = i;
            if (((i2 & 2) != 0 ? b50Var.b[1] : -1) != -1) {
                sp spVar = this.j;
                int i3 = (i2 & 2) != 0 ? b50Var.b[1] : -1;
                spVar.getClass();
                int min = Math.min(i3, 16384);
                int i4 = spVar.d;
                if (i4 != min) {
                    if (min < i4) {
                        spVar.b = Math.min(spVar.b, min);
                    }
                    spVar.c = true;
                    spVar.d = min;
                    int i5 = spVar.h;
                    if (min < i5) {
                        if (min == 0) {
                            gp[] gpVarArr = spVar.e;
                            a7.b0(gpVarArr, 0, gpVarArr.length);
                            spVar.f = spVar.e.length - 1;
                            spVar.g = 0;
                            spVar.h = 0;
                        } else {
                            spVar.a(i5 - min);
                        }
                    }
                }
            }
            h(0, 0, 4, 1);
            this.f.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void flush() {
        if (this.i) {
            throw new IOException("closed");
        }
        this.f.flush();
    }

    public final synchronized void g(boolean z, int i, h9 h9Var, int i2) {
        if (this.i) {
            throw new IOException("closed");
        }
        h(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            i9 i9Var = this.f;
            h9Var.getClass();
            i9Var.e(i2, h9Var);
        }
    }

    public final void h(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = k;
        if (logger.isLoggable(level)) {
            logger.fine(zp.a(false, i, i2, i3, i4));
        }
        if (i2 > this.h) {
            g9.k("FRAME_SIZE_ERROR length > ", this.h, ": ", i2);
            return;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            g9.d(f60.e("reserved bit set: ", i));
            return;
        }
        byte[] bArr = cb0.a;
        i9 i9Var = this.f;
        i9Var.getClass();
        i9Var.writeByte((i2 >>> 16) & 255);
        i9Var.writeByte((i2 >>> 8) & 255);
        i9Var.writeByte(i2 & 255);
        i9Var.writeByte(i3 & 255);
        i9Var.writeByte(i4 & 255);
        i9Var.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void k(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            throw null;
        }
        if (this.i) {
            throw new IOException("closed");
        }
        if (f60.j(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        h(0, bArr.length + 8, 7, 0);
        this.f.writeInt(i);
        this.f.writeInt(f60.j(i2));
        if (bArr.length != 0) {
            this.f.write(bArr);
        }
        this.f.flush();
    }

    public final synchronized void q(boolean z, int i, ArrayList arrayList) {
        if (this.i) {
            throw new IOException("closed");
        }
        this.j.d(arrayList);
        long j = this.g.g;
        long min = Math.min(this.h, j);
        int i2 = j == min ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        h(i, (int) min, 1, i2);
        this.f.e(min, this.g);
        if (j > min) {
            long j2 = j - min;
            while (j2 > 0) {
                long min2 = Math.min(this.h, j2);
                j2 -= min2;
                h(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                this.f.e(min2, this.g);
            }
        }
    }

    public final synchronized void r(int i, int i2, boolean z) {
        if (this.i) {
            throw new IOException("closed");
        }
        h(0, 8, 6, z ? 1 : 0);
        this.f.writeInt(i);
        this.f.writeInt(i2);
        this.f.flush();
    }

    public final synchronized void s(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        if (this.i) {
            throw new IOException("closed");
        }
        if (f60.j(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        h(i, 4, 3, 0);
        this.f.writeInt(f60.j(i2));
        this.f.flush();
    }

    public final synchronized void t(int i, long j) {
        if (this.i) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        h(i, 4, 8, 0);
        this.f.writeInt((int) j);
        this.f.flush();
    }
}
