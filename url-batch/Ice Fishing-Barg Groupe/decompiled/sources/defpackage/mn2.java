package defpackage;

import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class mn2 extends bq1 {
    public static final mn2 TSizfFm2Yiuu = new mn2(BuiltinSerializersKt.serializer(jn2.Companion));

    @Override // defpackage.gPXPFXrUH4XX
    public final Object RAsUl2FVSrh6(Object obj) {
        byte[] bArr = ((kn2) obj).rtx2ld2ELZv4;
        ln2 ln2Var = new ln2();
        ln2Var.PxuCJdSBwIXG = bArr;
        ln2Var.lS5Rgt96tfkO = bArr.length;
        ln2Var.lS5Rgt96tfkO(10);
        return ln2Var;
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int Y1f8riQaR6yg(Object obj) {
        return ((kn2) obj).rtx2ld2ELZv4.length;
    }

    @Override // defpackage.xk, defpackage.gPXPFXrUH4XX
    public final void a92UlCVFR9N8(op opVar, int i, Object obj) {
        ln2 ln2Var = (ln2) obj;
        ln2Var.getClass();
        byte pnx5pC0XzaCw = opVar.Y1f8riQaR6yg(this.lS5Rgt96tfkO, i).pnx5pC0XzaCw();
        ln2Var.lS5Rgt96tfkO(ln2Var.Y1f8riQaR6yg() + 1);
        byte[] bArr = ln2Var.PxuCJdSBwIXG;
        int i2 = ln2Var.lS5Rgt96tfkO;
        ln2Var.lS5Rgt96tfkO = i2 + 1;
        bArr[i2] = pnx5pC0XzaCw;
    }

    @Override // defpackage.bq1
    public final void dgRBjINgWbAK(fx1 fx1Var, Object obj, int i) {
        byte[] bArr = ((kn2) obj).rtx2ld2ELZv4;
        fx1Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            fx1Var.xfACYKDMU6Dj(this.lS5Rgt96tfkO, i2).a92UlCVFR9N8(bArr[i2]);
        }
    }

    @Override // defpackage.bq1
    public final Object wdg6QnbFHrFF() {
        return new kn2(new byte[0]);
    }
}
