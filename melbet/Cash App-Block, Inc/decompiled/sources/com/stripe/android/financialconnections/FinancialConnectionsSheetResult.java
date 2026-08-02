package com.stripe.android.financialconnections;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class FinancialConnectionsSheetResult implements Parcelable {

    public final class Canceled extends FinancialConnectionsSheetResult {
        public static final Canceled INSTANCE = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new ElementsSessionContext.Creator(9);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Canceled);
        }

        public final int hashCode() {
            return 637890822;
        }

        public final String toString() {
            return "Canceled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Completed extends FinancialConnectionsSheetResult {
        public static final Parcelable.Creator<Completed> CREATOR = new ElementsSessionContext.Creator(10);
        public final FinancialConnectionsSession financialConnectionsSession;

        public Completed(FinancialConnectionsSession financialConnectionsSession) {
            financialConnectionsSession.getClass();
            this.financialConnectionsSession = financialConnectionsSession;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Completed) && Intrinsics.areEqual(this.financialConnectionsSession, ((Completed) obj).financialConnectionsSession);
        }

        public final int hashCode() {
            return this.financialConnectionsSession.hashCode();
        }

        public final String toString() {
            return "Completed(financialConnectionsSession=" + this.financialConnectionsSession + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.financialConnectionsSession.writeToParcel(parcel, i);
        }
    }

    public final class Failed extends FinancialConnectionsSheetResult {
        public static final Parcelable.Creator<Failed> CREATOR = new ElementsSessionContext.Creator(11);
        public final Throwable error;

        public Failed(Throwable th) {
            th.getClass();
            this.error = th;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) obj).error);
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("Failed(error=", ")", this.error);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.error);
        }
    }
}
