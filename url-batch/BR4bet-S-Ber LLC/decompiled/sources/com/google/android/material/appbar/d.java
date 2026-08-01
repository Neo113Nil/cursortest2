package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
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
