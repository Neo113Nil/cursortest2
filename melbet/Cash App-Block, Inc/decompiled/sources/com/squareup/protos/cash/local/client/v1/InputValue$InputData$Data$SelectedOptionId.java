package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzil;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InputValue$InputData$Data$SelectedOptionId extends zzil {
    public final String value;

    public InputValue$InputData$Data$SelectedOptionId(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputValue$InputData$Data$SelectedOptionId) && Intrinsics.areEqual(this.value, ((InputValue$InputData$Data$SelectedOptionId) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectedOptionId(value=", this.value, ")");
    }
}
