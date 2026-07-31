package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class hi0 extends s3.a {
    public static final Parcelable.Creator<hi0> CREATOR = new ii0();
    public final String A;
    public final List<String> B;
    public final String C;
    public final b40 D;
    public final List<String> E;
    public final long F;
    public final String G;
    public final float H;
    public final int I;
    public final int J;
    public final boolean K;
    public final String L;
    public final boolean M;
    public final String N;
    public final boolean O;
    public final int P;
    public final Bundle Q;
    public final String R;
    public final hz S;
    public final boolean T;
    public final Bundle U;
    public final String V;
    public final String W;
    public final String X;
    public final boolean Y;
    public final List<Integer> Z;

    /* renamed from: a0, reason: collision with root package name */
    public final String f6280a0;

    /* renamed from: b0, reason: collision with root package name */
    public final List<String> f6281b0;

    /* renamed from: c0, reason: collision with root package name */
    public final int f6282c0;

    /* renamed from: d0, reason: collision with root package name */
    public final boolean f6283d0;

    /* renamed from: e0, reason: collision with root package name */
    public final boolean f6284e0;

    /* renamed from: f, reason: collision with root package name */
    public final int f6285f;

    /* renamed from: f0, reason: collision with root package name */
    public final boolean f6286f0;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f6287g;

    /* renamed from: g0, reason: collision with root package name */
    public final ArrayList<String> f6288g0;

    /* renamed from: h, reason: collision with root package name */
    public final kv f6289h;

    /* renamed from: h0, reason: collision with root package name */
    public final String f6290h0;

    /* renamed from: i, reason: collision with root package name */
    public final pv f6291i;

    /* renamed from: i0, reason: collision with root package name */
    public final r90 f6292i0;

    /* renamed from: j, reason: collision with root package name */
    public final String f6293j;

    /* renamed from: j0, reason: collision with root package name */
    public final String f6294j0;

    /* renamed from: k, reason: collision with root package name */
    public final ApplicationInfo f6295k;

    /* renamed from: k0, reason: collision with root package name */
    public final Bundle f6296k0;

    /* renamed from: l, reason: collision with root package name */
    public final PackageInfo f6297l;

    /* renamed from: m, reason: collision with root package name */
    public final String f6298m;

    /* renamed from: n, reason: collision with root package name */
    public final String f6299n;

    /* renamed from: o, reason: collision with root package name */
    public final String f6300o;

    /* renamed from: p, reason: collision with root package name */
    public final po0 f6301p;

    /* renamed from: q, reason: collision with root package name */
    public final Bundle f6302q;

    /* renamed from: r, reason: collision with root package name */
    public final int f6303r;

    /* renamed from: s, reason: collision with root package name */
    public final List<String> f6304s;

    /* renamed from: t, reason: collision with root package name */
    public final Bundle f6305t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f6306u;

    /* renamed from: v, reason: collision with root package name */
    public final int f6307v;

    /* renamed from: w, reason: collision with root package name */
    public final int f6308w;

    /* renamed from: x, reason: collision with root package name */
    public final float f6309x;

    /* renamed from: y, reason: collision with root package name */
    public final String f6310y;

    /* renamed from: z, reason: collision with root package name */
    public final long f6311z;

    hi0(int i7, Bundle bundle, kv kvVar, pv pvVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, po0 po0Var, Bundle bundle2, int i8, List<String> list, Bundle bundle3, boolean z6, int i9, int i10, float f7, String str5, long j7, String str6, List<String> list2, String str7, b40 b40Var, List<String> list3, long j8, String str8, float f8, boolean z7, int i11, int i12, boolean z8, String str9, String str10, boolean z9, int i13, Bundle bundle4, String str11, hz hzVar, boolean z10, Bundle bundle5, String str12, String str13, String str14, boolean z11, List<Integer> list4, String str15, List<String> list5, int i14, boolean z12, boolean z13, boolean z14, ArrayList<String> arrayList, String str16, r90 r90Var, String str17, Bundle bundle6) {
        this.f6285f = i7;
        this.f6287g = bundle;
        this.f6289h = kvVar;
        this.f6291i = pvVar;
        this.f6293j = str;
        this.f6295k = applicationInfo;
        this.f6297l = packageInfo;
        this.f6298m = str2;
        this.f6299n = str3;
        this.f6300o = str4;
        this.f6301p = po0Var;
        this.f6302q = bundle2;
        this.f6303r = i8;
        this.f6304s = list;
        this.E = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.f6305t = bundle3;
        this.f6306u = z6;
        this.f6307v = i9;
        this.f6308w = i10;
        this.f6309x = f7;
        this.f6310y = str5;
        this.f6311z = j7;
        this.A = str6;
        this.B = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.C = str7;
        this.D = b40Var;
        this.F = j8;
        this.G = str8;
        this.H = f8;
        this.M = z7;
        this.I = i11;
        this.J = i12;
        this.K = z8;
        this.L = str9;
        this.N = str10;
        this.O = z9;
        this.P = i13;
        this.Q = bundle4;
        this.R = str11;
        this.S = hzVar;
        this.T = z10;
        this.U = bundle5;
        this.V = str12;
        this.W = str13;
        this.X = str14;
        this.Y = z11;
        this.Z = list4;
        this.f6280a0 = str15;
        this.f6281b0 = list5;
        this.f6282c0 = i14;
        this.f6283d0 = z12;
        this.f6284e0 = z13;
        this.f6286f0 = z14;
        this.f6288g0 = arrayList;
        this.f6290h0 = str16;
        this.f6292i0 = r90Var;
        this.f6294j0 = str17;
        this.f6296k0 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f6285f);
        s3.c.d(parcel, 2, this.f6287g, false);
        s3.c.l(parcel, 3, this.f6289h, i7, false);
        s3.c.l(parcel, 4, this.f6291i, i7, false);
        s3.c.m(parcel, 5, this.f6293j, false);
        s3.c.l(parcel, 6, this.f6295k, i7, false);
        s3.c.l(parcel, 7, this.f6297l, i7, false);
        s3.c.m(parcel, 8, this.f6298m, false);
        s3.c.m(parcel, 9, this.f6299n, false);
        s3.c.m(parcel, 10, this.f6300o, false);
        s3.c.l(parcel, 11, this.f6301p, i7, false);
        s3.c.d(parcel, 12, this.f6302q, false);
        s3.c.h(parcel, 13, this.f6303r);
        s3.c.o(parcel, 14, this.f6304s, false);
        s3.c.d(parcel, 15, this.f6305t, false);
        s3.c.c(parcel, 16, this.f6306u);
        s3.c.h(parcel, 18, this.f6307v);
        s3.c.h(parcel, 19, this.f6308w);
        s3.c.f(parcel, 20, this.f6309x);
        s3.c.m(parcel, 21, this.f6310y, false);
        s3.c.k(parcel, 25, this.f6311z);
        s3.c.m(parcel, 26, this.A, false);
        s3.c.o(parcel, 27, this.B, false);
        s3.c.m(parcel, 28, this.C, false);
        s3.c.l(parcel, 29, this.D, i7, false);
        s3.c.o(parcel, 30, this.E, false);
        s3.c.k(parcel, 31, this.F);
        s3.c.m(parcel, 33, this.G, false);
        s3.c.f(parcel, 34, this.H);
        s3.c.h(parcel, 35, this.I);
        s3.c.h(parcel, 36, this.J);
        s3.c.c(parcel, 37, this.K);
        s3.c.m(parcel, 39, this.L, false);
        s3.c.c(parcel, 40, this.M);
        s3.c.m(parcel, 41, this.N, false);
        s3.c.c(parcel, 42, this.O);
        s3.c.h(parcel, 43, this.P);
        s3.c.d(parcel, 44, this.Q, false);
        s3.c.m(parcel, 45, this.R, false);
        s3.c.l(parcel, 46, this.S, i7, false);
        s3.c.c(parcel, 47, this.T);
        s3.c.d(parcel, 48, this.U, false);
        s3.c.m(parcel, 49, this.V, false);
        s3.c.m(parcel, 50, this.W, false);
        s3.c.m(parcel, 51, this.X, false);
        s3.c.c(parcel, 52, this.Y);
        s3.c.j(parcel, 53, this.Z, false);
        s3.c.m(parcel, 54, this.f6280a0, false);
        s3.c.o(parcel, 55, this.f6281b0, false);
        s3.c.h(parcel, 56, this.f6282c0);
        s3.c.c(parcel, 57, this.f6283d0);
        s3.c.c(parcel, 58, this.f6284e0);
        s3.c.c(parcel, 59, this.f6286f0);
        s3.c.o(parcel, 60, this.f6288g0, false);
        s3.c.m(parcel, 61, this.f6290h0, false);
        s3.c.l(parcel, 63, this.f6292i0, i7, false);
        s3.c.m(parcel, 64, this.f6294j0, false);
        s3.c.d(parcel, 65, this.f6296k0, false);
        s3.c.b(parcel, a7);
    }
}
