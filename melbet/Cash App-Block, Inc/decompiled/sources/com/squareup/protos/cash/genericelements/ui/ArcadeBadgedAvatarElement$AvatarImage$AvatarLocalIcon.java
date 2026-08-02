package com.squareup.protos.cash.genericelements.ui;

import com.google.android.gms.internal.mlkit_vision_common.zzbc;
import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ArcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon extends zzbc {
    public final ArcadeBadgedAvatarElement.AvatarImageLocalIcon value;

    public ArcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon(ArcadeBadgedAvatarElement.AvatarImageLocalIcon avatarImageLocalIcon) {
        avatarImageLocalIcon.getClass();
        this.value = avatarImageLocalIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon) && Intrinsics.areEqual(this.value, ((ArcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AvatarLocalIcon(value=" + this.value + ")";
    }
}
