package r0;

import K.T;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import x.AbstractC0313a;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0293a extends AbstractC0313a {

    /* renamed from: a, reason: collision with root package name */
    public l f3508a;

    @Override // x.AbstractC0313a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f3508a == null) {
            this.f3508a = new l(view);
        }
        l lVar = this.f3508a;
        View view2 = lVar.f1796a;
        lVar.f1797b = view2.getTop();
        lVar.f1798c = view2.getLeft();
        l lVar2 = this.f3508a;
        View view3 = lVar2.f1796a;
        int top = 0 - (view3.getTop() - lVar2.f1797b);
        WeakHashMap weakHashMap = T.f423a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f1798c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
