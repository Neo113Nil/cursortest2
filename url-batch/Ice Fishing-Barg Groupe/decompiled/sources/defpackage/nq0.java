package defpackage;

import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nq0 extends bq1 {
    public static final nq0 TSizfFm2Yiuu = new nq0(BuiltinSerializersKt.serializer(oq0.PxuCJdSBwIXG));

    @Override // defpackage.gPXPFXrUH4XX
    public final Object RAsUl2FVSrh6(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        mq0 mq0Var = new mq0();
        mq0Var.PxuCJdSBwIXG = iArr;
        mq0Var.lS5Rgt96tfkO = iArr.length;
        mq0Var.lS5Rgt96tfkO(10);
        return mq0Var;
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int Y1f8riQaR6yg(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.xk, defpackage.gPXPFXrUH4XX
    public final void a92UlCVFR9N8(op opVar, int i, Object obj) {
        mq0 mq0Var = (mq0) obj;
        mq0Var.getClass();
        int ZbWwgt3aGe7A = opVar.ZbWwgt3aGe7A(this.lS5Rgt96tfkO, i);
        mq0Var.lS5Rgt96tfkO(mq0Var.Y1f8riQaR6yg() + 1);
        int[] iArr = mq0Var.PxuCJdSBwIXG;
        int i2 = mq0Var.lS5Rgt96tfkO;
        mq0Var.lS5Rgt96tfkO = i2 + 1;
        iArr[i2] = ZbWwgt3aGe7A;
    }

    @Override // defpackage.bq1
    public final void dgRBjINgWbAK(fx1 fx1Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        fx1Var.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            fx1Var.nLZGh9p8gVSu(i2, iArr[i2], this.lS5Rgt96tfkO);
        }
    }

    @Override // defpackage.bq1
    public final Object wdg6QnbFHrFF() {
        return new int[0];
    }
}
