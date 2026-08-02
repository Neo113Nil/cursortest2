package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.dm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0449dm extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f7196a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7197b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f7198c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7199d;

    /* renamed from: e, reason: collision with root package name */
    public final List<String> f7200e;

    public C0449dm(P3 p3) {
        this(p3.a().c(), p3.a().d(), p3.a().a(), p3.a().h(), p3.a().b());
    }

    public final boolean a(C0449dm c0449dm) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0449dm mergeFrom(C0449dm c0449dm) {
        return new C0449dm((String) WrapUtils.getOrDefaultNullable(this.f7196a, c0449dm.f7196a), (String) WrapUtils.getOrDefaultNullable(this.f7197b, c0449dm.f7197b), (Map) WrapUtils.getOrDefaultNullable(this.f7198c, c0449dm.f7198c), this.f7199d || c0449dm.f7199d, c0449dm.f7199d ? c0449dm.f7200e : this.f7200e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return false;
    }

    public final String toString() {
        return "Arguments{distributionReferrer='" + this.f7196a + "', installReferrerSource='" + this.f7197b + "', clientClids=" + this.f7198c + ", hasNewCustomHosts=" + this.f7199d + ", newCustomHosts=" + this.f7200e + '}';
    }

    public C0449dm(String str, String str2, Map<String, String> map, boolean z, List<String> list) {
        this.f7196a = str;
        this.f7197b = str2;
        this.f7198c = map;
        this.f7199d = z;
        this.f7200e = list;
    }

    public C0449dm() {
        this(null, null, null, false, null);
    }
}
