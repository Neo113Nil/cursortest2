package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhs;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class EducationalSheetButton$Action$PaginatedSheet extends zzhs {
    public final PaginatedSheet value;

    public EducationalSheetButton$Action$PaginatedSheet(PaginatedSheet paginatedSheet) {
        paginatedSheet.getClass();
        this.value = paginatedSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EducationalSheetButton$Action$PaginatedSheet) && Intrinsics.areEqual(this.value, ((EducationalSheetButton$Action$PaginatedSheet) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PaginatedSheet(value=" + this.value + ")";
    }
}
