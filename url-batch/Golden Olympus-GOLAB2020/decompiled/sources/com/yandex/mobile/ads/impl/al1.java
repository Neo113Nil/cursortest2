package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class al1 extends g12 {
    public static final Parcelable.Creator<al1> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f23354b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23355c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f23356d;

    final class a implements Parcelable.Creator<al1> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final al1 createFromParcel(Parcel parcel) {
            return new al1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final al1[] newArray(int i4) {
            return new al1[i4];
        }
    }

    static al1 a(sf1 sf1Var, int i4, long j4) {
        long v4 = sf1Var.v();
        int i5 = i4 - 4;
        byte[] bArr = new byte[i5];
        sf1Var.a(bArr, 0, i5);
        return new al1(v4, bArr, j4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f23354b);
        parcel.writeLong(this.f23355c);
        parcel.writeByteArray(this.f23356d);
    }

    private al1(long j4, byte[] bArr, long j5) {
        this.f23354b = j5;
        this.f23355c = j4;
        this.f23356d = bArr;
    }

    private al1(Parcel parcel) {
        this.f23354b = parcel.readLong();
        this.f23355c = parcel.readLong();
        this.f23356d = (byte[]) u82.a(parcel.createByteArray());
    }
}
