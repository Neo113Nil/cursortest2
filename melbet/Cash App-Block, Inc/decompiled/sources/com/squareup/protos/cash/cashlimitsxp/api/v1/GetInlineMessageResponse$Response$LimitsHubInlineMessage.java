package com.squareup.protos.cash.cashlimitsxp.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class GetInlineMessageResponse$Response$LimitsHubInlineMessage extends TransactorKt {
    public final GetInlineMessageResponse.LimitsHubInlineMessage value;

    public GetInlineMessageResponse$Response$LimitsHubInlineMessage(GetInlineMessageResponse.LimitsHubInlineMessage limitsHubInlineMessage) {
        limitsHubInlineMessage.getClass();
        this.value = limitsHubInlineMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetInlineMessageResponse$Response$LimitsHubInlineMessage) && Intrinsics.areEqual(this.value, ((GetInlineMessageResponse$Response$LimitsHubInlineMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LimitsHubInlineMessage(value=" + this.value + ")";
    }
}
