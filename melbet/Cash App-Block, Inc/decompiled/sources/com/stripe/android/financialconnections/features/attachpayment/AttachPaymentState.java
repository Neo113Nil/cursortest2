package com.stripe.android.financialconnections.features.attachpayment;

import com.stripe.android.financialconnections.presentation.Async;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class AttachPaymentState {
    public final Async linkPaymentAccount;

    public AttachPaymentState(Async async) {
        async.getClass();
        this.linkPaymentAccount = async;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AttachPaymentState) && Intrinsics.areEqual(this.linkPaymentAccount, ((AttachPaymentState) obj).linkPaymentAccount);
    }

    public final int hashCode() {
        return this.linkPaymentAccount.hashCode();
    }

    public final String toString() {
        return "AttachPaymentState(linkPaymentAccount=" + this.linkPaymentAccount + ")";
    }
}
