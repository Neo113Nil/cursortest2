package x;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public final class c implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f4524a;

    public c(CoordinatorLayout coordinatorLayout) {
        this.f4524a = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f4524a.f1807q;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.f4524a;
        coordinatorLayout.p(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f1807q;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
