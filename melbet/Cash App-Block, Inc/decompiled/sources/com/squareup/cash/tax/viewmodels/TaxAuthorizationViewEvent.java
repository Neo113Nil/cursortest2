package com.squareup.cash.tax.viewmodels;

/* loaded from: classes7.dex */
public abstract class TaxAuthorizationViewEvent {

    public final class HandleError extends TaxAuthorizationViewEvent {
        public static final HandleError INSTANCE = new HandleError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HandleError);
        }

        public final int hashCode() {
            return -682042097;
        }

        public final String toString() {
            return "HandleError";
        }
    }

    public final class StartTaxAuthorizationFlow extends TaxAuthorizationViewEvent {
        public static final StartTaxAuthorizationFlow INSTANCE = new StartTaxAuthorizationFlow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StartTaxAuthorizationFlow);
        }

        public final int hashCode() {
            return 997157485;
        }

        public final String toString() {
            return "StartTaxAuthorizationFlow";
        }
    }
}
