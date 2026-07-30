package defpackage;

import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class c10 extends bq1 {
    public static final c10 TSizfFm2Yiuu = new c10(BuiltinSerializersKt.serializer(e10.PxuCJdSBwIXG));

    @Override // defpackage.gPXPFXrUH4XX
    public final Object RAsUl2FVSrh6(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        b10 b10Var = new b10();
        b10Var.PxuCJdSBwIXG = dArr;
        b10Var.lS5Rgt96tfkO = dArr.length;
        b10Var.lS5Rgt96tfkO(10);
        return b10Var;
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int Y1f8riQaR6yg(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.xk, defpackage.gPXPFXrUH4XX
    public final void a92UlCVFR9N8(op opVar, int i, Object obj) {
        b10 b10Var = (b10) obj;
        b10Var.getClass();
        double XL4ISE6Oc65B = opVar.XL4ISE6Oc65B(this.lS5Rgt96tfkO, i);
        b10Var.lS5Rgt96tfkO(b10Var.Y1f8riQaR6yg() + 1);
        double[] dArr = b10Var.PxuCJdSBwIXG;
        int i2 = b10Var.lS5Rgt96tfkO;
        b10Var.lS5Rgt96tfkO = i2 + 1;
        dArr[i2] = XL4ISE6Oc65B;
    }

    @Override // defpackage.bq1
    public final void dgRBjINgWbAK(fx1 fx1Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        fx1Var.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            aq1 aq1Var = this.lS5Rgt96tfkO;
            aq1Var.getClass();
            fx1Var.EpkonXwzFgDB(aq1Var, i2);
            fx1Var.Y1f8riQaR6yg(d);
        }
    }

    @Override // defpackage.bq1
    public final Object wdg6QnbFHrFF() {
        return new double[0];
    }
}
