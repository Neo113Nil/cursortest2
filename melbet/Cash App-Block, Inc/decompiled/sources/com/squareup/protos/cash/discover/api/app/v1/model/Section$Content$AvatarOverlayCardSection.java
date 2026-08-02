package com.squareup.protos.cash.discover.api.app.v1.model;

import coil3.Uri_androidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Section$Content$AvatarOverlayCardSection extends Uri_androidKt {
    public final AvatarOverlayCardSection value;

    public Section$Content$AvatarOverlayCardSection(AvatarOverlayCardSection avatarOverlayCardSection) {
        avatarOverlayCardSection.getClass();
        this.value = avatarOverlayCardSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Section$Content$AvatarOverlayCardSection) && Intrinsics.areEqual(this.value, ((Section$Content$AvatarOverlayCardSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AvatarOverlayCardSection(value=" + this.value + ")";
    }
}
