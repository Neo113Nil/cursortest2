package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class pv extends s3.a {
    public static final Parcelable.Creator<pv> CREATOR = new qv();

    /* renamed from: f, reason: collision with root package name */
    public final String f10376f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10377g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10378h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10379i;

    /* renamed from: j, reason: collision with root package name */
    public final int f10380j;

    /* renamed from: k, reason: collision with root package name */
    public final int f10381k;

    /* renamed from: l, reason: collision with root package name */
    public final pv[] f10382l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f10383m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f10384n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10385o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10386p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10387q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10388r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10389s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10390t;

    public pv() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public pv(Context context, r2.h hVar) {
        this(context, new r2.h[]{hVar});
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pv(Context context, r2.h[] hVarArr) {
        int b7;
        int i7;
        String sb;
        int i8;
        double d7;
        double d8;
        int intValue;
        int intValue2;
        r2.h hVar = hVarArr[0];
        this.f10379i = false;
        boolean l7 = hVar.l();
        this.f10384n = l7;
        this.f10388r = r2.y.f(hVar);
        this.f10389s = r2.y.g(hVar);
        boolean h7 = r2.y.h(hVar);
        this.f10390t = h7;
        if (l7) {
            r2.h hVar2 = r2.h.f21142i;
            this.f10380j = hVar2.j();
            b7 = hVar2.c();
        } else if (this.f10389s) {
            this.f10380j = hVar.j();
            b7 = r2.y.a(hVar);
        } else {
            this.f10380j = hVar.j();
            b7 = h7 ? r2.y.b(hVar) : hVar.c();
        }
        this.f10377g = b7;
        int i9 = this.f10380j;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (i9 == -1) {
            qw.b();
            if (context.getResources().getConfiguration().orientation == 2) {
                if (((int) (r6.heightPixels / context.getResources().getDisplayMetrics().density)) < 600) {
                    qw.b();
                    DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        if (v3.l.c()) {
                            defaultDisplay.getRealMetrics(displayMetrics2);
                            intValue = displayMetrics2.heightPixels;
                            intValue2 = displayMetrics2.widthPixels;
                        } else {
                            try {
                                Integer num = (Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0]);
                                Integer num2 = (Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0]);
                                intValue = num == null ? 0 : num.intValue();
                                intValue2 = num2 == null ? 0 : num2.intValue();
                            } catch (Exception unused) {
                            }
                        }
                        defaultDisplay.getMetrics(displayMetrics2);
                        int i10 = displayMetrics2.heightPixels;
                        int i11 = displayMetrics2.widthPixels;
                        if (i10 == intValue && i11 == intValue2) {
                            int i12 = displayMetrics.widthPixels;
                            qw.b();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            i8 = i12 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.f10381k = i8;
                            d7 = i8 / displayMetrics.density;
                            i7 = (int) d7;
                            d8 = i7;
                            Double.isNaN(d7);
                            Double.isNaN(d8);
                            if (d7 - d8 >= 0.01d) {
                                i7++;
                            }
                        }
                    }
                }
            }
            i8 = displayMetrics.widthPixels;
            this.f10381k = i8;
            d7 = i8 / displayMetrics.density;
            i7 = (int) d7;
            d8 = i7;
            Double.isNaN(d7);
            Double.isNaN(d8);
            if (d7 - d8 >= 0.01d) {
            }
        } else {
            i7 = this.f10380j;
            qw.b();
            this.f10381k = bo0.k(displayMetrics, this.f10380j);
        }
        int k7 = b7 == -2 ? k(displayMetrics) : this.f10377g;
        qw.b();
        this.f10378h = bo0.k(displayMetrics, k7);
        if (i9 == -1 || b7 == -2) {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append(i7);
            sb2.append("x");
            sb2.append(k7);
            sb2.append("_as");
            sb = sb2.toString();
        } else if (this.f10389s || this.f10390t) {
            int i13 = this.f10380j;
            int i14 = this.f10377g;
            StringBuilder sb3 = new StringBuilder(26);
            sb3.append(i13);
            sb3.append("x");
            sb3.append(i14);
            sb3.append("_as");
            sb = sb3.toString();
        } else {
            sb = this.f10384n ? "320x50_mb" : hVar.toString();
        }
        this.f10376f = sb;
        int length = hVarArr.length;
        if (length > 1) {
            this.f10382l = new pv[length];
            for (int i15 = 0; i15 < hVarArr.length; i15++) {
                this.f10382l[i15] = new pv(context, hVarArr[i15]);
            }
        } else {
            this.f10382l = null;
        }
        this.f10383m = false;
        this.f10385o = false;
    }

    pv(String str, int i7, int i8, boolean z6, int i9, int i10, pv[] pvVarArr, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f10376f = str;
        this.f10377g = i7;
        this.f10378h = i8;
        this.f10379i = z6;
        this.f10380j = i9;
        this.f10381k = i10;
        this.f10382l = pvVarArr;
        this.f10383m = z7;
        this.f10384n = z8;
        this.f10385o = z9;
        this.f10386p = z10;
        this.f10387q = z11;
        this.f10388r = z12;
        this.f10389s = z13;
        this.f10390t = z14;
    }

    public static int c(DisplayMetrics displayMetrics) {
        return (int) (k(displayMetrics) * displayMetrics.density);
    }

    public static pv g() {
        return new pv("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static pv h() {
        return new pv("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static pv i() {
        return new pv("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static pv j() {
        return new pv("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    private static int k(DisplayMetrics displayMetrics) {
        int i7 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i7 <= 400) {
            return 32;
        }
        return i7 <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.m(parcel, 2, this.f10376f, false);
        s3.c.h(parcel, 3, this.f10377g);
        s3.c.h(parcel, 4, this.f10378h);
        s3.c.c(parcel, 5, this.f10379i);
        s3.c.h(parcel, 6, this.f10380j);
        s3.c.h(parcel, 7, this.f10381k);
        s3.c.p(parcel, 8, this.f10382l, i7, false);
        s3.c.c(parcel, 9, this.f10383m);
        s3.c.c(parcel, 10, this.f10384n);
        s3.c.c(parcel, 11, this.f10385o);
        s3.c.c(parcel, 12, this.f10386p);
        s3.c.c(parcel, 13, this.f10387q);
        s3.c.c(parcel, 14, this.f10388r);
        s3.c.c(parcel, 15, this.f10389s);
        s3.c.c(parcel, 16, this.f10390t);
        s3.c.b(parcel, a7);
    }
}
