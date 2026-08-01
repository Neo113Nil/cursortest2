package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new Q.k(9);

    /* renamed from: a, reason: collision with root package name */
    public final long f1864a;

    public d(long j2) {
        this.f1864a = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f1864a == ((d) obj).f1864a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f1864a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f1864a);
    }
}
