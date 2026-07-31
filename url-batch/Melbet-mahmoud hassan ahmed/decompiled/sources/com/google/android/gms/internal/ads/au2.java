package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class au2 extends s3.a {
    public static final Parcelable.Creator<au2> CREATOR = new bu2();

    /* renamed from: f, reason: collision with root package name */
    private final xt2[] f2967f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f2968g;

    /* renamed from: h, reason: collision with root package name */
    private final int f2969h;

    /* renamed from: i, reason: collision with root package name */
    public final xt2 f2970i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2971j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2972k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2973l;

    /* renamed from: m, reason: collision with root package name */
    public final String f2974m;

    /* renamed from: n, reason: collision with root package name */
    private final int f2975n;

    /* renamed from: o, reason: collision with root package name */
    private final int f2976o;

    /* renamed from: p, reason: collision with root package name */
    private final int[] f2977p;

    /* renamed from: q, reason: collision with root package name */
    private final int[] f2978q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2979r;

    public au2(int i7, int i8, int i9, int i10, String str, int i11, int i12) {
        xt2[] values = xt2.values();
        this.f2967f = values;
        int[] a7 = yt2.a();
        this.f2977p = a7;
        int[] a8 = zt2.a();
        this.f2978q = a8;
        this.f2968g = null;
        this.f2969h = i7;
        this.f2970i = values[i7];
        this.f2971j = i8;
        this.f2972k = i9;
        this.f2973l = i10;
        this.f2974m = str;
        this.f2975n = i11;
        this.f2979r = a7[i11];
        this.f2976o = i12;
        int i13 = a8[i12];
    }

    private au2(Context context, xt2 xt2Var, int i7, int i8, int i9, String str, String str2, String str3) {
        this.f2967f = xt2.values();
        this.f2977p = yt2.a();
        this.f2978q = zt2.a();
        this.f2968g = context;
        this.f2969h = xt2Var.ordinal();
        this.f2970i = xt2Var;
        this.f2971j = i7;
        this.f2972k = i8;
        this.f2973l = i9;
        this.f2974m = str;
        int i10 = 2;
        if ("oldest".equals(str2)) {
            i10 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i10 = 3;
        }
        this.f2979r = i10;
        this.f2975n = i10 - 1;
        "onAdClosed".equals(str3);
        this.f2976o = 0;
    }

    public static au2 c(xt2 xt2Var, Context context) {
        if (xt2Var == xt2.Rewarded) {
            return new au2(context, xt2Var, ((Integer) sw.c().b(m10.O4)).intValue(), ((Integer) sw.c().b(m10.U4)).intValue(), ((Integer) sw.c().b(m10.W4)).intValue(), (String) sw.c().b(m10.Y4), (String) sw.c().b(m10.Q4), (String) sw.c().b(m10.S4));
        }
        if (xt2Var == xt2.Interstitial) {
            return new au2(context, xt2Var, ((Integer) sw.c().b(m10.P4)).intValue(), ((Integer) sw.c().b(m10.V4)).intValue(), ((Integer) sw.c().b(m10.X4)).intValue(), (String) sw.c().b(m10.Z4), (String) sw.c().b(m10.R4), (String) sw.c().b(m10.T4));
        }
        if (xt2Var != xt2.AppOpen) {
            return null;
        }
        return new au2(context, xt2Var, ((Integer) sw.c().b(m10.f8174c5)).intValue(), ((Integer) sw.c().b(m10.f8190e5)).intValue(), ((Integer) sw.c().b(m10.f8198f5)).intValue(), (String) sw.c().b(m10.f8158a5), (String) sw.c().b(m10.f8166b5), (String) sw.c().b(m10.f8182d5));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f2969h);
        s3.c.h(parcel, 2, this.f2971j);
        s3.c.h(parcel, 3, this.f2972k);
        s3.c.h(parcel, 4, this.f2973l);
        s3.c.m(parcel, 5, this.f2974m, false);
        s3.c.h(parcel, 6, this.f2975n);
        s3.c.h(parcel, 7, this.f2976o);
        s3.c.b(parcel, a7);
    }
}
