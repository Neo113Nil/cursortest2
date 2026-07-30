package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pg2 implements PointerInputEventHandler {
    public final /* synthetic */ ru PxuCJdSBwIXG;
    public final /* synthetic */ e81 TSizfFm2Yiuu;
    public final /* synthetic */ d91 Y1f8riQaR6yg;
    public final /* synthetic */ d91 lS5Rgt96tfkO;

    public pg2(ru ruVar, d91 d91Var, e81 e81Var, d91 d91Var2) {
        this.PxuCJdSBwIXG = ruVar;
        this.lS5Rgt96tfkO = d91Var;
        this.TSizfFm2Yiuu = e81Var;
        this.Y1f8riQaR6yg = d91Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(eo1 eo1Var, bt btVar) {
        og2 og2Var = new og2(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu, null);
        o6 o6Var = new o6(this.Y1f8riQaR6yg, 4);
        z20 z20Var = rd2.PxuCJdSBwIXG;
        Object XL4ISE6Oc65B = cs0.XL4ISE6Oc65B(new d4(eo1Var, og2Var, o6Var, new up1(eo1Var), null, 8), btVar);
        no2 no2Var = no2.PxuCJdSBwIXG;
        su suVar = su.rtx2ld2ELZv4;
        if (XL4ISE6Oc65B != suVar) {
            XL4ISE6Oc65B = no2Var;
        }
        return XL4ISE6Oc65B == suVar ? XL4ISE6Oc65B : no2Var;
    }
}
