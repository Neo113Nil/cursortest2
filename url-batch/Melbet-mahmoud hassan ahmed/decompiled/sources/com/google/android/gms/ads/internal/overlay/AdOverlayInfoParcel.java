package com.google.android.gms.ads.internal.overlay;

import a3.x0;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.eu0;
import com.google.android.gms.internal.ads.jb1;
import com.google.android.gms.internal.ads.o42;
import com.google.android.gms.internal.ads.pi1;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.s60;
import com.google.android.gms.internal.ads.u60;
import com.google.android.gms.internal.ads.wv1;
import com.google.android.gms.internal.ads.xw2;
import com.google.android.gms.internal.ads.yu;
import s3.c;
import x3.a;
import x3.b;
import y2.j;
import z2.f;
import z2.q;
import z2.y;

/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends s3.a implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new a();

    @RecentlyNonNull
    public final String A;

    @RecentlyNonNull
    public final String B;
    public final jb1 C;
    public final pi1 D;

    /* renamed from: f, reason: collision with root package name */
    public final f f2409f;

    /* renamed from: g, reason: collision with root package name */
    public final yu f2410g;

    /* renamed from: h, reason: collision with root package name */
    public final q f2411h;

    /* renamed from: i, reason: collision with root package name */
    public final eu0 f2412i;

    /* renamed from: j, reason: collision with root package name */
    public final u60 f2413j;

    /* renamed from: k, reason: collision with root package name */
    @RecentlyNonNull
    public final String f2414k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2415l;

    /* renamed from: m, reason: collision with root package name */
    @RecentlyNonNull
    public final String f2416m;

    /* renamed from: n, reason: collision with root package name */
    public final y f2417n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2418o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2419p;

    /* renamed from: q, reason: collision with root package name */
    @RecentlyNonNull
    public final String f2420q;

    /* renamed from: r, reason: collision with root package name */
    public final po0 f2421r;

    /* renamed from: s, reason: collision with root package name */
    @RecentlyNonNull
    public final String f2422s;

    /* renamed from: t, reason: collision with root package name */
    public final j f2423t;

    /* renamed from: u, reason: collision with root package name */
    public final s60 f2424u;

    /* renamed from: v, reason: collision with root package name */
    @RecentlyNonNull
    public final String f2425v;

    /* renamed from: w, reason: collision with root package name */
    public final o42 f2426w;

    /* renamed from: x, reason: collision with root package name */
    public final wv1 f2427x;

    /* renamed from: y, reason: collision with root package name */
    public final xw2 f2428y;

    /* renamed from: z, reason: collision with root package name */
    public final x0 f2429z;

    public AdOverlayInfoParcel(eu0 eu0Var, po0 po0Var, x0 x0Var, o42 o42Var, wv1 wv1Var, xw2 xw2Var, String str, String str2, int i7) {
        this.f2409f = null;
        this.f2410g = null;
        this.f2411h = null;
        this.f2412i = eu0Var;
        this.f2424u = null;
        this.f2413j = null;
        this.f2414k = null;
        this.f2415l = false;
        this.f2416m = null;
        this.f2417n = null;
        this.f2418o = i7;
        this.f2419p = 5;
        this.f2420q = null;
        this.f2421r = po0Var;
        this.f2422s = null;
        this.f2423t = null;
        this.f2425v = str;
        this.A = str2;
        this.f2426w = o42Var;
        this.f2427x = wv1Var;
        this.f2428y = xw2Var;
        this.f2429z = x0Var;
        this.B = null;
        this.C = null;
        this.D = null;
    }

    public AdOverlayInfoParcel(yu yuVar, q qVar, s60 s60Var, u60 u60Var, y yVar, eu0 eu0Var, boolean z6, int i7, String str, po0 po0Var, pi1 pi1Var) {
        this.f2409f = null;
        this.f2410g = yuVar;
        this.f2411h = qVar;
        this.f2412i = eu0Var;
        this.f2424u = s60Var;
        this.f2413j = u60Var;
        this.f2414k = null;
        this.f2415l = z6;
        this.f2416m = null;
        this.f2417n = yVar;
        this.f2418o = i7;
        this.f2419p = 3;
        this.f2420q = str;
        this.f2421r = po0Var;
        this.f2422s = null;
        this.f2423t = null;
        this.f2425v = null;
        this.A = null;
        this.f2426w = null;
        this.f2427x = null;
        this.f2428y = null;
        this.f2429z = null;
        this.B = null;
        this.C = null;
        this.D = pi1Var;
    }

    public AdOverlayInfoParcel(yu yuVar, q qVar, s60 s60Var, u60 u60Var, y yVar, eu0 eu0Var, boolean z6, int i7, String str, String str2, po0 po0Var, pi1 pi1Var) {
        this.f2409f = null;
        this.f2410g = yuVar;
        this.f2411h = qVar;
        this.f2412i = eu0Var;
        this.f2424u = s60Var;
        this.f2413j = u60Var;
        this.f2414k = str2;
        this.f2415l = z6;
        this.f2416m = str;
        this.f2417n = yVar;
        this.f2418o = i7;
        this.f2419p = 3;
        this.f2420q = null;
        this.f2421r = po0Var;
        this.f2422s = null;
        this.f2423t = null;
        this.f2425v = null;
        this.A = null;
        this.f2426w = null;
        this.f2427x = null;
        this.f2428y = null;
        this.f2429z = null;
        this.B = null;
        this.C = null;
        this.D = pi1Var;
    }

    public AdOverlayInfoParcel(yu yuVar, q qVar, y yVar, eu0 eu0Var, int i7, po0 po0Var, String str, j jVar, String str2, String str3, String str4, jb1 jb1Var) {
        this.f2409f = null;
        this.f2410g = null;
        this.f2411h = qVar;
        this.f2412i = eu0Var;
        this.f2424u = null;
        this.f2413j = null;
        this.f2414k = str2;
        this.f2415l = false;
        this.f2416m = str3;
        this.f2417n = null;
        this.f2418o = i7;
        this.f2419p = 1;
        this.f2420q = null;
        this.f2421r = po0Var;
        this.f2422s = str;
        this.f2423t = jVar;
        this.f2425v = null;
        this.A = null;
        this.f2426w = null;
        this.f2427x = null;
        this.f2428y = null;
        this.f2429z = null;
        this.B = str4;
        this.C = jb1Var;
        this.D = null;
    }

    public AdOverlayInfoParcel(yu yuVar, q qVar, y yVar, eu0 eu0Var, boolean z6, int i7, po0 po0Var, pi1 pi1Var) {
        this.f2409f = null;
        this.f2410g = yuVar;
        this.f2411h = qVar;
        this.f2412i = eu0Var;
        this.f2424u = null;
        this.f2413j = null;
        this.f2414k = null;
        this.f2415l = z6;
        this.f2416m = null;
        this.f2417n = yVar;
        this.f2418o = i7;
        this.f2419p = 2;
        this.f2420q = null;
        this.f2421r = po0Var;
        this.f2422s = null;
        this.f2423t = null;
        this.f2425v = null;
        this.A = null;
        this.f2426w = null;
        this.f2427x = null;
        this.f2428y = null;
        this.f2429z = null;
        this.B = null;
        this.C = null;
        this.D = pi1Var;
    }

    AdOverlayInfoParcel(f fVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z6, String str2, IBinder iBinder5, int i7, int i8, String str3, po0 po0Var, String str4, j jVar, IBinder iBinder6, String str5, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, IBinder iBinder10, String str6, String str7, IBinder iBinder11, IBinder iBinder12) {
        this.f2409f = fVar;
        this.f2410g = (yu) b.O0(a.AbstractBinderC0153a.q0(iBinder));
        this.f2411h = (q) b.O0(a.AbstractBinderC0153a.q0(iBinder2));
        this.f2412i = (eu0) b.O0(a.AbstractBinderC0153a.q0(iBinder3));
        this.f2424u = (s60) b.O0(a.AbstractBinderC0153a.q0(iBinder6));
        this.f2413j = (u60) b.O0(a.AbstractBinderC0153a.q0(iBinder4));
        this.f2414k = str;
        this.f2415l = z6;
        this.f2416m = str2;
        this.f2417n = (y) b.O0(a.AbstractBinderC0153a.q0(iBinder5));
        this.f2418o = i7;
        this.f2419p = i8;
        this.f2420q = str3;
        this.f2421r = po0Var;
        this.f2422s = str4;
        this.f2423t = jVar;
        this.f2425v = str5;
        this.A = str6;
        this.f2426w = (o42) b.O0(a.AbstractBinderC0153a.q0(iBinder7));
        this.f2427x = (wv1) b.O0(a.AbstractBinderC0153a.q0(iBinder8));
        this.f2428y = (xw2) b.O0(a.AbstractBinderC0153a.q0(iBinder9));
        this.f2429z = (x0) b.O0(a.AbstractBinderC0153a.q0(iBinder10));
        this.B = str7;
        this.C = (jb1) b.O0(a.AbstractBinderC0153a.q0(iBinder11));
        this.D = (pi1) b.O0(a.AbstractBinderC0153a.q0(iBinder12));
    }

    public AdOverlayInfoParcel(f fVar, yu yuVar, q qVar, y yVar, po0 po0Var, eu0 eu0Var, pi1 pi1Var) {
        this.f2409f = fVar;
        this.f2410g = yuVar;
        this.f2411h = qVar;
        this.f2412i = eu0Var;
        this.f2424u = null;
        this.f2413j = null;
        this.f2414k = null;
        this.f2415l = false;
        this.f2416m = null;
        this.f2417n = yVar;
        this.f2418o = -1;
        this.f2419p = 4;
        this.f2420q = null;
        this.f2421r = po0Var;
        this.f2422s = null;
        this.f2423t = null;
        this.f2425v = null;
        this.A = null;
        this.f2426w = null;
        this.f2427x = null;
        this.f2428y = null;
        this.f2429z = null;
        this.B = null;
        this.C = null;
        this.D = pi1Var;
    }

    public AdOverlayInfoParcel(q qVar, eu0 eu0Var, int i7, po0 po0Var) {
        this.f2411h = qVar;
        this.f2412i = eu0Var;
        this.f2418o = 1;
        this.f2421r = po0Var;
        this.f2409f = null;
        this.f2410g = null;
        this.f2424u = null;
        this.f2413j = null;
        this.f2414k = null;
        this.f2415l = false;
        this.f2416m = null;
        this.f2417n = null;
        this.f2419p = 1;
        this.f2420q = null;
        this.f2422s = null;
        this.f2423t = null;
        this.f2425v = null;
        this.A = null;
        this.f2426w = null;
        this.f2427x = null;
        this.f2428y = null;
        this.f2429z = null;
        this.B = null;
        this.C = null;
        this.D = null;
    }

    @RecentlyNonNull
    public static AdOverlayInfoParcel c(@RecentlyNonNull Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i7) {
        int a7 = c.a(parcel);
        c.l(parcel, 2, this.f2409f, i7, false);
        c.g(parcel, 3, b.B3(this.f2410g).asBinder(), false);
        c.g(parcel, 4, b.B3(this.f2411h).asBinder(), false);
        c.g(parcel, 5, b.B3(this.f2412i).asBinder(), false);
        c.g(parcel, 6, b.B3(this.f2413j).asBinder(), false);
        c.m(parcel, 7, this.f2414k, false);
        c.c(parcel, 8, this.f2415l);
        c.m(parcel, 9, this.f2416m, false);
        c.g(parcel, 10, b.B3(this.f2417n).asBinder(), false);
        c.h(parcel, 11, this.f2418o);
        c.h(parcel, 12, this.f2419p);
        c.m(parcel, 13, this.f2420q, false);
        c.l(parcel, 14, this.f2421r, i7, false);
        c.m(parcel, 16, this.f2422s, false);
        c.l(parcel, 17, this.f2423t, i7, false);
        c.g(parcel, 18, b.B3(this.f2424u).asBinder(), false);
        c.m(parcel, 19, this.f2425v, false);
        c.g(parcel, 20, b.B3(this.f2426w).asBinder(), false);
        c.g(parcel, 21, b.B3(this.f2427x).asBinder(), false);
        c.g(parcel, 22, b.B3(this.f2428y).asBinder(), false);
        c.g(parcel, 23, b.B3(this.f2429z).asBinder(), false);
        c.m(parcel, 24, this.A, false);
        c.m(parcel, 25, this.B, false);
        c.g(parcel, 26, b.B3(this.C).asBinder(), false);
        c.g(parcel, 27, b.B3(this.D).asBinder(), false);
        c.b(parcel, a7);
    }
}
