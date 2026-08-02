package com.withpersona.sdk2.inquiry.governmentid.live_hint;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;

/* loaded from: classes9.dex */
public final class HoldStillHint implements Hint {
    public static final HoldStillHint INSTANCE = new HoldStillHint();
    public static final Parcelable.Creator<HoldStillHint> CREATOR = new RawExtraction.Creator(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof HoldStillHint);
    }

    public final int hashCode() {
        return 1462785890;
    }

    public final String toString() {
        return "HoldStillHint";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
