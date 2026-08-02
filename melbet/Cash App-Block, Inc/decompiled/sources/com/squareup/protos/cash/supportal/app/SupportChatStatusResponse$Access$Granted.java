package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzlo;
import com.squareup.protos.cash.supportal.app.SupportChatStatusResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SupportChatStatusResponse$Access$Granted extends zzlo {
    public final SupportChatStatusResponse.Granted value;

    public SupportChatStatusResponse$Access$Granted(SupportChatStatusResponse.Granted granted) {
        granted.getClass();
        this.value = granted;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SupportChatStatusResponse$Access$Granted) && Intrinsics.areEqual(this.value, ((SupportChatStatusResponse$Access$Granted) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Granted(value=" + this.value + ")";
    }
}
