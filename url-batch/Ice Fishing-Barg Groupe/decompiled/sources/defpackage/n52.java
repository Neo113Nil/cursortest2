package defpackage;

import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class n52 extends bq1 {
    public static final n52 TSizfFm2Yiuu = new n52(BuiltinSerializersKt.serializer(o52.PxuCJdSBwIXG));

    @Override // defpackage.gPXPFXrUH4XX
    public final Object RAsUl2FVSrh6(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        m52 m52Var = new m52();
        m52Var.PxuCJdSBwIXG = sArr;
        m52Var.lS5Rgt96tfkO = sArr.length;
        m52Var.lS5Rgt96tfkO(10);
        return m52Var;
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int Y1f8riQaR6yg(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.xk, defpackage.gPXPFXrUH4XX
    public final void a92UlCVFR9N8(op opVar, int i, Object obj) {
        m52 m52Var = (m52) obj;
        m52Var.getClass();
        short S2OOm9zPNm0h = opVar.S2OOm9zPNm0h(this.lS5Rgt96tfkO, i);
        m52Var.lS5Rgt96tfkO(m52Var.Y1f8riQaR6yg() + 1);
        short[] sArr = m52Var.PxuCJdSBwIXG;
        int i2 = m52Var.lS5Rgt96tfkO;
        m52Var.lS5Rgt96tfkO = i2 + 1;
        sArr[i2] = S2OOm9zPNm0h;
    }

    @Override // defpackage.bq1
    public final void dgRBjINgWbAK(fx1 fx1Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        fx1Var.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            short s = sArr[i2];
            aq1 aq1Var = this.lS5Rgt96tfkO;
            aq1Var.getClass();
            fx1Var.EpkonXwzFgDB(aq1Var, i2);
            fx1Var.e9gEMXR7LXtO(s);
        }
    }

    @Override // defpackage.bq1
    public final Object wdg6QnbFHrFF() {
        return new short[0];
    }
}
