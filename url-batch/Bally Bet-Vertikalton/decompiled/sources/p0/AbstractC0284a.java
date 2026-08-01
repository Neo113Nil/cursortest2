package p0;

import K.T;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import x.AbstractC0336a;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0284a extends AbstractC0336a {

    /* renamed from: a, reason: collision with root package name */
    public l f3383a;

    @Override // x.AbstractC0336a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f3383a == null) {
            this.f3383a = new l(view);
        }
        l lVar = this.f3383a;
        View view2 = lVar.f1674a;
        lVar.f1675b = view2.getTop();
        lVar.f1676c = view2.getLeft();
        l lVar2 = this.f3383a;
        View view3 = lVar2.f1674a;
        int top = 0 - (view3.getTop() - lVar2.f1675b);
        WeakHashMap weakHashMap = T.f381a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f1676c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
