package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzll;
import com.squareup.protos.cash.supportal.app.GetChatMessagesRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class GetChatMessagesRequest$Criteria$After extends zzll {
    public final GetChatMessagesRequest.After value;

    public GetChatMessagesRequest$Criteria$After(GetChatMessagesRequest.After after) {
        after.getClass();
        this.value = after;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetChatMessagesRequest$Criteria$After) && Intrinsics.areEqual(this.value, ((GetChatMessagesRequest$Criteria$After) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "After(value=" + this.value + ")";
    }
}
