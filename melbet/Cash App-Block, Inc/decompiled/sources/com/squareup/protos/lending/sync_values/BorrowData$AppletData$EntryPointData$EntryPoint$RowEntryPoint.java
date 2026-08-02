package com.squareup.protos.lending.sync_values;

import com.google.android.gms.internal.mlkit_vision_face.zzji;
import com.squareup.protos.lending.sync_values.BorrowData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BorrowData$AppletData$EntryPointData$EntryPoint$RowEntryPoint extends zzji {
    public final BorrowData.AppletData.EntryPointData.RowEntryPoint value;

    public BorrowData$AppletData$EntryPointData$EntryPoint$RowEntryPoint(BorrowData.AppletData.EntryPointData.RowEntryPoint rowEntryPoint) {
        rowEntryPoint.getClass();
        this.value = rowEntryPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowData$AppletData$EntryPointData$EntryPoint$RowEntryPoint) && Intrinsics.areEqual(this.value, ((BorrowData$AppletData$EntryPointData$EntryPoint$RowEntryPoint) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RowEntryPoint(value=" + this.value + ")";
    }
}
