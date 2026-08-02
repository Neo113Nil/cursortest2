package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class rg extends t6 {
    public static final Parcelable.Creator<rg> CREATOR = new qg();

    /* renamed from: f, reason: collision with root package name */
    public final float f7536f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7537g;

    public rg() {
        this.f7536f = 0.9f;
        this.f7537g = 0.6f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.startapp.sdk.internal.t6, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeFloat(this.f7536f);
        parcel.writeFloat(this.f7537g);
    }

    public rg(Parcel parcel) {
        super(parcel);
        this.f7536f = parcel.readFloat();
        this.f7537g = parcel.readFloat();
    }
}
