package com.squareup.protos.cash.shop.rendering.api;

import com.datadog.android.rum.model.ErrorEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PageHeaderSection$TopContent$AvatarCarousel extends ErrorEvent.Usr.Companion {
    public final AvatarCarousel value;

    public PageHeaderSection$TopContent$AvatarCarousel(AvatarCarousel avatarCarousel) {
        avatarCarousel.getClass();
        this.value = avatarCarousel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PageHeaderSection$TopContent$AvatarCarousel) && Intrinsics.areEqual(this.value, ((PageHeaderSection$TopContent$AvatarCarousel) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AvatarCarousel(value=" + this.value + ")";
    }
}
