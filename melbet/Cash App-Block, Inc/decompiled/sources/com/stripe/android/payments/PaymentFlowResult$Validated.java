package com.stripe.android.payments;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.model.Source;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PaymentFlowResult$Validated {
    public final boolean canCancelSource;
    public final String clientSecret;
    public final int flowOutcome;
    public final Source source;
    public final String sourceId;
    public final String stripeAccountId;

    public PaymentFlowResult$Validated(String str, int i, boolean z, String str2, Source source, String str3) {
        str.getClass();
        this.clientSecret = str;
        this.flowOutcome = i;
        this.canCancelSource = z;
        this.sourceId = str2;
        this.source = source;
        this.stripeAccountId = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentFlowResult$Validated)) {
            return false;
        }
        PaymentFlowResult$Validated paymentFlowResult$Validated = (PaymentFlowResult$Validated) obj;
        return Intrinsics.areEqual(this.clientSecret, paymentFlowResult$Validated.clientSecret) && this.flowOutcome == paymentFlowResult$Validated.flowOutcome && this.canCancelSource == paymentFlowResult$Validated.canCancelSource && Intrinsics.areEqual(this.sourceId, paymentFlowResult$Validated.sourceId) && Intrinsics.areEqual(this.source, paymentFlowResult$Validated.source) && Intrinsics.areEqual(this.stripeAccountId, paymentFlowResult$Validated.stripeAccountId);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flowOutcome, this.clientSecret.hashCode() * 31, 31), 31, this.canCancelSource);
        String str = this.sourceId;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Source source = this.source;
        int hashCode2 = (hashCode + (source == null ? 0 : source.hashCode())) * 31;
        String str2 = this.stripeAccountId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("Validated(clientSecret=", this.flowOutcome, this.clientSecret, ", flowOutcome=", ", canCancelSource=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.canCancelSource, ", sourceId=", this.sourceId, ", source=");
        m.append(this.source);
        m.append(", stripeAccountId=");
        m.append(this.stripeAccountId);
        m.append(")");
        return m.toString();
    }
}
