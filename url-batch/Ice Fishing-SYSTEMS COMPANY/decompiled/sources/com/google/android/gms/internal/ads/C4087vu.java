package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.vu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4087vu extends P2.a {
    public static final Parcelable.Creator<C4087vu> CREATOR = new S8(19);

    /* renamed from: A, reason: collision with root package name */
    public final int f34887A;

    /* renamed from: B, reason: collision with root package name */
    public final int f34888B;

    /* renamed from: C, reason: collision with root package name */
    public final int f34889C;

    /* renamed from: n, reason: collision with root package name */
    public final Context f34890n;

    /* renamed from: u, reason: collision with root package name */
    public final int f34891u;

    /* renamed from: v, reason: collision with root package name */
    public final EnumC3979tu f34892v;

    /* renamed from: w, reason: collision with root package name */
    public final int f34893w;

    /* renamed from: x, reason: collision with root package name */
    public final int f34894x;

    /* renamed from: y, reason: collision with root package name */
    public final int f34895y;

    /* renamed from: z, reason: collision with root package name */
    public final String f34896z;

    public C4087vu(int i, int i4, int i9, int i10, String str, int i11, int i12) {
        EnumC3979tu[] values = EnumC3979tu.values();
        this.f34890n = null;
        this.f34891u = i;
        this.f34892v = values[i];
        this.f34893w = i4;
        this.f34894x = i9;
        this.f34895y = i10;
        this.f34896z = str;
        this.f34887A = i11;
        this.f34889C = new int[]{1, 2, 3}[i11];
        this.f34888B = i12;
        int i13 = new int[]{1}[i12];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f34891u);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f34893w);
        S0.f.A(parcel, 3, 4);
        parcel.writeInt(this.f34894x);
        S0.f.A(parcel, 4, 4);
        parcel.writeInt(this.f34895y);
        S0.f.u(parcel, 5, this.f34896z);
        S0.f.A(parcel, 6, 4);
        parcel.writeInt(this.f34887A);
        S0.f.A(parcel, 7, 4);
        parcel.writeInt(this.f34888B);
        S0.f.C(parcel, B8);
    }

    public C4087vu(Context context, EnumC3979tu enumC3979tu, int i, int i4, int i9, String str, String str2) {
        EnumC3979tu.values();
        this.f34890n = context;
        this.f34891u = enumC3979tu.ordinal();
        this.f34892v = enumC3979tu;
        this.f34893w = i;
        this.f34894x = i4;
        this.f34895y = i9;
        this.f34896z = str;
        int i10 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.f34889C = i10;
        this.f34887A = i10 - 1;
        this.f34888B = 0;
    }
}
