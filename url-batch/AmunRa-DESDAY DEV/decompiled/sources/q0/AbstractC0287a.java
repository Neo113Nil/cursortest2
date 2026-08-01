package q0;

import K.S;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import x.AbstractC0328a;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0287a extends AbstractC0328a {

    /* renamed from: a, reason: collision with root package name */
    public l f3510a;

    @Override // x.AbstractC0328a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f3510a == null) {
            this.f3510a = new l(view);
        }
        l lVar = this.f3510a;
        View view2 = lVar.f1704a;
        lVar.f1705b = view2.getTop();
        lVar.f1706c = view2.getLeft();
        l lVar2 = this.f3510a;
        View view3 = lVar2.f1704a;
        int top = 0 - (view3.getTop() - lVar2.f1705b);
        WeakHashMap weakHashMap = S.f362a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f1706c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
