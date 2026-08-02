package com.squareup.protos.cash.cashapproxy.api;

import app.cash.local.primitives.LocationMenuKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class OrderHubRow$Content$SectionHeaderString extends LocationMenuKt {
    public final String value;

    public OrderHubRow$Content$SectionHeaderString(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderHubRow$Content$SectionHeaderString) && Intrinsics.areEqual(this.value, ((OrderHubRow$Content$SectionHeaderString) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SectionHeaderString(value=", this.value, ")");
    }
}
