package q0;

import K.S;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import x.AbstractC0334a;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0287a extends AbstractC0334a {

    /* renamed from: a, reason: collision with root package name */
    public l f3488a;

    @Override // x.AbstractC0334a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f3488a == null) {
            this.f3488a = new l(view);
        }
        l lVar = this.f3488a;
        View view2 = lVar.f1771a;
        lVar.f1772b = view2.getTop();
        lVar.f1773c = view2.getLeft();
        l lVar2 = this.f3488a;
        View view3 = lVar2.f1771a;
        int top = 0 - (view3.getTop() - lVar2.f1772b);
        WeakHashMap weakHashMap = S.f422a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f1773c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
