package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class aq2 {
    public final boolean PxuCJdSBwIXG;
    public final float[] RAsUl2FVSrh6;
    public final int TSizfFm2Yiuu;
    public final tv[] Y1f8riQaR6yg;
    public final float[] a92UlCVFR9N8;
    public int e9gEMXR7LXtO;
    public final zp2 lS5Rgt96tfkO;
    public final float[] rtx2ld2ELZv4;

    public aq2(boolean z, zp2 zp2Var) {
        int i;
        this.PxuCJdSBwIXG = z;
        this.lS5Rgt96tfkO = zp2Var;
        if (z && zp2Var.equals(zp2.rtx2ld2ELZv4)) {
            u9.rtx2ld2ELZv4("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int ordinal = zp2Var.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                u9.gPXPFXrUH4XX();
                throw null;
            }
            i = 2;
        }
        this.TSizfFm2Yiuu = i;
        this.Y1f8riQaR6yg = new tv[20];
        this.a92UlCVFR9N8 = new float[20];
        this.RAsUl2FVSrh6 = new float[20];
        this.rtx2ld2ELZv4 = new float[3];
    }

    public final void PxuCJdSBwIXG(long j, float f) {
        int i = (this.e9gEMXR7LXtO + 1) % 20;
        this.e9gEMXR7LXtO = i;
        tv[] tvVarArr = this.Y1f8riQaR6yg;
        tv tvVar = tvVarArr[i];
        if (tvVar != null) {
            tvVar.PxuCJdSBwIXG = j;
            tvVar.lS5Rgt96tfkO = f;
        } else {
            tv tvVar2 = new tv();
            tvVar2.PxuCJdSBwIXG = j;
            tvVar2.lS5Rgt96tfkO = f;
            tvVarArr[i] = tvVar2;
        }
    }

    public final float lS5Rgt96tfkO(float f) {
        zp2 zp2Var;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (f <= 0.0f) {
            ep0.lS5Rgt96tfkO("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.e9gEMXR7LXtO;
        tv[] tvVarArr = this.Y1f8riQaR6yg;
        tv tvVar = tvVarArr[i2];
        if (tvVar == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            tv tvVar2 = tvVar;
            while (true) {
                tv tvVar3 = tvVarArr[i2];
                boolean z2 = this.PxuCJdSBwIXG;
                zp2Var = this.lS5Rgt96tfkO;
                fArr = this.a92UlCVFR9N8;
                fArr2 = this.RAsUl2FVSrh6;
                if (tvVar3 != null) {
                    long j = tvVar.PxuCJdSBwIXG;
                    f2 = f5;
                    int i4 = i2;
                    long j2 = tvVar3.PxuCJdSBwIXG;
                    float f6 = j - j2;
                    z = z2;
                    i = 1;
                    float abs = Math.abs(j2 - tvVar2.PxuCJdSBwIXG);
                    tvVar2 = (zp2Var == zp2.rtx2ld2ELZv4 || z) ? tvVar3 : tvVar;
                    if (f6 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i3] = tvVar3.lS5Rgt96tfkO;
                    fArr2[i3] = -f6;
                    i2 = (i4 == 0 ? 20 : i4) - 1;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    f5 = f2;
                } else {
                    f2 = f5;
                    z = z2;
                    i = 1;
                    break;
                }
            }
            if (i3 >= this.TSizfFm2Yiuu) {
                int ordinal = zp2Var.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = this.rtx2ld2ELZv4;
                        sj0.J54yh1s3n4Aq(fArr2, fArr, i3, fArr3);
                        f4 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f4 = f2;
                    }
                } else {
                    if (ordinal != i) {
                        u9.gPXPFXrUH4XX();
                        return f2;
                    }
                    int i5 = i3 - i;
                    float f7 = fArr2[i5];
                    int i6 = i5;
                    float f8 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f9 = fArr2[i7];
                        if (f7 != f9) {
                            float f10 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f7 - f9);
                            f8 += Math.abs(f10) * (f10 - (Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f))));
                            if (i6 == i5) {
                                f8 *= 0.5f;
                            }
                        }
                        i6--;
                        f7 = f9;
                    }
                    f4 = Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f));
                }
                f3 = f4 * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f11 = -f;
            if (f3 < f11) {
                return f11;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public /* synthetic */ aq2() {
        this(false, zp2.rtx2ld2ELZv4);
    }

    public aq2(int i) {
        this(true, zp2.OPXfSBeufaJ8);
    }
}
