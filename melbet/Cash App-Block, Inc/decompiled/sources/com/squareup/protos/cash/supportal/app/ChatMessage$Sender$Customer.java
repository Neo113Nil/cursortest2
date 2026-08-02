package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzlk;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ChatMessage$Sender$Customer extends zzlk {
    public final ChatMessage.Customer value;

    public ChatMessage$Sender$Customer(ChatMessage.Customer customer) {
        customer.getClass();
        this.value = customer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatMessage$Sender$Customer) && Intrinsics.areEqual(this.value, ((ChatMessage$Sender$Customer) obj).value);
    }

    public final ChatMessage.Customer getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Customer(value=" + this.value + ")";
    }
}
