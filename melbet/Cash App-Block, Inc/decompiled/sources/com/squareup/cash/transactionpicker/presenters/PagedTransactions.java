package com.squareup.cash.transactionpicker.presenters;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.paging.PagingData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PagedTransactions {
    public final PagingData completed;
    public final long completedCount;
    public final PagingData outstanding;
    public final long outstandingCount;

    public PagedTransactions(PagingData pagingData, long j, PagingData pagingData2, long j2) {
        pagingData.getClass();
        pagingData2.getClass();
        this.outstanding = pagingData;
        this.outstandingCount = j;
        this.completed = pagingData2;
        this.completedCount = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagedTransactions)) {
            return false;
        }
        PagedTransactions pagedTransactions = (PagedTransactions) obj;
        return Intrinsics.areEqual(this.outstanding, pagedTransactions.outstanding) && this.outstandingCount == pagedTransactions.outstandingCount && Intrinsics.areEqual(this.completed, pagedTransactions.completed) && this.completedCount == pagedTransactions.completedCount;
    }

    public final int hashCode() {
        return Long.hashCode(this.completedCount) + ((this.completed.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.outstanding.hashCode() * 31, 31, this.outstandingCount)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagedTransactions(outstanding=");
        sb.append(this.outstanding);
        sb.append(", outstandingCount=");
        sb.append(this.outstandingCount);
        sb.append(", completed=");
        sb.append(this.completed);
        sb.append(", completedCount=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.completedCount, ")", sb);
    }
}
