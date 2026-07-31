package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class hz extends s3.a {
    public static final Parcelable.Creator<hz> CREATOR = new iz();

    /* renamed from: f, reason: collision with root package name */
    public final int f6465f;

    public hz(int i7) {
        this.f6465f = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 2, this.f6465f);
        s3.c.b(parcel, a7);
    }
}
