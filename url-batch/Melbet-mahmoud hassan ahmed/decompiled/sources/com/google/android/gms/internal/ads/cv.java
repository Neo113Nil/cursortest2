package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class cv extends s3.a {
    public static final Parcelable.Creator<cv> CREATOR = new dv();

    /* renamed from: f, reason: collision with root package name */
    public final int f3954f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3955g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3956h;

    /* renamed from: i, reason: collision with root package name */
    public cv f3957i;

    /* renamed from: j, reason: collision with root package name */
    public IBinder f3958j;

    public cv(int i7, String str, String str2, cv cvVar, IBinder iBinder) {
        this.f3954f = i7;
        this.f3955g = str;
        this.f3956h = str2;
        this.f3957i = cvVar;
        this.f3958j = iBinder;
    }

    public final r2.a c() {
        cv cvVar = this.f3957i;
        return new r2.a(this.f3954f, this.f3955g, this.f3956h, cvVar == null ? null : new r2.a(cvVar.f3954f, cvVar.f3955g, cvVar.f3956h));
    }

    public final r2.n g() {
        cv cvVar = this.f3957i;
        zy zyVar = null;
        r2.a aVar = cvVar == null ? null : new r2.a(cvVar.f3954f, cvVar.f3955g, cvVar.f3956h);
        int i7 = this.f3954f;
        String str = this.f3955g;
        String str2 = this.f3956h;
        IBinder iBinder = this.f3958j;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zyVar = queryLocalInterface instanceof zy ? (zy) queryLocalInterface : new xy(iBinder);
        }
        return new r2.n(i7, str, str2, aVar, r2.v.d(zyVar));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f3954f);
        s3.c.m(parcel, 2, this.f3955g, false);
        s3.c.m(parcel, 3, this.f3956h, false);
        s3.c.l(parcel, 4, this.f3957i, i7, false);
        s3.c.g(parcel, 5, this.f3958j, false);
        s3.c.b(parcel, a7);
    }
}
