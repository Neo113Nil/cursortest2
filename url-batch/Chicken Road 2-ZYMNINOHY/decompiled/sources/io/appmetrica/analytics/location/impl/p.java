package io.appmetrica.analytics.location.impl;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public i f13155a;

    /* renamed from: b, reason: collision with root package name */
    public final m f13156b;

    /* renamed from: c, reason: collision with root package name */
    public final h f13157c;

    /* renamed from: d, reason: collision with root package name */
    public final List f13158d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f13159e = new HashMap();

    public p(List list, i iVar) {
        this.f13158d = list;
        this.f13155a = iVar;
        m mVar = new m();
        this.f13156b = mVar;
        this.f13157c = new h(mVar);
    }

    public final m a() {
        return this.f13156b;
    }
}
