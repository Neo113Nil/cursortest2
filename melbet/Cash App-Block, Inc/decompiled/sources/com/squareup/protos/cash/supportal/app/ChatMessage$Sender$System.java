package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzlk;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ChatMessage$Sender$System extends zzlk {
    public final ChatMessage.ChatSystem value;

    public ChatMessage$Sender$System(ChatMessage.ChatSystem chatSystem) {
        chatSystem.getClass();
        this.value = chatSystem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatMessage$Sender$System) && Intrinsics.areEqual(this.value, ((ChatMessage$Sender$System) obj).value);
    }

    public final ChatMessage.ChatSystem getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "System(value=" + this.value + ")";
    }
}
