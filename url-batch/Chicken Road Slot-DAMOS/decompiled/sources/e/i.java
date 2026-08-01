package e;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.appsflyer.R;
import d.e0;
import n0.i0;
import n0.v;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final v f3751a = new v(new a1.k(5));

    public static e0 a(i0 i0Var) {
        e0 e0Var = (e0) i0Var.j(f3751a);
        Object obj = null;
        if (e0Var == null) {
            i0Var.W(1208426157);
            View view = (View) i0Var.j(AndroidCompositionLocals_androidKt.f469f);
            view.getClass();
            while (true) {
                if (view == null) {
                    e0Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                e0 e0Var2 = tag instanceof e0 ? (e0) tag : null;
                if (e0Var2 != null) {
                    e0Var = e0Var2;
                    break;
                }
                Object z10 = w.z(view);
                view = z10 instanceof View ? (View) z10 : null;
            }
        } else {
            i0Var.W(1208423708);
        }
        i0Var.p(false);
        if (e0Var != null) {
            i0Var.W(1208423789);
            i0Var.p(false);
            return e0Var;
        }
        i0Var.W(1208428160);
        Context context = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f465b);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            if (context instanceof e0) {
                obj = context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        e0 e0Var3 = (e0) obj;
        i0Var.p(false);
        return e0Var3;
    }
}
