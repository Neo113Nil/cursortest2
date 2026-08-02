package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import com.squareup.protos.cash.supportal.app.OpenChatResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class OpenChatResponse$Result$Denied extends zzlm {
    public final OpenChatResponse.Denied value;

    public OpenChatResponse$Result$Denied(OpenChatResponse.Denied denied) {
        denied.getClass();
        this.value = denied;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenChatResponse$Result$Denied) && Intrinsics.areEqual(this.value, ((OpenChatResponse$Result$Denied) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Denied(value=" + this.value + ")";
    }
}
