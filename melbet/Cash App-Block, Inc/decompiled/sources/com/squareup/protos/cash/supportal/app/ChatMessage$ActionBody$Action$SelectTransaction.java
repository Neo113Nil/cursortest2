package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzli;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ChatMessage$ActionBody$Action$SelectTransaction extends zzli {
    public final ChatMessage.SelectTransaction value;

    public ChatMessage$ActionBody$Action$SelectTransaction(ChatMessage.SelectTransaction selectTransaction) {
        selectTransaction.getClass();
        this.value = selectTransaction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatMessage$ActionBody$Action$SelectTransaction) && Intrinsics.areEqual(this.value, ((ChatMessage$ActionBody$Action$SelectTransaction) obj).value);
    }

    public final ChatMessage.SelectTransaction getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SelectTransaction(value=" + this.value + ")";
    }
}
