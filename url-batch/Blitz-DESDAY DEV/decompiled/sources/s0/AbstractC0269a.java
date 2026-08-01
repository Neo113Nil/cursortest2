package s0;

import M.Q;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import z.AbstractC0318a;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0269a extends AbstractC0318a {

    /* renamed from: a, reason: collision with root package name */
    public l f3604a;

    @Override // z.AbstractC0318a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f3604a == null) {
            this.f3604a = new l(view);
        }
        l lVar = this.f3604a;
        View view2 = lVar.f1881a;
        lVar.f1882b = view2.getTop();
        lVar.f1883c = view2.getLeft();
        l lVar2 = this.f3604a;
        View view3 = lVar2.f1881a;
        int top = 0 - (view3.getTop() - lVar2.f1882b);
        WeakHashMap weakHashMap = Q.f513a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f1883c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
