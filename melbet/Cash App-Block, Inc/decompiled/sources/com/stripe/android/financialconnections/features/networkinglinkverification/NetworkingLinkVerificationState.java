package com.stripe.android.financialconnections.features.networkinglinkverification;

import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.uicore.elements.OTPElement;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class NetworkingLinkVerificationState {
    public final Async confirmVerification;
    public final Async payload;

    public final class Payload {
        public final String consumerSessionClientSecret;
        public final String email;
        public final FinancialConnectionsInstitution initialInstitution;
        public final OTPElement otpElement;
        public final String phoneNumber;

        public Payload(String str, String str2, OTPElement oTPElement, String str3, FinancialConnectionsInstitution financialConnectionsInstitution) {
            str.getClass();
            str3.getClass();
            this.email = str;
            this.phoneNumber = str2;
            this.otpElement = oTPElement;
            this.consumerSessionClientSecret = str3;
            this.initialInstitution = financialConnectionsInstitution;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return Intrinsics.areEqual(this.email, payload.email) && this.phoneNumber.equals(payload.phoneNumber) && this.otpElement.equals(payload.otpElement) && Intrinsics.areEqual(this.consumerSessionClientSecret, payload.consumerSessionClientSecret) && Intrinsics.areEqual(this.initialInstitution, payload.initialInstitution);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.otpElement.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.email.hashCode() * 31, 31, this.phoneNumber)) * 31, 31, this.consumerSessionClientSecret);
            FinancialConnectionsInstitution financialConnectionsInstitution = this.initialInstitution;
            return m + (financialConnectionsInstitution == null ? 0 : financialConnectionsInstitution.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Payload(email=", this.email, ", phoneNumber=", this.phoneNumber, ", otpElement=");
            m.append(this.otpElement);
            m.append(", consumerSessionClientSecret=");
            m.append(this.consumerSessionClientSecret);
            m.append(", initialInstitution=");
            m.append(this.initialInstitution);
            m.append(")");
            return m.toString();
        }
    }

    public NetworkingLinkVerificationState(Async async, Async async2) {
        async.getClass();
        async2.getClass();
        this.payload = async;
        this.confirmVerification = async2;
    }

    public static NetworkingLinkVerificationState copy$default(NetworkingLinkVerificationState networkingLinkVerificationState, Async async, Async async2, int i) {
        if ((i & 1) != 0) {
            async = networkingLinkVerificationState.payload;
        }
        if ((i & 2) != 0) {
            async2 = networkingLinkVerificationState.confirmVerification;
        }
        networkingLinkVerificationState.getClass();
        async.getClass();
        async2.getClass();
        return new NetworkingLinkVerificationState(async, async2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkingLinkVerificationState)) {
            return false;
        }
        NetworkingLinkVerificationState networkingLinkVerificationState = (NetworkingLinkVerificationState) obj;
        return Intrinsics.areEqual(this.payload, networkingLinkVerificationState.payload) && Intrinsics.areEqual(this.confirmVerification, networkingLinkVerificationState.confirmVerification);
    }

    public final int hashCode() {
        return this.confirmVerification.hashCode() + (this.payload.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkingLinkVerificationState(payload=" + this.payload + ", confirmVerification=" + this.confirmVerification + ")";
    }
}
