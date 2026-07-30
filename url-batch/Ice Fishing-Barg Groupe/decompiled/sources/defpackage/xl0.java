package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xl0 implements Closeable {
    public static final wl0 Companion = new wl0();
    public static final Logger cpQdD2nAriOS = Logger.getLogger(zk0.class.getName());
    public final yf OPXfSBeufaJ8;
    public boolean dgRBjINgWbAK;
    public final hg rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;
    public final rk0 x50lh2ztY7Y5;

    public xl0(ds1 ds1Var) {
        ds1Var.getClass();
        this.rtx2ld2ELZv4 = ds1Var;
        yf yfVar = new yf();
        this.OPXfSBeufaJ8 = yfVar;
        this.wdg6QnbFHrFF = 16384;
        this.x50lh2ztY7Y5 = new rk0(yfVar);
    }

    public final void OPXfSBeufaJ8(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = cpQdD2nAriOS;
            if (logger.isLoggable(level)) {
                logger.fine(zk0.lS5Rgt96tfkO(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.wdg6QnbFHrFF) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.wdg6QnbFHrFF + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            u9.e9gEMXR7LXtO(o0.wdg6QnbFHrFF("reserved bit set: ", i));
            return;
        }
        byte[] bArr = kv2.PxuCJdSBwIXG;
        hg hgVar = this.rtx2ld2ELZv4;
        hgVar.getClass();
        hgVar.writeByte((i2 >>> 16) & 255);
        hgVar.writeByte((i2 >>> 8) & 255);
        hgVar.writeByte(i2 & 255);
        hgVar.writeByte(i3 & 255);
        hgVar.writeByte(i4 & 255);
        hgVar.writeInt(i & Integer.MAX_VALUE);
    }

    public final void RfyTYNmI9Srp(int i, o60 o60Var) {
        synchronized (this) {
            if (this.dgRBjINgWbAK) {
                throw new IOException("closed");
            }
            if (o60Var.rtx2ld2ELZv4 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            OPXfSBeufaJ8(i, 4, 3, 0);
            this.rtx2ld2ELZv4.writeInt(o60Var.rtx2ld2ELZv4);
            this.rtx2ld2ELZv4.flush();
        }
    }

    public final void S2OOm9zPNm0h(int i, long j) {
        synchronized (this) {
            try {
                if (this.dgRBjINgWbAK) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = cpQdD2nAriOS;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(zk0.TSizfFm2Yiuu(false, i, 4, j));
                }
                OPXfSBeufaJ8(i, 4, 8, 0);
                this.rtx2ld2ELZv4.writeInt((int) j);
                this.rtx2ld2ELZv4.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void XL4ISE6Oc65B(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.dgRBjINgWbAK) {
                throw new IOException("closed");
            }
            OPXfSBeufaJ8(0, 8, 6, z ? 1 : 0);
            this.rtx2ld2ELZv4.writeInt(i);
            this.rtx2ld2ELZv4.writeInt(i2);
            this.rtx2ld2ELZv4.flush();
        }
    }

    public final void a92UlCVFR9N8(boolean z, int i, yf yfVar, int i2) {
        synchronized (this) {
            if (this.dgRBjINgWbAK) {
                throw new IOException("closed");
            }
            OPXfSBeufaJ8(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                hg hgVar = this.rtx2ld2ELZv4;
                yfVar.getClass();
                hgVar.VhhvGxCb8gfr(i2, yfVar);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.dgRBjINgWbAK = true;
            this.rtx2ld2ELZv4.close();
        }
    }

    public final void cpQdD2nAriOS(int i, o60 o60Var, byte[] bArr) {
        synchronized (this) {
            if (this.dgRBjINgWbAK) {
                throw new IOException("closed");
            }
            if (o60Var.rtx2ld2ELZv4 == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            OPXfSBeufaJ8(0, bArr.length + 8, 7, 0);
            this.rtx2ld2ELZv4.writeInt(i);
            this.rtx2ld2ELZv4.writeInt(o60Var.rtx2ld2ELZv4);
            if (bArr.length != 0) {
                this.rtx2ld2ELZv4.write(bArr);
            }
            this.rtx2ld2ELZv4.flush();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.dgRBjINgWbAK) {
                throw new IOException("closed");
            }
            this.rtx2ld2ELZv4.flush();
        }
    }

    public final void gPXPFXrUH4XX(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.dgRBjINgWbAK) {
                throw new IOException("closed");
            }
            this.x50lh2ztY7Y5.Y1f8riQaR6yg(arrayList);
            long j = this.OPXfSBeufaJ8.OPXfSBeufaJ8;
            long min = Math.min(this.wdg6QnbFHrFF, j);
            int i2 = j == min ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            OPXfSBeufaJ8(i, (int) min, 1, i2);
            this.rtx2ld2ELZv4.VhhvGxCb8gfr(min, this.OPXfSBeufaJ8);
            if (j > min) {
                long j2 = j - min;
                while (j2 > 0) {
                    long min2 = Math.min(this.wdg6QnbFHrFF, j2);
                    j2 -= min2;
                    OPXfSBeufaJ8(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                    this.rtx2ld2ELZv4.VhhvGxCb8gfr(min2, this.OPXfSBeufaJ8);
                }
            }
        }
    }

    public final void lS5Rgt96tfkO(t42 t42Var) {
        t42Var.getClass();
        synchronized (this) {
            try {
                if (this.dgRBjINgWbAK) {
                    throw new IOException("closed");
                }
                int i = this.wdg6QnbFHrFF;
                int i2 = t42Var.PxuCJdSBwIXG;
                if ((i2 & 32) != 0) {
                    i = t42Var.lS5Rgt96tfkO[5];
                }
                this.wdg6QnbFHrFF = i;
                if (((i2 & 2) != 0 ? t42Var.lS5Rgt96tfkO[1] : -1) != -1) {
                    rk0 rk0Var = this.x50lh2ztY7Y5;
                    int i3 = (i2 & 2) != 0 ? t42Var.lS5Rgt96tfkO[1] : -1;
                    rk0Var.getClass();
                    int min = Math.min(i3, 16384);
                    int i4 = rk0Var.Y1f8riQaR6yg;
                    if (i4 != min) {
                        if (min < i4) {
                            rk0Var.lS5Rgt96tfkO = Math.min(rk0Var.lS5Rgt96tfkO, min);
                        }
                        rk0Var.TSizfFm2Yiuu = true;
                        rk0Var.Y1f8riQaR6yg = min;
                        int i5 = rk0Var.rtx2ld2ELZv4;
                        if (min < i5) {
                            if (min == 0) {
                                fj0[] fj0VarArr = rk0Var.e9gEMXR7LXtO;
                                na.v6yxfmkxNKhL(0, fj0VarArr.length, null, fj0VarArr);
                                rk0Var.a92UlCVFR9N8 = rk0Var.e9gEMXR7LXtO.length - 1;
                                rk0Var.RAsUl2FVSrh6 = 0;
                                rk0Var.rtx2ld2ELZv4 = 0;
                            } else {
                                rk0Var.PxuCJdSBwIXG(i5 - min);
                            }
                        }
                    }
                }
                OPXfSBeufaJ8(0, 0, 4, 1);
                this.rtx2ld2ELZv4.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
