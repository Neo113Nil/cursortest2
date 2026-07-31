package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class ti2 extends si2 {
    public static final Parcelable.Creator<ti2> CREATOR = new a();

    final class a implements Parcelable.Creator<ti2> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final ti2 createFromParcel(Parcel parcel) {
            return new ti2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ti2[] newArray(int i4) {
            return new ti2[i4];
        }
    }

    ti2(Parcel parcel) {
        super(parcel);
    }

    public ti2(String str, String str2) {
        super(str, str2);
    }
}
