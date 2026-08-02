package com.withpersona.sdk2.inquiry.steps.ui.components.utils;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.nfc.ChipAuthenticationStatus;
import kotlin.jvm.internal.Intrinsics;
import net.oneformapp.schema.Element;

/* loaded from: classes9.dex */
public final class GovernmentIdNfcData implements Parcelable {
    public static final Parcelable.Creator<GovernmentIdNfcData> CREATOR = new Element.AnonymousClass1(1);
    public final ChipAuthenticationStatus chipAuthenticationStatus;
    public final Uri dg1Uri;
    public final Uri dg2Uri;
    public final Uri sodUri;

    public GovernmentIdNfcData(Uri uri, Uri uri2, Uri uri3, ChipAuthenticationStatus chipAuthenticationStatus) {
        chipAuthenticationStatus.getClass();
        this.dg1Uri = uri;
        this.dg2Uri = uri2;
        this.sodUri = uri3;
        this.chipAuthenticationStatus = chipAuthenticationStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GovernmentIdNfcData)) {
            return false;
        }
        GovernmentIdNfcData governmentIdNfcData = (GovernmentIdNfcData) obj;
        return Intrinsics.areEqual(this.dg1Uri, governmentIdNfcData.dg1Uri) && Intrinsics.areEqual(this.dg2Uri, governmentIdNfcData.dg2Uri) && Intrinsics.areEqual(this.sodUri, governmentIdNfcData.sodUri) && this.chipAuthenticationStatus == governmentIdNfcData.chipAuthenticationStatus;
    }

    public final int hashCode() {
        Uri uri = this.dg1Uri;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        Uri uri2 = this.dg2Uri;
        int hashCode2 = (hashCode + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        Uri uri3 = this.sodUri;
        return this.chipAuthenticationStatus.hashCode() + ((hashCode2 + (uri3 != null ? uri3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "GovernmentIdNfcData(dg1Uri=" + this.dg1Uri + ", dg2Uri=" + this.dg2Uri + ", sodUri=" + this.sodUri + ", chipAuthenticationStatus=" + this.chipAuthenticationStatus + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.dg1Uri, i);
        parcel.writeParcelable(this.dg2Uri, i);
        parcel.writeParcelable(this.sodUri, i);
        parcel.writeString(this.chipAuthenticationStatus.name());
    }
}
