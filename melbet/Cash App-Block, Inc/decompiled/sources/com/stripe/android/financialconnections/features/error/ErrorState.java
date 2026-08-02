package com.stripe.android.financialconnections.features.error;

import com.stripe.android.financialconnections.presentation.Async;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ErrorState {
    public final Async payload;

    public final class Payload {
        public final boolean allowManualEntry;
        public final boolean disableLinkMoreAccounts;
        public final Throwable error;

        public Payload(Throwable th, boolean z, boolean z2) {
            this.error = th;
            this.disableLinkMoreAccounts = z;
            this.allowManualEntry = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return this.error.equals(payload.error) && this.disableLinkMoreAccounts == payload.disableLinkMoreAccounts && this.allowManualEntry == payload.allowManualEntry;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.allowManualEntry) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.error.hashCode() * 31, 31, this.disableLinkMoreAccounts);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(error=");
            sb.append(this.error);
            sb.append(", disableLinkMoreAccounts=");
            sb.append(this.disableLinkMoreAccounts);
            sb.append(", allowManualEntry=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.allowManualEntry, ")");
        }
    }

    public ErrorState(Async async) {
        async.getClass();
        this.payload = async;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ErrorState) && Intrinsics.areEqual(this.payload, ((ErrorState) obj).payload);
    }

    public final int hashCode() {
        return this.payload.hashCode();
    }

    public final String toString() {
        return "ErrorState(payload=" + this.payload + ")";
    }
}
