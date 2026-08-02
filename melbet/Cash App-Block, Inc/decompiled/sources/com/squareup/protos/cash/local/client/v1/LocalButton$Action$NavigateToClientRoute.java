package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzir;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalButton$Action$NavigateToClientRoute extends zzir {
    public final String value;

    public LocalButton$Action$NavigateToClientRoute(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalButton$Action$NavigateToClientRoute) && Intrinsics.areEqual(this.value, ((LocalButton$Action$NavigateToClientRoute) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NavigateToClientRoute(value=", this.value, ")");
    }
}
