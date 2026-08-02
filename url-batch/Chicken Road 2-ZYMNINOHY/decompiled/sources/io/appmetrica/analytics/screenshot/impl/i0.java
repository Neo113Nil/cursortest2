package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13474a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13475b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13476c;

    public i0(boolean z, List list, long j4) {
        this.f13474a = z;
        this.f13475b = list;
        this.f13476c = j4;
    }

    public final long a() {
        return this.f13476c;
    }

    public final boolean b() {
        return this.f13474a;
    }

    public final List c() {
        return this.f13475b;
    }

    public final String toString() {
        return "ServiceSideContentObserverCaptorConfig(enabled=" + this.f13474a + ", mediaStoreColumnNames=" + this.f13475b + ", detectWindowSeconds=" + this.f13476c + ')';
    }

    public i0(C1158p c1158p) {
        this(c1158p.b(), c1158p.c(), c1158p.a());
    }
}
