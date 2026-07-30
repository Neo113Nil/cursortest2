package defpackage;

import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class kj extends bq1 {
    public static final kj TSizfFm2Yiuu = new kj(BuiltinSerializersKt.serializer(lj.PxuCJdSBwIXG));

    @Override // defpackage.gPXPFXrUH4XX
    public final Object RAsUl2FVSrh6(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        ij ijVar = new ij();
        ijVar.PxuCJdSBwIXG = cArr;
        ijVar.lS5Rgt96tfkO = cArr.length;
        ijVar.lS5Rgt96tfkO(10);
        return ijVar;
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int Y1f8riQaR6yg(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.xk, defpackage.gPXPFXrUH4XX
    public final void a92UlCVFR9N8(op opVar, int i, Object obj) {
        ij ijVar = (ij) obj;
        ijVar.getClass();
        char r3s1LDPKFs1S = opVar.r3s1LDPKFs1S(this.lS5Rgt96tfkO, i);
        ijVar.lS5Rgt96tfkO(ijVar.Y1f8riQaR6yg() + 1);
        char[] cArr = ijVar.PxuCJdSBwIXG;
        int i2 = ijVar.lS5Rgt96tfkO;
        ijVar.lS5Rgt96tfkO = i2 + 1;
        cArr[i2] = r3s1LDPKFs1S;
    }

    @Override // defpackage.bq1
    public final void dgRBjINgWbAK(fx1 fx1Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        fx1Var.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            char c = cArr[i2];
            aq1 aq1Var = this.lS5Rgt96tfkO;
            aq1Var.getClass();
            fx1Var.EpkonXwzFgDB(aq1Var, i2);
            fx1Var.QrzZRwfaDlRX(c);
        }
    }

    @Override // defpackage.bq1
    public final Object wdg6QnbFHrFF() {
        return new char[0];
    }
}
