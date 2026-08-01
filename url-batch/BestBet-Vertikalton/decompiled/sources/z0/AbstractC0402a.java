package z0;

import K.Q;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import x.AbstractC0392a;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0402a extends AbstractC0392a {

    /* renamed from: a, reason: collision with root package name */
    public l f4625a;

    @Override // x.AbstractC0392a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f4625a == null) {
            this.f4625a = new l(view);
        }
        l lVar = this.f4625a;
        View view2 = lVar.f2276a;
        lVar.f2277b = view2.getTop();
        lVar.f2278c = view2.getLeft();
        l lVar2 = this.f4625a;
        View view3 = lVar2.f2276a;
        int top = 0 - (view3.getTop() - lVar2.f2277b);
        WeakHashMap weakHashMap = Q.f578a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f2278c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
