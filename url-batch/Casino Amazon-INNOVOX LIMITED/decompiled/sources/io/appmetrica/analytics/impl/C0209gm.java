package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.gm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0209gm {
    public final Map A;
    public final C9 B;

    /* renamed from: a, reason: collision with root package name */
    public final String f1277a;
    public final String b;
    public final C0312km c;
    public final String d;
    public final List e;
    public final List f;
    public final List g;
    public final Map h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final C0345m4 n;
    public final long o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final C0654ye s;
    public final RetryPolicyConfig t;
    public final long u;
    public final long v;
    public final boolean w;
    public final C0138e3 x;
    public final C0368n2 y;
    public final Dm z;

    public C0209gm(String str, String str2, C0312km c0312km) {
        this.f1277a = str;
        this.b = str2;
        this.c = c0312km;
        this.d = c0312km.f1347a;
        this.e = c0312km.b;
        this.f = c0312km.f;
        this.g = c0312km.g;
        List list = c0312km.h;
        this.h = c0312km.i;
        this.i = c0312km.c;
        this.j = c0312km.d;
        String str3 = c0312km.e;
        this.k = c0312km.j;
        this.l = c0312km.k;
        this.m = c0312km.l;
        this.n = c0312km.m;
        this.o = c0312km.n;
        this.p = c0312km.o;
        this.q = c0312km.p;
        this.r = c0312km.q;
        Hm hm = c0312km.r;
        this.s = c0312km.s;
        this.t = c0312km.t;
        this.u = c0312km.u;
        this.v = c0312km.v;
        this.w = c0312km.w;
        this.x = c0312km.x;
        this.y = c0312km.y;
        this.z = c0312km.z;
        this.A = c0312km.A;
        this.B = c0312km.B;
    }

    public final String a() {
        return this.f1277a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final String toString() {
        return "StartupState(deviceId=" + this.f1277a + ", deviceIdHash=" + this.b + ", startupStateModel=" + this.c + ')';
    }
}
