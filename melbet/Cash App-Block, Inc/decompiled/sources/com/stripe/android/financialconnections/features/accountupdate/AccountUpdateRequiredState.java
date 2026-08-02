package com.stripe.android.financialconnections.features.accountupdate;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class AccountUpdateRequiredState {
    public final Async payload;
    public final FinancialConnectionsSessionManifest.Pane referrer;

    public AccountUpdateRequiredState(FinancialConnectionsSessionManifest.Pane pane, Async async) {
        async.getClass();
        this.referrer = pane;
        this.payload = async;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountUpdateRequiredState)) {
            return false;
        }
        AccountUpdateRequiredState accountUpdateRequiredState = (AccountUpdateRequiredState) obj;
        return this.referrer == accountUpdateRequiredState.referrer && Intrinsics.areEqual(this.payload, accountUpdateRequiredState.payload);
    }

    public final int hashCode() {
        return this.payload.hashCode() + (this.referrer.hashCode() * 31);
    }

    public final String toString() {
        return "AccountUpdateRequiredState(referrer=" + this.referrer + ", payload=" + this.payload + ")";
    }
}
