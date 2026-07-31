package androidx.navigation.ui;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import android.view.View;
import androidx.customview.widget.Openable;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import java.lang.ref.WeakReference;
import java.util.Set;

/* loaded from: classes5.dex */
public final class NavigationUI {

    /* renamed from: androidx.navigation.ui.NavigationUI$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass3 {
    }

    /* renamed from: androidx.navigation.ui.NavigationUI$5, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass5 {
    }

    public static boolean navigateUp(NavController navController, AppBarConfiguration appBarConfiguration) {
        Openable openableLayout = appBarConfiguration.getOpenableLayout();
        NavDestination currentDestination = navController.getCurrentDestination();
        Set topLevelDestinations = appBarConfiguration.getTopLevelDestinations();
        if (openableLayout != null && currentDestination != null && matchDestinations(currentDestination, topLevelDestinations)) {
            openableLayout.open();
            return true;
        }
        if (navController.navigateUp()) {
            return true;
        }
        if (appBarConfiguration.getFallbackOnNavigateUpListener() != null) {
            return appBarConfiguration.getFallbackOnNavigateUpListener().onNavigateUp();
        }
        return false;
    }

    /* renamed from: androidx.navigation.ui.NavigationUI$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 implements View.OnClickListener {
        final /* synthetic */ AppBarConfiguration val$configuration;
        final /* synthetic */ NavController val$navController;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NavigationUI.navigateUp(this.val$navController, this.val$configuration);
        }
    }

    /* renamed from: androidx.navigation.ui.NavigationUI$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass2 implements View.OnClickListener {
        final /* synthetic */ AppBarConfiguration val$configuration;
        final /* synthetic */ NavController val$navController;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NavigationUI.navigateUp(this.val$navController, this.val$configuration);
        }
    }

    /* renamed from: androidx.navigation.ui.NavigationUI$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass4 implements NavController.OnDestinationChangedListener {
        final /* synthetic */ NavController val$navController;
        final /* synthetic */ WeakReference val$weakReference;

        @Override // androidx.navigation.NavController.OnDestinationChangedListener
        public void onDestinationChanged(NavController navController, NavDestination navDestination, Bundle bundle) {
            MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(this.val$weakReference.get());
            this.val$navController.removeOnDestinationChangedListener(this);
        }
    }

    /* renamed from: androidx.navigation.ui.NavigationUI$6, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass6 implements NavController.OnDestinationChangedListener {
        final /* synthetic */ NavController val$navController;
        final /* synthetic */ WeakReference val$weakReference;

        @Override // androidx.navigation.NavController.OnDestinationChangedListener
        public void onDestinationChanged(NavController navController, NavDestination navDestination, Bundle bundle) {
            MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(this.val$weakReference.get());
            this.val$navController.removeOnDestinationChangedListener(this);
        }
    }

    static boolean matchDestinations(NavDestination navDestination, Set set) {
        while (!set.contains(Integer.valueOf(navDestination.getId()))) {
            navDestination = navDestination.getParent();
            if (navDestination == null) {
                return false;
            }
        }
        return true;
    }
}
