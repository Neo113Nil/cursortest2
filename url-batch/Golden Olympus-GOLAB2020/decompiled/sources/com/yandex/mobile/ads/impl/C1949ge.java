package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.wz0;

/* renamed from: com.yandex.mobile.ads.impl.ge, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1949ge implements wz0.b {
    public static final Parcelable.Creator<C1949ge> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f26114b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26115c;

    /* renamed from: com.yandex.mobile.ads.impl.ge$a */
    final class a implements Parcelable.Creator<C1949ge> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final C1949ge createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            return new C1949ge(parcel.readInt(), readString);
        }

        @Override // android.os.Parcelable.Creator
        public final C1949ge[] newArray(int i4) {
            return new C1949ge[i4];
        }
    }

    public C1949ge(int i4, String str) {
        this.f26114b = i4;
        this.f26115c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Ait(controlCode=" + this.f26114b + ",url=" + this.f26115c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f26115c);
        parcel.writeInt(this.f26114b);
    }
}
