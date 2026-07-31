package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p00 extends s3.a {
    public static final Parcelable.Creator<p00> CREATOR = new q00();

    /* renamed from: f, reason: collision with root package name */
    public final String f9964f;

    p00(String str) {
        this.f9964f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.m(parcel, 15, this.f9964f, false);
        s3.c.b(parcel, a7);
    }
}
