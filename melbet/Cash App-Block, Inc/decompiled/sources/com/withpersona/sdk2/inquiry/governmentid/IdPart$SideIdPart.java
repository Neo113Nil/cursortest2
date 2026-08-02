package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;

/* loaded from: classes9.dex */
public final class IdPart$SideIdPart implements Parcelable {
    public static final Parcelable.Creator<IdPart$SideIdPart> CREATOR = new RawExtraction.Creator(3);
    public final IdConfig.Side side;

    public IdPart$SideIdPart(IdConfig.Side side) {
        side.getClass();
        this.side = side;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IdPart$SideIdPart) && this.side == ((IdPart$SideIdPart) obj).side;
    }

    public final int hashCode() {
        return this.side.hashCode();
    }

    public final String toString() {
        return "SideIdPart(side=" + this.side + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.side.name());
    }
}
