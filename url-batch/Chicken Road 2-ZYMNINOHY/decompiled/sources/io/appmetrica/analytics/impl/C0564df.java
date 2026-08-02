package io.appmetrica.analytics.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.df, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0564df implements Q7 {

    /* renamed from: a, reason: collision with root package name */
    public final C0900qf f11680a;

    /* renamed from: b, reason: collision with root package name */
    public final List<C0538cf> f11681b;

    public C0564df(C0900qf c0900qf, List<C0538cf> list) {
        this.f11680a = c0900qf;
        this.f11681b = list;
    }

    @Override // io.appmetrica.analytics.impl.Q7
    public final List<C0538cf> a() {
        return this.f11681b;
    }

    @Override // io.appmetrica.analytics.impl.Q7
    public final Object b() {
        return this.f11680a;
    }

    public final C0900qf c() {
        return this.f11680a;
    }

    public final String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f11680a + ", candidates=" + this.f11681b + '}';
    }
}
