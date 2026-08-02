package com.squareup.protos.cash.cashapproxy.api;

import app.cash.local.primitives.LocationMenuKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class OrderHubRow$Content$SectionHeader extends LocationMenuKt {
    public final Text value;

    public OrderHubRow$Content$SectionHeader(Text text) {
        text.getClass();
        this.value = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderHubRow$Content$SectionHeader) && Intrinsics.areEqual(this.value, ((OrderHubRow$Content$SectionHeader) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SectionHeader(value=" + this.value + ")";
    }
}
