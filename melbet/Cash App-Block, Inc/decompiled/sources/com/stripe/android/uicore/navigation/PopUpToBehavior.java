package com.stripe.android.uicore.navigation;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface PopUpToBehavior {

    /* loaded from: classes8.dex */
    public final class Current implements PopUpToBehavior {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Current);
        }

        @Override // com.stripe.android.uicore.navigation.PopUpToBehavior
        public final boolean getInclusive() {
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        public final String toString() {
            return "Current(inclusive=true)";
        }
    }

    /* loaded from: classes8.dex */
    public final class Route implements PopUpToBehavior {
        public final String route;

        public Route(String str) {
            str.getClass();
            this.route = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Route) && Intrinsics.areEqual(this.route, ((Route) obj).route);
        }

        @Override // com.stripe.android.uicore.navigation.PopUpToBehavior
        public final boolean getInclusive() {
            return true;
        }

        public final int hashCode() {
            return this.route.hashCode() + (Boolean.hashCode(true) * 31);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Route(inclusive=true, route=", this.route, ")");
        }
    }

    public final class Start implements PopUpToBehavior {
        public static final Start INSTANCE = new Start();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Start);
        }

        @Override // com.stripe.android.uicore.navigation.PopUpToBehavior
        public final boolean getInclusive() {
            return true;
        }

        public final int hashCode() {
            return 122269371;
        }

        public final String toString() {
            return "Start";
        }
    }

    boolean getInclusive();
}
