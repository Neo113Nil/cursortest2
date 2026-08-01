package v0;

import M.P;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import z.AbstractC0427a;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0407a extends AbstractC0427a {

    /* renamed from: a, reason: collision with root package name */
    public l f4443a;

    @Override // z.AbstractC0427a
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        v(coordinatorLayout, view, i);
        if (this.f4443a == null) {
            this.f4443a = new l(view);
        }
        l lVar = this.f4443a;
        View view2 = lVar.f2389a;
        lVar.f2390b = view2.getTop();
        lVar.f2391c = view2.getLeft();
        l lVar2 = this.f4443a;
        View view3 = lVar2.f2389a;
        int top = 0 - (view3.getTop() - lVar2.f2390b);
        WeakHashMap weakHashMap = P.f711a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f2391c));
        return true;
    }

    public void v(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
