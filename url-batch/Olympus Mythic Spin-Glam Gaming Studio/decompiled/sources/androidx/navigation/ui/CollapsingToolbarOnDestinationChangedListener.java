package androidx.navigation.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.transition.TransitionManager;
import java.lang.ref.WeakReference;

@RestrictTo
/* loaded from: classes3.dex */
class CollapsingToolbarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {
    private final WeakReference mCollapsingToolbarLayoutWeakReference;
    private final WeakReference mToolbarWeakReference;

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener, androidx.navigation.NavController.OnDestinationChangedListener
    public void onDestinationChanged(NavController navController, NavDestination navDestination, Bundle bundle) {
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(this.mCollapsingToolbarLayoutWeakReference.get());
        navController.removeOnDestinationChangedListener(this);
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void setTitle(CharSequence charSequence) {
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(this.mCollapsingToolbarLayoutWeakReference.get());
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
