package w0;

import K.S;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import x.AbstractC0378b;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0376a extends AbstractC0378b {

    /* renamed from: a, reason: collision with root package name */
    public l f3992a;

    @Override // x.AbstractC0378b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f3992a == null) {
            this.f3992a = new l(view);
        }
        l lVar = this.f3992a;
        View view2 = (View) lVar.f1878a;
        lVar.f1879b = view2.getTop();
        lVar.f1880c = view2.getLeft();
        l lVar2 = this.f3992a;
        View view3 = (View) lVar2.f1878a;
        int top = 0 - (view3.getTop() - lVar2.f1879b);
        WeakHashMap weakHashMap = S.f365a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f1880c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
