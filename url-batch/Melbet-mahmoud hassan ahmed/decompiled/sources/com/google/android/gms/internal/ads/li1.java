package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class li1 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f7985a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7986b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f7987c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, String> f7988d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public final long f7989e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7990f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7991g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7992h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7993i;

    private li1(Uri uri, long j7, int i7, byte[] bArr, Map<String, String> map, long j8, long j9, String str, int i8, Object obj) {
        long j10 = j7 + j8;
        wu1.d(j10 >= 0);
        wu1.d(j8 >= 0);
        wu1.d(j9 > 0 || j9 == -1);
        this.f7985a = uri;
        this.f7986b = 1;
        this.f7987c = null;
        this.f7988d = Collections.unmodifiableMap(new HashMap(map));
        this.f7990f = j8;
        this.f7989e = j10;
        this.f7991g = j9;
        this.f7992h = null;
        this.f7993i = i8;
    }

    @Deprecated
    public li1(Uri uri, byte[] bArr, long j7, long j8, long j9, String str, int i7) {
        this(uri, j7 - j8, 1, null, Collections.emptyMap(), j8, j9, null, i7, null);
    }

    public static String a(int i7) {
        return "GET";
    }

    public final boolean b(int i7) {
        return (this.f7993i & i7) == i7;
    }

    public final String toString() {
        String a7 = a(1);
        String valueOf = String.valueOf(this.f7985a);
        long j7 = this.f7990f;
        long j8 = this.f7991g;
        int i7 = this.f7993i;
        StringBuilder sb = new StringBuilder(a7.length() + 70 + valueOf.length() + 4);
        sb.append("DataSpec[");
        sb.append(a7);
        sb.append(" ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(j7);
        sb.append(", ");
        sb.append(j8);
        sb.append(", null, ");
        sb.append(i7);
        sb.append("]");
        return sb.toString();
    }
}
