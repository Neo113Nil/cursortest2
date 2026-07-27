package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.fm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0651fm extends U5 {

    /* renamed from: d, reason: collision with root package name */
    public List f8195d;

    /* renamed from: e, reason: collision with root package name */
    public List f8196e;

    /* renamed from: f, reason: collision with root package name */
    public String f8197f;

    /* renamed from: g, reason: collision with root package name */
    public String f8198g;

    /* renamed from: h, reason: collision with root package name */
    public Map f8199h;

    /* renamed from: i, reason: collision with root package name */
    public C1148z3 f8200i;

    /* renamed from: j, reason: collision with root package name */
    public List f8201j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8202k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8203l;

    /* renamed from: m, reason: collision with root package name */
    public String f8204m;

    /* renamed from: n, reason: collision with root package name */
    public long f8205n;

    /* renamed from: o, reason: collision with root package name */
    public final C0930qg f8206o;

    /* renamed from: p, reason: collision with root package name */
    public final N7 f8207p;

    public C0651fm() {
        this(C1027ua.k().u(), new N7());
    }

    public final long a(long j2) {
        if (this.f8205n == 0) {
            this.f8205n = j2;
        }
        return this.f8205n;
    }

    public final C1148z3 c() {
        return this.f8200i;
    }

    public final Map<String, String> d() {
        return this.f8199h;
    }

    public final String e() {
        return this.f8204m;
    }

    public final String f() {
        return this.f8197f;
    }

    public final long g() {
        return this.f8205n;
    }

    public final String h() {
        return this.f8198g;
    }

    public final List<String> i() {
        return this.f8201j;
    }

    public final C0930qg j() {
        return this.f8206o;
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
        if (!AbstractC0860no.a((Collection) this.f8195d)) {
            linkedHashSet.addAll(this.f8195d);
        }
        if (!AbstractC0860no.a((Collection) this.f8196e)) {
            linkedHashSet.addAll(this.f8196e);
        }
        String[] strArr = (String[]) this.f8207p.f7171a.a();
        if (strArr != null) {
            arrayList = new ArrayList();
            for (String str : strArr) {
                if (str == null || B4.k.Z(str)) {
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
            if (str2 == null || B4.k.Z(str2)) {
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
        return this.f8196e;
    }

    public final List<String> m() {
        return this.f8195d;
    }

    public final boolean n() {
        return this.f8202k;
    }

    public final boolean o() {
        return this.f8203l;
    }

    @Override // io.appmetrica.analytics.impl.U5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f8195d + ", mStartupHostsFromClient=" + this.f8196e + ", mDistributionReferrer='" + this.f8197f + "', mInstallReferrerSource='" + this.f8198g + "', mClidsFromClient=" + this.f8199h + ", mNewCustomHosts=" + this.f8201j + ", mHasNewCustomHosts=" + this.f8202k + ", mSuccessfulStartup=" + this.f8203l + ", mCountryInit='" + this.f8204m + "', mFirstStartupTime=" + this.f8205n + "} " + super.toString();
    }

    public C0651fm(C0930qg c0930qg, N7 n7) {
        this.f8200i = new C1148z3(null, Y7.f7730c);
        this.f8205n = 0L;
        this.f8206o = c0930qg;
        this.f8207p = n7;
    }

    public final void a(List<String> list) {
        this.f8201j = list;
    }

    public final void a(boolean z) {
        this.f8202k = z;
    }

    public final void a(String str) {
        this.f8204m = str;
    }
}
