package n1;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j3.z;
import java.util.WeakHashMap;
import k0.j0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class a extends x.a {

    /* renamed from: a, reason: collision with root package name */
    public z f2946a;

    @Override // x.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        r(coordinatorLayout, view, i4);
        if (this.f2946a == null) {
            this.f2946a = new z(view);
        }
        z zVar = this.f2946a;
        View view2 = (View) zVar.c;
        zVar.f2494a = view2.getTop();
        zVar.f2495b = view2.getLeft();
        z zVar2 = this.f2946a;
        View view3 = (View) zVar2.c;
        int top = 0 - (view3.getTop() - zVar2.f2494a);
        WeakHashMap weakHashMap = j0.f2752a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - zVar2.f2495b));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i4) {
        coordinatorLayout.q(view, i4);
    }
}
