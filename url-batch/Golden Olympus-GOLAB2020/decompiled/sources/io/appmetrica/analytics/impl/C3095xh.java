package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.xh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3095xh extends C2721j6 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f40177d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40178e;

    /* renamed from: f, reason: collision with root package name */
    public int f40179f;

    /* renamed from: g, reason: collision with root package name */
    public int f40180g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40181h;

    /* renamed from: i, reason: collision with root package name */
    public int f40182i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f40183j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC3017uh f40184k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC3069wh f40185l;

    /* renamed from: m, reason: collision with root package name */
    public String f40186m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f40187n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f40188o;

    /* renamed from: p, reason: collision with root package name */
    public String f40189p;

    /* renamed from: q, reason: collision with root package name */
    public List f40190q;

    /* renamed from: r, reason: collision with root package name */
    public int f40191r;

    /* renamed from: s, reason: collision with root package name */
    public long f40192s;

    /* renamed from: t, reason: collision with root package name */
    public long f40193t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f40194u;

    /* renamed from: v, reason: collision with root package name */
    public long f40195v;

    /* renamed from: w, reason: collision with root package name */
    public List f40196w;

    public C3095xh(C2953s5 c2953s5) {
        this.f40185l = c2953s5;
    }

    public final void a(int i4) {
        this.f40191r = i4;
    }

    public final void b(List<String> list) {
        this.f40190q = list;
    }

    public final String c() {
        return this.f40186m;
    }

    public final void d(boolean z4) {
        this.f40177d = z4;
    }

    public final void e(boolean z4) {
        this.f40181h = z4;
    }

    public final void f(boolean z4) {
        this.f40187n = z4;
    }

    @NonNull
    public final String g() {
        return (String) WrapUtils.getOrDefault(this.f40189p, "");
    }

    public final boolean h() {
        return this.f40184k.a(this.f40183j);
    }

    public final int i() {
        return this.f40180g;
    }

    public final long j() {
        return this.f40195v;
    }

    public final int k() {
        return this.f40182i;
    }

    public final long l() {
        return this.f40192s;
    }

    public final long m() {
        return this.f40193t;
    }

    public final List<String> n() {
        return this.f40190q;
    }

    public final int o() {
        return this.f40179f;
    }

    public final boolean p() {
        return this.f40188o;
    }

    public final boolean q() {
        return this.f40178e;
    }

    public final boolean r() {
        return this.f40177d;
    }

    public final boolean s() {
        return this.f40187n;
    }

    public final boolean t() {
        return isIdentifiersValid() && !AbstractC2713io.a((Collection) this.f40190q) && this.f40194u;
    }

    @Override // io.appmetrica.analytics.impl.C2721j6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f40177d + ", mFirstActivationAsUpdate=" + this.f40178e + ", mSessionTimeout=" + this.f40179f + ", mDispatchPeriod=" + this.f40180g + ", mLogEnabled=" + this.f40181h + ", mMaxReportsCount=" + this.f40182i + ", dataSendingEnabledFromArguments=" + this.f40183j + ", dataSendingStrategy=" + this.f40184k + ", mPreloadInfoSendingStrategy=" + this.f40185l + ", mApiKey='" + this.f40186m + "', mPermissionsCollectingEnabled=" + this.f40187n + ", mFeaturesCollectingEnabled=" + this.f40188o + ", mClidsFromStartupResponse='" + this.f40189p + "', mReportHosts=" + this.f40190q + ", mAttributionId=" + this.f40191r + ", mPermissionsCollectingIntervalSeconds=" + this.f40192s + ", mPermissionsForceSendIntervalSeconds=" + this.f40193t + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f40194u + ", mMaxReportsInDbCount=" + this.f40195v + ", mCertificates=" + this.f40196w + "} " + super.toString();
    }

    public final boolean u() {
        return ((C2953s5) this.f40185l).A();
    }

    public final void a(long j4) {
        this.f40195v = j4;
    }

    public final void b(long j4) {
        this.f40192s = j4;
    }

    public final void c(long j4) {
        this.f40193t = j4;
    }

    public final void d(int i4) {
        this.f40179f = i4;
    }

    public final List<String> e() {
        return this.f40196w;
    }

    public final boolean f() {
        return this.f40194u;
    }

    public final void a(@NonNull List<String> list) {
        this.f40196w = list;
    }

    public final void b(boolean z4) {
        this.f40188o = z4;
    }

    public final void c(boolean z4) {
        this.f40178e = z4;
    }

    public final int d() {
        return this.f40191r;
    }

    public final void a(Boolean bool, @NonNull InterfaceC3017uh interfaceC3017uh) {
        this.f40183j = bool;
        this.f40184k = interfaceC3017uh;
    }

    public final void b(int i4) {
        this.f40180g = i4;
    }

    public final void c(int i4) {
        this.f40182i = i4;
    }

    public final void a(boolean z4) {
        this.f40194u = z4;
    }
}
