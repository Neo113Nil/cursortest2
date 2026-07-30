package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class m62 implements le0 {
    public final /* synthetic */ y62 OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ m62(y62 y62Var, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = y62Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        boolean z;
        int i = this.rtx2ld2ELZv4;
        no2 no2Var = no2.PxuCJdSBwIXG;
        y62 y62Var = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                ir0 ir0Var = (ir0) obj;
                y62Var.wdg6QnbFHrFF.OPXfSBeufaJ8((int) (ir0Var.PxuCJdSBwIXG >> 32));
                y62Var.dgRBjINgWbAK.OPXfSBeufaJ8((int) (ir0Var.PxuCJdSBwIXG & 4294967295L));
                return no2Var;
            case 1:
                float floatValue = ((Float) obj).floatValue();
                tk tkVar = y62Var.lS5Rgt96tfkO;
                fj1 fj1Var = y62Var.TSizfFm2Yiuu;
                float OPXfSBeufaJ8 = ng0.OPXfSBeufaJ8(floatValue, tkVar.PxuCJdSBwIXG, tkVar.lS5Rgt96tfkO);
                if (OPXfSBeufaJ8 == fj1Var.rtx2ld2ELZv4()) {
                    z = false;
                } else {
                    if (OPXfSBeufaJ8 != fj1Var.rtx2ld2ELZv4()) {
                        le0 le0Var = y62Var.Y1f8riQaR6yg;
                        if (le0Var != null) {
                            le0Var.OPXfSBeufaJ8(Float.valueOf(OPXfSBeufaJ8));
                        } else {
                            y62Var.TSizfFm2Yiuu(OPXfSBeufaJ8);
                        }
                    }
                    ae0 ae0Var = y62Var.PxuCJdSBwIXG;
                    if (ae0Var != null) {
                        ae0Var.PxuCJdSBwIXG();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                y62Var.PxuCJdSBwIXG(0.0f);
                y62Var.r3s1LDPKFs1S.PxuCJdSBwIXG();
                return no2Var;
        }
    }
}
