package com.squareup.protos.cash.genericelements.ui;

import com.google.android.gms.internal.mlkit_vision_common.zzbc;
import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon extends zzbc {
    public final ArcadeBadgedAvatarElement.AvatarImageRemoteIcon value;

    public ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon(ArcadeBadgedAvatarElement.AvatarImageRemoteIcon avatarImageRemoteIcon) {
        avatarImageRemoteIcon.getClass();
        this.value = avatarImageRemoteIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon) && Intrinsics.areEqual(this.value, ((ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AvatarRemoteIcon(value=" + this.value + ")";
    }
}
