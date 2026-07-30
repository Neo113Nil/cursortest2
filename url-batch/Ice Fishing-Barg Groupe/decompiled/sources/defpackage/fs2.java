package defpackage;

import java.io.Closeable;
import java.util.Random;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fs2 implements Closeable {
    public final byte[] BRwzKIf41E4i;
    public final Random OPXfSBeufaJ8;
    public boolean QrzZRwfaDlRX;
    public final xf XL4ISE6Oc65B;
    public final yf cpQdD2nAriOS;
    public final boolean dgRBjINgWbAK;
    public x51 gPXPFXrUH4XX;
    public final yf r3s1LDPKFs1S;
    public final hg rtx2ld2ELZv4;
    public final boolean wdg6QnbFHrFF;
    public final long x50lh2ztY7Y5;

    public fs2(hg hgVar, Random random, boolean z, boolean z2, long j) {
        hgVar.getClass();
        this.rtx2ld2ELZv4 = hgVar;
        this.OPXfSBeufaJ8 = random;
        this.wdg6QnbFHrFF = z;
        this.dgRBjINgWbAK = z2;
        this.x50lh2ztY7Y5 = j;
        this.cpQdD2nAriOS = new yf();
        this.r3s1LDPKFs1S = hgVar.PxuCJdSBwIXG();
        this.BRwzKIf41E4i = new byte[4];
        this.XL4ISE6Oc65B = new xf();
    }

    public final void a92UlCVFR9N8(ah ahVar) {
        long j;
        int i;
        int i2;
        z12 z12Var;
        long j2;
        int i3;
        long j3;
        if (this.QrzZRwfaDlRX) {
            u9.S9EYkSpbGuxq("closed");
            return;
        }
        yf yfVar = this.cpQdD2nAriOS;
        yfVar.nLZGh9p8gVSu(ahVar);
        if (!this.wdg6QnbFHrFF || ahVar.rtx2ld2ELZv4.length < this.x50lh2ztY7Y5) {
            j = 0;
            i = 129;
        } else {
            x51 x51Var = this.gPXPFXrUH4XX;
            if (x51Var == null) {
                x51Var = new x51(0, this.dgRBjINgWbAK);
                this.gPXPFXrUH4XX = x51Var;
            }
            qx qxVar = (qx) x51Var.x50lh2ztY7Y5;
            yf yfVar2 = x51Var.wdg6QnbFHrFF;
            if (yfVar2.OPXfSBeufaJ8 != 0) {
                u9.XL4ISE6Oc65B("Failed requirement.");
                return;
            }
            if (x51Var.OPXfSBeufaJ8) {
                ((Deflater) x51Var.dgRBjINgWbAK).reset();
            }
            qxVar.VhhvGxCb8gfr(yfVar.OPXfSBeufaJ8, yfVar);
            qxVar.flush();
            ah ahVar2 = y51.PxuCJdSBwIXG;
            long j4 = yfVar2.OPXfSBeufaJ8;
            byte[] bArr = ahVar2.rtx2ld2ELZv4;
            byte[] bArr2 = ahVar2.rtx2ld2ELZv4;
            long length = j4 - bArr.length;
            int length2 = bArr.length;
            if (length2 >= 0) {
                if (length >= 0) {
                    long j5 = length2;
                    if (length + j5 <= j4 && length2 <= bArr.length) {
                        if (length2 == 0) {
                            j = 0;
                        } else {
                            long j6 = length + 1;
                            byte[] bArr3 = lS5Rgt96tfkO.PxuCJdSBwIXG;
                            j = 0;
                            cs0.cpQdD2nAriOS(bArr.length, 0L, j5);
                            if (length2 <= 0) {
                                u9.XL4ISE6Oc65B("byteCount == 0");
                                return;
                            }
                            if (length < 0) {
                                u9.OPXfSBeufaJ8("fromIndex < 0: ", length);
                                return;
                            }
                            if (length > j6) {
                                throw new IllegalArgumentException(("fromIndex > toIndex: " + length + " > " + j6).toString());
                            }
                            long j7 = yfVar2.OPXfSBeufaJ8;
                            if (j6 > j7) {
                                j6 = j7;
                            }
                            if (length == j6 || (z12Var = yfVar2.rtx2ld2ELZv4) == null) {
                                i3 = 0;
                                j3 = -1;
                                j2 = -1;
                            } else {
                                j2 = -1;
                                if (j7 - length < length) {
                                    while (j7 > length) {
                                        z12Var = z12Var.RAsUl2FVSrh6;
                                        z12Var.getClass();
                                        j7 -= z12Var.TSizfFm2Yiuu - z12Var.lS5Rgt96tfkO;
                                    }
                                    byte b = bArr2[0];
                                    i3 = 0;
                                    long j8 = j7;
                                    long min = Math.min(j6, (yfVar2.OPXfSBeufaJ8 - j5) + 1);
                                    loop1: while (j8 < min) {
                                        byte[] bArr4 = z12Var.PxuCJdSBwIXG;
                                        byte b2 = b;
                                        int min2 = (int) Math.min(z12Var.TSizfFm2Yiuu, (z12Var.lS5Rgt96tfkO + min) - j8);
                                        int i4 = (int) ((z12Var.lS5Rgt96tfkO + length) - j8);
                                        while (i4 < min2) {
                                            byte b3 = b2;
                                            if (bArr4[i4] == b3 && lS5Rgt96tfkO.PxuCJdSBwIXG(z12Var, i4 + 1, bArr2, 1, length2)) {
                                                j3 = (i4 - z12Var.lS5Rgt96tfkO) + j8;
                                                break loop1;
                                            } else {
                                                i4++;
                                                b2 = b3;
                                            }
                                        }
                                        long j9 = j8 + (z12Var.TSizfFm2Yiuu - z12Var.lS5Rgt96tfkO);
                                        z12Var = z12Var.a92UlCVFR9N8;
                                        z12Var.getClass();
                                        j8 = j9;
                                        b = b2;
                                        length = j8;
                                    }
                                    j3 = -1;
                                } else {
                                    i3 = 0;
                                    long j10 = 0;
                                    while (true) {
                                        long j11 = (z12Var.TSizfFm2Yiuu - z12Var.lS5Rgt96tfkO) + j10;
                                        if (j11 > length) {
                                            break;
                                        }
                                        z12Var = z12Var.a92UlCVFR9N8;
                                        z12Var.getClass();
                                        j10 = j11;
                                    }
                                    byte b4 = bArr2[0];
                                    long min3 = Math.min(j6, (yfVar2.OPXfSBeufaJ8 - j5) + 1);
                                    loop4: while (j10 < min3) {
                                        byte[] bArr5 = z12Var.PxuCJdSBwIXG;
                                        long j12 = j10;
                                        int min4 = (int) Math.min(z12Var.TSizfFm2Yiuu, (z12Var.lS5Rgt96tfkO + min3) - j12);
                                        for (int i5 = (int) ((z12Var.lS5Rgt96tfkO + length) - j12); i5 < min4; i5++) {
                                            if (bArr5[i5] == b4 && lS5Rgt96tfkO.PxuCJdSBwIXG(z12Var, i5 + 1, bArr2, 1, length2)) {
                                                j3 = (i5 - z12Var.lS5Rgt96tfkO) + j12;
                                                break loop4;
                                            }
                                        }
                                        length = j12 + (z12Var.TSizfFm2Yiuu - z12Var.lS5Rgt96tfkO);
                                        z12Var = z12Var.a92UlCVFR9N8;
                                        z12Var.getClass();
                                        j10 = length;
                                    }
                                    j3 = -1;
                                }
                            }
                            if (j3 == j2) {
                                i2 = i3;
                            }
                        }
                        long j13 = yfVar2.OPXfSBeufaJ8 - 4;
                        xf xfVar = new xf();
                        yfVar2.XL4ISE6Oc65B(xfVar);
                        try {
                            xfVar.lS5Rgt96tfkO(j13);
                            xfVar.close();
                            yfVar.VhhvGxCb8gfr(yfVar2.OPXfSBeufaJ8, yfVar2);
                            i = 193;
                        } finally {
                        }
                    }
                } else {
                    j = 0;
                    i2 = 0;
                }
                yfVar2.Pf0ThKz3j5YS(i2);
                yfVar.VhhvGxCb8gfr(yfVar2.OPXfSBeufaJ8, yfVar2);
                i = 193;
            }
            i2 = 0;
            j = 0;
            yfVar2.Pf0ThKz3j5YS(i2);
            yfVar.VhhvGxCb8gfr(yfVar2.OPXfSBeufaJ8, yfVar2);
            i = 193;
        }
        long j14 = yfVar.OPXfSBeufaJ8;
        yf yfVar3 = this.r3s1LDPKFs1S;
        yfVar3.Pf0ThKz3j5YS(i);
        if (j14 <= 125) {
            yfVar3.Pf0ThKz3j5YS(((int) j14) | 128);
        } else if (j14 <= 65535) {
            yfVar3.Pf0ThKz3j5YS(254);
            yfVar3.zf8DYfih6EZu((int) j14);
        } else {
            yfVar3.Pf0ThKz3j5YS(255);
            z12 kpCQ9veP6n3I = yfVar3.kpCQ9veP6n3I(8);
            byte[] bArr6 = kpCQ9veP6n3I.PxuCJdSBwIXG;
            int i6 = kpCQ9veP6n3I.TSizfFm2Yiuu;
            bArr6[i6] = (byte) ((j14 >>> 56) & 255);
            bArr6[i6 + 1] = (byte) ((j14 >>> 48) & 255);
            bArr6[i6 + 2] = (byte) ((j14 >>> 40) & 255);
            bArr6[i6 + 3] = (byte) ((j14 >>> 32) & 255);
            bArr6[i6 + 4] = (byte) ((j14 >>> 24) & 255);
            bArr6[i6 + 5] = (byte) ((j14 >>> 16) & 255);
            bArr6[i6 + 6] = (byte) ((j14 >>> 8) & 255);
            bArr6[i6 + 7] = (byte) (j14 & 255);
            kpCQ9veP6n3I.TSizfFm2Yiuu = i6 + 8;
            yfVar3.OPXfSBeufaJ8 += 8;
        }
        byte[] bArr7 = this.BRwzKIf41E4i;
        bArr7.getClass();
        this.OPXfSBeufaJ8.nextBytes(bArr7);
        yfVar3.rZjpSjn4zoMv(bArr7.length, bArr7);
        if (j14 > j) {
            xf xfVar2 = this.XL4ISE6Oc65B;
            xfVar2.getClass();
            yfVar.XL4ISE6Oc65B(xfVar2);
            xfVar2.a92UlCVFR9N8(j);
            sj0.wLFCmsViZrNT(xfVar2, bArr7);
            xfVar2.close();
        }
        yfVar3.VhhvGxCb8gfr(j14, yfVar);
        this.rtx2ld2ELZv4.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x51 x51Var = this.gPXPFXrUH4XX;
        if (x51Var != null) {
            kv2.PxuCJdSBwIXG(x51Var);
        }
        kv2.PxuCJdSBwIXG(this.rtx2ld2ELZv4);
    }

    public final void lS5Rgt96tfkO(int i, ah ahVar) {
        if (this.QrzZRwfaDlRX) {
            u9.S9EYkSpbGuxq("closed");
            return;
        }
        int TSizfFm2Yiuu = ahVar.TSizfFm2Yiuu();
        if (TSizfFm2Yiuu > 125) {
            u9.XL4ISE6Oc65B("Payload size must be less than or equal to 125");
            return;
        }
        yf yfVar = this.r3s1LDPKFs1S;
        yfVar.Pf0ThKz3j5YS(i | 128);
        yfVar.Pf0ThKz3j5YS(TSizfFm2Yiuu | 128);
        byte[] bArr = this.BRwzKIf41E4i;
        bArr.getClass();
        this.OPXfSBeufaJ8.nextBytes(bArr);
        yfVar.rZjpSjn4zoMv(bArr.length, bArr);
        if (TSizfFm2Yiuu > 0) {
            long j = yfVar.OPXfSBeufaJ8;
            yfVar.nLZGh9p8gVSu(ahVar);
            xf xfVar = this.XL4ISE6Oc65B;
            xfVar.getClass();
            yfVar.XL4ISE6Oc65B(xfVar);
            xfVar.a92UlCVFR9N8(j);
            sj0.wLFCmsViZrNT(xfVar, bArr);
            xfVar.close();
        }
        this.rtx2ld2ELZv4.flush();
    }
}
