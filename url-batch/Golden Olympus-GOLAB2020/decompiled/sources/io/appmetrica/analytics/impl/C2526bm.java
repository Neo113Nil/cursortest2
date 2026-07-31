package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.text.StringsKt;

/* renamed from: io.appmetrica.analytics.impl.bm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2526bm extends C2721j6 {

    /* renamed from: d, reason: collision with root package name */
    public List f38742d;

    /* renamed from: e, reason: collision with root package name */
    public List f38743e;

    /* renamed from: f, reason: collision with root package name */
    public String f38744f;

    /* renamed from: g, reason: collision with root package name */
    public String f38745g;

    /* renamed from: h, reason: collision with root package name */
    public Map f38746h;

    /* renamed from: i, reason: collision with root package name */
    public N3 f38747i;

    /* renamed from: j, reason: collision with root package name */
    public List f38748j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f38749k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f38750l;

    /* renamed from: m, reason: collision with root package name */
    public String f38751m;

    /* renamed from: n, reason: collision with root package name */
    public long f38752n;

    /* renamed from: o, reason: collision with root package name */
    public final C3120yg f38753o;

    /* renamed from: p, reason: collision with root package name */
    public final C2512b8 f38754p;

    public C2526bm() {
        this(Ia.j().t(), new C2512b8());
    }

    public final long a(long j4) {
        if (this.f38752n == 0) {
            this.f38752n = j4;
        }
        return this.f38752n;
    }

    @NonNull
    public final N3 c() {
        return this.f38747i;
    }

    public final Map<String, String> d() {
        return this.f38746h;
    }

    public final String e() {
        return this.f38751m;
    }

    public final String f() {
        return this.f38744f;
    }

    public final long g() {
        return this.f38752n;
    }

    public final String h() {
        return this.f38745g;
    }

    public final List<String> i() {
        return this.f38748j;
    }

    @NonNull
    public final C3120yg j() {
        return this.f38753o;
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
        if (!AbstractC2713io.a((Collection) this.f38742d)) {
            linkedHashSet.addAll(this.f38742d);
        }
        if (!AbstractC2713io.a((Collection) this.f38743e)) {
            linkedHashSet.addAll(this.f38743e);
        }
        String[] strArr = (String[]) this.f38754p.f38710a.a();
        if (strArr != null) {
            arrayList = new ArrayList();
            for (String str : strArr) {
                if (str == null || StringsKt.z(str)) {
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
            if (str2 == null || StringsKt.z(str2)) {
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
        return this.f38743e;
    }

    public final List<String> m() {
        return this.f38742d;
    }

    public final boolean n() {
        return this.f38749k;
    }

    public final boolean o() {
        return this.f38750l;
    }

    @Override // io.appmetrica.analytics.impl.C2721j6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f38742d + ", mStartupHostsFromClient=" + this.f38743e + ", mDistributionReferrer='" + this.f38744f + "', mInstallReferrerSource='" + this.f38745g + "', mClidsFromClient=" + this.f38746h + ", mNewCustomHosts=" + this.f38748j + ", mHasNewCustomHosts=" + this.f38749k + ", mSuccessfulStartup=" + this.f38750l + ", mCountryInit='" + this.f38751m + "', mFirstStartupTime=" + this.f38752n + "} " + super.toString();
    }

    public C2526bm(C3120yg c3120yg, C2512b8 c2512b8) {
        this.f38747i = new N3(null, EnumC2775l8.f39393c);
        this.f38752n = 0L;
        this.f38753o = c3120yg;
        this.f38754p = c2512b8;
    }

    public final void a(List<String> list) {
        this.f38748j = list;
    }

    public final void a(boolean z4) {
        this.f38749k = z4;
    }

    public final void a(String str) {
        this.f38751m = str;
    }
}
