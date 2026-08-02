package com.squareup.cash.taptopay.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface TapToPayPaymentRequestViewModel {

    public final class Accepted implements TapToPayPaymentRequestViewModel {
        public final String amount;

        public Accepted(String str) {
            str.getClass();
            this.amount = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Accepted) && Intrinsics.areEqual(this.amount, ((Accepted) obj).amount);
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Accepted(amount=", this.amount, ")");
        }
    }

    public final class DemoMode implements TapToPayPaymentRequestViewModel {
        public static final DemoMode INSTANCE = new DemoMode();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DemoMode);
        }

        public final int hashCode() {
            return 1313102160;
        }

        public final String toString() {
            return "DemoMode";
        }
    }

    public final class Requesting implements TapToPayPaymentRequestViewModel {
        public static final Requesting INSTANCE = new Requesting();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Requesting);
        }

        public final int hashCode() {
            return 817208221;
        }

        public final String toString() {
            return "Requesting";
        }
    }
}
