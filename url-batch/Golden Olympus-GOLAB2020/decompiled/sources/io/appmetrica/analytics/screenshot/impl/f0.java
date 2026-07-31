package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40753a;

    /* renamed from: b, reason: collision with root package name */
    public final List f40754b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40755c;

    public f0(boolean z4, List list, long j4) {
        this.f40753a = z4;
        this.f40754b = list;
        this.f40755c = j4;
    }

    public final long a() {
        return this.f40755c;
    }

    public final boolean b() {
        return this.f40753a;
    }

    public final List c() {
        return this.f40754b;
    }

    public final String toString() {
        return "ServiceSideContentObserverCaptorConfig(enabled=" + this.f40753a + ", mediaStoreColumnNames=" + this.f40754b + ", detectWindowSeconds=" + this.f40755c + ')';
    }

    public f0(C3169o c3169o) {
        this(c3169o.b(), c3169o.c(), c3169o.a());
    }
}
