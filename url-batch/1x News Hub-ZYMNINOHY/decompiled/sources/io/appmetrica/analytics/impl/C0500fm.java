package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.fm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500fm extends U5 {

    /* renamed from: d, reason: collision with root package name */
    public List f7328d;

    /* renamed from: e, reason: collision with root package name */
    public List f7329e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f7330g;

    /* renamed from: h, reason: collision with root package name */
    public Map f7331h;

    /* renamed from: i, reason: collision with root package name */
    public C0997z3 f7332i;

    /* renamed from: j, reason: collision with root package name */
    public List f7333j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7334k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7335l;

    /* renamed from: m, reason: collision with root package name */
    public String f7336m;

    /* renamed from: n, reason: collision with root package name */
    public long f7337n;
    public final C0779qg o;

    /* renamed from: p, reason: collision with root package name */
    public final N7 f7338p;

    public C0500fm() {
        this(C0876ua.k().u(), new N7());
    }

    public final long a(long j3) {
        if (this.f7337n == 0) {
            this.f7337n = j3;
        }
        return this.f7337n;
    }

    public final C0997z3 c() {
        return this.f7332i;
    }

    public final Map<String, String> d() {
        return this.f7331h;
    }

    public final String e() {
        return this.f7336m;
    }

    public final String f() {
        return this.f;
    }

    public final long g() {
        return this.f7337n;
    }

    public final String h() {
        return this.f7330g;
    }

    public final List<String> i() {
        return this.f7333j;
    }

    public final C0779qg j() {
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
        if (!AbstractC0709no.a((Collection) this.f7328d)) {
            linkedHashSet.addAll(this.f7328d);
        }
        if (!AbstractC0709no.a((Collection) this.f7329e)) {
            linkedHashSet.addAll(this.f7329e);
        }
        String[] strArr = (String[]) this.f7338p.f6361a.a();
        if (strArr != null) {
            arrayList = new ArrayList();
            for (String str : strArr) {
                if (str == null || s2.n.U(str)) {
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
            if (str2 == null || s2.n.U(str2)) {
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
        return this.f7329e;
    }

    public final List<String> m() {
        return this.f7328d;
    }

    public final boolean n() {
        return this.f7334k;
    }

    public final boolean o() {
        return this.f7335l;
    }

    @Override // io.appmetrica.analytics.impl.U5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f7328d + ", mStartupHostsFromClient=" + this.f7329e + ", mDistributionReferrer='" + this.f + "', mInstallReferrerSource='" + this.f7330g + "', mClidsFromClient=" + this.f7331h + ", mNewCustomHosts=" + this.f7333j + ", mHasNewCustomHosts=" + this.f7334k + ", mSuccessfulStartup=" + this.f7335l + ", mCountryInit='" + this.f7336m + "', mFirstStartupTime=" + this.f7337n + "} " + super.toString();
    }

    public C0500fm(C0779qg c0779qg, N7 n7) {
        this.f7332i = new C0997z3(null, Y7.f6892c);
        this.f7337n = 0L;
        this.o = c0779qg;
        this.f7338p = n7;
    }

    public final void a(List<String> list) {
        this.f7333j = list;
    }

    public final void a(boolean z) {
        this.f7334k = z;
    }

    public final void a(String str) {
        this.f7336m = str;
    }
}
