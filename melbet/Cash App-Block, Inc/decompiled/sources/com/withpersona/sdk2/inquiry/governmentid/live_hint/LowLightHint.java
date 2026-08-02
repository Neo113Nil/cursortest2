package com.withpersona.sdk2.inquiry.governmentid.live_hint;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;

/* loaded from: classes9.dex */
public final class LowLightHint implements Hint {
    public static final LowLightHint INSTANCE = new LowLightHint();
    public static final Parcelable.Creator<LowLightHint> CREATOR = new RawExtraction.Creator(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof LowLightHint);
    }

    public final int hashCode() {
        return -18155401;
    }

    public final String toString() {
        return "LowLightHint";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
