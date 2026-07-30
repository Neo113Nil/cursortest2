package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class j3 implements PointerInputEventHandler {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public final /* synthetic */ Object lS5Rgt96tfkO;

    public /* synthetic */ j3(int i, Object obj) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(eo1 eo1Var, bt btVar) {
        int i = this.PxuCJdSBwIXG;
        int i2 = 2;
        bt btVar2 = null;
        Object obj = this.lS5Rgt96tfkO;
        su suVar = su.rtx2ld2ELZv4;
        no2 no2Var = no2.PxuCJdSBwIXG;
        switch (i) {
            case 0:
                Object ryVscX7ZL4Ux = b51.ryVscX7ZL4Ux(eo1Var, new i3((k3) obj, btVar2, 0), btVar);
                return ryVscX7ZL4Ux == suVar ? ryVscX7ZL4Ux : no2Var;
            case 1:
                Object W7ceZOzvrRuI = ((pc2) eo1Var).W7ceZOzvrRuI(new i3((mt) obj, btVar2, i2), btVar);
                return W7ceZOzvrRuI == suVar ? W7ceZOzvrRuI : no2Var;
            case 2:
                y62 y62Var = (y62) obj;
                Object Y1f8riQaR6yg = rd2.Y1f8riQaR6yg(eo1Var, new u62(y62Var, null), new m62(y62Var, i2), btVar, 3);
                return Y1f8riQaR6yg == suVar ? Y1f8riQaR6yg : no2Var;
            case 3:
                Object ryVscX7ZL4Ux2 = b51.ryVscX7ZL4Ux(eo1Var, new m22((ya2) obj, null), btVar);
                return ryVscX7ZL4Ux2 == suVar ? ryVscX7ZL4Ux2 : no2Var;
            case 4:
                Object ryVscX7ZL4Ux3 = b51.ryVscX7ZL4Ux(eo1Var, new i3(new RAsUl2FVSrh6(1, (ve2) obj, ve2.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 0, 3), btVar2, 1), btVar);
                if (ryVscX7ZL4Ux3 != suVar) {
                    ryVscX7ZL4Ux3 = no2Var;
                }
                return ryVscX7ZL4Ux3 == suVar ? ryVscX7ZL4Ux3 : no2Var;
            case 5:
                eh2 eh2Var = (eh2) obj;
                bh2 bh2Var = eh2Var.IAToe7bXGz4N;
                ch2 ch2Var = eh2Var.pnx5pC0XzaCw;
                pc2 pc2Var = (pc2) eo1Var;
                pc2Var.getClass();
                vq2 vq2Var = zv.zf8DYfih6EZu(pc2Var).ozEBbv0hFTAB;
                x3 x3Var = new x3();
                x3Var.lS5Rgt96tfkO = vq2Var;
                Object ryVscX7ZL4Ux4 = b51.ryVscX7ZL4Ux(eo1Var, new m22(x3Var, bh2Var, ch2Var, null), btVar);
                if (ryVscX7ZL4Ux4 != suVar) {
                    ryVscX7ZL4Ux4 = no2Var;
                }
                return ryVscX7ZL4Ux4 == suVar ? ryVscX7ZL4Ux4 : no2Var;
            default:
                Object XL4ISE6Oc65B = cs0.XL4ISE6Oc65B(new rz(eo1Var, (of2) obj, null), btVar);
                if (XL4ISE6Oc65B != suVar) {
                    XL4ISE6Oc65B = no2Var;
                }
                return XL4ISE6Oc65B == suVar ? XL4ISE6Oc65B : no2Var;
        }
    }
}
