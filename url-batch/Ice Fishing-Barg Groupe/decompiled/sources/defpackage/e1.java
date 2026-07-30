package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class e1 extends m61 implements df, b32, vu0, kw0, ol2 {
    public final /* synthetic */ r1 S2OOm9zPNm0h;
    public final y VhhvGxCb8gfr = new y(2, this);

    public e1(r1 r1Var) {
        this.S2OOm9zPNm0h = r1Var;
    }

    @Override // defpackage.ol2
    public final Object RfyTYNmI9Srp() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.kw0
    public final k51 e9gEMXR7LXtO(l51 l51Var, e51 e51Var, long j) {
        em1 e9gEMXR7LXtO = e51Var.e9gEMXR7LXtO(j);
        return l51Var.gGoUzNp9JO5I(e9gEMXR7LXtO.rtx2ld2ELZv4, e9gEMXR7LXtO.OPXfSBeufaJ8, q50.rtx2ld2ELZv4, this.VhhvGxCb8gfr, new d1(e9gEMXR7LXtO, 0));
    }

    @Override // defpackage.vu0
    public final boolean x50lh2ztY7Y5(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.df
    public final Object yQRudnv4La6p(pd1 pd1Var, i1 i1Var, ct ctVar) {
        long J54yh1s3n4Aq = kj0.J54yh1s3n4Aq(pd1Var);
        qt1 qt1Var = (qt1) i1Var.PxuCJdSBwIXG();
        qt1 OPXfSBeufaJ8 = qt1Var != null ? qt1Var.OPXfSBeufaJ8(J54yh1s3n4Aq) : null;
        if (OPXfSBeufaJ8 != null) {
            this.S2OOm9zPNm0h.requestRectangleOnScreen(new Rect((int) OPXfSBeufaJ8.PxuCJdSBwIXG, (int) OPXfSBeufaJ8.lS5Rgt96tfkO, (int) OPXfSBeufaJ8.TSizfFm2Yiuu, (int) OPXfSBeufaJ8.Y1f8riQaR6yg), false);
        }
        return no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.vu0
    public final boolean zf8DYfih6EZu(KeyEvent keyEvent) {
        ga0 ga0Var;
        int i;
        int[] iArr = ka0.PxuCJdSBwIXG;
        long XL4ISE6Oc65B = jh0.XL4ISE6Oc65B(keyEvent);
        ou0.Companion.getClass();
        Integer num = null;
        if (ou0.PxuCJdSBwIXG(XL4ISE6Oc65B, ou0.lS5Rgt96tfkO)) {
            ga0.Companion.getClass();
            ga0Var = new ga0(2);
        } else if (ou0.PxuCJdSBwIXG(XL4ISE6Oc65B, ou0.TSizfFm2Yiuu)) {
            ga0.Companion.getClass();
            ga0Var = new ga0(1);
        } else if (ou0.PxuCJdSBwIXG(XL4ISE6Oc65B, ou0.gPXPFXrUH4XX)) {
            if (keyEvent.isShiftPressed()) {
                ga0.Companion.getClass();
                i = 2;
            } else {
                ga0.Companion.getClass();
                i = 1;
            }
            ga0Var = new ga0(i);
        } else if (ou0.PxuCJdSBwIXG(XL4ISE6Oc65B, ou0.RAsUl2FVSrh6)) {
            ga0.Companion.getClass();
            ga0Var = new ga0(4);
        } else if (ou0.PxuCJdSBwIXG(XL4ISE6Oc65B, ou0.a92UlCVFR9N8)) {
            ga0.Companion.getClass();
            ga0Var = new ga0(3);
        } else if (ou0.PxuCJdSBwIXG(XL4ISE6Oc65B, ou0.Y1f8riQaR6yg) || ou0.PxuCJdSBwIXG(XL4ISE6Oc65B, ou0.aF05bpZJlKEP)) {
            ga0.Companion.getClass();
            ga0Var = new ga0(5);
        } else if (ou0.PxuCJdSBwIXG(XL4ISE6Oc65B, ou0.e9gEMXR7LXtO) || ou0.PxuCJdSBwIXG(XL4ISE6Oc65B, ou0.kpCQ9veP6n3I)) {
            ga0.Companion.getClass();
            ga0Var = new ga0(6);
        } else if (ou0.PxuCJdSBwIXG(XL4ISE6Oc65B, ou0.rtx2ld2ELZv4) || ou0.PxuCJdSBwIXG(XL4ISE6Oc65B, ou0.XL4ISE6Oc65B) || ou0.PxuCJdSBwIXG(XL4ISE6Oc65B, ou0.rZjpSjn4zoMv)) {
            ga0.Companion.getClass();
            ga0Var = new ga0(7);
        } else if (ou0.PxuCJdSBwIXG(XL4ISE6Oc65B, ou0.PxuCJdSBwIXG) || ou0.PxuCJdSBwIXG(XL4ISE6Oc65B, ou0.S9EYkSpbGuxq)) {
            ga0.Companion.getClass();
            ga0Var = new ga0(8);
        } else {
            ga0Var = null;
        }
        if (ga0Var == null) {
            return false;
        }
        int i2 = ga0Var.PxuCJdSBwIXG;
        int S9EYkSpbGuxq = jh0.S9EYkSpbGuxq(keyEvent);
        su0.Companion.getClass();
        if (S9EYkSpbGuxq != 2) {
            return false;
        }
        r1 r1Var = this.S2OOm9zPNm0h;
        ((qa0) r1Var.getFocusOwner()).getClass();
        Boolean e9gEMXR7LXtO = ((qa0) r1Var.getFocusOwner()).e9gEMXR7LXtO(i2, r1Var.getEmbeddedViewFocusRect(), new y(1, ga0Var));
        if (e9gEMXR7LXtO != null ? e9gEMXR7LXtO.booleanValue() : true) {
            return true;
        }
        if (!ov2.tmVwIGCQF4zR(i2)) {
            return false;
        }
        fa0 fa0Var = ga0.Companion;
        fa0Var.getClass();
        if (i2 == 5) {
            num = 33;
        } else {
            fa0Var.getClass();
            if (i2 == 6) {
                num = 130;
            } else {
                fa0Var.getClass();
                if (i2 == 3) {
                    num = 17;
                } else {
                    fa0Var.getClass();
                    if (i2 == 4) {
                        num = 66;
                    } else {
                        fa0Var.getClass();
                        if (i2 == 1) {
                            num = 2;
                        } else {
                            fa0Var.getClass();
                            if (i2 == 2) {
                                num = 1;
                            }
                        }
                    }
                }
            }
        }
        int intValue = num != null ? num.intValue() : 2;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = r1Var.getRootView();
        rootView.getClass();
        View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, r1Var.getView(), intValue);
        if (findNextFocus == null || findNextFocus.equals(r1Var)) {
            return ((qa0) r1Var.getFocusOwner()).rtx2ld2ELZv4(i2);
        }
        return false;
    }

    @Override // defpackage.b32
    public final void D0aTLcX6Uhyo(l32 l32Var) {
    }
}
