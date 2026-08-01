package p0;

import K.T;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import x.AbstractC0335a;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0283a extends AbstractC0335a {

    /* renamed from: a, reason: collision with root package name */
    public l f3377a;

    @Override // x.AbstractC0335a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f3377a == null) {
            this.f3377a = new l(view);
        }
        l lVar = this.f3377a;
        View view2 = lVar.f1668a;
        lVar.f1669b = view2.getTop();
        lVar.f1670c = view2.getLeft();
        l lVar2 = this.f3377a;
        View view3 = lVar2.f1668a;
        int top = 0 - (view3.getTop() - lVar2.f1669b);
        WeakHashMap weakHashMap = T.f381a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f1670c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
