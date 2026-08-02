package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.fm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622fm {

    /* renamed from: A, reason: collision with root package name */
    public final Map f11858A;

    /* renamed from: B, reason: collision with root package name */
    public final B9 f11859B;

    /* renamed from: a, reason: collision with root package name */
    public final String f11860a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11861b;

    /* renamed from: c, reason: collision with root package name */
    public final C0725jm f11862c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11863d;

    /* renamed from: e, reason: collision with root package name */
    public final List f11864e;

    /* renamed from: f, reason: collision with root package name */
    public final List f11865f;

    /* renamed from: g, reason: collision with root package name */
    public final List f11866g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f11867h;

    /* renamed from: i, reason: collision with root package name */
    public final String f11868i;

    /* renamed from: j, reason: collision with root package name */
    public final String f11869j;

    /* renamed from: k, reason: collision with root package name */
    public final String f11870k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11871l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11872m;
    public final C0759l4 n;
    public final long o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f11873p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f11874q;

    /* renamed from: r, reason: collision with root package name */
    public final String f11875r;

    /* renamed from: s, reason: collision with root package name */
    public final C1080xe f11876s;

    /* renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f11877t;

    /* renamed from: u, reason: collision with root package name */
    public final long f11878u;
    public final long v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f11879w;

    /* renamed from: x, reason: collision with root package name */
    public final C0552d3 f11880x;

    /* renamed from: y, reason: collision with root package name */
    public final C0783m2 f11881y;
    public final Cm z;

    public C0622fm(String str, String str2, C0725jm c0725jm) {
        this.f11860a = str;
        this.f11861b = str2;
        this.f11862c = c0725jm;
        this.f11863d = c0725jm.f12156a;
        this.f11864e = c0725jm.f12157b;
        this.f11865f = c0725jm.f12161f;
        this.f11866g = c0725jm.f12162g;
        this.f11867h = c0725jm.f12164i;
        this.f11868i = c0725jm.f12158c;
        this.f11869j = c0725jm.f12159d;
        this.f11870k = c0725jm.f12165j;
        this.f11871l = c0725jm.f12166k;
        this.f11872m = c0725jm.f12167l;
        this.n = c0725jm.f12168m;
        this.o = c0725jm.n;
        this.f11873p = c0725jm.o;
        this.f11874q = c0725jm.f12169p;
        this.f11875r = c0725jm.f12170q;
        this.f11876s = c0725jm.f12172s;
        this.f11877t = c0725jm.f12173t;
        this.f11878u = c0725jm.f12174u;
        this.v = c0725jm.v;
        this.f11879w = c0725jm.f12175w;
        this.f11880x = c0725jm.f12176x;
        this.f11881y = c0725jm.f12177y;
        this.z = c0725jm.z;
        this.f11858A = c0725jm.f12154A;
        this.f11859B = c0725jm.f12155B;
    }

    public final String a() {
        return this.f11860a;
    }

    public final String b() {
        return this.f11861b;
    }

    public final String c() {
        return this.f11863d;
    }

    public final String toString() {
        return "StartupState(deviceId=" + this.f11860a + ", deviceIdHash=" + this.f11861b + ", startupStateModel=" + this.f11862c + ')';
    }
}
