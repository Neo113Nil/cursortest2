package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import com.google.android.gms.internal.mlkit_vision_common.zzjz;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DetailsPageComponent$Component$VerticalSpacer extends zzjz {
    public final DetailsPageVerticalSpacer value;

    public DetailsPageComponent$Component$VerticalSpacer(DetailsPageVerticalSpacer detailsPageVerticalSpacer) {
        detailsPageVerticalSpacer.getClass();
        this.value = detailsPageVerticalSpacer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DetailsPageComponent$Component$VerticalSpacer) && Intrinsics.areEqual(this.value, ((DetailsPageComponent$Component$VerticalSpacer) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "VerticalSpacer(value=" + this.value + ")";
    }
}
