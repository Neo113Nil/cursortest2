package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.majelw.libystne.R;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class h93 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final g93 a(d0 d0Var, d00 d00Var, my myVar) {
        t7 t7Var;
        g93 g93Var;
        Object[] objArr = 0;
        if (nv0.a.compareAndSet(false, true)) {
            lq g = s93.g(1, 6, null);
            z71.H(j8.b((CoroutineContext) xb.y.getValue()), null, new ed(11, objArr == true ? 1 : 0, g), 3);
            j6 j6Var = new j6(16, g);
            synchronized (tm2.c) {
                tm2.i = zv.F(tm2.i, j6Var);
                Unit unit = Unit.a;
            }
            tm2.a();
        }
        if (d0Var.getChildCount() > 0) {
            View childAt = d0Var.getChildAt(0);
            if (childAt instanceof t7) {
                t7Var = (t7) childAt;
                if (t7Var == null) {
                    t7Var = new t7(d0Var.getContext(), d00Var.i());
                    d0Var.addView(t7Var.getView(), a);
                }
                Object tag = t7Var.getView().getTag(R.id.wrapped_composition_tag);
                g93Var = tag instanceof g93 ? (g93) tag : null;
                if (g93Var == null) {
                    g93Var = new g93(t7Var, new k00(d00Var, new t13(t7Var.getRoot())));
                    t7Var.getView().setTag(R.id.wrapped_composition_tag, g93Var);
                }
                g93Var.c(myVar);
                if (!Intrinsics.b(t7Var.getCoroutineContext(), d00Var.i())) {
                    t7Var.setCoroutineContext(d00Var.i());
                }
                return g93Var;
            }
        } else {
            d0Var.removeAllViews();
        }
        t7Var = null;
        if (t7Var == null) {
        }
        Object tag2 = t7Var.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof g93) {
        }
        if (g93Var == null) {
        }
        g93Var.c(myVar);
        if (!Intrinsics.b(t7Var.getCoroutineContext(), d00Var.i())) {
        }
        return g93Var;
    }
}
