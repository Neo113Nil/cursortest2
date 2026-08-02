package com.squareup.protos.cash.discover.api.app.v1.model;

import app.cash.zipline.loader.ZiplineFile;
import com.squareup.protos.cash.discover.api.app.v1.model.AvatarOverlayCardSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AvatarOverlayCardSection$OverlayCardItem$Content$Avatar extends ZiplineFile.Companion {
    public final AvatarOverlayCardSection.AvatarOverlayCardItem value;

    public AvatarOverlayCardSection$OverlayCardItem$Content$Avatar(AvatarOverlayCardSection.AvatarOverlayCardItem avatarOverlayCardItem) {
        avatarOverlayCardItem.getClass();
        this.value = avatarOverlayCardItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AvatarOverlayCardSection$OverlayCardItem$Content$Avatar) && Intrinsics.areEqual(this.value, ((AvatarOverlayCardSection$OverlayCardItem$Content$Avatar) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Avatar(value=" + this.value + ")";
    }
}
