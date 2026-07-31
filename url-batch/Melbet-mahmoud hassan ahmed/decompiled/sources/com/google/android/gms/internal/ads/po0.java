package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class po0 extends s3.a {
    public static final Parcelable.Creator<po0> CREATOR = new qo0();

    /* renamed from: f, reason: collision with root package name */
    public String f10301f;

    /* renamed from: g, reason: collision with root package name */
    public int f10302g;

    /* renamed from: h, reason: collision with root package name */
    public int f10303h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10304i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10305j;

    public po0(int i7, int i8, boolean z6, boolean z7) {
        this(214106000, i8, true, false, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public po0(int i7, int i8, boolean z6, boolean z7, boolean z8) {
        this(r12.toString(), i7, i8, z6, false);
        String str = z6 ? "0" : "1";
        StringBuilder sb = new StringBuilder(str.length() + 36);
        sb.append("afma-sdk-a-v");
        sb.append(i7);
        sb.append(".");
        sb.append(i8);
        sb.append(".");
        sb.append(str);
    }

    po0(String str, int i7, int i8, boolean z6, boolean z7) {
        this.f10301f = str;
        this.f10302g = i7;
        this.f10303h = i8;
        this.f10304i = z6;
        this.f10305j = z7;
    }

    public static po0 c() {
        return new po0(o3.j.f19861a, o3.j.f19861a, true, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.m(parcel, 2, this.f10301f, false);
        s3.c.h(parcel, 3, this.f10302g);
        s3.c.h(parcel, 4, this.f10303h);
        s3.c.c(parcel, 5, this.f10304i);
        s3.c.c(parcel, 6, this.f10305j);
        s3.c.b(parcel, a7);
    }
}
