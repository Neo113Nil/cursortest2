package com.squareup.cash.work.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface PayHomeViewEvent {

    public final class BackPressed implements PayHomeViewEvent {
        public static final BackPressed INSTANCE = new BackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackPressed);
        }

        public final int hashCode() {
            return -122517969;
        }

        public final String toString() {
            return "BackPressed";
        }
    }

    public final class DirectDepositClicked implements PayHomeViewEvent {
        public static final DirectDepositClicked INSTANCE = new DirectDepositClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DirectDepositClicked);
        }

        public final int hashCode() {
            return -1560974978;
        }

        public final String toString() {
            return "DirectDepositClicked";
        }
    }

    public final class LinkedAccountsClicked implements PayHomeViewEvent {
        public static final LinkedAccountsClicked INSTANCE = new LinkedAccountsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LinkedAccountsClicked);
        }

        public final int hashCode() {
            return 360907260;
        }

        public final String toString() {
            return "LinkedAccountsClicked";
        }
    }

    /* loaded from: classes8.dex */
    public final class PastPayStubClicked implements PayHomeViewEvent {
        public final String stubId;

        public PastPayStubClicked(String str) {
            str.getClass();
            this.stubId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PastPayStubClicked) && Intrinsics.areEqual(this.stubId, ((PastPayStubClicked) obj).stubId);
        }

        public final int hashCode() {
            return this.stubId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PastPayStubClicked(stubId=", this.stubId, ")");
        }
    }

    public final class RetryClicked implements PayHomeViewEvent {
        public static final RetryClicked INSTANCE = new RetryClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryClicked);
        }

        public final int hashCode() {
            return 724831723;
        }

        public final String toString() {
            return "RetryClicked";
        }
    }

    public final class SeeMoreClicked implements PayHomeViewEvent {
        public static final SeeMoreClicked INSTANCE = new SeeMoreClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SeeMoreClicked);
        }

        public final int hashCode() {
            return 594222923;
        }

        public final String toString() {
            return "SeeMoreClicked";
        }
    }

    /* loaded from: classes8.dex */
    public final class TaxFormsClicked implements PayHomeViewEvent {
        public static final TaxFormsClicked INSTANCE = new TaxFormsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TaxFormsClicked);
        }

        public final int hashCode() {
            return 1126626103;
        }

        public final String toString() {
            return "TaxFormsClicked";
        }
    }
}
