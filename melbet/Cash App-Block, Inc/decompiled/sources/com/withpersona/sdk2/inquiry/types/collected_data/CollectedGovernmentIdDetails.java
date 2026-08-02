package com.withpersona.sdk2.inquiry.types.collected_data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import net.oneformapp.schema.Element;

/* loaded from: classes9.dex */
public final class CollectedGovernmentIdDetails implements Parcelable {
    public static final Parcelable.Creator<CollectedGovernmentIdDetails> CREATOR = new Element.AnonymousClass1(5);
    public final Date dateOfBirth;
    public final Date expirationDate;

    public CollectedGovernmentIdDetails(Date date, Date date2) {
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
        if (!(obj instanceof CollectedGovernmentIdDetails)) {
            return false;
        }
        CollectedGovernmentIdDetails collectedGovernmentIdDetails = (CollectedGovernmentIdDetails) obj;
        return Intrinsics.areEqual(this.dateOfBirth, collectedGovernmentIdDetails.dateOfBirth) && Intrinsics.areEqual(this.expirationDate, collectedGovernmentIdDetails.expirationDate);
    }

    public final int hashCode() {
        Date date = this.dateOfBirth;
        int hashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.expirationDate;
        return hashCode + (date2 != null ? date2.hashCode() : 0);
    }

    public final String toString() {
        return "CollectedGovernmentIdDetails(dateOfBirth=" + this.dateOfBirth + ", expirationDate=" + this.expirationDate + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.dateOfBirth);
        parcel.writeSerializable(this.expirationDate);
    }
}
