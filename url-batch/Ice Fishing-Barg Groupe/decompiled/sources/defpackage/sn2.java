package defpackage;

import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class sn2 extends bq1 {
    public static final sn2 TSizfFm2Yiuu = new sn2(BuiltinSerializersKt.serializer(pn2.Companion));

    @Override // defpackage.gPXPFXrUH4XX
    public final Object RAsUl2FVSrh6(Object obj) {
        int[] iArr = ((qn2) obj).rtx2ld2ELZv4;
        rn2 rn2Var = new rn2();
        rn2Var.PxuCJdSBwIXG = iArr;
        rn2Var.lS5Rgt96tfkO = iArr.length;
        rn2Var.lS5Rgt96tfkO(10);
        return rn2Var;
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int Y1f8riQaR6yg(Object obj) {
        return ((qn2) obj).rtx2ld2ELZv4.length;
    }

    @Override // defpackage.xk, defpackage.gPXPFXrUH4XX
    public final void a92UlCVFR9N8(op opVar, int i, Object obj) {
        rn2 rn2Var = (rn2) obj;
        rn2Var.getClass();
        int VhhvGxCb8gfr = opVar.Y1f8riQaR6yg(this.lS5Rgt96tfkO, i).VhhvGxCb8gfr();
        rn2Var.lS5Rgt96tfkO(rn2Var.Y1f8riQaR6yg() + 1);
        int[] iArr = rn2Var.PxuCJdSBwIXG;
        int i2 = rn2Var.lS5Rgt96tfkO;
        rn2Var.lS5Rgt96tfkO = i2 + 1;
        iArr[i2] = VhhvGxCb8gfr;
    }

    @Override // defpackage.bq1
    public final void dgRBjINgWbAK(fx1 fx1Var, Object obj, int i) {
        int[] iArr = ((qn2) obj).rtx2ld2ELZv4;
        fx1Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            fx1Var.xfACYKDMU6Dj(this.lS5Rgt96tfkO, i2).OPXfSBeufaJ8(iArr[i2]);
        }
    }

    @Override // defpackage.bq1
    public final Object wdg6QnbFHrFF() {
        return new qn2(new int[0]);
    }
}
