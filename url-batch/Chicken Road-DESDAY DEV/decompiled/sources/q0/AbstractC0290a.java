package q0;

import K.S;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import x.AbstractC0332a;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0290a extends AbstractC0332a {

    /* renamed from: a, reason: collision with root package name */
    public l f3442a;

    @Override // x.AbstractC0332a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f3442a == null) {
            this.f3442a = new l(view);
        }
        l lVar = this.f3442a;
        View view2 = lVar.f1734a;
        lVar.f1735b = view2.getTop();
        lVar.f1736c = view2.getLeft();
        l lVar2 = this.f3442a;
        View view3 = lVar2.f1734a;
        int top = 0 - (view3.getTop() - lVar2.f1735b);
        WeakHashMap weakHashMap = S.f369a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f1736c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
