package com.squareup.cash.work.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public interface PayHistoryListViewEvent {

    public final class BackPressed implements PayHistoryListViewEvent {
        public static final BackPressed INSTANCE = new BackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackPressed);
        }

        public final int hashCode() {
            return -1725387836;
        }

        public final String toString() {
            return "BackPressed";
        }
    }

    public final class LoadMore implements PayHistoryListViewEvent {
        public static final LoadMore INSTANCE = new LoadMore();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoadMore);
        }

        public final int hashCode() {
            return 1699207026;
        }

        public final String toString() {
            return "LoadMore";
        }
    }

    public final class RetryClicked implements PayHistoryListViewEvent {
        public static final RetryClicked INSTANCE = new RetryClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryClicked);
        }

        public final int hashCode() {
            return -1719493898;
        }

        public final String toString() {
            return "RetryClicked";
        }
    }

    /* loaded from: classes8.dex */
    public final class StubClicked implements PayHistoryListViewEvent {
        public final String stubId;

        public StubClicked(String str) {
            this.stubId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StubClicked) && this.stubId.equals(((StubClicked) obj).stubId);
        }

        public final int hashCode() {
            return this.stubId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StubClicked(stubId=", this.stubId, ")");
        }
    }
}
