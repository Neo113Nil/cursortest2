package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Ne, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2687Ne extends P2.a {
    public static final Parcelable.Creator<C2687Ne> CREATOR = new S8(13);

    /* renamed from: A, reason: collision with root package name */
    public final String f26573A;

    /* renamed from: B, reason: collision with root package name */
    public C4087vu f26574B;

    /* renamed from: C, reason: collision with root package name */
    public String f26575C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f26576D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f26577E;

    /* renamed from: F, reason: collision with root package name */
    public final Bundle f26578F;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f26579n;

    /* renamed from: u, reason: collision with root package name */
    public final C5107a f26580u;

    /* renamed from: v, reason: collision with root package name */
    public final ApplicationInfo f26581v;

    /* renamed from: w, reason: collision with root package name */
    public final String f26582w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f26583x;

    /* renamed from: y, reason: collision with root package name */
    public final PackageInfo f26584y;

    /* renamed from: z, reason: collision with root package name */
    public final String f26585z;

    public C2687Ne(Bundle bundle, C5107a c5107a, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, String str2, String str3, C4087vu c4087vu, String str4, boolean z8, boolean z9, Bundle bundle2) {
        this.f26579n = bundle;
        this.f26580u = c5107a;
        this.f26582w = str;
        this.f26581v = applicationInfo;
        this.f26583x = arrayList;
        this.f26584y = packageInfo;
        this.f26585z = str2;
        this.f26573A = str3;
        this.f26574B = c4087vu;
        this.f26575C = str4;
        this.f26576D = z8;
        this.f26577E = z9;
        this.f26578F = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.q(parcel, 1, this.f26579n);
        S0.f.t(parcel, 2, this.f26580u, i);
        S0.f.t(parcel, 3, this.f26581v, i);
        S0.f.u(parcel, 4, this.f26582w);
        S0.f.w(parcel, 5, this.f26583x);
        S0.f.t(parcel, 6, this.f26584y, i);
        S0.f.u(parcel, 7, this.f26585z);
        S0.f.u(parcel, 9, this.f26573A);
        S0.f.t(parcel, 10, this.f26574B, i);
        S0.f.u(parcel, 11, this.f26575C);
        S0.f.A(parcel, 12, 4);
        parcel.writeInt(this.f26576D ? 1 : 0);
        S0.f.A(parcel, 13, 4);
        parcel.writeInt(this.f26577E ? 1 : 0);
        S0.f.q(parcel, 14, this.f26578F);
        S0.f.C(parcel, B8);
    }
}
