package com.squareup.protos.franklin.lending;

import com.google.android.gms.internal.mlkit_vision_face.zzeb;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CreditLine$CreditLineStatusData$Routing$ClientRoute extends zzeb {
    public final String value;

    public CreditLine$CreditLineStatusData$Routing$ClientRoute(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreditLine$CreditLineStatusData$Routing$ClientRoute) && Intrinsics.areEqual(this.value, ((CreditLine$CreditLineStatusData$Routing$ClientRoute) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRoute(value=", this.value, ")");
    }
}
