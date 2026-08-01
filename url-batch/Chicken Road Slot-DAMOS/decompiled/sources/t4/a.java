package t4;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.appsflyer.R;
import n0.i0;
import n0.u;
import n0.v;
import s4.c;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final v f9280a = new v(new u(4));

    public static c a(i0 i0Var) {
        c cVar;
        c cVar2 = (c) i0Var.j(f9280a);
        if (cVar2 != null) {
            i0Var.W(950834231);
            i0Var.p(false);
            return cVar2;
        }
        i0Var.W(950836184);
        View view = (View) i0Var.j(AndroidCompositionLocals_androidKt.f469f);
        view.getClass();
        while (true) {
            cVar = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            c cVar3 = tag instanceof c ? (c) tag : null;
            if (cVar3 != null) {
                cVar = cVar3;
                break;
            }
            Object z10 = w.z(view);
            view = z10 instanceof View ? (View) z10 : null;
        }
        i0Var.p(false);
        return cVar;
    }
}
