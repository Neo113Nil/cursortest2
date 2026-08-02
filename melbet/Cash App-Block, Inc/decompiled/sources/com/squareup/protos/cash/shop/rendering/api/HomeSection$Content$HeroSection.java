package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzku;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class HomeSection$Content$HeroSection extends zzku {
    public final HeroSection value;

    public HomeSection$Content$HeroSection(HeroSection heroSection) {
        heroSection.getClass();
        this.value = heroSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HomeSection$Content$HeroSection) && Intrinsics.areEqual(this.value, ((HomeSection$Content$HeroSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "HeroSection(value=" + this.value + ")";
    }
}
