package com.stripe.android.challenge.passive.warmer.activity;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.Country;

/* loaded from: classes8.dex */
public final class PassiveChallengeWarmerCompleted implements Parcelable {
    public static final PassiveChallengeWarmerCompleted INSTANCE = new PassiveChallengeWarmerCompleted();
    public static final Parcelable.Creator<PassiveChallengeWarmerCompleted> CREATOR = new Country.Creator(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PassiveChallengeWarmerCompleted);
    }

    public final int hashCode() {
        return 1608486069;
    }

    public final String toString() {
        return "PassiveChallengeWarmerCompleted";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
