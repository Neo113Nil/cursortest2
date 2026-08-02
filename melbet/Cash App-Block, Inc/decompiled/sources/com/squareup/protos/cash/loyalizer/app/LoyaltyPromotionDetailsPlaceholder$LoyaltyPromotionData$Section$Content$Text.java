package com.squareup.protos.cash.loyalizer.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjj;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text extends zzjj {
    public final String value;

    public LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text) && Intrinsics.areEqual(this.value, ((LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(value=", this.value, ")");
    }
}
