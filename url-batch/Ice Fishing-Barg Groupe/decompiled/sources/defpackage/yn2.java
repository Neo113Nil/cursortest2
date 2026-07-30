package defpackage;

import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yn2 extends bq1 {
    public static final yn2 TSizfFm2Yiuu = new yn2(BuiltinSerializersKt.serializer(vn2.Companion));

    @Override // defpackage.gPXPFXrUH4XX
    public final Object RAsUl2FVSrh6(Object obj) {
        long[] jArr = ((wn2) obj).rtx2ld2ELZv4;
        xn2 xn2Var = new xn2();
        xn2Var.PxuCJdSBwIXG = jArr;
        xn2Var.lS5Rgt96tfkO = jArr.length;
        xn2Var.lS5Rgt96tfkO(10);
        return xn2Var;
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int Y1f8riQaR6yg(Object obj) {
        return ((wn2) obj).rtx2ld2ELZv4.length;
    }

    @Override // defpackage.xk, defpackage.gPXPFXrUH4XX
    public final void a92UlCVFR9N8(op opVar, int i, Object obj) {
        xn2 xn2Var = (xn2) obj;
        xn2Var.getClass();
        long TSizfFm2Yiuu2 = opVar.Y1f8riQaR6yg(this.lS5Rgt96tfkO, i).TSizfFm2Yiuu();
        xn2Var.lS5Rgt96tfkO(xn2Var.Y1f8riQaR6yg() + 1);
        long[] jArr = xn2Var.PxuCJdSBwIXG;
        int i2 = xn2Var.lS5Rgt96tfkO;
        xn2Var.lS5Rgt96tfkO = i2 + 1;
        jArr[i2] = TSizfFm2Yiuu2;
    }

    @Override // defpackage.bq1
    public final void dgRBjINgWbAK(fx1 fx1Var, Object obj, int i) {
        long[] jArr = ((wn2) obj).rtx2ld2ELZv4;
        fx1Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            fx1Var.xfACYKDMU6Dj(this.lS5Rgt96tfkO, i2).r3s1LDPKFs1S(jArr[i2]);
        }
    }

    @Override // defpackage.bq1
    public final Object wdg6QnbFHrFF() {
        return new wn2(new long[0]);
    }
}
