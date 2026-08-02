package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.kh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0746kh extends N5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f12222d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12223e;

    /* renamed from: f, reason: collision with root package name */
    public int f12224f;

    /* renamed from: g, reason: collision with root package name */
    public int f12225g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12226h;

    /* renamed from: i, reason: collision with root package name */
    public int f12227i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f12228j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0669hh f12229k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0720jh f12230l;

    /* renamed from: m, reason: collision with root package name */
    public String f12231m;
    public boolean n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public String f12232p;

    /* renamed from: q, reason: collision with root package name */
    public List f12233q;

    /* renamed from: r, reason: collision with root package name */
    public int f12234r;

    /* renamed from: s, reason: collision with root package name */
    public long f12235s;

    /* renamed from: t, reason: collision with root package name */
    public long f12236t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12237u;
    public long v;

    /* renamed from: w, reason: collision with root package name */
    public List f12238w;

    /* renamed from: x, reason: collision with root package name */
    public Set f12239x = new HashSet();

    public C0746kh(X4 x4) {
        this.f12230l = x4;
    }

    public final void a(int i4) {
        this.f12234r = i4;
    }

    public final void b(List<String> list) {
        this.f12233q = list;
    }

    public final String c() {
        return this.f12231m;
    }

    public final void d(boolean z) {
        this.f12222d = z;
    }

    public final void e(boolean z) {
        this.f12226h = z;
    }

    public final void f(boolean z) {
        this.n = z;
    }

    public final boolean g() {
        return this.f12237u;
    }

    public final String h() {
        return (String) WrapUtils.getOrDefault(this.f12232p, "");
    }

    public final boolean i() {
        return this.f12229k.a(this.f12228j);
    }

    public final int j() {
        return this.f12225g;
    }

    public final long k() {
        return this.v;
    }

    public final int l() {
        return this.f12227i;
    }

    public final long m() {
        return this.f12235s;
    }

    public final long n() {
        return this.f12236t;
    }

    public final List<String> o() {
        return this.f12233q;
    }

    public final int p() {
        return this.f12224f;
    }

    public final boolean q() {
        return this.o;
    }

    public final boolean r() {
        return this.f12223e;
    }

    public final boolean s() {
        return this.f12222d;
    }

    public final boolean t() {
        return this.n;
    }

    @Override // io.appmetrica.analytics.impl.N5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f12222d + ", mFirstActivationAsUpdate=" + this.f12223e + ", mSessionTimeout=" + this.f12224f + ", mDispatchPeriod=" + this.f12225g + ", mLogEnabled=" + this.f12226h + ", mMaxReportsCount=" + this.f12227i + ", dataSendingEnabledFromArguments=" + this.f12228j + ", dataSendingStrategy=" + this.f12229k + ", mPreloadInfoSendingStrategy=" + this.f12230l + ", mApiKey='" + this.f12231m + "', mPermissionsCollectingEnabled=" + this.n + ", mFeaturesCollectingEnabled=" + this.o + ", mClidsFromStartupResponse='" + this.f12232p + "', mReportHosts=" + this.f12233q + ", mAttributionId=" + this.f12234r + ", mPermissionsCollectingIntervalSeconds=" + this.f12235s + ", mPermissionsForceSendIntervalSeconds=" + this.f12236t + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f12237u + ", mMaxReportsInDbCount=" + this.v + ", mCertificates=" + this.f12238w + "} " + super.toString();
    }

    public final boolean u() {
        return isIdentifiersValid() && !AbstractC0779lo.a((Collection) this.f12233q) && this.f12237u;
    }

    public final boolean v() {
        return ((X4) this.f12230l).B();
    }

    public final void a(long j4) {
        this.v = j4;
    }

    public final void b(long j4) {
        this.f12235s = j4;
    }

    public final void c(long j4) {
        this.f12236t = j4;
    }

    public final void d(int i4) {
        this.f12224f = i4;
    }

    public final Set<String> e() {
        return this.f12239x;
    }

    public final List<String> f() {
        return this.f12238w;
    }

    public final void a(List<String> list) {
        this.f12238w = list;
    }

    public final void b(boolean z) {
        this.o = z;
    }

    public final void c(boolean z) {
        this.f12223e = z;
    }

    public final int d() {
        return this.f12234r;
    }

    public final void a(Boolean bool, InterfaceC0669hh interfaceC0669hh) {
        this.f12228j = bool;
        this.f12229k = interfaceC0669hh;
    }

    public final void b(int i4) {
        this.f12225g = i4;
    }

    public final void c(int i4) {
        this.f12227i = i4;
    }

    public final void a(boolean z) {
        this.f12237u = z;
    }

    public final void a(Set<String> set) {
        this.f12239x = set;
    }
}
