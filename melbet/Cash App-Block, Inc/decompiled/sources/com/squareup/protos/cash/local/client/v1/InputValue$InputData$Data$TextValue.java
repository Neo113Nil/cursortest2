package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzil;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InputValue$InputData$Data$TextValue extends zzil {
    public final String value;

    public InputValue$InputData$Data$TextValue(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputValue$InputData$Data$TextValue) && Intrinsics.areEqual(this.value, ((InputValue$InputData$Data$TextValue) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TextValue(value=", this.value, ")");
    }
}
