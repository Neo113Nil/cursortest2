package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import com.google.android.gms.internal.mlkit_vision_common.zzjz;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DetailsPageComponent$Component$Header extends zzjz {
    public final DetailsPageHeader value;

    public DetailsPageComponent$Component$Header(DetailsPageHeader detailsPageHeader) {
        detailsPageHeader.getClass();
        this.value = detailsPageHeader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DetailsPageComponent$Component$Header) && Intrinsics.areEqual(this.value, ((DetailsPageComponent$Component$Header) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Header(value=" + this.value + ")";
    }
}
