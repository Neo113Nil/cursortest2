package r0;

import K.T;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import x.AbstractC0315a;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0294a extends AbstractC0315a {

    /* renamed from: a, reason: collision with root package name */
    public l f3394a;

    @Override // x.AbstractC0315a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f3394a == null) {
            this.f3394a = new l(view);
        }
        l lVar = this.f3394a;
        View view2 = lVar.f1827a;
        lVar.f1828b = view2.getTop();
        lVar.f1829c = view2.getLeft();
        l lVar2 = this.f3394a;
        View view3 = lVar2.f1827a;
        int top = 0 - (view3.getTop() - lVar2.f1828b);
        WeakHashMap weakHashMap = T.f440a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f1829c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
