package com.squareup.protos.cash.cashapproxy.api;

import app.cash.local.primitives.LocalMoneyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class OrderDetailRow$Row$Spacer extends LocalMoneyKt {
    public final Spacer value;

    public OrderDetailRow$Row$Spacer(Spacer spacer) {
        spacer.getClass();
        this.value = spacer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderDetailRow$Row$Spacer) && Intrinsics.areEqual(this.value, ((OrderDetailRow$Row$Spacer) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Spacer(value=" + this.value + ")";
    }
}
