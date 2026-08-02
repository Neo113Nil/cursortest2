package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9044a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9045b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9046c;

    public i0(boolean z, List list, long j3) {
        this.f9044a = z;
        this.f9045b = list;
        this.f9046c = j3;
    }

    public final long a() {
        return this.f9046c;
    }

    public final boolean b() {
        return this.f9044a;
    }

    public final List c() {
        return this.f9045b;
    }

    public final String toString() {
        return "ServiceSideContentObserverCaptorConfig(enabled=" + this.f9044a + ", mediaStoreColumnNames=" + this.f9045b + ", detectWindowSeconds=" + this.f9046c + ')';
    }

    public i0(C1033p c1033p) {
        this(c1033p.b(), c1033p.c(), c1033p.a());
    }
}
