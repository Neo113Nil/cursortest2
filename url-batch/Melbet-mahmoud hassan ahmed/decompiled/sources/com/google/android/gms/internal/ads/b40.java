package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import f3.d;

/* loaded from: classes.dex */
public final class b40 extends s3.a {
    public static final Parcelable.Creator<b40> CREATOR = new c40();

    /* renamed from: f, reason: collision with root package name */
    public final int f3202f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3203g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3204h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3205i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3206j;

    /* renamed from: k, reason: collision with root package name */
    public final s00 f3207k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3208l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3209m;

    public b40(int i7, boolean z6, int i8, boolean z7, int i9, s00 s00Var, boolean z8, int i10) {
        this.f3202f = i7;
        this.f3203g = z6;
        this.f3204h = i8;
        this.f3205i = z7;
        this.f3206j = i9;
        this.f3207k = s00Var;
        this.f3208l = z8;
        this.f3209m = i10;
    }

    public b40(u2.e eVar) {
        this(4, eVar.f(), eVar.b(), eVar.e(), eVar.a(), eVar.d() != null ? new s00(eVar.d()) : null, eVar.g(), eVar.c());
    }

    public static f3.d c(b40 b40Var) {
        d.a aVar = new d.a();
        if (b40Var == null) {
            return aVar.a();
        }
        int i7 = b40Var.f3202f;
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 == 4) {
                    aVar.d(b40Var.f3208l);
                    aVar.c(b40Var.f3209m);
                }
                aVar.f(b40Var.f3203g);
                aVar.e(b40Var.f3205i);
                return aVar.a();
            }
            s00 s00Var = b40Var.f3207k;
            if (s00Var != null) {
                aVar.g(new r2.x(s00Var));
            }
        }
        aVar.b(b40Var.f3206j);
        aVar.f(b40Var.f3203g);
        aVar.e(b40Var.f3205i);
        return aVar.a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f3202f);
        s3.c.c(parcel, 2, this.f3203g);
        s3.c.h(parcel, 3, this.f3204h);
        s3.c.c(parcel, 4, this.f3205i);
        s3.c.h(parcel, 5, this.f3206j);
        s3.c.l(parcel, 6, this.f3207k, i7, false);
        s3.c.c(parcel, 7, this.f3208l);
        s3.c.h(parcel, 8, this.f3209m);
        s3.c.b(parcel, a7);
    }
}
