package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import com.google.android.gms.internal.mlkit_vision_common.zzjz;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DetailsPageComponent$Component$HorizontalDivider extends zzjz {
    public final DetailsPageHorizontalDivider value;

    public DetailsPageComponent$Component$HorizontalDivider(DetailsPageHorizontalDivider detailsPageHorizontalDivider) {
        detailsPageHorizontalDivider.getClass();
        this.value = detailsPageHorizontalDivider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DetailsPageComponent$Component$HorizontalDivider) && Intrinsics.areEqual(this.value, ((DetailsPageComponent$Component$HorizontalDivider) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "HorizontalDivider(value=" + this.value + ")";
    }
}
