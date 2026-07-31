package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class i12 extends g12 {
    public static final Parcelable.Creator<i12> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f27053b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27054c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27055d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27056e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27057f;

    /* renamed from: g, reason: collision with root package name */
    public final long f27058g;

    /* renamed from: h, reason: collision with root package name */
    public final long f27059h;

    /* renamed from: i, reason: collision with root package name */
    public final List<b> f27060i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f27061j;

    /* renamed from: k, reason: collision with root package name */
    public final long f27062k;

    /* renamed from: l, reason: collision with root package name */
    public final int f27063l;

    /* renamed from: m, reason: collision with root package name */
    public final int f27064m;

    /* renamed from: n, reason: collision with root package name */
    public final int f27065n;

    final class a implements Parcelable.Creator<i12> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final i12 createFromParcel(Parcel parcel) {
            return new i12(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final i12[] newArray(int i4) {
            return new i12[i4];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f27066a;

        /* renamed from: b, reason: collision with root package name */
        public final long f27067b;

        /* renamed from: c, reason: collision with root package name */
        public final long f27068c;

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        private b(int i4, long j4, long j5) {
            this.f27066a = i4;
            this.f27067b = j4;
            this.f27068c = j5;
        }
    }

    static i12 a(sf1 sf1Var, long j4, e52 e52Var) {
        boolean z4;
        List list;
        long j5;
        boolean z5;
        boolean z6;
        boolean z7;
        long j6;
        int i4;
        int i5;
        int i6;
        long j7;
        boolean z8;
        boolean z9;
        long j8;
        long v4 = sf1Var.v();
        boolean z10 = (sf1Var.t() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
        List list2 = Collections.EMPTY_LIST;
        if (z10) {
            z4 = z10;
            list = list2;
            j5 = -9223372036854775807L;
            z5 = false;
            z6 = false;
            z7 = false;
            j6 = -9223372036854775807L;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            j7 = v4;
            z8 = false;
        } else {
            int t4 = sf1Var.t();
            boolean z11 = (t4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
            boolean z12 = (t4 & 64) != 0;
            boolean z13 = (t4 & 32) != 0;
            boolean z14 = (t4 & 16) != 0;
            long a4 = (!z12 || z14) ? -9223372036854775807L : u42.a(j4, sf1Var);
            if (!z12) {
                int t5 = sf1Var.t();
                ArrayList arrayList = new ArrayList(t5);
                for (int i7 = 0; i7 < t5; i7++) {
                    int t6 = sf1Var.t();
                    long a5 = !z14 ? u42.a(j4, sf1Var) : -9223372036854775807L;
                    arrayList.add(new b(t6, a5, e52Var.b(a5)));
                }
                list2 = arrayList;
            }
            if (z13) {
                long t7 = sf1Var.t();
                boolean z15 = (128 & t7) != 0;
                j8 = ((((t7 & 1) << 32) | sf1Var.v()) * 1000) / 90;
                z9 = z15;
            } else {
                z9 = false;
                j8 = -9223372036854775807L;
            }
            int z16 = sf1Var.z();
            int t8 = sf1Var.t();
            i4 = z16;
            z4 = z10;
            z5 = z14;
            z7 = z9;
            z6 = z11;
            long j9 = a4;
            i6 = sf1Var.t();
            i5 = t8;
            j5 = j9;
            list = list2;
            j7 = v4;
            z8 = z12;
            j6 = j8;
        }
        return new i12(j7, z4, z6, z8, z5, j5, e52Var.b(j5), list, z7, j6, i4, i5, i6);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f27053b);
        parcel.writeByte(this.f27054c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f27055d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f27056e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f27057f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f27058g);
        parcel.writeLong(this.f27059h);
        int size = this.f27060i.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = this.f27060i.get(i5);
            parcel.writeInt(bVar.f27066a);
            parcel.writeLong(bVar.f27067b);
            parcel.writeLong(bVar.f27068c);
        }
        parcel.writeByte(this.f27061j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f27062k);
        parcel.writeInt(this.f27063l);
        parcel.writeInt(this.f27064m);
        parcel.writeInt(this.f27065n);
    }

    private i12(long j4, boolean z4, boolean z5, boolean z6, boolean z7, long j5, long j6, List<b> list, boolean z8, long j7, int i4, int i5, int i6) {
        this.f27053b = j4;
        this.f27054c = z4;
        this.f27055d = z5;
        this.f27056e = z6;
        this.f27057f = z7;
        this.f27058g = j5;
        this.f27059h = j6;
        this.f27060i = Collections.unmodifiableList(list);
        this.f27061j = z8;
        this.f27062k = j7;
        this.f27063l = i4;
        this.f27064m = i5;
        this.f27065n = i6;
    }

    private i12(Parcel parcel) {
        this.f27053b = parcel.readLong();
        this.f27054c = parcel.readByte() == 1;
        this.f27055d = parcel.readByte() == 1;
        this.f27056e = parcel.readByte() == 1;
        this.f27057f = parcel.readByte() == 1;
        this.f27058g = parcel.readLong();
        this.f27059h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            arrayList.add(b.a(parcel));
        }
        this.f27060i = Collections.unmodifiableList(arrayList);
        this.f27061j = parcel.readByte() == 1;
        this.f27062k = parcel.readLong();
        this.f27063l = parcel.readInt();
        this.f27064m = parcel.readInt();
        this.f27065n = parcel.readInt();
    }
}
