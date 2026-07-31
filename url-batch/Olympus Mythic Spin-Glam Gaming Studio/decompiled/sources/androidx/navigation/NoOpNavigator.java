package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.navigation.Navigator;

@Navigator.Name("NoOp")
@RestrictTo
/* loaded from: classes5.dex */
public class NoOpNavigator extends Navigator<NavDestination> {
    @Override // androidx.navigation.Navigator
    public NavDestination navigate(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        return navDestination;
    }

    @Override // androidx.navigation.Navigator
    public boolean popBackStack() {
        return true;
    }

    @Override // androidx.navigation.Navigator
    public NavDestination createDestination() {
        return new NavDestination(this);
    }
}
