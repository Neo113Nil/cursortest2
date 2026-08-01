package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class go implements Closeable {
    public static final Logger k = Logger.getLogger(nn.class.getName());
    public final v8 f;
    public final u8 g;
    public int h;
    public boolean i;
    public final gn j;

    public go(ay ayVar) {
        ayVar.getClass();
        this.f = ayVar;
        u8 u8Var = new u8();
        this.g = u8Var;
        this.h = 16384;
        this.j = new gn(u8Var);
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

    public final synchronized void m(or orVar) {
        try {
            orVar.getClass();
            if (this.i) {
                throw new IOException("closed");
            }
            int i = this.h;
            int i2 = orVar.f;
            if ((i2 & 32) != 0) {
                i = ((int[]) orVar.g)[5];
            }
            this.h = i;
            if (((i2 & 2) != 0 ? ((int[]) orVar.g)[1] : -1) != -1) {
                gn gnVar = this.j;
                int i3 = (i2 & 2) != 0 ? ((int[]) orVar.g)[1] : -1;
                gnVar.getClass();
                int min = Math.min(i3, 16384);
                int i4 = gnVar.d;
                if (i4 != min) {
                    if (min < i4) {
                        gnVar.b = Math.min(gnVar.b, min);
                    }
                    gnVar.c = true;
                    gnVar.d = min;
                    int i5 = gnVar.h;
                    if (min < i5) {
                        if (min == 0) {
                            um[] umVarArr = gnVar.e;
                            q6.f0(umVarArr, 0, umVarArr.length);
                            gnVar.f = gnVar.e.length - 1;
                            gnVar.g = 0;
                            gnVar.h = 0;
                        } else {
                            gnVar.a(i5 - min);
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

    public final synchronized void n(boolean z, int i, u8 u8Var, int i2) {
        if (this.i) {
            throw new IOException("closed");
        }
        o(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            v8 v8Var = this.f;
            u8Var.getClass();
            v8Var.e(i2, u8Var);
        }
    }

    public final void o(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = k;
        if (logger.isLoggable(level)) {
            logger.fine(nn.a(false, i, i2, i3, i4));
        }
        if (i2 > this.h) {
            t8.n("FRAME_SIZE_ERROR length > ", this.h, ": ", i2);
            return;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            t8.e(d30.e("reserved bit set: ", i));
            return;
        }
        byte[] bArr = r70.a;
        v8 v8Var = this.f;
        v8Var.getClass();
        v8Var.writeByte((i2 >>> 16) & 255);
        v8Var.writeByte((i2 >>> 8) & 255);
        v8Var.writeByte(i2 & 255);
        v8Var.writeByte(i3 & 255);
        v8Var.writeByte(i4 & 255);
        v8Var.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void p(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            throw null;
        }
        if (this.i) {
            throw new IOException("closed");
        }
        if (d30.h(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        o(0, bArr.length + 8, 7, 0);
        this.f.writeInt(i);
        this.f.writeInt(d30.h(i2));
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

    public final synchronized void r(int i, int i2, boolean z) {
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
        if (d30.h(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        o(i, 4, 3, 0);
        this.f.writeInt(d30.h(i2));
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
