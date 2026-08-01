package p0;

import K.X;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import x.AbstractC0361a;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0310a extends AbstractC0361a {

    /* renamed from: a, reason: collision with root package name */
    public l f3765a;

    @Override // x.AbstractC0361a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f3765a == null) {
            this.f3765a = new l(view);
        }
        l lVar = this.f3765a;
        View view2 = lVar.f1889a;
        lVar.f1890b = view2.getTop();
        lVar.f1891c = view2.getLeft();
        l lVar2 = this.f3765a;
        View view3 = lVar2.f1889a;
        int top = 0 - (view3.getTop() - lVar2.f1890b);
        WeakHashMap weakHashMap = X.f418a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f1891c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
