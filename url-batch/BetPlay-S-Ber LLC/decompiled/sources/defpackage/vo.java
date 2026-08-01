package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class vo implements Closeable {
    public static final Logger k = Logger.getLogger(co.class.getName());
    public final q8 f;
    public final p8 g;
    public int h;
    public boolean i;
    public final vn j;

    public vo(qy qyVar) {
        qyVar.getClass();
        this.f = qyVar;
        p8 p8Var = new p8();
        this.g = p8Var;
        this.h = 16384;
        this.j = new vn(p8Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.i = true;
        this.f.close();
    }

    public final synchronized void flush() {
        if (this.i) {
            throw new IOException("closed");
        }
        this.f.flush();
    }

    public final synchronized void m(v2 v2Var) {
        try {
            v2Var.getClass();
            if (this.i) {
                throw new IOException("closed");
            }
            int i = this.h;
            int i2 = v2Var.a;
            if ((i2 & 32) != 0) {
                i = ((int[]) v2Var.b)[5];
            }
            this.h = i;
            if (((i2 & 2) != 0 ? ((int[]) v2Var.b)[1] : -1) != -1) {
                vn vnVar = this.j;
                int i3 = (i2 & 2) != 0 ? ((int[]) v2Var.b)[1] : -1;
                vnVar.getClass();
                int min = Math.min(i3, 16384);
                int i4 = vnVar.d;
                if (i4 != min) {
                    if (min < i4) {
                        vnVar.b = Math.min(vnVar.b, min);
                    }
                    vnVar.c = true;
                    vnVar.d = min;
                    int i5 = vnVar.h;
                    if (min < i5) {
                        if (min == 0) {
                            mn[] mnVarArr = vnVar.e;
                            h7.i0(mnVarArr, 0, mnVarArr.length);
                            vnVar.f = vnVar.e.length - 1;
                            vnVar.g = 0;
                            vnVar.h = 0;
                        } else {
                            vnVar.a(i5 - min);
                        }
                    }
                }
            }
            o(0, 0, 4, 1);
            this.f.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n(boolean z, int i, p8 p8Var, int i2) {
        if (this.i) {
            throw new IOException("closed");
        }
        o(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            q8 q8Var = this.f;
            p8Var.getClass();
            q8Var.e(i2, p8Var);
        }
    }

    public final void o(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = k;
        if (logger.isLoggable(level)) {
            logger.fine(co.a(false, i, i2, i3, i4));
        }
        if (i2 > this.h) {
            o8.l("FRAME_SIZE_ERROR length > ", this.h, ": ", i2);
            return;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            o8.e(o30.e("reserved bit set: ", i));
            return;
        }
        byte[] bArr = y70.a;
        q8 q8Var = this.f;
        q8Var.getClass();
        q8Var.writeByte((i2 >>> 16) & 255);
        q8Var.writeByte((i2 >>> 8) & 255);
        q8Var.writeByte(i2 & 255);
        q8Var.writeByte(i3 & 255);
        q8Var.writeByte(i4 & 255);
        q8Var.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void p(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            throw null;
        }
        if (this.i) {
            throw new IOException("closed");
        }
        if (o30.i(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        o(0, bArr.length + 8, 7, 0);
        this.f.writeInt(i);
        this.f.writeInt(o30.i(i2));
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
        o(i, (int) min, 1, i2);
        this.f.e(min, this.g);
        if (j > min) {
            long j2 = j - min;
            while (j2 > 0) {
                long min2 = Math.min(this.h, j2);
                j2 -= min2;
                o(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                this.f.e(min2, this.g);
            }
        }
    }

    public final synchronized void r(int i, boolean z, int i2) {
        if (this.i) {
            throw new IOException("closed");
        }
        o(0, 8, 6, z ? 1 : 0);
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
        if (o30.i(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        o(i, 4, 3, 0);
        this.f.writeInt(o30.i(i2));
        this.f.flush();
    }

    public final synchronized void t(int i, long j) {
        if (this.i) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        o(i, 4, 8, 0);
        this.f.writeInt((int) j);
        this.f.flush();
    }
}
