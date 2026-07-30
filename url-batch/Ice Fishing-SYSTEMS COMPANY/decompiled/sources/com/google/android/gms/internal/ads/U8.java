package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class U8 extends P2.a {
    public static final Parcelable.Creator<U8> CREATOR = new S8(1);

    /* renamed from: A, reason: collision with root package name */
    public long f27931A;

    /* renamed from: B, reason: collision with root package name */
    public String f27932B;

    /* renamed from: C, reason: collision with root package name */
    public int f27933C;

    /* renamed from: n, reason: collision with root package name */
    public final String f27934n;

    /* renamed from: u, reason: collision with root package name */
    public final long f27935u;

    /* renamed from: v, reason: collision with root package name */
    public final String f27936v;

    /* renamed from: w, reason: collision with root package name */
    public final String f27937w;

    /* renamed from: x, reason: collision with root package name */
    public final String f27938x;

    /* renamed from: y, reason: collision with root package name */
    public final Bundle f27939y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f27940z;

    public U8(String str, long j9, String str2, String str3, String str4, Bundle bundle, boolean z8, long j10, String str5, int i) {
        this.f27934n = str;
        this.f27935u = j9;
        this.f27936v = str2 == null ? "" : str2;
        this.f27937w = str3 == null ? "" : str3;
        this.f27938x = str4 == null ? "" : str4;
        this.f27939y = bundle == null ? new Bundle() : bundle;
        this.f27940z = z8;
        this.f27931A = j10;
        this.f27932B = str5;
        this.f27933C = i;
    }

    public static U8 a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 51);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                String sb2 = sb.toString();
                int i = t2.C.f40822b;
                u2.i.f(sb2);
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new U8(queryParameter, parseLong, host, str, str2, bundle, equals, 0L, "", 0);
        } catch (NullPointerException e6) {
            e = e6;
            int i4 = t2.C.f40822b;
            u2.i.g("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e9) {
            e = e9;
            int i42 = t2.C.f40822b;
            u2.i.g("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.u(parcel, 2, this.f27934n);
        S0.f.A(parcel, 3, 8);
        parcel.writeLong(this.f27935u);
        S0.f.u(parcel, 4, this.f27936v);
        S0.f.u(parcel, 5, this.f27937w);
        S0.f.u(parcel, 6, this.f27938x);
        S0.f.q(parcel, 7, this.f27939y);
        S0.f.A(parcel, 8, 4);
        parcel.writeInt(this.f27940z ? 1 : 0);
        long j9 = this.f27931A;
        S0.f.A(parcel, 9, 8);
        parcel.writeLong(j9);
        S0.f.u(parcel, 10, this.f27932B);
        int i4 = this.f27933C;
        S0.f.A(parcel, 11, 4);
        parcel.writeInt(i4);
        S0.f.C(parcel, B8);
    }
}
