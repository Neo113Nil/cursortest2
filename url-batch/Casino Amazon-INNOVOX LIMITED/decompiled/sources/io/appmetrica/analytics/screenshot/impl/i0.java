package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1732a;
    public final List b;
    public final long c;

    public i0(boolean z, List list, long j) {
        this.f1732a = z;
        this.b = list;
        this.c = j;
    }

    public final long a() {
        return this.c;
    }

    public final boolean b() {
        return this.f1732a;
    }

    public final List c() {
        return this.b;
    }

    public final String toString() {
        return "ServiceSideContentObserverCaptorConfig(enabled=" + this.f1732a + ", mediaStoreColumnNames=" + this.b + ", detectWindowSeconds=" + this.c + ')';
    }

    public i0(C0704p c0704p) {
        this(c0704p.b(), c0704p.c(), c0704p.a());
    }
}
