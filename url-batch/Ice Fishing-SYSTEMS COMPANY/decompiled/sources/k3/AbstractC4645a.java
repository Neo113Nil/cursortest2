package k3;

import B.b;
import O.X;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;

/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4645a extends b {

    /* renamed from: a, reason: collision with root package name */
    public l f38747a;

    @Override // B.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f38747a == null) {
            this.f38747a = new l(view);
        }
        l lVar = this.f38747a;
        View view2 = lVar.f36133n;
        lVar.f36134u = view2.getTop();
        lVar.f36135v = view2.getLeft();
        l lVar2 = this.f38747a;
        View view3 = lVar2.f36133n;
        int top = 0 - (view3.getTop() - lVar2.f36134u);
        WeakHashMap weakHashMap = X.f2240a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f36135v));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(i, view);
    }
}
