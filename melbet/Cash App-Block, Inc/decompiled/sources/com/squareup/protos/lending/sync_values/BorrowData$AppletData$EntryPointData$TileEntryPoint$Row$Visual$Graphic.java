package com.squareup.protos.lending.sync_values;

import com.google.android.gms.internal.mlkit_vision_face.zzjk;
import com.squareup.protos.lending.sync_values.BorrowData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic extends zzjk {
    public final BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic value;

    public BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic(BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic graphic) {
        graphic.getClass();
        this.value = graphic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic) && Intrinsics.areEqual(this.value, ((BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Graphic) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Graphic(value=" + this.value + ")";
    }
}
