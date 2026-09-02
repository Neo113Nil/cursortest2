package p1;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import n0.l0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class a extends a0.b {

    /* renamed from: a, reason: collision with root package name */
    public b f3010a;

    @Override // a0.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f3010a == null) {
            this.f3010a = new b(view);
        }
        b bVar = this.f3010a;
        View view2 = (View) bVar.f3013c;
        bVar.f3011a = view2.getTop();
        bVar.f3012b = view2.getLeft();
        b bVar2 = this.f3010a;
        View view3 = (View) bVar2.f3013c;
        int top = 0 - (view3.getTop() - bVar2.f3011a);
        WeakHashMap weakHashMap = l0.f2757a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - bVar2.f3012b));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
