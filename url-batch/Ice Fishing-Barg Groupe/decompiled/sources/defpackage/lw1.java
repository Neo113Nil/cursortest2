package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class lw1 extends tl {
    public static final jw1 Companion = new jw1();
    public static final rc1 XL4ISE6Oc65B = new rc1(5);
    public final boolean BRwzKIf41E4i;
    public final float[] OPXfSBeufaJ8;
    public final kw1 QrzZRwfaDlRX;
    public final vk2 RAsUl2FVSrh6;
    public final gs2 Y1f8riQaR6yg;
    public final float a92UlCVFR9N8;
    public final gw1 cpQdD2nAriOS;
    public final f10 dgRBjINgWbAK;
    public final float e9gEMXR7LXtO;
    public final gw1 gPXPFXrUH4XX;
    public final f10 r3s1LDPKFs1S;
    public final float[] rtx2ld2ELZv4;
    public final float[] wdg6QnbFHrFF;
    public final kw1 x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01ea, code lost:
    
        if ((((r25 - r12) * r3) - ((r1 - r15) * r10)) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lw1(String str, float[] fArr, gs2 gs2Var, float[] fArr2, f10 f10Var, f10 f10Var2, float f, float f2, vk2 vk2Var, int i) {
        super(i, 12884901888L, str);
        ?? r44;
        float f3;
        float f4;
        boolean z;
        ml.Companion.getClass();
        this.Y1f8riQaR6yg = gs2Var;
        this.e9gEMXR7LXtO = f;
        this.a92UlCVFR9N8 = f2;
        this.RAsUl2FVSrh6 = vk2Var;
        this.dgRBjINgWbAK = f10Var;
        int i2 = 1;
        this.x50lh2ztY7Y5 = new kw1(this, i2);
        int i3 = 0;
        this.cpQdD2nAriOS = new gw1(this, i3);
        this.r3s1LDPKFs1S = f10Var2;
        this.QrzZRwfaDlRX = new kw1(this, i3);
        this.gPXPFXrUH4XX = new gw1(this, i2);
        if (fArr.length != 6 && fArr.length != 9) {
            u9.XL4ISE6Oc65B("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        Companion.getClass();
        float[] fArr3 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr3[0] = f5 / f7;
            fArr3[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr3[2] = f8 / f10;
            fArr3[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr3[4] = f11 / f13;
            fArr3[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.rtx2ld2ELZv4 = fArr3;
        if (fArr2 == null) {
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr3[2];
            float f17 = fArr3[3];
            float f18 = fArr3[4];
            float f19 = fArr3[5];
            f3 = 1.0f;
            float f20 = gs2Var.PxuCJdSBwIXG;
            r44 = 1;
            float f21 = gs2Var.lS5Rgt96tfkO;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            this.OPXfSBeufaJ8 = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
        } else {
            r44 = 1;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.OPXfSBeufaJ8 = fArr2;
        }
        this.wdg6QnbFHrFF = ov2.ozEBbv0hFTAB(this.OPXfSBeufaJ8);
        float PxuCJdSBwIXG = jw1.PxuCJdSBwIXG(fArr3);
        float[] fArr4 = wl.PxuCJdSBwIXG;
        if (PxuCJdSBwIXG / jw1.PxuCJdSBwIXG(wl.lS5Rgt96tfkO) > 0.9f) {
            float[] fArr5 = wl.PxuCJdSBwIXG;
            float f38 = fArr3[0];
            float f39 = fArr5[0];
            float f40 = fArr3[r44];
            float f41 = fArr5[r44];
            float f42 = fArr3[2];
            float f43 = fArr5[2];
            float f44 = fArr3[3];
            float f45 = fArr5[3];
            float f46 = fArr3[4];
            float f47 = fArr5[4];
            float f48 = fArr3[5];
            float f49 = fArr5[5];
            f4 = 0.0f;
            float[] fArr6 = new float[6];
            fArr6[0] = f38 - f39;
            fArr6[r44] = f40 - f41;
            fArr6[2] = f42 - f43;
            fArr6[3] = f44 - f45;
            fArr6[4] = f46 - f47;
            fArr6[5] = f48 - f49;
            float f50 = fArr6[0];
            float f51 = fArr6[r44];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr6[2];
                float f53 = fArr6[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr6[4];
                    float f55 = fArr6[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) >= 0.0f) {
                    }
                }
            }
        } else {
            f4 = 0.0f;
        }
        int i4 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            float[] fArr7 = wl.PxuCJdSBwIXG;
            if (fArr3 != fArr7) {
                for (int i5 = 0; i5 < 6; i5++) {
                    if (Float.compare(fArr3[i5], fArr7[i5]) != 0 && Math.abs(fArr3[i5] - fArr7[i5]) > 0.001f) {
                        break;
                    }
                }
            }
            if (ov2.S9EYkSpbGuxq(gs2Var, b51.RAsUl2FVSrh6) && f == f4 && f2 == f3) {
                float[] fArr8 = wl.PxuCJdSBwIXG;
                lw1 lw1Var = wl.e9gEMXR7LXtO;
                for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                    if (Math.abs(f10Var.TSizfFm2Yiuu(d) - lw1Var.dgRBjINgWbAK.TSizfFm2Yiuu(d)) <= 0.001d && Math.abs(f10Var2.TSizfFm2Yiuu(d) - lw1Var.r3s1LDPKFs1S.TSizfFm2Yiuu(d)) <= 0.001d) {
                    }
                }
            }
            z = false;
            this.BRwzKIf41E4i = z;
        }
        z = r44;
        this.BRwzKIf41E4i = z;
    }

    @Override // defpackage.tl
    public final float PxuCJdSBwIXG(int i) {
        return this.a92UlCVFR9N8;
    }

    @Override // defpackage.tl
    public final boolean TSizfFm2Yiuu() {
        return this.BRwzKIf41E4i;
    }

    @Override // defpackage.tl
    public final long Y1f8riQaR6yg(float f, float f2, float f3) {
        double d = f;
        gw1 gw1Var = this.gPXPFXrUH4XX;
        float TSizfFm2Yiuu = (float) gw1Var.TSizfFm2Yiuu(d);
        float TSizfFm2Yiuu2 = (float) gw1Var.TSizfFm2Yiuu(f2);
        float TSizfFm2Yiuu3 = (float) gw1Var.TSizfFm2Yiuu(f3);
        float[] fArr = this.OPXfSBeufaJ8;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * TSizfFm2Yiuu3) + (fArr[3] * TSizfFm2Yiuu2) + (fArr[0] * TSizfFm2Yiuu);
        float f5 = (fArr[7] * TSizfFm2Yiuu3) + (fArr[4] * TSizfFm2Yiuu2) + (fArr[1] * TSizfFm2Yiuu);
        return (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
    }

    @Override // defpackage.tl
    public final long a92UlCVFR9N8(float f, float f2, float f3, float f4, tl tlVar) {
        float[] fArr = this.wdg6QnbFHrFF;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        gw1 gw1Var = this.cpQdD2nAriOS;
        return mm2.lS5Rgt96tfkO((float) gw1Var.TSizfFm2Yiuu(f5), (float) gw1Var.TSizfFm2Yiuu(f6), (float) gw1Var.TSizfFm2Yiuu(f7), f4, tlVar);
    }

    @Override // defpackage.tl
    public final float e9gEMXR7LXtO(float f, float f2, float f3) {
        double d = f;
        gw1 gw1Var = this.gPXPFXrUH4XX;
        float TSizfFm2Yiuu = (float) gw1Var.TSizfFm2Yiuu(d);
        float TSizfFm2Yiuu2 = (float) gw1Var.TSizfFm2Yiuu(f2);
        float TSizfFm2Yiuu3 = (float) gw1Var.TSizfFm2Yiuu(f3);
        float[] fArr = this.OPXfSBeufaJ8;
        return (fArr[8] * TSizfFm2Yiuu3) + (fArr[5] * TSizfFm2Yiuu2) + (fArr[2] * TSizfFm2Yiuu);
    }

    @Override // defpackage.tl
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lw1.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        lw1 lw1Var = (lw1) obj;
        if (Float.compare(lw1Var.e9gEMXR7LXtO, this.e9gEMXR7LXtO) != 0 || Float.compare(lw1Var.a92UlCVFR9N8, this.a92UlCVFR9N8) != 0 || !cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, lw1Var.Y1f8riQaR6yg) || !Arrays.equals(this.rtx2ld2ELZv4, lw1Var.rtx2ld2ELZv4)) {
            return false;
        }
        vk2 vk2Var = lw1Var.RAsUl2FVSrh6;
        vk2 vk2Var2 = this.RAsUl2FVSrh6;
        if (vk2Var2 != null) {
            return cs0.wdg6QnbFHrFF(vk2Var2, vk2Var);
        }
        if (vk2Var == null) {
            return true;
        }
        if (cs0.wdg6QnbFHrFF(this.dgRBjINgWbAK, lw1Var.dgRBjINgWbAK)) {
            return cs0.wdg6QnbFHrFF(this.r3s1LDPKFs1S, lw1Var.r3s1LDPKFs1S);
        }
        return false;
    }

    @Override // defpackage.tl
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.rtx2ld2ELZv4) + ((this.Y1f8riQaR6yg.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e9gEMXR7LXtO;
        int floatToIntBits = (hashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.a92UlCVFR9N8;
        int floatToIntBits2 = (floatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        vk2 vk2Var = this.RAsUl2FVSrh6;
        int hashCode2 = floatToIntBits2 + (vk2Var != null ? vk2Var.hashCode() : 0);
        if (vk2Var != null) {
            return hashCode2;
        }
        return this.r3s1LDPKFs1S.hashCode() + ((this.dgRBjINgWbAK.hashCode() + (hashCode2 * 31)) * 31);
    }

    @Override // defpackage.tl
    public final float lS5Rgt96tfkO(int i) {
        return this.e9gEMXR7LXtO;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lw1(String str, float[] fArr, gs2 gs2Var, final vk2 vk2Var, int i) {
        this(str, fArr, gs2Var, null, r4, r0, 0.0f, 1.0f, vk2Var, i);
        double d;
        f10 f10Var;
        f10 f10Var2;
        Companion.getClass();
        double d2 = vk2Var.PxuCJdSBwIXG;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = vk2Var.RAsUl2FVSrh6;
        double d4 = vk2Var.a92UlCVFR9N8;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            f10Var = new f10() { // from class: iw1
                @Override // defpackage.f10
                public final double TSizfFm2Yiuu(double d5) {
                    int i5 = i4;
                    vk2 vk2Var2 = vk2Var;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = wl.PxuCJdSBwIXG;
                            return wl.PxuCJdSBwIXG(vk2Var2, d5);
                        case 1:
                            float[] fArr3 = wl.PxuCJdSBwIXG;
                            return wl.TSizfFm2Yiuu(vk2Var2, d5);
                        case 2:
                            double d6 = vk2Var2.lS5Rgt96tfkO;
                            return d5 >= vk2Var2.e9gEMXR7LXtO ? Math.pow((d6 * d5) + vk2Var2.TSizfFm2Yiuu, vk2Var2.PxuCJdSBwIXG) : vk2Var2.Y1f8riQaR6yg * d5;
                        case 3:
                            double d7 = vk2Var2.lS5Rgt96tfkO;
                            double d8 = vk2Var2.TSizfFm2Yiuu;
                            double d9 = vk2Var2.Y1f8riQaR6yg;
                            return d5 >= vk2Var2.e9gEMXR7LXtO ? Math.pow((d7 * d5) + d8, vk2Var2.PxuCJdSBwIXG) + vk2Var2.a92UlCVFR9N8 : (d9 * d5) + vk2Var2.RAsUl2FVSrh6;
                        case 4:
                            float[] fArr4 = wl.PxuCJdSBwIXG;
                            return wl.lS5Rgt96tfkO(vk2Var2, d5);
                        case 5:
                            float[] fArr5 = wl.PxuCJdSBwIXG;
                            return wl.Y1f8riQaR6yg(vk2Var2, d5);
                        case 6:
                            double d10 = vk2Var2.lS5Rgt96tfkO;
                            double d11 = vk2Var2.TSizfFm2Yiuu;
                            double d12 = vk2Var2.Y1f8riQaR6yg;
                            return d5 >= vk2Var2.e9gEMXR7LXtO * d12 ? (Math.pow(d5, 1.0d / vk2Var2.PxuCJdSBwIXG) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = vk2Var2.lS5Rgt96tfkO;
                            double d14 = vk2Var2.TSizfFm2Yiuu;
                            double d15 = vk2Var2.Y1f8riQaR6yg;
                            return d5 >= vk2Var2.e9gEMXR7LXtO * d15 ? (Math.pow(d5 - vk2Var2.a92UlCVFR9N8, 1.0d / vk2Var2.PxuCJdSBwIXG) - d14) / d13 : (d5 - vk2Var2.RAsUl2FVSrh6) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                f10Var = new f10() { // from class: iw1
                    @Override // defpackage.f10
                    public final double TSizfFm2Yiuu(double d5) {
                        int i52 = i5;
                        vk2 vk2Var2 = vk2Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = wl.PxuCJdSBwIXG;
                                return wl.PxuCJdSBwIXG(vk2Var2, d5);
                            case 1:
                                float[] fArr3 = wl.PxuCJdSBwIXG;
                                return wl.TSizfFm2Yiuu(vk2Var2, d5);
                            case 2:
                                double d6 = vk2Var2.lS5Rgt96tfkO;
                                return d5 >= vk2Var2.e9gEMXR7LXtO ? Math.pow((d6 * d5) + vk2Var2.TSizfFm2Yiuu, vk2Var2.PxuCJdSBwIXG) : vk2Var2.Y1f8riQaR6yg * d5;
                            case 3:
                                double d7 = vk2Var2.lS5Rgt96tfkO;
                                double d8 = vk2Var2.TSizfFm2Yiuu;
                                double d9 = vk2Var2.Y1f8riQaR6yg;
                                return d5 >= vk2Var2.e9gEMXR7LXtO ? Math.pow((d7 * d5) + d8, vk2Var2.PxuCJdSBwIXG) + vk2Var2.a92UlCVFR9N8 : (d9 * d5) + vk2Var2.RAsUl2FVSrh6;
                            case 4:
                                float[] fArr4 = wl.PxuCJdSBwIXG;
                                return wl.lS5Rgt96tfkO(vk2Var2, d5);
                            case 5:
                                float[] fArr5 = wl.PxuCJdSBwIXG;
                                return wl.Y1f8riQaR6yg(vk2Var2, d5);
                            case 6:
                                double d10 = vk2Var2.lS5Rgt96tfkO;
                                double d11 = vk2Var2.TSizfFm2Yiuu;
                                double d12 = vk2Var2.Y1f8riQaR6yg;
                                return d5 >= vk2Var2.e9gEMXR7LXtO * d12 ? (Math.pow(d5, 1.0d / vk2Var2.PxuCJdSBwIXG) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = vk2Var2.lS5Rgt96tfkO;
                                double d14 = vk2Var2.TSizfFm2Yiuu;
                                double d15 = vk2Var2.Y1f8riQaR6yg;
                                return d5 >= vk2Var2.e9gEMXR7LXtO * d15 ? (Math.pow(d5 - vk2Var2.a92UlCVFR9N8, 1.0d / vk2Var2.PxuCJdSBwIXG) - d14) / d13 : (d5 - vk2Var2.RAsUl2FVSrh6) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                f10Var = new f10() { // from class: iw1
                    @Override // defpackage.f10
                    public final double TSizfFm2Yiuu(double d5) {
                        int i52 = i6;
                        vk2 vk2Var2 = vk2Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = wl.PxuCJdSBwIXG;
                                return wl.PxuCJdSBwIXG(vk2Var2, d5);
                            case 1:
                                float[] fArr3 = wl.PxuCJdSBwIXG;
                                return wl.TSizfFm2Yiuu(vk2Var2, d5);
                            case 2:
                                double d6 = vk2Var2.lS5Rgt96tfkO;
                                return d5 >= vk2Var2.e9gEMXR7LXtO ? Math.pow((d6 * d5) + vk2Var2.TSizfFm2Yiuu, vk2Var2.PxuCJdSBwIXG) : vk2Var2.Y1f8riQaR6yg * d5;
                            case 3:
                                double d7 = vk2Var2.lS5Rgt96tfkO;
                                double d8 = vk2Var2.TSizfFm2Yiuu;
                                double d9 = vk2Var2.Y1f8riQaR6yg;
                                return d5 >= vk2Var2.e9gEMXR7LXtO ? Math.pow((d7 * d5) + d8, vk2Var2.PxuCJdSBwIXG) + vk2Var2.a92UlCVFR9N8 : (d9 * d5) + vk2Var2.RAsUl2FVSrh6;
                            case 4:
                                float[] fArr4 = wl.PxuCJdSBwIXG;
                                return wl.lS5Rgt96tfkO(vk2Var2, d5);
                            case 5:
                                float[] fArr5 = wl.PxuCJdSBwIXG;
                                return wl.Y1f8riQaR6yg(vk2Var2, d5);
                            case 6:
                                double d10 = vk2Var2.lS5Rgt96tfkO;
                                double d11 = vk2Var2.TSizfFm2Yiuu;
                                double d12 = vk2Var2.Y1f8riQaR6yg;
                                return d5 >= vk2Var2.e9gEMXR7LXtO * d12 ? (Math.pow(d5, 1.0d / vk2Var2.PxuCJdSBwIXG) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = vk2Var2.lS5Rgt96tfkO;
                                double d14 = vk2Var2.TSizfFm2Yiuu;
                                double d15 = vk2Var2.Y1f8riQaR6yg;
                                return d5 >= vk2Var2.e9gEMXR7LXtO * d15 ? (Math.pow(d5 - vk2Var2.a92UlCVFR9N8, 1.0d / vk2Var2.PxuCJdSBwIXG) - d14) / d13 : (d5 - vk2Var2.RAsUl2FVSrh6) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                f10Var = new f10() { // from class: iw1
                    @Override // defpackage.f10
                    public final double TSizfFm2Yiuu(double d5) {
                        int i52 = i7;
                        vk2 vk2Var2 = vk2Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = wl.PxuCJdSBwIXG;
                                return wl.PxuCJdSBwIXG(vk2Var2, d5);
                            case 1:
                                float[] fArr3 = wl.PxuCJdSBwIXG;
                                return wl.TSizfFm2Yiuu(vk2Var2, d5);
                            case 2:
                                double d6 = vk2Var2.lS5Rgt96tfkO;
                                return d5 >= vk2Var2.e9gEMXR7LXtO ? Math.pow((d6 * d5) + vk2Var2.TSizfFm2Yiuu, vk2Var2.PxuCJdSBwIXG) : vk2Var2.Y1f8riQaR6yg * d5;
                            case 3:
                                double d7 = vk2Var2.lS5Rgt96tfkO;
                                double d8 = vk2Var2.TSizfFm2Yiuu;
                                double d9 = vk2Var2.Y1f8riQaR6yg;
                                return d5 >= vk2Var2.e9gEMXR7LXtO ? Math.pow((d7 * d5) + d8, vk2Var2.PxuCJdSBwIXG) + vk2Var2.a92UlCVFR9N8 : (d9 * d5) + vk2Var2.RAsUl2FVSrh6;
                            case 4:
                                float[] fArr4 = wl.PxuCJdSBwIXG;
                                return wl.lS5Rgt96tfkO(vk2Var2, d5);
                            case 5:
                                float[] fArr5 = wl.PxuCJdSBwIXG;
                                return wl.Y1f8riQaR6yg(vk2Var2, d5);
                            case 6:
                                double d10 = vk2Var2.lS5Rgt96tfkO;
                                double d11 = vk2Var2.TSizfFm2Yiuu;
                                double d12 = vk2Var2.Y1f8riQaR6yg;
                                return d5 >= vk2Var2.e9gEMXR7LXtO * d12 ? (Math.pow(d5, 1.0d / vk2Var2.PxuCJdSBwIXG) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = vk2Var2.lS5Rgt96tfkO;
                                double d14 = vk2Var2.TSizfFm2Yiuu;
                                double d15 = vk2Var2.Y1f8riQaR6yg;
                                return d5 >= vk2Var2.e9gEMXR7LXtO * d15 ? (Math.pow(d5 - vk2Var2.a92UlCVFR9N8, 1.0d / vk2Var2.PxuCJdSBwIXG) - d14) / d13 : (d5 - vk2Var2.RAsUl2FVSrh6) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            f10Var2 = new f10() { // from class: iw1
                @Override // defpackage.f10
                public final double TSizfFm2Yiuu(double d5) {
                    int i52 = i2;
                    vk2 vk2Var2 = vk2Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = wl.PxuCJdSBwIXG;
                            return wl.PxuCJdSBwIXG(vk2Var2, d5);
                        case 1:
                            float[] fArr3 = wl.PxuCJdSBwIXG;
                            return wl.TSizfFm2Yiuu(vk2Var2, d5);
                        case 2:
                            double d6 = vk2Var2.lS5Rgt96tfkO;
                            return d5 >= vk2Var2.e9gEMXR7LXtO ? Math.pow((d6 * d5) + vk2Var2.TSizfFm2Yiuu, vk2Var2.PxuCJdSBwIXG) : vk2Var2.Y1f8riQaR6yg * d5;
                        case 3:
                            double d7 = vk2Var2.lS5Rgt96tfkO;
                            double d8 = vk2Var2.TSizfFm2Yiuu;
                            double d9 = vk2Var2.Y1f8riQaR6yg;
                            return d5 >= vk2Var2.e9gEMXR7LXtO ? Math.pow((d7 * d5) + d8, vk2Var2.PxuCJdSBwIXG) + vk2Var2.a92UlCVFR9N8 : (d9 * d5) + vk2Var2.RAsUl2FVSrh6;
                        case 4:
                            float[] fArr4 = wl.PxuCJdSBwIXG;
                            return wl.lS5Rgt96tfkO(vk2Var2, d5);
                        case 5:
                            float[] fArr5 = wl.PxuCJdSBwIXG;
                            return wl.Y1f8riQaR6yg(vk2Var2, d5);
                        case 6:
                            double d10 = vk2Var2.lS5Rgt96tfkO;
                            double d11 = vk2Var2.TSizfFm2Yiuu;
                            double d12 = vk2Var2.Y1f8riQaR6yg;
                            return d5 >= vk2Var2.e9gEMXR7LXtO * d12 ? (Math.pow(d5, 1.0d / vk2Var2.PxuCJdSBwIXG) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = vk2Var2.lS5Rgt96tfkO;
                            double d14 = vk2Var2.TSizfFm2Yiuu;
                            double d15 = vk2Var2.Y1f8riQaR6yg;
                            return d5 >= vk2Var2.e9gEMXR7LXtO * d15 ? (Math.pow(d5 - vk2Var2.a92UlCVFR9N8, 1.0d / vk2Var2.PxuCJdSBwIXG) - d14) / d13 : (d5 - vk2Var2.RAsUl2FVSrh6) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            f10Var2 = new f10() { // from class: iw1
                @Override // defpackage.f10
                public final double TSizfFm2Yiuu(double d5) {
                    int i52 = i3;
                    vk2 vk2Var2 = vk2Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = wl.PxuCJdSBwIXG;
                            return wl.PxuCJdSBwIXG(vk2Var2, d5);
                        case 1:
                            float[] fArr3 = wl.PxuCJdSBwIXG;
                            return wl.TSizfFm2Yiuu(vk2Var2, d5);
                        case 2:
                            double d6 = vk2Var2.lS5Rgt96tfkO;
                            return d5 >= vk2Var2.e9gEMXR7LXtO ? Math.pow((d6 * d5) + vk2Var2.TSizfFm2Yiuu, vk2Var2.PxuCJdSBwIXG) : vk2Var2.Y1f8riQaR6yg * d5;
                        case 3:
                            double d7 = vk2Var2.lS5Rgt96tfkO;
                            double d8 = vk2Var2.TSizfFm2Yiuu;
                            double d9 = vk2Var2.Y1f8riQaR6yg;
                            return d5 >= vk2Var2.e9gEMXR7LXtO ? Math.pow((d7 * d5) + d8, vk2Var2.PxuCJdSBwIXG) + vk2Var2.a92UlCVFR9N8 : (d9 * d5) + vk2Var2.RAsUl2FVSrh6;
                        case 4:
                            float[] fArr4 = wl.PxuCJdSBwIXG;
                            return wl.lS5Rgt96tfkO(vk2Var2, d5);
                        case 5:
                            float[] fArr5 = wl.PxuCJdSBwIXG;
                            return wl.Y1f8riQaR6yg(vk2Var2, d5);
                        case 6:
                            double d10 = vk2Var2.lS5Rgt96tfkO;
                            double d11 = vk2Var2.TSizfFm2Yiuu;
                            double d12 = vk2Var2.Y1f8riQaR6yg;
                            return d5 >= vk2Var2.e9gEMXR7LXtO * d12 ? (Math.pow(d5, 1.0d / vk2Var2.PxuCJdSBwIXG) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = vk2Var2.lS5Rgt96tfkO;
                            double d14 = vk2Var2.TSizfFm2Yiuu;
                            double d15 = vk2Var2.Y1f8riQaR6yg;
                            return d5 >= vk2Var2.e9gEMXR7LXtO * d15 ? (Math.pow(d5 - vk2Var2.a92UlCVFR9N8, 1.0d / vk2Var2.PxuCJdSBwIXG) - d14) / d13 : (d5 - vk2Var2.RAsUl2FVSrh6) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            f10Var2 = new f10() { // from class: iw1
                @Override // defpackage.f10
                public final double TSizfFm2Yiuu(double d5) {
                    int i52 = i8;
                    vk2 vk2Var2 = vk2Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = wl.PxuCJdSBwIXG;
                            return wl.PxuCJdSBwIXG(vk2Var2, d5);
                        case 1:
                            float[] fArr3 = wl.PxuCJdSBwIXG;
                            return wl.TSizfFm2Yiuu(vk2Var2, d5);
                        case 2:
                            double d6 = vk2Var2.lS5Rgt96tfkO;
                            return d5 >= vk2Var2.e9gEMXR7LXtO ? Math.pow((d6 * d5) + vk2Var2.TSizfFm2Yiuu, vk2Var2.PxuCJdSBwIXG) : vk2Var2.Y1f8riQaR6yg * d5;
                        case 3:
                            double d7 = vk2Var2.lS5Rgt96tfkO;
                            double d8 = vk2Var2.TSizfFm2Yiuu;
                            double d9 = vk2Var2.Y1f8riQaR6yg;
                            return d5 >= vk2Var2.e9gEMXR7LXtO ? Math.pow((d7 * d5) + d8, vk2Var2.PxuCJdSBwIXG) + vk2Var2.a92UlCVFR9N8 : (d9 * d5) + vk2Var2.RAsUl2FVSrh6;
                        case 4:
                            float[] fArr4 = wl.PxuCJdSBwIXG;
                            return wl.lS5Rgt96tfkO(vk2Var2, d5);
                        case 5:
                            float[] fArr5 = wl.PxuCJdSBwIXG;
                            return wl.Y1f8riQaR6yg(vk2Var2, d5);
                        case 6:
                            double d10 = vk2Var2.lS5Rgt96tfkO;
                            double d11 = vk2Var2.TSizfFm2Yiuu;
                            double d12 = vk2Var2.Y1f8riQaR6yg;
                            return d5 >= vk2Var2.e9gEMXR7LXtO * d12 ? (Math.pow(d5, 1.0d / vk2Var2.PxuCJdSBwIXG) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = vk2Var2.lS5Rgt96tfkO;
                            double d14 = vk2Var2.TSizfFm2Yiuu;
                            double d15 = vk2Var2.Y1f8riQaR6yg;
                            return d5 >= vk2Var2.e9gEMXR7LXtO * d15 ? (Math.pow(d5 - vk2Var2.a92UlCVFR9N8, 1.0d / vk2Var2.PxuCJdSBwIXG) - d14) / d13 : (d5 - vk2Var2.RAsUl2FVSrh6) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            f10Var2 = new f10() { // from class: iw1
                @Override // defpackage.f10
                public final double TSizfFm2Yiuu(double d5) {
                    int i52 = i9;
                    vk2 vk2Var2 = vk2Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = wl.PxuCJdSBwIXG;
                            return wl.PxuCJdSBwIXG(vk2Var2, d5);
                        case 1:
                            float[] fArr3 = wl.PxuCJdSBwIXG;
                            return wl.TSizfFm2Yiuu(vk2Var2, d5);
                        case 2:
                            double d6 = vk2Var2.lS5Rgt96tfkO;
                            return d5 >= vk2Var2.e9gEMXR7LXtO ? Math.pow((d6 * d5) + vk2Var2.TSizfFm2Yiuu, vk2Var2.PxuCJdSBwIXG) : vk2Var2.Y1f8riQaR6yg * d5;
                        case 3:
                            double d7 = vk2Var2.lS5Rgt96tfkO;
                            double d8 = vk2Var2.TSizfFm2Yiuu;
                            double d9 = vk2Var2.Y1f8riQaR6yg;
                            return d5 >= vk2Var2.e9gEMXR7LXtO ? Math.pow((d7 * d5) + d8, vk2Var2.PxuCJdSBwIXG) + vk2Var2.a92UlCVFR9N8 : (d9 * d5) + vk2Var2.RAsUl2FVSrh6;
                        case 4:
                            float[] fArr4 = wl.PxuCJdSBwIXG;
                            return wl.lS5Rgt96tfkO(vk2Var2, d5);
                        case 5:
                            float[] fArr5 = wl.PxuCJdSBwIXG;
                            return wl.Y1f8riQaR6yg(vk2Var2, d5);
                        case 6:
                            double d10 = vk2Var2.lS5Rgt96tfkO;
                            double d11 = vk2Var2.TSizfFm2Yiuu;
                            double d12 = vk2Var2.Y1f8riQaR6yg;
                            return d5 >= vk2Var2.e9gEMXR7LXtO * d12 ? (Math.pow(d5, 1.0d / vk2Var2.PxuCJdSBwIXG) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = vk2Var2.lS5Rgt96tfkO;
                            double d14 = vk2Var2.TSizfFm2Yiuu;
                            double d15 = vk2Var2.Y1f8riQaR6yg;
                            return d5 >= vk2Var2.e9gEMXR7LXtO * d15 ? (Math.pow(d5 - vk2Var2.a92UlCVFR9N8, 1.0d / vk2Var2.PxuCJdSBwIXG) - d14) / d13 : (d5 - vk2Var2.RAsUl2FVSrh6) / d15;
                    }
                }
            };
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lw1(String str, float[] fArr, gs2 gs2Var, final double d, float f, float f2, int i) {
        this(str, fArr, gs2Var, null, r11, r3, f, f2, new vk2(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
        f10 f10Var;
        f10 f10Var2 = XL4ISE6Oc65B;
        if (d == 1.0d) {
            f10Var = f10Var2;
        } else {
            final int i2 = 0;
            f10Var = new f10() { // from class: hw1
                @Override // defpackage.f10
                public final double TSizfFm2Yiuu(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            f10Var2 = new f10() { // from class: hw1
                @Override // defpackage.f10
                public final double TSizfFm2Yiuu(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
    }
}
