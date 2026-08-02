package com.stripe.android.uicore.navigation;

import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class NavBackStackEntryUpdate {
    public final NavBackStackEntry currentBackStackEntry;
    public final NavBackStackEntry previousBackStackEntry;

    public NavBackStackEntryUpdate(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.previousBackStackEntry = navBackStackEntry;
        this.currentBackStackEntry = navBackStackEntry2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavBackStackEntryUpdate)) {
            return false;
        }
        NavBackStackEntryUpdate navBackStackEntryUpdate = (NavBackStackEntryUpdate) obj;
        return Intrinsics.areEqual(this.previousBackStackEntry, navBackStackEntryUpdate.previousBackStackEntry) && Intrinsics.areEqual(this.currentBackStackEntry, navBackStackEntryUpdate.currentBackStackEntry);
    }

    public final int hashCode() {
        NavBackStackEntry navBackStackEntry = this.previousBackStackEntry;
        int hashCode = (navBackStackEntry == null ? 0 : navBackStackEntry.hashCode()) * 31;
        NavBackStackEntry navBackStackEntry2 = this.currentBackStackEntry;
        return hashCode + (navBackStackEntry2 != null ? navBackStackEntry2.hashCode() : 0);
    }

    public final String toString() {
        return "NavBackStackEntryUpdate(previousBackStackEntry=" + this.previousBackStackEntry + ", currentBackStackEntry=" + this.currentBackStackEntry + ")";
    }
}
