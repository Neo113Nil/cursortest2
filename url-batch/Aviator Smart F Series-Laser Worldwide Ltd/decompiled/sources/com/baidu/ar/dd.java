package com.baidu.ar;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class dd implements Parcelable {
    public static final Parcelable.Creator<dd> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f2066a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f2067b;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public dd[] newArray(int i8) {
            return new dd[i8];
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            dd ddVar = new dd();
            ddVar.a(parcel.readString());
            ddVar.a(parcel.createFloatArray());
            return ddVar;
        }
    }

    public void a(String str) {
        this.f2066a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f2066a);
        parcel.writeFloatArray(this.f2067b);
    }

    public void a(float[] fArr) {
        this.f2067b = fArr;
    }

    public float[] a() {
        return this.f2067b;
    }
}
