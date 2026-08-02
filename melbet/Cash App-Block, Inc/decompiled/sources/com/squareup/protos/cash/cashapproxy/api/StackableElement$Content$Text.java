package com.squareup.protos.cash.cashapproxy.api;

import app.cash.local.primitives.MarketingMessageDataKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class StackableElement$Content$Text extends MarketingMessageDataKt {
    public final Text value;

    public StackableElement$Content$Text(Text text) {
        text.getClass();
        this.value = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StackableElement$Content$Text) && Intrinsics.areEqual(this.value, ((StackableElement$Content$Text) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Text(value=" + this.value + ")";
    }
}
