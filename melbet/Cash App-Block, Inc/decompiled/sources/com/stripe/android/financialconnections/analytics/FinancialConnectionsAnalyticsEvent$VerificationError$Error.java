package com.stripe.android.financialconnections.analytics;

/* loaded from: classes8.dex */
public enum FinancialConnectionsAnalyticsEvent$VerificationError$Error {
    /* JADX INFO: Fake field, exist only in values array */
    ConsumerNotFoundError("ConsumerNotFoundError"),
    /* JADX INFO: Fake field, exist only in values array */
    LookupConsumerSession("LookupConsumerSession"),
    StartVerificationSessionError("StartVerificationSessionError"),
    ConfirmVerificationSessionError("ConfirmVerificationSessionError"),
    MarkLinkVerifiedError("MarkLinkVerifiedError");

    public final String value;

    FinancialConnectionsAnalyticsEvent$VerificationError$Error(String str) {
        this.value = str;
    }
}
