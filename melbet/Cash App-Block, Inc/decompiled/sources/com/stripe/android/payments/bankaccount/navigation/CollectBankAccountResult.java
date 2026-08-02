package com.stripe.android.payments.bankaccount.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.model.Token;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class CollectBankAccountResult implements Parcelable {

    public final class Cancelled extends CollectBankAccountResult {
        public static final Cancelled INSTANCE = new Cancelled();
        public static final Parcelable.Creator<Cancelled> CREATOR = new Token.Creator(25);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancelled);
        }

        public final int hashCode() {
            return -1318193034;
        }

        public final String toString() {
            return "Cancelled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Completed extends CollectBankAccountResult {
        public static final Parcelable.Creator<Completed> CREATOR = new Token.Creator(26);
        public final CollectBankAccountResponse response;

        public Completed(CollectBankAccountResponse collectBankAccountResponse) {
            collectBankAccountResponse.getClass();
            this.response = collectBankAccountResponse;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Completed) && Intrinsics.areEqual(this.response, ((Completed) obj).response);
        }

        public final int hashCode() {
            return this.response.hashCode();
        }

        public final String toString() {
            return "Completed(response=" + this.response + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.response.writeToParcel(parcel, i);
        }
    }

    public final class Failed extends CollectBankAccountResult {
        public static final Parcelable.Creator<Failed> CREATOR = new Token.Creator(27);
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
