package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import com.google.android.gms.internal.mlkit_vision_common.zzjz;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DetailsPageComponent$Component$Image extends zzjz {
    public final DetailsPageImage value;

    public DetailsPageComponent$Component$Image(DetailsPageImage detailsPageImage) {
        detailsPageImage.getClass();
        this.value = detailsPageImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DetailsPageComponent$Component$Image) && Intrinsics.areEqual(this.value, ((DetailsPageComponent$Component$Image) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Image(value=" + this.value + ")";
    }
}
