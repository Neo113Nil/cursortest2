package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzld;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SearchSection$Content$UpsellCard extends zzld {
    public final UpsellCardSection value;

    public SearchSection$Content$UpsellCard(UpsellCardSection upsellCardSection) {
        upsellCardSection.getClass();
        this.value = upsellCardSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchSection$Content$UpsellCard) && Intrinsics.areEqual(this.value, ((SearchSection$Content$UpsellCard) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UpsellCard(value=" + this.value + ")";
    }
}
