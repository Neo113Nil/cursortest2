package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzlk;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ChatMessage$Sender$Bot extends zzlk {
    public final ChatMessage.Bot value;

    public ChatMessage$Sender$Bot(ChatMessage.Bot bot) {
        bot.getClass();
        this.value = bot;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatMessage$Sender$Bot) && Intrinsics.areEqual(this.value, ((ChatMessage$Sender$Bot) obj).value);
    }

    public final ChatMessage.Bot getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Bot(value=" + this.value + ")";
    }
}
