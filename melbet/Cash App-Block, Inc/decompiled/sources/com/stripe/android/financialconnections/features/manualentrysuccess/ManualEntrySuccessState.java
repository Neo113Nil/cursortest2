package com.stripe.android.financialconnections.features.manualentrysuccess;

import com.stripe.android.financialconnections.presentation.Async;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ManualEntrySuccessState {
    public final Async completeSession;
    public final Async payload;

    public ManualEntrySuccessState(Async async, Async async2) {
        async.getClass();
        async2.getClass();
        this.payload = async;
        this.completeSession = async2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.stripe.android.financialconnections.presentation.Async] */
    public static ManualEntrySuccessState copy$default(ManualEntrySuccessState manualEntrySuccessState, Async async, Async.Loading loading, int i) {
        if ((i & 1) != 0) {
            async = manualEntrySuccessState.payload;
        }
        Async.Loading loading2 = loading;
        if ((i & 2) != 0) {
            loading2 = manualEntrySuccessState.completeSession;
        }
        manualEntrySuccessState.getClass();
        async.getClass();
        loading2.getClass();
        return new ManualEntrySuccessState(async, loading2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManualEntrySuccessState)) {
            return false;
        }
        ManualEntrySuccessState manualEntrySuccessState = (ManualEntrySuccessState) obj;
        return Intrinsics.areEqual(this.payload, manualEntrySuccessState.payload) && Intrinsics.areEqual(this.completeSession, manualEntrySuccessState.completeSession);
    }

    public final int hashCode() {
        return this.completeSession.hashCode() + (this.payload.hashCode() * 31);
    }

    public final String toString() {
        return "ManualEntrySuccessState(payload=" + this.payload + ", completeSession=" + this.completeSession + ")";
    }
}
