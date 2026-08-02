package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.internal.bridge.InternalSerializersKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProfileDirectoryRow$Action$Url extends InternalSerializersKt {
    public final String value;

    public ProfileDirectoryRow$Action$Url(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileDirectoryRow$Action$Url) && Intrinsics.areEqual(this.value, ((ProfileDirectoryRow$Action$Url) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Url(value=", this.value, ")");
    }
}
