package com.squareup.protos.lending;

import com.google.android.gms.internal.mlkit_vision_face.zzjb;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$AppletRow$Content$UnorderedList extends zzjb {
    public final PrepurchaseAfterpayAppletData.AppletRow.UnorderedList value;

    public PrepurchaseAfterpayAppletData$AppletRow$Content$UnorderedList(PrepurchaseAfterpayAppletData.AppletRow.UnorderedList unorderedList) {
        unorderedList.getClass();
        this.value = unorderedList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseAfterpayAppletData$AppletRow$Content$UnorderedList) && Intrinsics.areEqual(this.value, ((PrepurchaseAfterpayAppletData$AppletRow$Content$UnorderedList) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UnorderedList(value=" + this.value + ")";
    }
}
