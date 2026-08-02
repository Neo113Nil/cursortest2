package com.squareup.paging;

import androidx.paging.PagingData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PagingDataWithCount {
    public final long count;
    public final PagingData value;

    public PagingDataWithCount(PagingData pagingData, long j) {
        pagingData.getClass();
        this.value = pagingData;
        this.count = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagingDataWithCount)) {
            return false;
        }
        PagingDataWithCount pagingDataWithCount = (PagingDataWithCount) obj;
        return Intrinsics.areEqual(this.value, pagingDataWithCount.value) && this.count == pagingDataWithCount.count;
    }

    public final int hashCode() {
        return Long.hashCode(this.count) + (this.value.hashCode() * 31);
    }

    public final String toString() {
        return "PagingDataWithCount(value=" + this.value + ", count=" + this.count + ")";
    }
}
