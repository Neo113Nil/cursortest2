package io.appmetrica.analytics.location.impl;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public i f8760a;

    /* renamed from: b, reason: collision with root package name */
    public final m f8761b;

    /* renamed from: c, reason: collision with root package name */
    public final h f8762c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8763d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f8764e = new HashMap();

    public p(List list, i iVar) {
        this.f8763d = list;
        this.f8760a = iVar;
        m mVar = new m();
        this.f8761b = mVar;
        this.f8762c = new h(mVar);
    }

    public final m a() {
        return this.f8761b;
    }
}
