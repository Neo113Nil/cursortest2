package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.ph, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0905ph extends U5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f9007d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9008e;

    /* renamed from: f, reason: collision with root package name */
    public int f9009f;

    /* renamed from: g, reason: collision with root package name */
    public int f9010g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9011h;

    /* renamed from: i, reason: collision with root package name */
    public int f9012i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f9013j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0827mh f9014k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0879oh f9015l;

    /* renamed from: m, reason: collision with root package name */
    public String f9016m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9017n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9018o;

    /* renamed from: p, reason: collision with root package name */
    public String f9019p;

    /* renamed from: q, reason: collision with root package name */
    public List f9020q;

    /* renamed from: r, reason: collision with root package name */
    public int f9021r;

    /* renamed from: s, reason: collision with root package name */
    public long f9022s;

    /* renamed from: t, reason: collision with root package name */
    public long f9023t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9024u;

    /* renamed from: v, reason: collision with root package name */
    public long f9025v;

    /* renamed from: w, reason: collision with root package name */
    public List f9026w;

    /* renamed from: x, reason: collision with root package name */
    public Set f9027x = new HashSet();

    public C0905ph(C0608e5 c0608e5) {
        this.f9015l = c0608e5;
    }

    public final void a(int i2) {
        this.f9021r = i2;
    }

    public final void b(List<String> list) {
        this.f9020q = list;
    }

    public final String c() {
        return this.f9016m;
    }

    public final void d(boolean z) {
        this.f9007d = z;
    }

    public final void e(boolean z) {
        this.f9011h = z;
    }

    public final void f(boolean z) {
        this.f9017n = z;
    }

    public final boolean g() {
        return this.f9024u;
    }

    public final String h() {
        return (String) WrapUtils.getOrDefault(this.f9019p, "");
    }

    public final boolean i() {
        return this.f9014k.a(this.f9013j);
    }

    public final int j() {
        return this.f9010g;
    }

    public final long k() {
        return this.f9025v;
    }

    public final int l() {
        return this.f9012i;
    }

    public final long m() {
        return this.f9022s;
    }

    public final long n() {
        return this.f9023t;
    }

    public final List<String> o() {
        return this.f9020q;
    }

    public final int p() {
        return this.f9009f;
    }

    public final boolean q() {
        return this.f9018o;
    }

    public final boolean r() {
        return this.f9008e;
    }

    public final boolean s() {
        return this.f9007d;
    }

    public final boolean t() {
        return this.f9017n;
    }

    @Override // io.appmetrica.analytics.impl.U5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f9007d + ", mFirstActivationAsUpdate=" + this.f9008e + ", mSessionTimeout=" + this.f9009f + ", mDispatchPeriod=" + this.f9010g + ", mLogEnabled=" + this.f9011h + ", mMaxReportsCount=" + this.f9012i + ", dataSendingEnabledFromArguments=" + this.f9013j + ", dataSendingStrategy=" + this.f9014k + ", mPreloadInfoSendingStrategy=" + this.f9015l + ", mApiKey='" + this.f9016m + "', mPermissionsCollectingEnabled=" + this.f9017n + ", mFeaturesCollectingEnabled=" + this.f9018o + ", mClidsFromStartupResponse='" + this.f9019p + "', mReportHosts=" + this.f9020q + ", mAttributionId=" + this.f9021r + ", mPermissionsCollectingIntervalSeconds=" + this.f9022s + ", mPermissionsForceSendIntervalSeconds=" + this.f9023t + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f9024u + ", mMaxReportsInDbCount=" + this.f9025v + ", mCertificates=" + this.f9026w + "} " + super.toString();
    }

    public final boolean u() {
        return isIdentifiersValid() && !AbstractC0860no.a((Collection) this.f9020q) && this.f9024u;
    }

    public final boolean v() {
        return ((C0608e5) this.f9015l).B();
    }

    public final void a(long j2) {
        this.f9025v = j2;
    }

    public final void b(long j2) {
        this.f9022s = j2;
    }

    public final void c(long j2) {
        this.f9023t = j2;
    }

    public final void d(int i2) {
        this.f9009f = i2;
    }

    public final Set<String> e() {
        return this.f9027x;
    }

    public final List<String> f() {
        return this.f9026w;
    }

    public final void a(List<String> list) {
        this.f9026w = list;
    }

    public final void b(boolean z) {
        this.f9018o = z;
    }

    public final void c(boolean z) {
        this.f9008e = z;
    }

    public final int d() {
        return this.f9021r;
    }

    public final void a(Boolean bool, InterfaceC0827mh interfaceC0827mh) {
        this.f9013j = bool;
        this.f9014k = interfaceC0827mh;
    }

    public final void b(int i2) {
        this.f9010g = i2;
    }

    public final void c(int i2) {
        this.f9012i = i2;
    }

    public final void a(boolean z) {
        this.f9024u = z;
    }

    public final void a(Set<String> set) {
        this.f9027x = set;
    }
}
