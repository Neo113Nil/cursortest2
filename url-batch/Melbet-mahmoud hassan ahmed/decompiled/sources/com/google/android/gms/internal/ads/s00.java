package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class s00 extends s3.a {
    public static final Parcelable.Creator<s00> CREATOR = new t00();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11592f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11593g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11594h;

    public s00(r2.x xVar) {
        this(xVar.c(), xVar.b(), xVar.a());
    }

    public s00(boolean z6, boolean z7, boolean z8) {
        this.f11592f = z6;
        this.f11593g = z7;
        this.f11594h = z8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.c(parcel, 2, this.f11592f);
        s3.c.c(parcel, 3, this.f11593g);
        s3.c.c(parcel, 4, this.f11594h);
        s3.c.b(parcel, a7);
    }
}
