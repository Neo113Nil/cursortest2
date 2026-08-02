package com.squareup.protos.lending;

import com.google.android.gms.internal.mlkit_vision_face.zzja;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$UnknownState extends zzja {
    public final PrepurchaseAfterpayAppletData.AppletRow.Cell.UnknownState value;

    public PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$UnknownState(PrepurchaseAfterpayAppletData.AppletRow.Cell.UnknownState unknownState) {
        unknownState.getClass();
        this.value = unknownState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$UnknownState) && this.value == ((PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$UnknownState) obj).value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UnknownState(value=" + this.value + ")";
    }
}
