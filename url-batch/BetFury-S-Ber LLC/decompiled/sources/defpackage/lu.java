package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class lu implements Closeable {
    public static final Logger k = Logger.getLogger(st.class.getName());
    public final v9 f;
    public final t9 g;
    public int h;
    public boolean i;
    public final lt j;

    public lu(i70 i70Var) {
        i70Var.getClass();
        this.f = i70Var;
        t9 t9Var = new t9();
        this.g = t9Var;
        this.h = 16384;
        this.j = new lt(t9Var);
    }

    public final synchronized void D(boolean z, int i, ArrayList arrayList) {
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
        r(i, (int) min, 1, i2);
        this.f.v(min, this.g);
        if (j > min) {
            long j2 = j - min;
            while (j2 > 0) {
                long min2 = Math.min(this.h, j2);
                j2 -= min2;
                r(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                this.f.v(min2, this.g);
            }
        }
    }

    public final synchronized void O(int i, int i2, boolean z) {
        if (this.i) {
            throw new IOException("closed");
        }
        r(0, 8, 6, z ? 1 : 0);
        this.f.writeInt(i);
        this.f.writeInt(i2);
        this.f.flush();
    }

    public final synchronized void P(int i, kn knVar) {
        knVar.getClass();
        if (this.i) {
            throw new IOException("closed");
        }
        if (knVar.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        r(i, 4, 3, 0);
        this.f.writeInt(knVar.getHttpCode());
        this.f.flush();
    }

    public final synchronized void Q(int i, long j) {
        if (this.i) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        r(i, 4, 8, 0);
        this.f.writeInt((int) j);
        this.f.flush();
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

    public final synchronized void i(cd0 cd0Var) {
        try {
            cd0Var.getClass();
            if (this.i) {
                throw new IOException("closed");
            }
            int i = this.h;
            int i2 = cd0Var.a;
            if ((i2 & 32) != 0) {
                i = cd0Var.b[5];
            }
            this.h = i;
            if (((i2 & 2) != 0 ? cd0Var.b[1] : -1) != -1) {
                lt ltVar = this.j;
                int i3 = (i2 & 2) != 0 ? cd0Var.b[1] : -1;
                ltVar.getClass();
                int min = Math.min(i3, 16384);
                int i4 = ltVar.d;
                if (i4 != min) {
                    if (min < i4) {
                        ltVar.b = Math.min(ltVar.b, min);
                    }
                    ltVar.c = true;
                    ltVar.d = min;
                    int i5 = ltVar.h;
                    if (min < i5) {
                        if (min == 0) {
                            xs[] xsVarArr = ltVar.e;
                            j7.a0(xsVarArr, 0, xsVarArr.length);
                            ltVar.f = ltVar.e.length - 1;
                            ltVar.g = 0;
                            ltVar.h = 0;
                        } else {
                            ltVar.a(i5 - min);
                        }
                    }
                }
            }
            r(0, 0, 4, 1);
            this.f.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n(boolean z, int i, t9 t9Var, int i2) {
        if (this.i) {
            throw new IOException("closed");
        }
        r(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            v9 v9Var = this.f;
            t9Var.getClass();
            v9Var.v(i2, t9Var);
        }
    }

    public final void r(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = k;
        if (logger.isLoggable(level)) {
            logger.fine(st.a(false, i, i2, i3, i4));
        }
        if (i2 > this.h) {
            s9.m("FRAME_SIZE_ERROR length > ", this.h, ": ", i2);
            return;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            s9.e(r7.b("reserved bit set: ", i));
            return;
        }
        byte[] bArr = zk0.a;
        v9 v9Var = this.f;
        v9Var.getClass();
        v9Var.writeByte((i2 >>> 16) & 255);
        v9Var.writeByte((i2 >>> 8) & 255);
        v9Var.writeByte(i2 & 255);
        v9Var.writeByte(i3 & 255);
        v9Var.writeByte(i4 & 255);
        v9Var.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void w(int i, kn knVar, byte[] bArr) {
        knVar.getClass();
        if (this.i) {
            throw new IOException("closed");
        }
        if (knVar.getHttpCode() == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        r(0, bArr.length + 8, 7, 0);
        this.f.writeInt(i);
        this.f.writeInt(knVar.getHttpCode());
        if (bArr.length != 0) {
            this.f.write(bArr);
        }
        this.f.flush();
    }
}
