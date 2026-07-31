package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class mj implements Parcelable {
    public static final Parcelable.Creator<mj> CREATOR = new kj();

    /* renamed from: f, reason: collision with root package name */
    private final lj[] f8596f;

    mj(Parcel parcel) {
        this.f8596f = new lj[parcel.readInt()];
        int i7 = 0;
        while (true) {
            lj[] ljVarArr = this.f8596f;
            if (i7 >= ljVarArr.length) {
                return;
            }
            ljVarArr[i7] = (lj) parcel.readParcelable(lj.class.getClassLoader());
            i7++;
        }
    }

    public mj(List<? extends lj> list) {
        lj[] ljVarArr = new lj[list.size()];
        this.f8596f = ljVarArr;
        list.toArray(ljVarArr);
    }

    public final int a() {
        return this.f8596f.length;
    }

    public final lj c(int i7) {
        return this.f8596f[i7];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mj.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8596f, ((mj) obj).f8596f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8596f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f8596f.length);
        for (lj ljVar : this.f8596f) {
            parcel.writeParcelable(ljVar, 0);
        }
    }
}
