package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class mq extends s3.a {
    public static final Parcelable.Creator<mq> CREATOR = new nq();

    /* renamed from: f, reason: collision with root package name */
    public final String f8673f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8674g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8675h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8676i;

    /* renamed from: j, reason: collision with root package name */
    public final String f8677j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f8678k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8679l;

    /* renamed from: m, reason: collision with root package name */
    public long f8680m;

    /* renamed from: n, reason: collision with root package name */
    public String f8681n;

    /* renamed from: o, reason: collision with root package name */
    public int f8682o;

    mq(String str, long j7, String str2, String str3, String str4, Bundle bundle, boolean z6, long j8, String str5, int i7) {
        this.f8673f = str;
        this.f8674g = j7;
        this.f8675h = str2 == null ? "" : str2;
        this.f8676i = str3 == null ? "" : str3;
        this.f8677j = str4 == null ? "" : str4;
        this.f8678k = bundle == null ? new Bundle() : bundle;
        this.f8679l = z6;
        this.f8680m = j8;
        this.f8681n = str5;
        this.f8682o = i7;
    }

    public static mq c(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                io0.g(sb.toString());
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
            return new mq(queryParameter, parseLong, host, str, str2, bundle, equals, 0L, "", 0);
        } catch (NullPointerException | NumberFormatException e7) {
            io0.h("Unable to parse Uri into cache offering.", e7);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.m(parcel, 2, this.f8673f, false);
        s3.c.k(parcel, 3, this.f8674g);
        s3.c.m(parcel, 4, this.f8675h, false);
        s3.c.m(parcel, 5, this.f8676i, false);
        s3.c.m(parcel, 6, this.f8677j, false);
        s3.c.d(parcel, 7, this.f8678k, false);
        s3.c.c(parcel, 8, this.f8679l);
        s3.c.k(parcel, 9, this.f8680m);
        s3.c.m(parcel, 10, this.f8681n, false);
        s3.c.h(parcel, 11, this.f8682o);
        s3.c.b(parcel, a7);
    }
}
