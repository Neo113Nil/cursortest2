package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ag extends s6 {
    public static final Parcelable.Creator<ag> CREATOR = new zf();
    public final float f;
    public final float g;

    public ag() {
        this.f = 0.9f;
        this.g = 0.6f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.startapp.sdk.internal.s6, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.g);
    }

    public ag(Parcel parcel) {
        super(parcel);
        this.f = parcel.readFloat();
        this.g = parcel.readFloat();
    }
}
