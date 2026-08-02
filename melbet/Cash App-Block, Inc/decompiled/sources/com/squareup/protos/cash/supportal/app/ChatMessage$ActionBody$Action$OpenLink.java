package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzli;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ChatMessage$ActionBody$Action$OpenLink extends zzli {
    public final ChatMessage.OpenLink value;

    public ChatMessage$ActionBody$Action$OpenLink(ChatMessage.OpenLink openLink) {
        openLink.getClass();
        this.value = openLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatMessage$ActionBody$Action$OpenLink) && Intrinsics.areEqual(this.value, ((ChatMessage$ActionBody$Action$OpenLink) obj).value);
    }

    public final ChatMessage.OpenLink getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OpenLink(value=" + this.value + ")";
    }
}
