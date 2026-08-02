package com.squareup.cash.tax.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class TaxReturnsEvent {

    public final class GoBack extends TaxReturnsEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 297283077;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class RouteToDeepLink extends TaxReturnsEvent {
        public final String deeplink;

        public RouteToDeepLink(String str) {
            str.getClass();
            this.deeplink = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RouteToDeepLink) && Intrinsics.areEqual(this.deeplink, ((RouteToDeepLink) obj).deeplink);
        }

        public final int hashCode() {
            return this.deeplink.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RouteToDeepLink(deeplink=", this.deeplink, ")");
        }
    }
}
