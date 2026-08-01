package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new F0.b(9);

    /* renamed from: a, reason: collision with root package name */
    public final long f2251a;

    public d(long j2) {
        this.f2251a = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f2251a == ((d) obj).f2251a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f2251a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2251a);
    }
}
