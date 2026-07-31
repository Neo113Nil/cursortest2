package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.fm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2633fm {

    /* renamed from: A, reason: collision with root package name */
    public final Dm f38976A;

    /* renamed from: B, reason: collision with root package name */
    public final Map f38977B;

    /* renamed from: C, reason: collision with root package name */
    public final W9 f38978C;

    /* renamed from: a, reason: collision with root package name */
    public final String f38979a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38980b;

    /* renamed from: c, reason: collision with root package name */
    public final C2737jm f38981c;

    /* renamed from: d, reason: collision with root package name */
    public final String f38982d;

    /* renamed from: e, reason: collision with root package name */
    public final List f38983e;

    /* renamed from: f, reason: collision with root package name */
    public final List f38984f;

    /* renamed from: g, reason: collision with root package name */
    public final List f38985g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f38986h;

    /* renamed from: i, reason: collision with root package name */
    public final String f38987i;

    /* renamed from: j, reason: collision with root package name */
    public final String f38988j;

    /* renamed from: k, reason: collision with root package name */
    public final String f38989k;

    /* renamed from: l, reason: collision with root package name */
    public final String f38990l;

    /* renamed from: m, reason: collision with root package name */
    public final String f38991m;

    /* renamed from: n, reason: collision with root package name */
    public final G4 f38992n;

    /* renamed from: o, reason: collision with root package name */
    public final long f38993o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f38994p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f38995q;

    /* renamed from: r, reason: collision with root package name */
    public final String f38996r;

    /* renamed from: s, reason: collision with root package name */
    public final Le f38997s;

    /* renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f38998t;

    /* renamed from: u, reason: collision with root package name */
    public final long f38999u;

    /* renamed from: v, reason: collision with root package name */
    public final long f39000v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f39001w;

    /* renamed from: x, reason: collision with root package name */
    public final BillingConfig f39002x;

    /* renamed from: y, reason: collision with root package name */
    public final C3133z3 f39003y;

    /* renamed from: z, reason: collision with root package name */
    public final C2924r2 f39004z;

    public C2633fm(String str, String str2, C2737jm c2737jm) {
        this.f38979a = str;
        this.f38980b = str2;
        this.f38981c = c2737jm;
        this.f38982d = c2737jm.f39294a;
        this.f38983e = c2737jm.f39295b;
        this.f38984f = c2737jm.f39299f;
        this.f38985g = c2737jm.f39300g;
        this.f38986h = c2737jm.f39302i;
        this.f38987i = c2737jm.f39296c;
        this.f38988j = c2737jm.f39297d;
        this.f38989k = c2737jm.f39303j;
        this.f38990l = c2737jm.f39304k;
        this.f38991m = c2737jm.f39305l;
        this.f38992n = c2737jm.f39306m;
        this.f38993o = c2737jm.f39307n;
        this.f38994p = c2737jm.f39308o;
        this.f38995q = c2737jm.f39309p;
        this.f38996r = c2737jm.f39310q;
        this.f38997s = c2737jm.f39312s;
        this.f38998t = c2737jm.f39313t;
        this.f38999u = c2737jm.f39314u;
        this.f39000v = c2737jm.f39315v;
        this.f39001w = c2737jm.f39316w;
        this.f39002x = c2737jm.f39317x;
        this.f39003y = c2737jm.f39318y;
        this.f39004z = c2737jm.f39319z;
        this.f38976A = c2737jm.f39291A;
        this.f38977B = c2737jm.f39292B;
        this.f38978C = c2737jm.f39293C;
    }

    public final String a() {
        return this.f38979a;
    }

    public final String b() {
        return this.f38980b;
    }

    public final long c() {
        return this.f39000v;
    }

    public final long d() {
        return this.f38999u;
    }

    public final String e() {
        return this.f38982d;
    }

    public final String toString() {
        return "StartupState(deviceId=" + this.f38979a + ", deviceIdHash=" + this.f38980b + ", startupStateModel=" + this.f38981c + ')';
    }
}
