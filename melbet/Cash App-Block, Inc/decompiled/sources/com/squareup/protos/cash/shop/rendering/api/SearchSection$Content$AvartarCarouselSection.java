package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzld;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SearchSection$Content$AvartarCarouselSection extends zzld {
    public final AvatarCarouselSection value;

    public SearchSection$Content$AvartarCarouselSection(AvatarCarouselSection avatarCarouselSection) {
        avatarCarouselSection.getClass();
        this.value = avatarCarouselSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchSection$Content$AvartarCarouselSection) && Intrinsics.areEqual(this.value, ((SearchSection$Content$AvartarCarouselSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AvartarCarouselSection(value=" + this.value + ")";
    }
}
