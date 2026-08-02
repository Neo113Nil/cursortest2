package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class GovernmentIdDetails implements Parcelable {
    public static final Parcelable.Creator<GovernmentIdDetails> CREATOR = new Frame.Creator(13);
    public final Date dateOfBirth;
    public final Date expirationDate;

    public GovernmentIdDetails(Date date, Date date2) {
        this.dateOfBirth = date;
        this.expirationDate = date2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GovernmentIdDetails)) {
            return false;
        }
        GovernmentIdDetails governmentIdDetails = (GovernmentIdDetails) obj;
        return Intrinsics.areEqual(this.dateOfBirth, governmentIdDetails.dateOfBirth) && Intrinsics.areEqual(this.expirationDate, governmentIdDetails.expirationDate);
    }

    public final int hashCode() {
        Date date = this.dateOfBirth;
        int hashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.expirationDate;
        return hashCode + (date2 != null ? date2.hashCode() : 0);
    }

    public final String toString() {
        return "GovernmentIdDetails(dateOfBirth=" + this.dateOfBirth + ", expirationDate=" + this.expirationDate + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.dateOfBirth);
        parcel.writeSerializable(this.expirationDate);
    }
}
