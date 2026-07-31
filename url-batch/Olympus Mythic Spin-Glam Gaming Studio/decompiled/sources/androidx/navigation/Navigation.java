package androidx.navigation;

import android.os.Bundle;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes13.dex */
public final class Navigation {
    public static NavController findNavController(View view) {
        NavController findViewNavController = findViewNavController(view);
        if (findViewNavController != null) {
            return findViewNavController;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    /* renamed from: androidx.navigation.Navigation$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 implements View.OnClickListener {
        final /* synthetic */ Bundle val$args;
        final /* synthetic */ int val$resId;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Navigation.findNavController(view).navigate(this.val$resId, this.val$args);
        }
    }

    /* renamed from: androidx.navigation.Navigation$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass2 implements View.OnClickListener {
        final /* synthetic */ NavDirections val$directions;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Navigation.findNavController(view).navigate(this.val$directions);
        }
    }

    public static void setViewNavController(View view, NavController navController) {
        view.setTag(R.id.nav_controller_view_tag, navController);
    }

    private static NavController findViewNavController(View view) {
        while (view != null) {
            NavController viewNavController = getViewNavController(view);
            if (viewNavController != null) {
                return viewNavController;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private static NavController getViewNavController(View view) {
        Object tag = view.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }
}
