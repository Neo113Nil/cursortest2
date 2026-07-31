package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class u42 extends g12 {
    public static final Parcelable.Creator<u42> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f32836b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32837c;

    final class a implements Parcelable.Creator<u42> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final u42 createFromParcel(Parcel parcel) {
            return new u42(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final u42[] newArray(int i4) {
            return new u42[i4];
        }
    }

    static u42 a(sf1 sf1Var, long j4, e52 e52Var) {
        long a4 = a(j4, sf1Var);
        return new u42(a4, e52Var.b(a4));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f32836b);
        parcel.writeLong(this.f32837c);
    }

    private u42(long j4, long j5) {
        this.f32836b = j4;
        this.f32837c = j5;
    }

    static long a(long j4, sf1 sf1Var) {
        long t4 = sf1Var.t();
        if ((128 & t4) != 0) {
            return 8589934591L & ((((t4 & 1) << 32) | sf1Var.v()) + j4);
        }
        return -9223372036854775807L;
    }
}
