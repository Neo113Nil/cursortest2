package com.stripe.android.financialconnections.features.networkingsavetolinkverification;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.uicore.elements.OTPElement;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class NetworkingSaveToLinkVerificationState {
    public final Async confirmVerification;
    public final Async payload;

    public final class Payload {
        public final String consumerSessionClientSecret;
        public final String email;
        public final OTPElement otpElement;
        public final String phoneNumber;
        public final boolean showNotNowButton;

        public Payload(boolean z, String str, String str2, OTPElement oTPElement, String str3) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.showNotNowButton = z;
            this.email = str;
            this.phoneNumber = str2;
            this.otpElement = oTPElement;
            this.consumerSessionClientSecret = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return this.showNotNowButton == payload.showNotNowButton && Intrinsics.areEqual(this.email, payload.email) && Intrinsics.areEqual(this.phoneNumber, payload.phoneNumber) && this.otpElement.equals(payload.otpElement) && Intrinsics.areEqual(this.consumerSessionClientSecret, payload.consumerSessionClientSecret);
        }

        public final int hashCode() {
            return this.consumerSessionClientSecret.hashCode() + ((this.otpElement.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.showNotNowButton) * 31, 31, this.email), 31, this.phoneNumber)) * 31);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Payload(showNotNowButton=", ", email=", this.email, ", phoneNumber=", this.showNotNowButton);
            m.append(this.phoneNumber);
            m.append(", otpElement=");
            m.append(this.otpElement);
            m.append(", consumerSessionClientSecret=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.consumerSessionClientSecret, ")");
        }
    }

    public NetworkingSaveToLinkVerificationState(Async async, Async async2) {
        async.getClass();
        async2.getClass();
        this.payload = async;
        this.confirmVerification = async2;
    }

    public static NetworkingSaveToLinkVerificationState copy$default(NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState, Async async, Async async2, int i) {
        if ((i & 1) != 0) {
            async = networkingSaveToLinkVerificationState.payload;
        }
        if ((i & 2) != 0) {
            async2 = networkingSaveToLinkVerificationState.confirmVerification;
        }
        networkingSaveToLinkVerificationState.getClass();
        async.getClass();
        async2.getClass();
        return new NetworkingSaveToLinkVerificationState(async, async2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkingSaveToLinkVerificationState)) {
            return false;
        }
        NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState = (NetworkingSaveToLinkVerificationState) obj;
        return Intrinsics.areEqual(this.payload, networkingSaveToLinkVerificationState.payload) && Intrinsics.areEqual(this.confirmVerification, networkingSaveToLinkVerificationState.confirmVerification);
    }

    public final int hashCode() {
        return this.confirmVerification.hashCode() + (this.payload.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkingSaveToLinkVerificationState(payload=" + this.payload + ", confirmVerification=" + this.confirmVerification + ")";
    }
}
