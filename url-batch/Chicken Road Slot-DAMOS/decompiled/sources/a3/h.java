package a3;

import a2.g0;
import a2.h0;
import a2.i0;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2.g0 f215b;

    public h(e0 e0Var, c2.g0 g0Var) {
        this.f214a = e0Var;
        this.f215b = g0Var;
    }

    @Override // a2.g0
    public final h0 a(i0 i0Var, List list, long j) {
        e0 e0Var = this.f214a;
        if (e0Var.getChildCount() == 0) {
            return i0.V(i0Var, x2.a.j(j), x2.a.i(j), c.f199i);
        }
        if (x2.a.j(j) != 0) {
            e0Var.getChildAt(0).setMinimumWidth(x2.a.j(j));
        }
        if (x2.a.i(j) != 0) {
            e0Var.getChildAt(0).setMinimumHeight(x2.a.i(j));
        }
        int j3 = x2.a.j(j);
        int h10 = x2.a.h(j);
        ViewGroup.LayoutParams layoutParams = e0Var.getLayoutParams();
        layoutParams.getClass();
        int k10 = n.k(e0Var, j3, h10, layoutParams.width);
        int i3 = x2.a.i(j);
        int g = x2.a.g(j);
        ViewGroup.LayoutParams layoutParams2 = e0Var.getLayoutParams();
        layoutParams2.getClass();
        e0Var.measure(k10, n.k(e0Var, i3, g, layoutParams2.height));
        return i0.V(i0Var, e0Var.getMeasuredWidth(), e0Var.getMeasuredHeight(), new f(e0Var, this.f215b, 1));
    }
}
