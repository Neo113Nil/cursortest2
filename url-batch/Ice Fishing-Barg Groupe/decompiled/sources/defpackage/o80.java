package defpackage;

import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class o80 extends bq1 {
    public static final o80 TSizfFm2Yiuu = new o80(BuiltinSerializersKt.serializer(p80.PxuCJdSBwIXG));

    @Override // defpackage.gPXPFXrUH4XX
    public final Object RAsUl2FVSrh6(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        n80 n80Var = new n80();
        n80Var.PxuCJdSBwIXG = fArr;
        n80Var.lS5Rgt96tfkO = fArr.length;
        n80Var.lS5Rgt96tfkO(10);
        return n80Var;
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int Y1f8riQaR6yg(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.xk, defpackage.gPXPFXrUH4XX
    public final void a92UlCVFR9N8(op opVar, int i, Object obj) {
        n80 n80Var = (n80) obj;
        n80Var.getClass();
        float BRwzKIf41E4i = opVar.BRwzKIf41E4i(this.lS5Rgt96tfkO, i);
        n80Var.lS5Rgt96tfkO(n80Var.Y1f8riQaR6yg() + 1);
        float[] fArr = n80Var.PxuCJdSBwIXG;
        int i2 = n80Var.lS5Rgt96tfkO;
        n80Var.lS5Rgt96tfkO = i2 + 1;
        fArr[i2] = BRwzKIf41E4i;
    }

    @Override // defpackage.bq1
    public final void dgRBjINgWbAK(fx1 fx1Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        fx1Var.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            aq1 aq1Var = this.lS5Rgt96tfkO;
            aq1Var.getClass();
            fx1Var.EpkonXwzFgDB(aq1Var, i2);
            fx1Var.x50lh2ztY7Y5(f);
        }
    }

    @Override // defpackage.bq1
    public final Object wdg6QnbFHrFF() {
        return new float[0];
    }
}
