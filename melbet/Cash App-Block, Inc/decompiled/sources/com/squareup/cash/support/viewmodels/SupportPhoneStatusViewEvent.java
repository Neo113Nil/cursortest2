package com.squareup.cash.support.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes7.dex */
public interface SupportPhoneStatusViewEvent {

    public final class Cancel implements SupportPhoneStatusViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -1785205870;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Close implements SupportPhoneStatusViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -472900128;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class RequestCall implements SupportPhoneStatusViewEvent {
        public static final RequestCall INSTANCE = new RequestCall();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RequestCall);
        }

        public final int hashCode() {
            return -194399371;
        }

        public final String toString() {
            return "RequestCall";
        }
    }
}
