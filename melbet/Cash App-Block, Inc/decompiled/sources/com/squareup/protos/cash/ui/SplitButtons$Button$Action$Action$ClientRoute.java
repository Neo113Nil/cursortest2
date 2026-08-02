package com.squareup.protos.cash.ui;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SplitButtons$Button$Action$Action$ClientRoute {
    public final String value;

    public SplitButtons$Button$Action$Action$ClientRoute(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SplitButtons$Button$Action$Action$ClientRoute) && Intrinsics.areEqual(this.value, ((SplitButtons$Button$Action$Action$ClientRoute) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRoute(value=", this.value, ")");
    }
}
