package com.squareup.protos.lending;

import com.google.android.gms.internal.mlkit_vision_face.zzjb;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$AppletRow$Content$Cell extends zzjb {
    public final PrepurchaseAfterpayAppletData.AppletRow.Cell value;

    public PrepurchaseAfterpayAppletData$AppletRow$Content$Cell(PrepurchaseAfterpayAppletData.AppletRow.Cell cell) {
        cell.getClass();
        this.value = cell;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseAfterpayAppletData$AppletRow$Content$Cell) && Intrinsics.areEqual(this.value, ((PrepurchaseAfterpayAppletData$AppletRow$Content$Cell) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Cell(value=" + this.value + ")";
    }
}
