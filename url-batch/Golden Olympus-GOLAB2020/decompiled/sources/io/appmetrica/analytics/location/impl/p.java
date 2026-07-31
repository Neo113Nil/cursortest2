package io.appmetrica.analytics.location.impl;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public i f40457a;

    /* renamed from: b, reason: collision with root package name */
    public final m f40458b;

    /* renamed from: c, reason: collision with root package name */
    public final h f40459c;

    /* renamed from: d, reason: collision with root package name */
    public final List f40460d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f40461e = new HashMap();

    public p(List list, i iVar) {
        this.f40460d = list;
        this.f40457a = iVar;
        m mVar = new m();
        this.f40458b = mVar;
        this.f40459c = new h(mVar);
    }

    public final m a() {
        return this.f40458b;
    }
}
