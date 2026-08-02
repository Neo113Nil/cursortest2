package com.squareup.protos.cash.genericelements.ui;

import coil3.network.internal.Utils_androidKt;
import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon extends Utils_androidKt {
    public final ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon value;

    public ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon(ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon avatarBadgeLocalIcon) {
        avatarBadgeLocalIcon.getClass();
        this.value = avatarBadgeLocalIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon) && Intrinsics.areEqual(this.value, ((ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BadgeLocalIcon(value=" + this.value + ")";
    }
}
