package com.squareup.cash.tax.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.tax.primitives.Id;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface TaxLocation extends Parcelable {

    public final class DeepLink implements TaxLocation {
        public static final Parcelable.Creator<DeepLink> CREATOR = new Id.Close.Creator(24);
        public final String url;

        public DeepLink(String str) {
            str.getClass();
            this.url = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeepLink) && Intrinsics.areEqual(this.url, ((DeepLink) obj).url);
        }

        @Override // com.squareup.cash.tax.primitives.TaxLocation
        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeepLink(url=", this.url, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.url);
        }
    }

    public final class EFile implements TaxLocation {
        public static final EFile INSTANCE = new EFile();
        public static final Parcelable.Creator<EFile> CREATOR = new Id.Close.Creator(25);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EFile);
        }

        @Override // com.squareup.cash.tax.primitives.TaxLocation
        public final String getUrl() {
            return "";
        }

        public final int hashCode() {
            return -1392679642;
        }

        public final String toString() {
            return "EFile";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class EstimateYourRefund implements TaxLocation {
        public static final EstimateYourRefund INSTANCE = new EstimateYourRefund();
        public static final Parcelable.Creator<EstimateYourRefund> CREATOR = new Id.Close.Creator(26);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EstimateYourRefund);
        }

        @Override // com.squareup.cash.tax.primitives.TaxLocation
        public final String getUrl() {
            return "/r/estimate-your-refund";
        }

        public final int hashCode() {
            return 1774671694;
        }

        public final String toString() {
            return "EstimateYourRefund";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class TaxHub implements TaxLocation {
        public static final TaxHub INSTANCE = new TaxHub();
        public static final Parcelable.Creator<TaxHub> CREATOR = new Id.Close.Creator(27);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TaxHub);
        }

        @Override // com.squareup.cash.tax.primitives.TaxLocation
        public final String getUrl() {
            return "";
        }

        public final int hashCode() {
            return 231389253;
        }

        public final String toString() {
            return "TaxHub";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class TaxHubWithDeepLink implements TaxLocation {
        public static final Parcelable.Creator<TaxHubWithDeepLink> CREATOR = new Id.Close.Creator(28);
        public final String url;

        public TaxHubWithDeepLink(String str) {
            str.getClass();
            this.url = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaxHubWithDeepLink) && Intrinsics.areEqual(this.url, ((TaxHubWithDeepLink) obj).url);
        }

        @Override // com.squareup.cash.tax.primitives.TaxLocation
        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TaxHubWithDeepLink(url=", this.url, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.url);
        }
    }

    String getUrl();
}
