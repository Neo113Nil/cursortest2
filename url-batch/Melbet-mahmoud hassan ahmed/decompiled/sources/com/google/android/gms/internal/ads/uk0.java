package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class uk0 extends s3.a {
    public static final Parcelable.Creator<uk0> CREATOR = new vk0();

    /* renamed from: f, reason: collision with root package name */
    public final String f12831f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12832g;

    public uk0(i3.e eVar) {
        this(eVar.b(), eVar.a());
    }

    public uk0(String str, String str2) {
        this.f12831f = str;
        this.f12832g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.m(parcel, 1, this.f12831f, false);
        s3.c.m(parcel, 2, this.f12832g, false);
        s3.c.b(parcel, a7);
    }
}
