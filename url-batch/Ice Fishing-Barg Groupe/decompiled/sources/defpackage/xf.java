package defpackage;

import java.io.Closeable;
import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xf implements Closeable {
    public boolean OPXfSBeufaJ8;
    public yf rtx2ld2ELZv4;
    public z12 wdg6QnbFHrFF;
    public byte[] x50lh2ztY7Y5;
    public long dgRBjINgWbAK = -1;
    public int cpQdD2nAriOS = -1;
    public int r3s1LDPKFs1S = -1;

    public final int a92UlCVFR9N8(long j) {
        yf yfVar = this.rtx2ld2ELZv4;
        if (yfVar == null) {
            u9.rtx2ld2ELZv4("not attached to a buffer");
            return 0;
        }
        if (j >= -1) {
            long j2 = yfVar.OPXfSBeufaJ8;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.wdg6QnbFHrFF = null;
                    this.dgRBjINgWbAK = j;
                    this.x50lh2ztY7Y5 = null;
                    this.cpQdD2nAriOS = -1;
                    this.r3s1LDPKFs1S = -1;
                    return -1;
                }
                z12 z12Var = yfVar.rtx2ld2ELZv4;
                z12 z12Var2 = this.wdg6QnbFHrFF;
                long j3 = 0;
                if (z12Var2 != null) {
                    long j4 = this.dgRBjINgWbAK - (this.cpQdD2nAriOS - z12Var2.lS5Rgt96tfkO);
                    if (j4 > j) {
                        z12Var2 = z12Var;
                        z12Var = z12Var2;
                        j2 = j4;
                    } else {
                        j3 = j4;
                    }
                } else {
                    z12Var2 = z12Var;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        z12Var2.getClass();
                        long j5 = (z12Var2.TSizfFm2Yiuu - z12Var2.lS5Rgt96tfkO) + j3;
                        if (j < j5) {
                            break;
                        }
                        z12Var2 = z12Var2.a92UlCVFR9N8;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        z12Var.getClass();
                        z12Var = z12Var.RAsUl2FVSrh6;
                        z12Var.getClass();
                        j2 -= z12Var.TSizfFm2Yiuu - z12Var.lS5Rgt96tfkO;
                    }
                    z12Var2 = z12Var;
                    j3 = j2;
                }
                if (this.OPXfSBeufaJ8) {
                    z12Var2.getClass();
                    if (z12Var2.Y1f8riQaR6yg) {
                        byte[] bArr = z12Var2.PxuCJdSBwIXG;
                        z12 z12Var3 = new z12(Arrays.copyOf(bArr, bArr.length), z12Var2.lS5Rgt96tfkO, z12Var2.TSizfFm2Yiuu, false, true);
                        if (yfVar.rtx2ld2ELZv4 == z12Var2) {
                            yfVar.rtx2ld2ELZv4 = z12Var3;
                        }
                        z12Var2.lS5Rgt96tfkO(z12Var3);
                        z12 z12Var4 = z12Var3.RAsUl2FVSrh6;
                        z12Var4.getClass();
                        z12Var4.PxuCJdSBwIXG();
                        z12Var2 = z12Var3;
                    }
                }
                this.wdg6QnbFHrFF = z12Var2;
                this.dgRBjINgWbAK = j;
                z12Var2.getClass();
                this.x50lh2ztY7Y5 = z12Var2.PxuCJdSBwIXG;
                int i = z12Var2.lS5Rgt96tfkO + ((int) (j - j3));
                this.cpQdD2nAriOS = i;
                int i2 = z12Var2.TSizfFm2Yiuu;
                this.r3s1LDPKFs1S = i2;
                return i2 - i;
            }
        }
        throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + yfVar.OPXfSBeufaJ8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.rtx2ld2ELZv4 == null) {
            u9.rtx2ld2ELZv4("not attached to a buffer");
            return;
        }
        this.rtx2ld2ELZv4 = null;
        this.wdg6QnbFHrFF = null;
        this.dgRBjINgWbAK = -1L;
        this.x50lh2ztY7Y5 = null;
        this.cpQdD2nAriOS = -1;
        this.r3s1LDPKFs1S = -1;
    }

    public final void lS5Rgt96tfkO(long j) {
        yf yfVar = this.rtx2ld2ELZv4;
        if (yfVar == null) {
            u9.rtx2ld2ELZv4("not attached to a buffer");
            return;
        }
        if (!this.OPXfSBeufaJ8) {
            u9.rtx2ld2ELZv4("resizeBuffer() only permitted for read/write buffers");
            return;
        }
        long j2 = yfVar.OPXfSBeufaJ8;
        if (j <= j2) {
            if (j < 0) {
                u9.OPXfSBeufaJ8("newSize < 0: ", j);
                return;
            }
            long j3 = j2 - j;
            while (true) {
                if (j3 <= 0) {
                    break;
                }
                z12 z12Var = yfVar.rtx2ld2ELZv4;
                z12Var.getClass();
                z12 z12Var2 = z12Var.RAsUl2FVSrh6;
                z12Var2.getClass();
                int i = z12Var2.TSizfFm2Yiuu;
                long j4 = i - z12Var2.lS5Rgt96tfkO;
                if (j4 > j3) {
                    z12Var2.TSizfFm2Yiuu = i - ((int) j3);
                    break;
                } else {
                    yfVar.rtx2ld2ELZv4 = z12Var2.PxuCJdSBwIXG();
                    d22.PxuCJdSBwIXG(z12Var2);
                    j3 -= j4;
                }
            }
            this.wdg6QnbFHrFF = null;
            this.dgRBjINgWbAK = j;
            this.x50lh2ztY7Y5 = null;
            this.cpQdD2nAriOS = -1;
            this.r3s1LDPKFs1S = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                z12 kpCQ9veP6n3I = yfVar.kpCQ9veP6n3I(i2);
                int min = (int) Math.min(j5, 8192 - kpCQ9veP6n3I.TSizfFm2Yiuu);
                int i3 = kpCQ9veP6n3I.TSizfFm2Yiuu + min;
                kpCQ9veP6n3I.TSizfFm2Yiuu = i3;
                j5 -= min;
                if (z) {
                    this.wdg6QnbFHrFF = kpCQ9veP6n3I;
                    this.dgRBjINgWbAK = j2;
                    this.x50lh2ztY7Y5 = kpCQ9veP6n3I.PxuCJdSBwIXG;
                    this.cpQdD2nAriOS = i3 - min;
                    this.r3s1LDPKFs1S = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        yfVar.OPXfSBeufaJ8 = j;
    }
}
