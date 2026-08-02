package com.squareup.cash.transactionpicker.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.paging.PagingData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class TransactionPickerViewModel {

    public final class Loaded extends TransactionPickerViewModel {
        public final PagingData completedTransactions;
        public final long completedTransactionsCount;
        public final PagingData outstandingTransactions;
        public final long outstandingTransactionsCount;

        public Loaded(PagingData pagingData, long j, PagingData pagingData2, long j2) {
            pagingData.getClass();
            pagingData2.getClass();
            this.outstandingTransactions = pagingData;
            this.outstandingTransactionsCount = j;
            this.completedTransactions = pagingData2;
            this.completedTransactionsCount = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.outstandingTransactions, loaded.outstandingTransactions) && this.outstandingTransactionsCount == loaded.outstandingTransactionsCount && Intrinsics.areEqual(this.completedTransactions, loaded.completedTransactions) && this.completedTransactionsCount == loaded.completedTransactionsCount;
        }

        public final int hashCode() {
            return Recorder$$ExternalSyntheticOutline2.m((this.completedTransactions.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.outstandingTransactions.hashCode() * 31, 31, this.outstandingTransactionsCount)) * 31, 31, this.completedTransactionsCount);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(outstandingTransactions=");
            sb.append(this.outstandingTransactions);
            sb.append(", outstandingTransactionsCount=");
            sb.append(this.outstandingTransactionsCount);
            sb.append(", completedTransactions=");
            sb.append(this.completedTransactions);
            sb.append(", completedTransactionsCount=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.completedTransactionsCount, ", overrideTitle=null)", sb);
        }
    }

    public final class Loading extends TransactionPickerViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 2110692337;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
