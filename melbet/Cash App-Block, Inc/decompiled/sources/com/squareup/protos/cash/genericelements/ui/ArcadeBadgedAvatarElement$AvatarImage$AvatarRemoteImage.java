package com.squareup.protos.cash.genericelements.ui;

import com.google.android.gms.internal.mlkit_vision_common.zzbc;
import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage extends zzbc {
    public final ArcadeBadgedAvatarElement.AvatarImageRemoteImage value;

    public ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage(ArcadeBadgedAvatarElement.AvatarImageRemoteImage avatarImageRemoteImage) {
        avatarImageRemoteImage.getClass();
        this.value = avatarImageRemoteImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage) && Intrinsics.areEqual(this.value, ((ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AvatarRemoteImage(value=" + this.value + ")";
    }
}
