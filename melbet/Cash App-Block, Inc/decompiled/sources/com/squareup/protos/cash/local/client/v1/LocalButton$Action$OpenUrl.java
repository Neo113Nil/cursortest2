package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzir;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalButton$Action$OpenUrl extends zzir {
    public final String value;

    public LocalButton$Action$OpenUrl(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalButton$Action$OpenUrl) && Intrinsics.areEqual(this.value, ((LocalButton$Action$OpenUrl) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenUrl(value=", this.value, ")");
    }
}
