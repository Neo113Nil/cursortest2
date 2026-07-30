package com.anythink.core.common.n.a;

import java.util.Locale;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final int f14997a = 60;

    /* renamed from: b, reason: collision with root package name */
    public static final int f14998b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14999c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f15000d = 28;

    /* renamed from: e, reason: collision with root package name */
    public static final int f15001e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final int f15002f = 16;

    /* renamed from: g, reason: collision with root package name */
    public final String f15003g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15004h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long f15005j;

    /* renamed from: k, reason: collision with root package name */
    public final int f15006k;

    /* renamed from: l, reason: collision with root package name */
    public final String f15007l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f15008a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f15009b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f15010c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f15011d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f15012e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f15013f = 5;
    }

    public l(String str, int i, int i4, long j9, int i9, String str2) {
        this.f15003g = str;
        this.f15004h = i;
        this.i = i4 <= 0 ? i4 == -1 ? -1 : 60 : i4;
        this.f15005j = j9;
        this.f15006k = i9;
        this.f15007l = str2;
    }

    private boolean c() {
        return this.f15004h == 5;
    }

    private boolean d() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        int i = this.i;
        return i != -1 && this.f15005j + ((long) i) <= currentTimeMillis;
    }

    public final boolean a() {
        return this.f15004h == 1;
    }

    public final boolean b() {
        return this.f15004h == 28;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof l)) {
            l lVar = (l) obj;
            if (this.f15003g.equals(lVar.f15003g) && this.f15004h == lVar.f15004h && this.i == lVar.i && this.f15005j == lVar.f15005j) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "{type:%s, value:%s, source:%s, server:%s, timestamp:%d, ttl:%d}", Integer.valueOf(this.f15004h), this.f15003g, Integer.valueOf(this.f15006k), this.f15007l, Long.valueOf(this.f15005j), Integer.valueOf(this.i));
    }

    private boolean a(long j9) {
        int i = this.i;
        return i != -1 && this.f15005j + ((long) i) <= j9;
    }
}
