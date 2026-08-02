package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import com.google.android.gms.internal.mlkit_vision_common.zzjz;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DetailsPageComponent$Component$UnorderedList extends zzjz {
    public final DetailsPageUnorderedList value;

    public DetailsPageComponent$Component$UnorderedList(DetailsPageUnorderedList detailsPageUnorderedList) {
        detailsPageUnorderedList.getClass();
        this.value = detailsPageUnorderedList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DetailsPageComponent$Component$UnorderedList) && Intrinsics.areEqual(this.value, ((DetailsPageComponent$Component$UnorderedList) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UnorderedList(value=" + this.value + ")";
    }
}
