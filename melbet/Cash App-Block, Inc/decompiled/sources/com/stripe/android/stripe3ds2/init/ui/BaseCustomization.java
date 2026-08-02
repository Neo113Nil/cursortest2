package com.stripe.android.stripe3ds2.init.ui;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public abstract class BaseCustomization implements Customization, Parcelable {
    public final String mTextColor;
    public final String mTextFontName;
    public final int mTextFontSize;

    public BaseCustomization(Parcel parcel) {
        this.mTextFontName = parcel.readString();
        this.mTextColor = parcel.readString();
        this.mTextFontSize = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTextFontName);
        parcel.writeString(this.mTextColor);
        parcel.writeInt(this.mTextFontSize);
    }
}
