package defpackage;

import android.view.View;
import com.ice.fishing.grenza.R;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class g21 {
    public static final fq PxuCJdSBwIXG = new fq(new kb(27));

    public static ic1 PxuCJdSBwIXG(hp hpVar) {
        ic1 ic1Var;
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        tf0 tf0Var = (tf0) hpVar;
        ic1 ic1Var2 = (ic1) tf0Var.wdg6QnbFHrFF(PxuCJdSBwIXG);
        if (ic1Var2 != null) {
            tf0Var.IXK6ba3ucyzm(950834231);
            tf0Var.gPXPFXrUH4XX(false);
            return ic1Var2;
        }
        tf0Var.IXK6ba3ucyzm(950836184);
        View view = (View) tf0Var.wdg6QnbFHrFF(h2.a92UlCVFR9N8);
        view.getClass();
        while (true) {
            ic1Var = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            ic1 ic1Var3 = tag instanceof ic1 ? (ic1) tag : null;
            if (ic1Var3 != null) {
                ic1Var = ic1Var3;
                break;
            }
            Object pnx5pC0XzaCw = ni0.pnx5pC0XzaCw(view);
            view = pnx5pC0XzaCw instanceof View ? (View) pnx5pC0XzaCw : null;
        }
        gg1 gg1Var2 = mp.PxuCJdSBwIXG;
        tf0Var.gPXPFXrUH4XX(false);
        return ic1Var;
    }
}
