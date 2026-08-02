package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.ph, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0754ph extends U5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f8082d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8083e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f8084g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8085h;

    /* renamed from: i, reason: collision with root package name */
    public int f8086i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f8087j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0676mh f8088k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0728oh f8089l;

    /* renamed from: m, reason: collision with root package name */
    public String f8090m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8091n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public String f8092p;

    /* renamed from: q, reason: collision with root package name */
    public List f8093q;

    /* renamed from: r, reason: collision with root package name */
    public int f8094r;

    /* renamed from: s, reason: collision with root package name */
    public long f8095s;

    /* renamed from: t, reason: collision with root package name */
    public long f8096t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8097u;
    public long v;

    /* renamed from: w, reason: collision with root package name */
    public List f8098w;

    /* renamed from: x, reason: collision with root package name */
    public Set f8099x = new HashSet();

    public C0754ph(C0457e5 c0457e5) {
        this.f8089l = c0457e5;
    }

    public final void a(int i3) {
        this.f8094r = i3;
    }

    public final void b(List<String> list) {
        this.f8093q = list;
    }

    public final String c() {
        return this.f8090m;
    }

    public final void d(boolean z) {
        this.f8082d = z;
    }

    public final void e(boolean z) {
        this.f8085h = z;
    }

    public final void f(boolean z) {
        this.f8091n = z;
    }

    public final boolean g() {
        return this.f8097u;
    }

    public final String h() {
        return (String) WrapUtils.getOrDefault(this.f8092p, "");
    }

    public final boolean i() {
        return this.f8088k.a(this.f8087j);
    }

    public final int j() {
        return this.f8084g;
    }

    public final long k() {
        return this.v;
    }

    public final int l() {
        return this.f8086i;
    }

    public final long m() {
        return this.f8095s;
    }

    public final long n() {
        return this.f8096t;
    }

    public final List<String> o() {
        return this.f8093q;
    }

    public final int p() {
        return this.f;
    }

    public final boolean q() {
        return this.o;
    }

    public final boolean r() {
        return this.f8083e;
    }

    public final boolean s() {
        return this.f8082d;
    }

    public final boolean t() {
        return this.f8091n;
    }

    @Override // io.appmetrica.analytics.impl.U5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f8082d + ", mFirstActivationAsUpdate=" + this.f8083e + ", mSessionTimeout=" + this.f + ", mDispatchPeriod=" + this.f8084g + ", mLogEnabled=" + this.f8085h + ", mMaxReportsCount=" + this.f8086i + ", dataSendingEnabledFromArguments=" + this.f8087j + ", dataSendingStrategy=" + this.f8088k + ", mPreloadInfoSendingStrategy=" + this.f8089l + ", mApiKey='" + this.f8090m + "', mPermissionsCollectingEnabled=" + this.f8091n + ", mFeaturesCollectingEnabled=" + this.o + ", mClidsFromStartupResponse='" + this.f8092p + "', mReportHosts=" + this.f8093q + ", mAttributionId=" + this.f8094r + ", mPermissionsCollectingIntervalSeconds=" + this.f8095s + ", mPermissionsForceSendIntervalSeconds=" + this.f8096t + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f8097u + ", mMaxReportsInDbCount=" + this.v + ", mCertificates=" + this.f8098w + "} " + super.toString();
    }

    public final boolean u() {
        return isIdentifiersValid() && !AbstractC0709no.a((Collection) this.f8093q) && this.f8097u;
    }

    public final boolean v() {
        return ((C0457e5) this.f8089l).B();
    }

    public final void a(long j3) {
        this.v = j3;
    }

    public final void b(long j3) {
        this.f8095s = j3;
    }

    public final void c(long j3) {
        this.f8096t = j3;
    }

    public final void d(int i3) {
        this.f = i3;
    }

    public final Set<String> e() {
        return this.f8099x;
    }

    public final List<String> f() {
        return this.f8098w;
    }

    public final void a(List<String> list) {
        this.f8098w = list;
    }

    public final void b(boolean z) {
        this.o = z;
    }

    public final void c(boolean z) {
        this.f8083e = z;
    }

    public final int d() {
        return this.f8094r;
    }

    public final void a(Boolean bool, InterfaceC0676mh interfaceC0676mh) {
        this.f8087j = bool;
        this.f8088k = interfaceC0676mh;
    }

    public final void b(int i3) {
        this.f8084g = i3;
    }

    public final void c(int i3) {
        this.f8086i = i3;
    }

    public final void a(boolean z) {
        this.f8097u = z;
    }

    public final void a(Set<String> set) {
        this.f8099x = set;
    }
}
