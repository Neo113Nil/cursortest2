package com.squareup.protos.lending.sync_values;

import com.google.android.gms.internal.mlkit_vision_face.zzjj;
import com.squareup.protos.lending.sync_values.BorrowData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2 extends zzjj {
    public final BorrowData.AppletData.EntryPointData.TileEntryPoint value;

    public BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2(BorrowData.AppletData.EntryPointData.TileEntryPoint tileEntryPoint) {
        tileEntryPoint.getClass();
        this.value = tileEntryPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2) && Intrinsics.areEqual(this.value, ((BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TileEntryPointV2(value=" + this.value + ")";
    }
}
