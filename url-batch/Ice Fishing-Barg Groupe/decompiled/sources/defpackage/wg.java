package defpackage;

import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wg extends bq1 {
    public static final wg TSizfFm2Yiuu = new wg(BuiltinSerializersKt.serializer(xg.PxuCJdSBwIXG));

    @Override // defpackage.gPXPFXrUH4XX
    public final Object RAsUl2FVSrh6(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        vg vgVar = new vg();
        vgVar.PxuCJdSBwIXG = bArr;
        vgVar.lS5Rgt96tfkO = bArr.length;
        vgVar.lS5Rgt96tfkO(10);
        return vgVar;
    }

    @Override // defpackage.gPXPFXrUH4XX
    public final int Y1f8riQaR6yg(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.xk, defpackage.gPXPFXrUH4XX
    public final void a92UlCVFR9N8(op opVar, int i, Object obj) {
        vg vgVar = (vg) obj;
        vgVar.getClass();
        byte S9EYkSpbGuxq = opVar.S9EYkSpbGuxq(this.lS5Rgt96tfkO, i);
        vgVar.lS5Rgt96tfkO(vgVar.Y1f8riQaR6yg() + 1);
        byte[] bArr = vgVar.PxuCJdSBwIXG;
        int i2 = vgVar.lS5Rgt96tfkO;
        vgVar.lS5Rgt96tfkO = i2 + 1;
        bArr[i2] = S9EYkSpbGuxq;
    }

    @Override // defpackage.bq1
    public final void dgRBjINgWbAK(fx1 fx1Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        fx1Var.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            aq1 aq1Var = this.lS5Rgt96tfkO;
            aq1Var.getClass();
            fx1Var.EpkonXwzFgDB(aq1Var, i2);
            fx1Var.a92UlCVFR9N8(b);
        }
    }

    @Override // defpackage.bq1
    public final Object wdg6QnbFHrFF() {
        return new byte[0];
    }
}
