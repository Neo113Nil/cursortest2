package s0;

import L.T;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import y.AbstractC0317a;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0296a extends AbstractC0317a {

    /* renamed from: a, reason: collision with root package name */
    public l f3576a;

    @Override // y.AbstractC0317a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f3576a == null) {
            this.f3576a = new l(view);
        }
        l lVar = this.f3576a;
        View view2 = lVar.f1896a;
        lVar.f1897b = view2.getTop();
        lVar.f1898c = view2.getLeft();
        l lVar2 = this.f3576a;
        View view3 = lVar2.f1896a;
        int top = 0 - (view3.getTop() - lVar2.f1897b);
        WeakHashMap weakHashMap = T.f490a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f1898c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
