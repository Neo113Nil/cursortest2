package s1;

import a0.c;
import a4.b0;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import n0.p0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public b0 f3235a;

    @Override // a0.c
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f3235a == null) {
            this.f3235a = new b0(view);
        }
        b0 b0Var = this.f3235a;
        View view2 = (View) b0Var.f144c;
        b0Var.f142a = view2.getTop();
        b0Var.f143b = view2.getLeft();
        b0 b0Var2 = this.f3235a;
        View view3 = (View) b0Var2.f144c;
        int top = 0 - (view3.getTop() - b0Var2.f142a);
        WeakHashMap weakHashMap = p0.f2816a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - b0Var2.f143b));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
