package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzlo;
import com.squareup.protos.cash.supportal.app.SupportChatStatusResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SupportChatStatusResponse$Access$Denied extends zzlo {
    public final SupportChatStatusResponse.Denied value;

    public SupportChatStatusResponse$Access$Denied(SupportChatStatusResponse.Denied denied) {
        denied.getClass();
        this.value = denied;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SupportChatStatusResponse$Access$Denied) && Intrinsics.areEqual(this.value, ((SupportChatStatusResponse$Access$Denied) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Denied(value=" + this.value + ")";
    }
}
