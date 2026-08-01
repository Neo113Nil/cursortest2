package u0;

import K.S;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import x.AbstractC0319a;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0305a extends AbstractC0319a {

    /* renamed from: a, reason: collision with root package name */
    public l f3943a;

    @Override // x.AbstractC0319a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f3943a == null) {
            this.f3943a = new l(view);
        }
        l lVar = this.f3943a;
        View view2 = lVar.f1800a;
        lVar.f1801b = view2.getTop();
        lVar.f1802c = view2.getLeft();
        l lVar2 = this.f3943a;
        View view3 = lVar2.f1800a;
        int top = 0 - (view3.getTop() - lVar2.f1801b);
        WeakHashMap weakHashMap = S.f351a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f1802c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
