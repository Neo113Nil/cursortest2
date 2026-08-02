package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527gn implements Nn {

    /* renamed from: a, reason: collision with root package name */
    public final Nn f7419a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7420b;

    public C0527gn(Nn nn, Object obj) {
        this.f7419a = nn;
        this.f7420b = obj;
    }

    @Override // io.appmetrica.analytics.impl.Nn
    public final Object a(Object obj) {
        return obj != this.f7419a.a(obj) ? this.f7420b : obj;
    }
}
