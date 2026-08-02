package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import com.squareup.protos.cash.shop.rendering.api.AvatarCarouselSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Section$BrandsDiscovery extends LocalMenuHoursViewKt {
    public final AvatarCarouselSection value;

    public AfterpayAppletHomeSection$Section$BrandsDiscovery(AvatarCarouselSection avatarCarouselSection) {
        avatarCarouselSection.getClass();
        this.value = avatarCarouselSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$Section$BrandsDiscovery) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$Section$BrandsDiscovery) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BrandsDiscovery(value=" + this.value + ")";
    }
}
