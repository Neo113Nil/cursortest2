package x;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC0337c implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f4168a;

    public ViewGroupOnHierarchyChangeListenerC0337c(CoordinatorLayout coordinatorLayout) {
        this.f4168a = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f4168a.f1280q;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.f4168a;
        coordinatorLayout.p(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f1280q;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
