package com.squareup.cash.stripe.integration;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.shopping.settings.screens.ErrorScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface StripeLinkActivityResult extends Parcelable {

    public final class Canceled implements StripeLinkActivityResult {
        public static final Canceled INSTANCE = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new ErrorScreen.Creator(25);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Canceled);
        }

        public final int hashCode() {
            return 289434187;
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

    public final class ManualLink implements StripeLinkActivityResult {
        public static final ManualLink INSTANCE = new ManualLink();
        public static final Parcelable.Creator<ManualLink> CREATOR = new ErrorScreen.Creator(28);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ManualLink);
        }

        public final int hashCode() {
            return -16844270;
        }

        public final String toString() {
            return "ManualLink";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Success implements StripeLinkActivityResult {
        public static final Parcelable.Creator<Success> CREATOR = new ErrorScreen.Creator(29);
        public final String accountId;
        public final String institutionName;
        public final String paymentMethodId;

        public Success(String str, String str2, String str3) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.accountId = str;
            this.paymentMethodId = str2;
            this.institutionName = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.accountId, success.accountId) && Intrinsics.areEqual(this.paymentMethodId, success.paymentMethodId) && Intrinsics.areEqual(this.institutionName, success.institutionName);
        }

        public final String getAccountId() {
            return this.accountId;
        }

        public final String getInstitutionName() {
            return this.institutionName;
        }

        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        public final int hashCode() {
            return this.institutionName.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.accountId.hashCode() * 31, 31, this.paymentMethodId);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(accountId=", this.accountId, ", paymentMethodId=", this.paymentMethodId, ", institutionName="), this.institutionName, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.accountId);
            parcel.writeString(this.paymentMethodId);
            parcel.writeString(this.institutionName);
        }
    }
}
