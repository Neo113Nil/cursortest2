package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class vv extends s3.a {
    public static final Parcelable.Creator<vv> CREATOR = new wv();

    /* renamed from: f, reason: collision with root package name */
    public final int f13509f;

    public vv(int i7) {
        this.f13509f = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 2, this.f13509f);
        s3.c.b(parcel, a7);
    }
}
