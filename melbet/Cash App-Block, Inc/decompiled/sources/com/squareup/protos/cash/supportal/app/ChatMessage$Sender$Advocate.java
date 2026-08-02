package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzlk;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ChatMessage$Sender$Advocate extends zzlk {
    public final ChatMessage.Advocate value;

    public ChatMessage$Sender$Advocate(ChatMessage.Advocate advocate) {
        advocate.getClass();
        this.value = advocate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatMessage$Sender$Advocate) && Intrinsics.areEqual(this.value, ((ChatMessage$Sender$Advocate) obj).value);
    }

    public final ChatMessage.Advocate getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Advocate(value=" + this.value + ")";
    }
}
