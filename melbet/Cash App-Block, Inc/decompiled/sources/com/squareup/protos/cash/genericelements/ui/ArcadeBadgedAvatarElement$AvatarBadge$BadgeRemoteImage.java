package com.squareup.protos.cash.genericelements.ui;

import coil3.network.internal.Utils_androidKt;
import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ArcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage extends Utils_androidKt {
    public final ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage value;

    public ArcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage(ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage avatarBadgeRemoteImage) {
        avatarBadgeRemoteImage.getClass();
        this.value = avatarBadgeRemoteImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage) && Intrinsics.areEqual(this.value, ((ArcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BadgeRemoteImage(value=" + this.value + ")";
    }
}
