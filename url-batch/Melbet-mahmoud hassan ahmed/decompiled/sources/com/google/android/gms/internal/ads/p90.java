package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p90 extends s3.a {
    public static final Parcelable.Creator<p90> CREATOR = new q90();

    /* renamed from: f, reason: collision with root package name */
    public final String f10124f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f10125g;

    public p90(String str, Bundle bundle) {
        this.f10124f = str;
        this.f10125g = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.m(parcel, 1, this.f10124f, false);
        s3.c.d(parcel, 2, this.f10125g, false);
        s3.c.b(parcel, a7);
    }
}
