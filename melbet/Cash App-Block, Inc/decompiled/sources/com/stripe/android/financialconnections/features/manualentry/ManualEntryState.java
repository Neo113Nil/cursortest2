package com.stripe.android.financialconnections.features.manualentry;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.financialconnections.presentation.Async;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ManualEntryState {
    public final Async linkPaymentAccount;
    public final Async payload;

    public final class Payload {
        public final boolean customManualEntry;
        public final boolean testMode;
        public final boolean verifyWithMicrodeposits;

        public Payload(boolean z, boolean z2, boolean z3) {
            this.verifyWithMicrodeposits = z;
            this.customManualEntry = z2;
            this.testMode = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return this.verifyWithMicrodeposits == payload.verifyWithMicrodeposits && this.customManualEntry == payload.customManualEntry && this.testMode == payload.testMode;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.testMode) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.verifyWithMicrodeposits) * 31, 31, this.customManualEntry);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("Payload(verifyWithMicrodeposits=", ", customManualEntry=", ", testMode=", this.verifyWithMicrodeposits, this.customManualEntry), this.testMode, ")");
        }
    }

    public ManualEntryState(Async async, Async async2) {
        async.getClass();
        async2.getClass();
        this.payload = async;
        this.linkPaymentAccount = async2;
    }

    public static ManualEntryState copy$default(ManualEntryState manualEntryState, Async async, Async async2, int i) {
        if ((i & 1) != 0) {
            async = manualEntryState.payload;
        }
        if ((i & 2) != 0) {
            async2 = manualEntryState.linkPaymentAccount;
        }
        manualEntryState.getClass();
        async.getClass();
        async2.getClass();
        return new ManualEntryState(async, async2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManualEntryState)) {
            return false;
        }
        ManualEntryState manualEntryState = (ManualEntryState) obj;
        return Intrinsics.areEqual(this.payload, manualEntryState.payload) && Intrinsics.areEqual(this.linkPaymentAccount, manualEntryState.linkPaymentAccount);
    }

    public final int hashCode() {
        return this.linkPaymentAccount.hashCode() + (this.payload.hashCode() * 31);
    }

    public final String toString() {
        return "ManualEntryState(payload=" + this.payload + ", linkPaymentAccount=" + this.linkPaymentAccount + ")";
    }
}
