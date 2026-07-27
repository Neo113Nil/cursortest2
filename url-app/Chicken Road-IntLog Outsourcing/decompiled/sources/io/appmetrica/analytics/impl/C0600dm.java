package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.dm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0600dm extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f8054a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8055b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f8056c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8057d;

    /* renamed from: e, reason: collision with root package name */
    public final List<String> f8058e;

    public C0600dm(P3 p32) {
        this(p32.a().c(), p32.a().d(), p32.a().a(), p32.a().h(), p32.a().b());
    }

    public final boolean a(C0600dm c0600dm) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0600dm mergeFrom(C0600dm c0600dm) {
        return new C0600dm((String) WrapUtils.getOrDefaultNullable(this.f8054a, c0600dm.f8054a), (String) WrapUtils.getOrDefaultNullable(this.f8055b, c0600dm.f8055b), (Map) WrapUtils.getOrDefaultNullable(this.f8056c, c0600dm.f8056c), this.f8057d || c0600dm.f8057d, c0600dm.f8057d ? c0600dm.f8058e : this.f8058e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return false;
    }

    public final String toString() {
        return "Arguments{distributionReferrer='" + this.f8054a + "', installReferrerSource='" + this.f8055b + "', clientClids=" + this.f8056c + ", hasNewCustomHosts=" + this.f8057d + ", newCustomHosts=" + this.f8058e + '}';
    }

    public C0600dm(String str, String str2, Map<String, String> map, boolean z, List<String> list) {
        this.f8054a = str;
        this.f8055b = str2;
        this.f8056c = map;
        this.f8057d = z;
        this.f8058e = list;
    }

    public C0600dm() {
        this(null, null, null, false, null);
    }
}
