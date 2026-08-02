package com.stripe.android.financialconnections.features.streamlinedconsent;

import com.stripe.android.financialconnections.model.IDConsentContentPane;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class IDConsentContentState {
    public final Async acceptConsent;
    public final Async payload;
    public final IDConsentContentState$ViewEffect$OpenUrl viewEffect;

    public final class Payload {
        public final IDConsentContentPane idConsentContentPane;

        public Payload(IDConsentContentPane iDConsentContentPane) {
            iDConsentContentPane.getClass();
            this.idConsentContentPane = iDConsentContentPane;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Payload) && Intrinsics.areEqual(this.idConsentContentPane, ((Payload) obj).idConsentContentPane);
        }

        public final int hashCode() {
            return this.idConsentContentPane.hashCode();
        }

        public final String toString() {
            return "Payload(idConsentContentPane=" + this.idConsentContentPane + ")";
        }
    }

    public IDConsentContentState(Async async, Async async2, IDConsentContentState$ViewEffect$OpenUrl iDConsentContentState$ViewEffect$OpenUrl) {
        async.getClass();
        async2.getClass();
        this.payload = async;
        this.acceptConsent = async2;
        this.viewEffect = iDConsentContentState$ViewEffect$OpenUrl;
    }

    public static IDConsentContentState copy$default(IDConsentContentState iDConsentContentState, Async async, Async async2, IDConsentContentState$ViewEffect$OpenUrl iDConsentContentState$ViewEffect$OpenUrl, int i) {
        if ((i & 1) != 0) {
            async = iDConsentContentState.payload;
        }
        if ((i & 2) != 0) {
            async2 = iDConsentContentState.acceptConsent;
        }
        if ((i & 4) != 0) {
            iDConsentContentState$ViewEffect$OpenUrl = iDConsentContentState.viewEffect;
        }
        iDConsentContentState.getClass();
        async.getClass();
        async2.getClass();
        return new IDConsentContentState(async, async2, iDConsentContentState$ViewEffect$OpenUrl);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IDConsentContentState)) {
            return false;
        }
        IDConsentContentState iDConsentContentState = (IDConsentContentState) obj;
        return Intrinsics.areEqual(this.payload, iDConsentContentState.payload) && Intrinsics.areEqual(this.acceptConsent, iDConsentContentState.acceptConsent) && Intrinsics.areEqual(this.viewEffect, iDConsentContentState.viewEffect);
    }

    public final int hashCode() {
        int hashCode = (this.acceptConsent.hashCode() + (this.payload.hashCode() * 31)) * 31;
        IDConsentContentState$ViewEffect$OpenUrl iDConsentContentState$ViewEffect$OpenUrl = this.viewEffect;
        return hashCode + (iDConsentContentState$ViewEffect$OpenUrl == null ? 0 : iDConsentContentState$ViewEffect$OpenUrl.hashCode());
    }

    public final String toString() {
        return "IDConsentContentState(payload=" + this.payload + ", acceptConsent=" + this.acceptConsent + ", viewEffect=" + this.viewEffect + ")";
    }
}
