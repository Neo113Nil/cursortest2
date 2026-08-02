package com.stripe.android.challenge.confirmation;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes8.dex */
public interface ConfirmationChallengeBridgeEvent {

    public final class Error implements ConfirmationChallengeBridgeEvent {
        public final BridgeException error;

        public Error(BridgeException bridgeException) {
            this.error = bridgeException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.error == ((Error) obj).error;
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.error + ")";
        }
    }

    public final class Ready implements ConfirmationChallengeBridgeEvent {
        public static final Ready INSTANCE = new Ready();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Ready);
        }

        public final int hashCode() {
            return -78401293;
        }

        public final String toString() {
            return "Ready";
        }
    }

    public final class Success implements ConfirmationChallengeBridgeEvent {
        public final String clientSecret;

        public Success(String str) {
            this.clientSecret = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.clientSecret.equals(((Success) obj).clientSecret);
        }

        public final int hashCode() {
            return this.clientSecret.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(clientSecret=", this.clientSecret, ")");
        }
    }
}
