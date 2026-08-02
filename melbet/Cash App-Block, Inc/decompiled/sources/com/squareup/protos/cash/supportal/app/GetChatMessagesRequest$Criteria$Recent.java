package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzll;
import com.squareup.protos.cash.supportal.app.GetChatMessagesRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class GetChatMessagesRequest$Criteria$Recent extends zzll {
    public final GetChatMessagesRequest.RecentHistory value;

    public GetChatMessagesRequest$Criteria$Recent(GetChatMessagesRequest.RecentHistory recentHistory) {
        recentHistory.getClass();
        this.value = recentHistory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetChatMessagesRequest$Criteria$Recent) && Intrinsics.areEqual(this.value, ((GetChatMessagesRequest$Criteria$Recent) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Recent(value=" + this.value + ")";
    }
}
