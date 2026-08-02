package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import w3.AbstractC1510g;

/* renamed from: io.appmetrica.analytics.impl.bm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0519bm extends N5 {

    /* renamed from: d, reason: collision with root package name */
    public List f11554d;

    /* renamed from: e, reason: collision with root package name */
    public List f11555e;

    /* renamed from: f, reason: collision with root package name */
    public String f11556f;

    /* renamed from: g, reason: collision with root package name */
    public String f11557g;

    /* renamed from: h, reason: collision with root package name */
    public Map f11558h;

    /* renamed from: i, reason: collision with root package name */
    public C0913r3 f11559i;

    /* renamed from: j, reason: collision with root package name */
    public List f11560j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11561k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11562l;

    /* renamed from: m, reason: collision with root package name */
    public String f11563m;
    public long n;
    public final C0771lg o;

    /* renamed from: p, reason: collision with root package name */
    public final H7 f11564p;

    public C0519bm() {
        this(C0817na.k().u(), new H7());
    }

    public final long a(long j4) {
        if (this.n == 0) {
            this.n = j4;
        }
        return this.n;
    }

    public final C0913r3 c() {
        return this.f11559i;
    }

    public final Map<String, String> d() {
        return this.f11558h;
    }

    public final String e() {
        return this.f11563m;
    }

    public final String f() {
        return this.f11556f;
    }

    public final long g() {
        return this.n;
    }

    public final String h() {
        return this.f11557g;
    }

    public final List<String> i() {
        return this.f11560j;
    }

    public final C0771lg j() {
        return this.o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r4 != null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<String> k() {
        ArrayList arrayList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!AbstractC0779lo.a((Collection) this.f11554d)) {
            linkedHashSet.addAll(this.f11554d);
        }
        if (!AbstractC0779lo.a((Collection) this.f11555e)) {
            linkedHashSet.addAll(this.f11555e);
        }
        String[] strArr = (String[]) this.f11564p.f10360a.a();
        if (strArr != null) {
            arrayList = new ArrayList();
            for (String str : strArr) {
                if (str == null || AbstractC1510g.j0(str)) {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        String[] strArr2 = BuildConfig.DEFAULT_HOSTS;
        arrayList = new ArrayList();
        for (String str2 : strArr2) {
            if (str2 == null || AbstractC1510g.j0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        linkedHashSet.addAll(arrayList);
        return new ArrayList(linkedHashSet);
    }

    public final List<String> l() {
        return this.f11555e;
    }

    public final List<String> m() {
        return this.f11554d;
    }

    public final boolean n() {
        return this.f11561k;
    }

    public final boolean o() {
        return this.f11562l;
    }

    @Override // io.appmetrica.analytics.impl.N5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f11554d + ", mStartupHostsFromClient=" + this.f11555e + ", mDistributionReferrer='" + this.f11556f + "', mInstallReferrerSource='" + this.f11557g + "', mClidsFromClient=" + this.f11558h + ", mNewCustomHosts=" + this.f11560j + ", mHasNewCustomHosts=" + this.f11561k + ", mSuccessfulStartup=" + this.f11562l + ", mCountryInit='" + this.f11563m + "', mFirstStartupTime=" + this.n + "} " + super.toString();
    }

    public C0519bm(C0771lg c0771lg, H7 h7) {
        this.f11559i = new C0913r3(null, S7.f10933c);
        this.n = 0L;
        this.o = c0771lg;
        this.f11564p = h7;
    }

    public final void a(List<String> list) {
        this.f11560j = list;
    }

    public final void a(boolean z) {
        this.f11561k = z;
    }

    public final void a(String str) {
        this.f11563m = str;
    }
}
