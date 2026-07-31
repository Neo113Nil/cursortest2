package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class l22 implements Comparable<l22>, Parcelable {
    public static final Parcelable.Creator<l22> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f28395b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28396c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28397d;

    final class a implements Parcelable.Creator<l22> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final l22 createFromParcel(Parcel parcel) {
            return new l22(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final l22[] newArray(int i4) {
            return new l22[i4];
        }
    }

    public l22(int i4, int i5, int i6) {
        this.f28395b = i4;
        this.f28396c = i5;
        this.f28397d = i6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(l22 l22Var) {
        l22 l22Var2 = l22Var;
        int i4 = this.f28395b - l22Var2.f28395b;
        if (i4 != 0) {
            return i4;
        }
        int i5 = this.f28396c - l22Var2.f28396c;
        return i5 == 0 ? this.f28397d - l22Var2.f28397d : i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l22.class == obj.getClass()) {
            l22 l22Var = (l22) obj;
            if (this.f28395b == l22Var.f28395b && this.f28396c == l22Var.f28396c && this.f28397d == l22Var.f28397d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f28395b * 31) + this.f28396c) * 31) + this.f28397d;
    }

    public final String toString() {
        return this.f28395b + "." + this.f28396c + "." + this.f28397d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f28395b);
        parcel.writeInt(this.f28396c);
        parcel.writeInt(this.f28397d);
    }

    l22(Parcel parcel) {
        this.f28395b = parcel.readInt();
        this.f28396c = parcel.readInt();
        this.f28397d = parcel.readInt();
    }
}
