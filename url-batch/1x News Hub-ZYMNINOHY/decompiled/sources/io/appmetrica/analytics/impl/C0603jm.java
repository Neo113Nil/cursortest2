package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.jm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603jm {

    /* renamed from: A, reason: collision with root package name */
    public final Map f7661A;

    /* renamed from: B, reason: collision with root package name */
    public final I9 f7662B;

    /* renamed from: a, reason: collision with root package name */
    public final String f7663a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7664b;

    /* renamed from: c, reason: collision with root package name */
    public final C0707nm f7665c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7666d;

    /* renamed from: e, reason: collision with root package name */
    public final List f7667e;
    public final List f;

    /* renamed from: g, reason: collision with root package name */
    public final List f7668g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f7669h;

    /* renamed from: i, reason: collision with root package name */
    public final String f7670i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7671j;

    /* renamed from: k, reason: collision with root package name */
    public final String f7672k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7673l;

    /* renamed from: m, reason: collision with root package name */
    public final String f7674m;

    /* renamed from: n, reason: collision with root package name */
    public final C0818s4 f7675n;
    public final long o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7676p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f7677q;

    /* renamed from: r, reason: collision with root package name */
    public final String f7678r;

    /* renamed from: s, reason: collision with root package name */
    public final De f7679s;

    /* renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f7680t;

    /* renamed from: u, reason: collision with root package name */
    public final long f7681u;
    public final long v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f7682w;

    /* renamed from: x, reason: collision with root package name */
    public final C0636l3 f7683x;

    /* renamed from: y, reason: collision with root package name */
    public final C0868u2 f7684y;
    public final Gm z;

    public C0603jm(String str, String str2, C0707nm c0707nm) {
        this.f7663a = str;
        this.f7664b = str2;
        this.f7665c = c0707nm;
        this.f7666d = c0707nm.f7957a;
        this.f7667e = c0707nm.f7958b;
        this.f = c0707nm.f;
        this.f7668g = c0707nm.f7962g;
        this.f7669h = c0707nm.f7964i;
        this.f7670i = c0707nm.f7959c;
        this.f7671j = c0707nm.f7960d;
        this.f7672k = c0707nm.f7965j;
        this.f7673l = c0707nm.f7966k;
        this.f7674m = c0707nm.f7967l;
        this.f7675n = c0707nm.f7968m;
        this.o = c0707nm.f7969n;
        this.f7676p = c0707nm.o;
        this.f7677q = c0707nm.f7970p;
        this.f7678r = c0707nm.f7971q;
        this.f7679s = c0707nm.f7973s;
        this.f7680t = c0707nm.f7974t;
        this.f7681u = c0707nm.f7975u;
        this.v = c0707nm.v;
        this.f7682w = c0707nm.f7976w;
        this.f7683x = c0707nm.f7977x;
        this.f7684y = c0707nm.f7978y;
        this.z = c0707nm.z;
        this.f7661A = c0707nm.f7955A;
        this.f7662B = c0707nm.f7956B;
    }

    public final String a() {
        return this.f7663a;
    }

    public final String b() {
        return this.f7664b;
    }

    public final String c() {
        return this.f7666d;
    }

    public final String toString() {
        return "StartupState(deviceId=" + this.f7663a + ", deviceIdHash=" + this.f7664b + ", startupStateModel=" + this.f7665c + ')';
    }
}
