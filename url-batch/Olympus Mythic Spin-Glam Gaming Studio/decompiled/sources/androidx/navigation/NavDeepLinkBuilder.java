package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.TaskStackBuilder;
import androidx.navigation.Navigator;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class NavDeepLinkBuilder {
    private Bundle mArgs;
    private final Context mContext;
    private int mDestId;
    private NavGraph mGraph;
    private final Intent mIntent;

    public NavDeepLinkBuilder(Context context) {
        this.mContext = context;
        if (context instanceof Activity) {
            this.mIntent = new Intent(context, context.getClass());
        } else {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            this.mIntent = launchIntentForPackage == null ? new Intent() : launchIntentForPackage;
        }
        this.mIntent.addFlags(268468224);
    }

    NavDeepLinkBuilder(NavController navController) {
        this(navController.getContext());
        this.mGraph = navController.getGraph();
    }

    public NavDeepLinkBuilder setDestination(int i) {
        this.mDestId = i;
        if (this.mGraph != null) {
            fillInIntent();
        }
        return this;
    }

    private void fillInIntent() {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(this.mGraph);
        NavDestination navDestination = null;
        while (!arrayDeque.isEmpty() && navDestination == null) {
            NavDestination navDestination2 = (NavDestination) arrayDeque.poll();
            if (navDestination2.getId() == this.mDestId) {
                navDestination = navDestination2;
            } else if (navDestination2 instanceof NavGraph) {
                Iterator<NavDestination> it = ((NavGraph) navDestination2).iterator();
                while (it.hasNext()) {
                    arrayDeque.add(it.next());
                }
            }
        }
        if (navDestination == null) {
            throw new IllegalArgumentException("Navigation destination " + NavDestination.getDisplayName(this.mContext, this.mDestId) + " cannot be found in the navigation graph " + this.mGraph);
        }
        this.mIntent.putExtra("android-support-nav:controller:deepLinkIds", navDestination.buildDeepLinkIds());
    }

    public NavDeepLinkBuilder setArguments(Bundle bundle) {
        this.mArgs = bundle;
        this.mIntent.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    public TaskStackBuilder createTaskStackBuilder() {
        if (this.mIntent.getIntArrayExtra("android-support-nav:controller:deepLinkIds") == null) {
            if (this.mGraph == null) {
                throw new IllegalStateException("You must call setGraph() before constructing the deep link");
            }
            throw new IllegalStateException("You must call setDestination() before constructing the deep link");
        }
        TaskStackBuilder addNextIntentWithParentStack = TaskStackBuilder.create(this.mContext).addNextIntentWithParentStack(new Intent(this.mIntent));
        for (int i = 0; i < addNextIntentWithParentStack.getIntentCount(); i++) {
            addNextIntentWithParentStack.editIntentAt(i).putExtra("android-support-nav:controller:deepLinkIntent", this.mIntent);
        }
        return addNextIntentWithParentStack;
    }

    private static class PermissiveNavigatorProvider extends NavigatorProvider {
        private final Navigator mDestNavigator;

        /* renamed from: androidx.navigation.NavDeepLinkBuilder$PermissiveNavigatorProvider$1, reason: invalid class name */
        class AnonymousClass1 extends Navigator<NavDestination> {
            @Override // androidx.navigation.Navigator
            public NavDestination createDestination() {
                return new NavDestination("permissive");
            }

            @Override // androidx.navigation.Navigator
            public NavDestination navigate(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
                throw new IllegalStateException("navigate is not supported");
            }

            @Override // androidx.navigation.Navigator
            public boolean popBackStack() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        }

        @Override // androidx.navigation.NavigatorProvider
        public Navigator getNavigator(String str) {
            try {
                return super.getNavigator(str);
            } catch (IllegalStateException unused) {
                return this.mDestNavigator;
            }
        }
    }
}
