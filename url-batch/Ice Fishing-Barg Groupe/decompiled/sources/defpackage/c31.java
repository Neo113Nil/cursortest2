package defpackage;

import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class c31 extends bq1 {
    public static final c31 TSizfFm2Yiuu = new c31(BuiltinSerializersKt.serializer(d31.PxuCJdSBwIXG));

    @Override // defpackage.gPXPFXrUH4XX
    public final Object RAsUl2FVSrh6(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        b31 b31Var = new b31();
        b31Var.PxuCJdSBwIXG = jArr;
        b31Var.lS5Rgt96tfkO = jArr.length;
        b31Var.lS5Rgt96tfkO(10);
        return b31Var;
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int Y1f8riQaR6yg(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.xk, defpackage.gPXPFXrUH4XX
    public final void a92UlCVFR9N8(op opVar, int i, Object obj) {
        b31 b31Var = (b31) obj;
        b31Var.getClass();
        long gPXPFXrUH4XX = opVar.gPXPFXrUH4XX(this.lS5Rgt96tfkO, i);
        b31Var.lS5Rgt96tfkO(b31Var.Y1f8riQaR6yg() + 1);
        long[] jArr = b31Var.PxuCJdSBwIXG;
        int i2 = b31Var.lS5Rgt96tfkO;
        b31Var.lS5Rgt96tfkO = i2 + 1;
        jArr[i2] = gPXPFXrUH4XX;
    }

    @Override // defpackage.bq1
    public final void dgRBjINgWbAK(fx1 fx1Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        fx1Var.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            aq1 aq1Var = this.lS5Rgt96tfkO;
            aq1Var.getClass();
            fx1Var.EpkonXwzFgDB(aq1Var, i2);
            fx1Var.r3s1LDPKFs1S(j);
        }
    }

    @Override // defpackage.bq1
    public final Object wdg6QnbFHrFF() {
        return new long[0];
    }
}
