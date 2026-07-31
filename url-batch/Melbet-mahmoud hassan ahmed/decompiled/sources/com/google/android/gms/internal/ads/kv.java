package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class kv extends s3.a {
    public static final Parcelable.Creator<kv> CREATOR = new mv();
    public final List<String> A;
    public final int B;
    public final String C;

    /* renamed from: f, reason: collision with root package name */
    public final int f7643f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public final long f7644g;

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f7645h;

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public final int f7646i;

    /* renamed from: j, reason: collision with root package name */
    public final List<String> f7647j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7648k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7649l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f7650m;

    /* renamed from: n, reason: collision with root package name */
    public final String f7651n;

    /* renamed from: o, reason: collision with root package name */
    public final p00 f7652o;

    /* renamed from: p, reason: collision with root package name */
    public final Location f7653p;

    /* renamed from: q, reason: collision with root package name */
    public final String f7654q;

    /* renamed from: r, reason: collision with root package name */
    public final Bundle f7655r;

    /* renamed from: s, reason: collision with root package name */
    public final Bundle f7656s;

    /* renamed from: t, reason: collision with root package name */
    public final List<String> f7657t;

    /* renamed from: u, reason: collision with root package name */
    public final String f7658u;

    /* renamed from: v, reason: collision with root package name */
    public final String f7659v;

    /* renamed from: w, reason: collision with root package name */
    @Deprecated
    public final boolean f7660w;

    /* renamed from: x, reason: collision with root package name */
    public final av f7661x;

    /* renamed from: y, reason: collision with root package name */
    public final int f7662y;

    /* renamed from: z, reason: collision with root package name */
    public final String f7663z;

    public kv(int i7, long j7, Bundle bundle, int i8, List<String> list, boolean z6, int i9, boolean z7, String str, p00 p00Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z8, av avVar, int i10, String str5, List<String> list3, int i11, String str6) {
        this.f7643f = i7;
        this.f7644g = j7;
        this.f7645h = bundle == null ? new Bundle() : bundle;
        this.f7646i = i8;
        this.f7647j = list;
        this.f7648k = z6;
        this.f7649l = i9;
        this.f7650m = z7;
        this.f7651n = str;
        this.f7652o = p00Var;
        this.f7653p = location;
        this.f7654q = str2;
        this.f7655r = bundle2 == null ? new Bundle() : bundle2;
        this.f7656s = bundle3;
        this.f7657t = list2;
        this.f7658u = str3;
        this.f7659v = str4;
        this.f7660w = z8;
        this.f7661x = avVar;
        this.f7662y = i10;
        this.f7663z = str5;
        this.A = list3 == null ? new ArrayList<>() : list3;
        this.B = i11;
        this.C = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kv)) {
            return false;
        }
        kv kvVar = (kv) obj;
        return this.f7643f == kvVar.f7643f && this.f7644g == kvVar.f7644g && ko0.a(this.f7645h, kvVar.f7645h) && this.f7646i == kvVar.f7646i && r3.n.a(this.f7647j, kvVar.f7647j) && this.f7648k == kvVar.f7648k && this.f7649l == kvVar.f7649l && this.f7650m == kvVar.f7650m && r3.n.a(this.f7651n, kvVar.f7651n) && r3.n.a(this.f7652o, kvVar.f7652o) && r3.n.a(this.f7653p, kvVar.f7653p) && r3.n.a(this.f7654q, kvVar.f7654q) && ko0.a(this.f7655r, kvVar.f7655r) && ko0.a(this.f7656s, kvVar.f7656s) && r3.n.a(this.f7657t, kvVar.f7657t) && r3.n.a(this.f7658u, kvVar.f7658u) && r3.n.a(this.f7659v, kvVar.f7659v) && this.f7660w == kvVar.f7660w && this.f7662y == kvVar.f7662y && r3.n.a(this.f7663z, kvVar.f7663z) && r3.n.a(this.A, kvVar.A) && this.B == kvVar.B && r3.n.a(this.C, kvVar.C);
    }

    public final int hashCode() {
        return r3.n.b(Integer.valueOf(this.f7643f), Long.valueOf(this.f7644g), this.f7645h, Integer.valueOf(this.f7646i), this.f7647j, Boolean.valueOf(this.f7648k), Integer.valueOf(this.f7649l), Boolean.valueOf(this.f7650m), this.f7651n, this.f7652o, this.f7653p, this.f7654q, this.f7655r, this.f7656s, this.f7657t, this.f7658u, this.f7659v, Boolean.valueOf(this.f7660w), Integer.valueOf(this.f7662y), this.f7663z, this.A, Integer.valueOf(this.B), this.C);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f7643f);
        s3.c.k(parcel, 2, this.f7644g);
        s3.c.d(parcel, 3, this.f7645h, false);
        s3.c.h(parcel, 4, this.f7646i);
        s3.c.o(parcel, 5, this.f7647j, false);
        s3.c.c(parcel, 6, this.f7648k);
        s3.c.h(parcel, 7, this.f7649l);
        s3.c.c(parcel, 8, this.f7650m);
        s3.c.m(parcel, 9, this.f7651n, false);
        s3.c.l(parcel, 10, this.f7652o, i7, false);
        s3.c.l(parcel, 11, this.f7653p, i7, false);
        s3.c.m(parcel, 12, this.f7654q, false);
        s3.c.d(parcel, 13, this.f7655r, false);
        s3.c.d(parcel, 14, this.f7656s, false);
        s3.c.o(parcel, 15, this.f7657t, false);
        s3.c.m(parcel, 16, this.f7658u, false);
        s3.c.m(parcel, 17, this.f7659v, false);
        s3.c.c(parcel, 18, this.f7660w);
        s3.c.l(parcel, 19, this.f7661x, i7, false);
        s3.c.h(parcel, 20, this.f7662y);
        s3.c.m(parcel, 21, this.f7663z, false);
        s3.c.o(parcel, 22, this.A, false);
        s3.c.h(parcel, 23, this.B);
        s3.c.m(parcel, 24, this.C, false);
        s3.c.b(parcel, a7);
    }
}
