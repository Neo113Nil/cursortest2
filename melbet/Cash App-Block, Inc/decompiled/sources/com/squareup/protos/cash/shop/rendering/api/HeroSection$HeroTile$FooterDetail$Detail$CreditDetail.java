package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class HeroSection$HeroTile$FooterDetail$Detail$CreditDetail extends zzkt {
    public final CreditDetail value;

    public HeroSection$HeroTile$FooterDetail$Detail$CreditDetail(CreditDetail creditDetail) {
        creditDetail.getClass();
        this.value = creditDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HeroSection$HeroTile$FooterDetail$Detail$CreditDetail) && Intrinsics.areEqual(this.value, ((HeroSection$HeroTile$FooterDetail$Detail$CreditDetail) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CreditDetail(value=" + this.value + ")";
    }
}
