package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class d extends f {
    public static final Parcelable.Creator<d> CREATOR = new c();
    public boolean h;
    public boolean i;
    public int j;
    public float k;
    public boolean l;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.h = parcel.readByte() != 0;
        this.i = parcel.readByte() != 0;
        this.j = parcel.readInt();
        this.k = parcel.readFloat();
        this.l = parcel.readByte() != 0;
    }

    @Override // defpackage.f, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.j);
        parcel.writeFloat(this.k);
        parcel.writeByte(this.l ? (byte) 1 : (byte) 0);
    }
}
