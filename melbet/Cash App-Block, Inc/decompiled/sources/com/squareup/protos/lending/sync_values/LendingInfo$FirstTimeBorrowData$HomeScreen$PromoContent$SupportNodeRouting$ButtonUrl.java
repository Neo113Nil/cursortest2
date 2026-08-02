package com.squareup.protos.lending.sync_values;

import com.google.android.gms.internal.mlkit_vision_face.zzjm;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$SupportNodeRouting$ButtonUrl extends zzjm {
    public final String value;

    public LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$SupportNodeRouting$ButtonUrl(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$SupportNodeRouting$ButtonUrl) && Intrinsics.areEqual(this.value, ((LendingInfo$FirstTimeBorrowData$HomeScreen$PromoContent$SupportNodeRouting$ButtonUrl) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ButtonUrl(value=", this.value, ")");
    }
}
