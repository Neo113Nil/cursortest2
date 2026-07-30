package defpackage;

import android.text.Layout;
import java.io.Serializable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class ie implements le0 {
    public final /* synthetic */ long OPXfSBeufaJ8;
    public final /* synthetic */ Serializable dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4 = 1;
    public final /* synthetic */ Object wdg6QnbFHrFF;
    public final /* synthetic */ Object x50lh2ztY7Y5;

    public /* synthetic */ ie(long j, float[] fArr, xt1 xt1Var, wt1 wt1Var) {
        this.OPXfSBeufaJ8 = j;
        this.wdg6QnbFHrFF = fArr;
        this.dgRBjINgWbAK = xt1Var;
        this.x50lh2ztY7Y5 = wt1Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        long j;
        no2 no2Var;
        float[] fArr;
        int i;
        float PxuCJdSBwIXG;
        float PxuCJdSBwIXG2;
        int i2 = this.rtx2ld2ELZv4;
        no2 no2Var2 = no2.PxuCJdSBwIXG;
        Object obj2 = this.x50lh2ztY7Y5;
        Serializable serializable = this.dgRBjINgWbAK;
        Object obj3 = this.wdg6QnbFHrFF;
        switch (i2) {
            case 0:
                qt1 qt1Var = (qt1) obj3;
                zt1 zt1Var = (zt1) serializable;
                long j2 = this.OPXfSBeufaJ8;
                jl jlVar = (jl) obj2;
                xw0 xw0Var = (xw0) obj;
                xw0Var.PxuCJdSBwIXG();
                float f = qt1Var.PxuCJdSBwIXG;
                float f2 = qt1Var.lS5Rgt96tfkO;
                ji jiVar = xw0Var.rtx2ld2ELZv4;
                ((i2) jiVar.OPXfSBeufaJ8.OPXfSBeufaJ8).BRwzKIf41E4i(f, f2);
                try {
                    k30.gPXPFXrUH4XX(xw0Var, (ym0) zt1Var.rtx2ld2ELZv4, j2, 0L, 0.0f, jlVar, 0, 890);
                    return no2Var2;
                } finally {
                    ((i2) jiVar.OPXfSBeufaJ8.OPXfSBeufaJ8).BRwzKIf41E4i(-f, -f2);
                }
            default:
                float[] fArr2 = (float[]) obj3;
                xt1 xt1Var = (xt1) serializable;
                wt1 wt1Var = (wt1) obj2;
                xi1 xi1Var = (xi1) obj;
                int i3 = xi1Var.lS5Rgt96tfkO;
                m4 m4Var = xi1Var.PxuCJdSBwIXG;
                int i4 = xi1Var.TSizfFm2Yiuu;
                long j3 = this.OPXfSBeufaJ8;
                int a92UlCVFR9N8 = i3 > vi2.a92UlCVFR9N8(j3) ? xi1Var.lS5Rgt96tfkO : vi2.a92UlCVFR9N8(j3);
                if (i4 >= vi2.e9gEMXR7LXtO(j3)) {
                    i4 = vi2.e9gEMXR7LXtO(j3);
                }
                long rtx2ld2ELZv4 = jh0.rtx2ld2ELZv4(xi1Var.Y1f8riQaR6yg(a92UlCVFR9N8), xi1Var.Y1f8riQaR6yg(i4));
                int i5 = xt1Var.rtx2ld2ELZv4;
                hi2 hi2Var = m4Var.Y1f8riQaR6yg;
                int a92UlCVFR9N82 = vi2.a92UlCVFR9N8(rtx2ld2ELZv4);
                int e9gEMXR7LXtO = vi2.e9gEMXR7LXtO(rtx2ld2ELZv4);
                Layout layout = hi2Var.a92UlCVFR9N8;
                int length = layout.getText().length();
                if (a92UlCVFR9N82 < 0) {
                    fp0.PxuCJdSBwIXG("startOffset must be > 0");
                }
                if (a92UlCVFR9N82 >= length) {
                    fp0.PxuCJdSBwIXG("startOffset must be less than text length");
                }
                if (e9gEMXR7LXtO <= a92UlCVFR9N82) {
                    fp0.PxuCJdSBwIXG("endOffset must be greater than startOffset");
                }
                if (e9gEMXR7LXtO > length) {
                    fp0.PxuCJdSBwIXG("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i5 < (e9gEMXR7LXtO - a92UlCVFR9N82) * 4) {
                    fp0.PxuCJdSBwIXG("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int RAsUl2FVSrh6 = hi2Var.RAsUl2FVSrh6(a92UlCVFR9N82);
                int RAsUl2FVSrh62 = hi2Var.RAsUl2FVSrh6(e9gEMXR7LXtO - 1);
                bk0 bk0Var = new bk0(hi2Var);
                if (RAsUl2FVSrh6 <= RAsUl2FVSrh62) {
                    while (true) {
                        int lineStart = layout.getLineStart(RAsUl2FVSrh6);
                        j = rtx2ld2ELZv4;
                        int a92UlCVFR9N83 = hi2Var.a92UlCVFR9N8(RAsUl2FVSrh6);
                        int max = Math.max(a92UlCVFR9N82, lineStart);
                        int min = Math.min(e9gEMXR7LXtO, a92UlCVFR9N83);
                        float rtx2ld2ELZv42 = hi2Var.rtx2ld2ELZv4(RAsUl2FVSrh6);
                        float e9gEMXR7LXtO2 = hi2Var.e9gEMXR7LXtO(RAsUl2FVSrh6);
                        no2Var = no2Var2;
                        fArr = fArr2;
                        boolean z = false;
                        boolean z2 = layout.getParagraphDirection(RAsUl2FVSrh6) == 1;
                        int i6 = i5;
                        int i7 = max;
                        while (i7 < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(i7);
                            if (!z2 || isRtlCharAt) {
                                if (z2 && isRtlCharAt) {
                                    z = false;
                                    float PxuCJdSBwIXG3 = bk0Var.PxuCJdSBwIXG(i7, false, false, false);
                                    i = min;
                                    PxuCJdSBwIXG = bk0Var.PxuCJdSBwIXG(i7 + 1, true, true, false);
                                    PxuCJdSBwIXG2 = PxuCJdSBwIXG3;
                                } else {
                                    i = min;
                                    z = false;
                                    if (z2 || !isRtlCharAt) {
                                        PxuCJdSBwIXG = bk0Var.PxuCJdSBwIXG(i7, false, false, false);
                                        PxuCJdSBwIXG2 = bk0Var.PxuCJdSBwIXG(i7 + 1, true, true, false);
                                    } else {
                                        PxuCJdSBwIXG2 = bk0Var.PxuCJdSBwIXG(i7, false, false, true);
                                        PxuCJdSBwIXG = bk0Var.PxuCJdSBwIXG(i7 + 1, true, true, true);
                                    }
                                }
                                fArr[i6] = PxuCJdSBwIXG;
                                fArr[i6 + 1] = rtx2ld2ELZv42;
                                fArr[i6 + 2] = PxuCJdSBwIXG2;
                                fArr[i6 + 3] = e9gEMXR7LXtO2;
                                i6 += 4;
                                i7++;
                                min = i;
                            } else {
                                PxuCJdSBwIXG = bk0Var.PxuCJdSBwIXG(i7, z, z, true);
                                i = min;
                                PxuCJdSBwIXG2 = bk0Var.PxuCJdSBwIXG(i7 + 1, true, true, true);
                            }
                            z = false;
                            fArr[i6] = PxuCJdSBwIXG;
                            fArr[i6 + 1] = rtx2ld2ELZv42;
                            fArr[i6 + 2] = PxuCJdSBwIXG2;
                            fArr[i6 + 3] = e9gEMXR7LXtO2;
                            i6 += 4;
                            i7++;
                            min = i;
                        }
                        if (RAsUl2FVSrh6 != RAsUl2FVSrh62) {
                            RAsUl2FVSrh6++;
                            rtx2ld2ELZv4 = j;
                            i5 = i6;
                            no2Var2 = no2Var;
                            fArr2 = fArr;
                        }
                    }
                } else {
                    j = rtx2ld2ELZv4;
                    no2Var = no2Var2;
                    fArr = fArr2;
                }
                int Y1f8riQaR6yg = (vi2.Y1f8riQaR6yg(j) * 4) + xt1Var.rtx2ld2ELZv4;
                for (int i8 = xt1Var.rtx2ld2ELZv4; i8 < Y1f8riQaR6yg; i8 += 4) {
                    int i9 = i8 + 1;
                    float f3 = fArr[i9];
                    float f4 = wt1Var.rtx2ld2ELZv4;
                    fArr[i9] = f3 + f4;
                    int i10 = i8 + 3;
                    fArr[i10] = fArr[i10] + f4;
                }
                xt1Var.rtx2ld2ELZv4 = Y1f8riQaR6yg;
                wt1Var.rtx2ld2ELZv4 = m4Var.lS5Rgt96tfkO() + wt1Var.rtx2ld2ELZv4;
                return no2Var;
        }
    }

    public /* synthetic */ ie(qt1 qt1Var, zt1 zt1Var, long j, td tdVar) {
        this.wdg6QnbFHrFF = qt1Var;
        this.dgRBjINgWbAK = zt1Var;
        this.OPXfSBeufaJ8 = j;
        this.x50lh2ztY7Y5 = tdVar;
    }
}
