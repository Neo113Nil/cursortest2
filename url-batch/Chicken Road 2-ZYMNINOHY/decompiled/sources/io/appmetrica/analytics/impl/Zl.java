package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Zl extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f11397a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11398b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f11399c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11400d;

    /* renamed from: e, reason: collision with root package name */
    public final List<String> f11401e;

    public Zl(H3 h32) {
        this(h32.a().c(), h32.a().d(), h32.a().a(), h32.a().h(), h32.a().b());
    }

    public final boolean a(Zl zl) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Zl mergeFrom(Zl zl) {
        return new Zl((String) WrapUtils.getOrDefaultNullable(this.f11397a, zl.f11397a), (String) WrapUtils.getOrDefaultNullable(this.f11398b, zl.f11398b), (Map) WrapUtils.getOrDefaultNullable(this.f11399c, zl.f11399c), this.f11400d || zl.f11400d, zl.f11400d ? zl.f11401e : this.f11401e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return false;
    }

    public final String toString() {
        return "Arguments{distributionReferrer='" + this.f11397a + "', installReferrerSource='" + this.f11398b + "', clientClids=" + this.f11399c + ", hasNewCustomHosts=" + this.f11400d + ", newCustomHosts=" + this.f11401e + '}';
    }

    public Zl(String str, String str2, Map<String, String> map, boolean z, List<String> list) {
        this.f11397a = str;
        this.f11398b = str2;
        this.f11399c = map;
        this.f11400d = z;
        this.f11401e = list;
    }

    public Zl() {
        this(null, null, null, false, null);
    }
}
