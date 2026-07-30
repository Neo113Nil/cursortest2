package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.ice.fishing.grenza.R;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class cv2 {
    public static final ViewGroup.LayoutParams PxuCJdSBwIXG = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final av2 PxuCJdSBwIXG(RfyTYNmI9Srp rfyTYNmI9Srp, dp dpVar, on onVar) {
        r1 r1Var;
        av2 av2Var;
        Object[] objArr = 0;
        if (xg0.PxuCJdSBwIXG.compareAndSet(false, true)) {
            eg PxuCJdSBwIXG2 = mm2.PxuCJdSBwIXG(1, 6, null);
            v6.Companion.getClass();
            fx1.KUoIVIumpKat(cs0.Y1f8riQaR6yg((hu) v6.EcgxDIVH5in8.getValue()), null, new rtx2ld2ELZv4(PxuCJdSBwIXG2, objArr == true ? 1 : 0, 10), 3);
            i72 i72Var = j72.Companion;
            y yVar = new y(11, PxuCJdSBwIXG2);
            i72Var.getClass();
            synchronized (s72.TSizfFm2Yiuu) {
                s72.OPXfSBeufaJ8 = zk.P6VAkUObIv30(s72.OPXfSBeufaJ8, yVar);
            }
            s72.Y1f8riQaR6yg(s72.PxuCJdSBwIXG);
        }
        if (rfyTYNmI9Srp.getChildCount() > 0) {
            View childAt = rfyTYNmI9Srp.getChildAt(0);
            r1Var = childAt instanceof r1 ? (r1) childAt : null;
            if (r1Var != null) {
                r1Var.setComposeViewContext(dpVar);
                if (r1Var == null) {
                    r1Var = new r1(rfyTYNmI9Srp.getContext(), dpVar);
                    rfyTYNmI9Srp.addView(r1Var.getView(), PxuCJdSBwIXG);
                }
                r1Var.setComposeViewContext(dpVar);
                if (rfyTYNmI9Srp.getComposeViewContext$ui() != null) {
                    dpVar.TSizfFm2Yiuu();
                    r1Var.setComposeViewContextIncrementedDuringInit$ui(true);
                }
                Object tag = r1Var.getTag(R.id.wrapped_composition_tag);
                av2Var = tag instanceof av2 ? (av2) tag : null;
                if (av2Var == null) {
                    av2Var = new av2(r1Var, new zp(dpVar.lS5Rgt96tfkO, new m9(r1Var.getRoot())));
                    r1Var.setTag(R.id.wrapped_composition_tag, av2Var);
                }
                av2Var.TSizfFm2Yiuu(onVar);
                r1Var.setFrameEndScheduler$ui(new bv2(dpVar.lS5Rgt96tfkO));
                return av2Var;
            }
        } else {
            rfyTYNmI9Srp.removeAllViews();
        }
        r1Var = null;
        if (r1Var == null) {
        }
        r1Var.setComposeViewContext(dpVar);
        if (rfyTYNmI9Srp.getComposeViewContext$ui() != null) {
        }
        Object tag2 = r1Var.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof av2) {
        }
        if (av2Var == null) {
        }
        av2Var.TSizfFm2Yiuu(onVar);
        r1Var.setFrameEndScheduler$ui(new bv2(dpVar.lS5Rgt96tfkO));
        return av2Var;
    }
}
