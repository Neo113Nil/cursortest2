package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class yq1 implements le0 {
    public final /* synthetic */ float OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4 = 0;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    public /* synthetic */ yq1(float f, tk tkVar) {
        this.OPXfSBeufaJ8 = f;
        this.wdg6QnbFHrFF = tkVar;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.rtx2ld2ELZv4;
        no2 no2Var = no2.PxuCJdSBwIXG;
        float f = this.OPXfSBeufaJ8;
        Object obj2 = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                tk tkVar = (tk) obj2;
                xq1 xq1Var = new xq1(((Number) ng0.x50lh2ztY7Y5(Float.valueOf(f), tkVar)).floatValue(), tkVar);
                iu0[] iu0VarArr = j32.PxuCJdSBwIXG;
                k32 k32Var = h32.TSizfFm2Yiuu;
                iu0 iu0Var = j32.PxuCJdSBwIXG[1];
                ((l32) obj).PxuCJdSBwIXG(k32Var, xq1Var);
                break;
            default:
                gl2 gl2Var = (gl2) obj2;
                long longValue = ((Long) obj).longValue();
                boolean RAsUl2FVSrh6 = gl2Var.RAsUl2FVSrh6();
                jj1 jj1Var = gl2Var.RAsUl2FVSrh6;
                if (!RAsUl2FVSrh6) {
                    if (jj1Var.rtx2ld2ELZv4() == Long.MIN_VALUE) {
                        jj1Var.OPXfSBeufaJ8(longValue);
                        ((mj1) gl2Var.PxuCJdSBwIXG.PxuCJdSBwIXG).setValue(Boolean.TRUE);
                    }
                    long rtx2ld2ELZv4 = longValue - jj1Var.rtx2ld2ELZv4();
                    if (f != 0.0f) {
                        rtx2ld2ELZv4 = b51.JHNfcAUfKc4G(rtx2ld2ELZv4 / f);
                    }
                    gl2Var.r3s1LDPKFs1S(rtx2ld2ELZv4);
                    gl2Var.rtx2ld2ELZv4(rtx2ld2ELZv4, f == 0.0f);
                    break;
                }
                break;
        }
        return no2Var;
    }

    public /* synthetic */ yq1(gl2 gl2Var, float f) {
        this.wdg6QnbFHrFF = gl2Var;
        this.OPXfSBeufaJ8 = f;
    }
}
