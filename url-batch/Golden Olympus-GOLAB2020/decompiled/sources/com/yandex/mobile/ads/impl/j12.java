package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class j12 extends g12 {
    public static final Parcelable.Creator<j12> CREATOR = new a();

    final class a implements Parcelable.Creator<j12> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final j12 createFromParcel(Parcel parcel) {
            return new j12();
        }

        @Override // android.os.Parcelable.Creator
        public final j12[] newArray(int i4) {
            return new j12[i4];
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
    }
}
