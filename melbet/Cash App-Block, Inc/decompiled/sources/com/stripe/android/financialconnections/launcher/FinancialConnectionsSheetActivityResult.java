package com.stripe.android.financialconnections.launcher;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.core.model.Country;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.Token;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class FinancialConnectionsSheetActivityResult implements Parcelable {

    public final class Canceled extends FinancialConnectionsSheetActivityResult {
        public static final Canceled INSTANCE = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new Country.Creator(18);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Canceled);
        }

        public final int hashCode() {
            return -1375852025;
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

    public final class Failed extends FinancialConnectionsSheetActivityResult {
        public static final Parcelable.Creator<Failed> CREATOR = new Country.Creator(20);
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

    public final class Completed extends FinancialConnectionsSheetActivityResult {
        public static final Parcelable.Creator<Completed> CREATOR = new Country.Creator(19);
        public final FinancialConnectionsSession financialConnectionsSession;
        public final InstantDebitsResult instantDebits;
        public final Token token;

        public /* synthetic */ Completed(InstantDebitsResult instantDebitsResult, FinancialConnectionsSession financialConnectionsSession, Token token, int i) {
            this((i & 1) != 0 ? null : instantDebitsResult, (i & 2) != 0 ? null : financialConnectionsSession, (i & 4) != 0 ? null : token);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) obj;
            return Intrinsics.areEqual(this.instantDebits, completed.instantDebits) && Intrinsics.areEqual(this.financialConnectionsSession, completed.financialConnectionsSession) && Intrinsics.areEqual(this.token, completed.token);
        }

        public final int hashCode() {
            InstantDebitsResult instantDebitsResult = this.instantDebits;
            int hashCode = (instantDebitsResult == null ? 0 : instantDebitsResult.hashCode()) * 31;
            FinancialConnectionsSession financialConnectionsSession = this.financialConnectionsSession;
            int hashCode2 = (hashCode + (financialConnectionsSession == null ? 0 : financialConnectionsSession.hashCode())) * 31;
            Token token = this.token;
            return hashCode2 + (token != null ? token.hashCode() : 0);
        }

        public final String toString() {
            return "Completed(instantDebits=" + this.instantDebits + ", financialConnectionsSession=" + this.financialConnectionsSession + ", token=" + this.token + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            InstantDebitsResult instantDebitsResult = this.instantDebits;
            if (instantDebitsResult == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                instantDebitsResult.writeToParcel(parcel, i);
            }
            FinancialConnectionsSession financialConnectionsSession = this.financialConnectionsSession;
            if (financialConnectionsSession == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                financialConnectionsSession.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.token, i);
        }

        public Completed(InstantDebitsResult instantDebitsResult, FinancialConnectionsSession financialConnectionsSession, Token token) {
            this.instantDebits = instantDebitsResult;
            this.financialConnectionsSession = financialConnectionsSession;
            this.token = token;
        }
    }
}
