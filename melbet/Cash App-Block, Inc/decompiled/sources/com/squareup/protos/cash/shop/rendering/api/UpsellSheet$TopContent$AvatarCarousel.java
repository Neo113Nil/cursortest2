package com.squareup.protos.cash.shop.rendering.api;

import com.datadog.android.rum.model.LongTaskEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class UpsellSheet$TopContent$AvatarCarousel extends LongTaskEvent.Companion {
    public final AvatarCarousel value;

    public UpsellSheet$TopContent$AvatarCarousel(AvatarCarousel avatarCarousel) {
        avatarCarousel.getClass();
        this.value = avatarCarousel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpsellSheet$TopContent$AvatarCarousel) && Intrinsics.areEqual(this.value, ((UpsellSheet$TopContent$AvatarCarousel) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AvatarCarousel(value=" + this.value + ")";
    }
}
