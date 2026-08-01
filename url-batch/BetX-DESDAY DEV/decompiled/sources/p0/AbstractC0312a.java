package p0;

import K.X;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import x.AbstractC0363a;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0312a extends AbstractC0363a {

    /* renamed from: a, reason: collision with root package name */
    public l f3769a;

    @Override // x.AbstractC0363a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f3769a == null) {
            this.f3769a = new l(view);
        }
        l lVar = this.f3769a;
        View view2 = lVar.f1867a;
        lVar.f1868b = view2.getTop();
        lVar.f1869c = view2.getLeft();
        l lVar2 = this.f3769a;
        View view3 = lVar2.f1867a;
        int top = 0 - (view3.getTop() - lVar2.f1868b);
        WeakHashMap weakHashMap = X.f419a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f1869c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
