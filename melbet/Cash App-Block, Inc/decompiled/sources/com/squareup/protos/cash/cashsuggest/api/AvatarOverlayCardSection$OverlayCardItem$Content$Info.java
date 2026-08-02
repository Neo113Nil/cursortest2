package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.layout.view.FlexboxHelpersKt;
import com.squareup.protos.cash.cashsuggest.api.AvatarOverlayCardSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AvatarOverlayCardSection$OverlayCardItem$Content$Info extends FlexboxHelpersKt {
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
