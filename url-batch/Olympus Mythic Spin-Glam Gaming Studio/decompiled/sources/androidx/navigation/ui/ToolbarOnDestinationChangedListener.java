package androidx.navigation.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.transition.TransitionManager;
import java.lang.ref.WeakReference;

@RestrictTo
/* loaded from: classes10.dex */
class ToolbarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {
    private final WeakReference mToolbarWeakReference;

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener, androidx.navigation.NavController.OnDestinationChangedListener
    public void onDestinationChanged(NavController navController, NavDestination navDestination, Bundle bundle) {
        if (((Toolbar) this.mToolbarWeakReference.get()) == null) {
            navController.removeOnDestinationChangedListener(this);
        } else {
            super.onDestinationChanged(navController, navDestination, bundle);
        }
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void setTitle(CharSequence charSequence) {
        ((Toolbar) this.mToolbarWeakReference.get()).setTitle(charSequence);
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void setNavigationIcon(Drawable drawable, int i) {
        Toolbar toolbar = (Toolbar) this.mToolbarWeakReference.get();
        if (toolbar != null) {
            boolean z = drawable == null && toolbar.getNavigationIcon() != null;
            toolbar.setNavigationIcon(drawable);
            toolbar.setNavigationContentDescription(i);
            if (z) {
                TransitionManager.beginDelayedTransition(toolbar);
            }
        }
    }
}
