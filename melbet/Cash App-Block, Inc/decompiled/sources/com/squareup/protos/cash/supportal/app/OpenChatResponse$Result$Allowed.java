package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import com.squareup.protos.cash.supportal.app.OpenChatResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class OpenChatResponse$Result$Allowed extends zzlm {
    public final OpenChatResponse.Allowed value;

    public OpenChatResponse$Result$Allowed(OpenChatResponse.Allowed allowed) {
        allowed.getClass();
        this.value = allowed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenChatResponse$Result$Allowed) && Intrinsics.areEqual(this.value, ((OpenChatResponse$Result$Allowed) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Allowed(value=" + this.value + ")";
    }
}
