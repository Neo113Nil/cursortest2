package com.stripe.android.uicore.navigation;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class NavigationIntent {

    public final class NavigateBack extends NavigationIntent {
        public static final NavigateBack INSTANCE = new NavigateBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateBack);
        }

        public final int hashCode() {
            return -1884351420;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    public final class NavigateTo extends NavigationIntent {
        public final PopUpToBehavior popUpTo;
        public final String route;

        public NavigateTo(String str, PopUpToBehavior popUpToBehavior) {
            str.getClass();
            this.route = str;
            this.popUpTo = popUpToBehavior;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateTo)) {
                return false;
            }
            NavigateTo navigateTo = (NavigateTo) obj;
            return Intrinsics.areEqual(this.route, navigateTo.route) && Intrinsics.areEqual(this.popUpTo, navigateTo.popUpTo);
        }

        public final int hashCode() {
            int hashCode = this.route.hashCode() * 31;
            PopUpToBehavior popUpToBehavior = this.popUpTo;
            return Boolean.hashCode(true) + ((hashCode + (popUpToBehavior == null ? 0 : popUpToBehavior.hashCode())) * 31);
        }

        public final String toString() {
            return "NavigateTo(route=" + this.route + ", popUpTo=" + this.popUpTo + ", isSingleTop=true)";
        }
    }
}
