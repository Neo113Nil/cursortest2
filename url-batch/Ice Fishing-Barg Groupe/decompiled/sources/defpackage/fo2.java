package defpackage;

import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fo2 extends bq1 {
    public static final fo2 TSizfFm2Yiuu = new fo2(BuiltinSerializersKt.serializer(co2.Companion));

    @Override // defpackage.gPXPFXrUH4XX
    public final Object RAsUl2FVSrh6(Object obj) {
        short[] sArr = ((do2) obj).rtx2ld2ELZv4;
        eo2 eo2Var = new eo2();
        eo2Var.PxuCJdSBwIXG = sArr;
        eo2Var.lS5Rgt96tfkO = sArr.length;
        eo2Var.lS5Rgt96tfkO(10);
        return eo2Var;
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int Y1f8riQaR6yg(Object obj) {
        return ((do2) obj).rtx2ld2ELZv4.length;
    }

    @Override // defpackage.xk, defpackage.gPXPFXrUH4XX
    public final void a92UlCVFR9N8(op opVar, int i, Object obj) {
        eo2 eo2Var = (eo2) obj;
        eo2Var.getClass();
        short IAToe7bXGz4N = opVar.Y1f8riQaR6yg(this.lS5Rgt96tfkO, i).IAToe7bXGz4N();
        eo2Var.lS5Rgt96tfkO(eo2Var.Y1f8riQaR6yg() + 1);
        short[] sArr = eo2Var.PxuCJdSBwIXG;
        int i2 = eo2Var.lS5Rgt96tfkO;
        eo2Var.lS5Rgt96tfkO = i2 + 1;
        sArr[i2] = IAToe7bXGz4N;
    }

    @Override // defpackage.bq1
    public final void dgRBjINgWbAK(fx1 fx1Var, Object obj, int i) {
        short[] sArr = ((do2) obj).rtx2ld2ELZv4;
        fx1Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            fx1Var.xfACYKDMU6Dj(this.lS5Rgt96tfkO, i2).e9gEMXR7LXtO(sArr[i2]);
        }
    }

    @Override // defpackage.bq1
    public final Object wdg6QnbFHrFF() {
        return new do2(new short[0]);
    }
}
