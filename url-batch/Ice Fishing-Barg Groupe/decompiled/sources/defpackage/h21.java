package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.ice.fishing.grenza.R;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class h21 {
    public static final fq PxuCJdSBwIXG = new fq(new kb(28));

    public static vf1 PxuCJdSBwIXG(hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        tf0 tf0Var = (tf0) hpVar;
        vf1 vf1Var = (vf1) tf0Var.wdg6QnbFHrFF(PxuCJdSBwIXG);
        Object obj = null;
        if (vf1Var == null) {
            tf0Var.IXK6ba3ucyzm(1208426157);
            View view = (View) tf0Var.wdg6QnbFHrFF(h2.a92UlCVFR9N8);
            view.getClass();
            while (true) {
                if (view == null) {
                    vf1Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                vf1 vf1Var2 = tag instanceof vf1 ? (vf1) tag : null;
                if (vf1Var2 != null) {
                    vf1Var = vf1Var2;
                    break;
                }
                Object pnx5pC0XzaCw = ni0.pnx5pC0XzaCw(view);
                view = pnx5pC0XzaCw instanceof View ? (View) pnx5pC0XzaCw : null;
            }
        } else {
            tf0Var.IXK6ba3ucyzm(1208423708);
        }
        tf0Var.gPXPFXrUH4XX(false);
        if (vf1Var == null) {
            tf0Var.IXK6ba3ucyzm(1208428160);
            Object obj2 = (Context) tf0Var.wdg6QnbFHrFF(h2.lS5Rgt96tfkO);
            while (true) {
                if (!(obj2 instanceof ContextWrapper)) {
                    break;
                }
                if (obj2 instanceof vf1) {
                    obj = obj2;
                    break;
                }
                obj2 = ((ContextWrapper) obj2).getBaseContext();
            }
            vf1Var = (vf1) obj;
        } else {
            tf0Var.IXK6ba3ucyzm(1208423789);
        }
        tf0Var.gPXPFXrUH4XX(false);
        gg1 gg1Var2 = mp.PxuCJdSBwIXG;
        return vf1Var;
    }
}
