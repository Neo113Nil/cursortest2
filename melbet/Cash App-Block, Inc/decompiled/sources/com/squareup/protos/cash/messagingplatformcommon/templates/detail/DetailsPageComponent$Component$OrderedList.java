package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import com.google.android.gms.internal.mlkit_vision_common.zzjz;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DetailsPageComponent$Component$OrderedList extends zzjz {
    public final DetailsPageOrderedList value;

    public DetailsPageComponent$Component$OrderedList(DetailsPageOrderedList detailsPageOrderedList) {
        detailsPageOrderedList.getClass();
        this.value = detailsPageOrderedList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DetailsPageComponent$Component$OrderedList) && Intrinsics.areEqual(this.value, ((DetailsPageComponent$Component$OrderedList) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OrderedList(value=" + this.value + ")";
    }
}
