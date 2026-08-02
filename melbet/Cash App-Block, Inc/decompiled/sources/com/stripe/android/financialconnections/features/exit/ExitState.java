package com.stripe.android.financialconnections.features.exit;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.TextResource;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes8.dex */
public final class ExitState {
    public final boolean closing;
    public final Async payload;
    public final FinancialConnectionsSessionManifest.Pane referrer;

    public final class Payload {
        public final TextResource.StringId description;

        public Payload(TextResource.StringId stringId) {
            this.description = stringId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Payload) && this.description.equals(((Payload) obj).description);
        }

        public final int hashCode() {
            return this.description.hashCode();
        }

        public final String toString() {
            return "Payload(description=" + this.description + ")";
        }
    }

    public ExitState(FinancialConnectionsSessionManifest.Pane pane, Async async, boolean z) {
        this.referrer = pane;
        this.payload = async;
        this.closing = z;
    }

    public static ExitState copy$default(ExitState exitState, Async async, int i) {
        FinancialConnectionsSessionManifest.Pane pane = exitState.referrer;
        if ((i & 2) != 0) {
            async = exitState.payload;
        }
        boolean z = (i & 4) != 0 ? exitState.closing : true;
        exitState.getClass();
        async.getClass();
        return new ExitState(pane, async, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExitState)) {
            return false;
        }
        ExitState exitState = (ExitState) obj;
        return this.referrer == exitState.referrer && this.payload.equals(exitState.payload) && this.closing == exitState.closing;
    }

    public final int hashCode() {
        FinancialConnectionsSessionManifest.Pane pane = this.referrer;
        int hashCode = pane == null ? 0 : pane.hashCode();
        return Boolean.hashCode(this.closing) + ((this.payload.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExitState(referrer=");
        sb.append(this.referrer);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", closing=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.closing, ")");
    }
}
