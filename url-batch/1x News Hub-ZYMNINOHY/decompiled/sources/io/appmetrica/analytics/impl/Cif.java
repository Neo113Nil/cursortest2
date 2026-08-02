package io.appmetrica.analytics.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.if, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif implements W7 {

    /* renamed from: a, reason: collision with root package name */
    public final C0907vf f7566a;

    /* renamed from: b, reason: collision with root package name */
    public final List<C0545hf> f7567b;

    public Cif(C0907vf c0907vf, List<C0545hf> list) {
        this.f7566a = c0907vf;
        this.f7567b = list;
    }

    @Override // io.appmetrica.analytics.impl.W7
    public final List<C0545hf> a() {
        return this.f7567b;
    }

    @Override // io.appmetrica.analytics.impl.W7
    public final Object b() {
        return this.f7566a;
    }

    public final C0907vf c() {
        return this.f7566a;
    }

    public final String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f7566a + ", candidates=" + this.f7567b + '}';
    }
}
