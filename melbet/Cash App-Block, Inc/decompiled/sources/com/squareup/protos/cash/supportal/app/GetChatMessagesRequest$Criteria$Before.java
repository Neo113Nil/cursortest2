package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzll;
import com.squareup.protos.cash.supportal.app.GetChatMessagesRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class GetChatMessagesRequest$Criteria$Before extends zzll {
    public final GetChatMessagesRequest.Before value;

    public GetChatMessagesRequest$Criteria$Before(GetChatMessagesRequest.Before before) {
        before.getClass();
        this.value = before;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetChatMessagesRequest$Criteria$Before) && Intrinsics.areEqual(this.value, ((GetChatMessagesRequest$Criteria$Before) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Before(value=" + this.value + ")";
    }
}
