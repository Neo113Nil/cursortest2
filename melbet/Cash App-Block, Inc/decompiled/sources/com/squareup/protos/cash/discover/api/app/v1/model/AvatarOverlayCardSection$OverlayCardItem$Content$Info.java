package com.squareup.protos.cash.discover.api.app.v1.model;

import app.cash.zipline.loader.ZiplineFile;
import com.squareup.protos.cash.discover.api.app.v1.model.AvatarOverlayCardSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AvatarOverlayCardSection$OverlayCardItem$Content$Info extends ZiplineFile.Companion {
    public final AvatarOverlayCardSection.InfoOverlayCardItem value;

    public AvatarOverlayCardSection$OverlayCardItem$Content$Info(AvatarOverlayCardSection.InfoOverlayCardItem infoOverlayCardItem) {
        infoOverlayCardItem.getClass();
        this.value = infoOverlayCardItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AvatarOverlayCardSection$OverlayCardItem$Content$Info) && Intrinsics.areEqual(this.value, ((AvatarOverlayCardSection$OverlayCardItem$Content$Info) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Info(value=" + this.value + ")";
    }
}
