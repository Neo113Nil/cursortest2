package defpackage;

import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ce extends bq1 {
    public static final ce TSizfFm2Yiuu = new ce(BuiltinSerializersKt.serializer(de.PxuCJdSBwIXG));

    @Override // defpackage.gPXPFXrUH4XX
    public final Object RAsUl2FVSrh6(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        be beVar = new be();
        beVar.PxuCJdSBwIXG = zArr;
        beVar.lS5Rgt96tfkO = zArr.length;
        beVar.lS5Rgt96tfkO(10);
        return beVar;
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int Y1f8riQaR6yg(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.xk, defpackage.gPXPFXrUH4XX
    public final void a92UlCVFR9N8(op opVar, int i, Object obj) {
        be beVar = (be) obj;
        beVar.getClass();
        boolean e9gEMXR7LXtO = opVar.e9gEMXR7LXtO(this.lS5Rgt96tfkO, i);
        beVar.lS5Rgt96tfkO(beVar.Y1f8riQaR6yg() + 1);
        boolean[] zArr = beVar.PxuCJdSBwIXG;
        int i2 = beVar.lS5Rgt96tfkO;
        beVar.lS5Rgt96tfkO = i2 + 1;
        zArr[i2] = e9gEMXR7LXtO;
    }

    @Override // defpackage.bq1
    public final void dgRBjINgWbAK(fx1 fx1Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        fx1Var.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = zArr[i2];
            aq1 aq1Var = this.lS5Rgt96tfkO;
            aq1Var.getClass();
            fx1Var.EpkonXwzFgDB(aq1Var, i2);
            fx1Var.RAsUl2FVSrh6(z);
        }
    }

    @Override // defpackage.bq1
    public final Object wdg6QnbFHrFF() {
        return new boolean[0];
    }
}
