package com.squareup.protos.lending.sync_values;

import com.google.android.gms.internal.mlkit_vision_face.zzjk;
import com.squareup.protos.lending.sync_values.BorrowData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations extends zzjk {
    public final BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations value;

    public BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations(BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations allocations) {
        allocations.getClass();
        this.value = allocations;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations) && Intrinsics.areEqual(this.value, ((BorrowData$AppletData$EntryPointData$TileEntryPoint$Row$Visual$Allocations) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Allocations(value=" + this.value + ")";
    }
}
