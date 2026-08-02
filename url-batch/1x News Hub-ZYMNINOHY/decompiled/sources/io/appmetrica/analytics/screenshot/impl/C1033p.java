package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1033p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9067a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9068b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9069c;

    public C1033p(boolean z, List list, long j3) {
        this.f9067a = z;
        this.f9068b = list;
        this.f9069c = j3;
    }

    public final long a() {
        return this.f9069c;
    }

    public final boolean b() {
        return this.f9067a;
    }

    public final List c() {
        return this.f9068b;
    }

    public final String toString() {
        return "ContentObserverCaptorConfig(enabled=" + this.f9067a + ", mediaStoreColumnNames='" + this.f9068b + "', detectWindowSeconds=" + this.f9069c + ')';
    }

    public C1033p() {
        this(new O().f8998a, c2.c.X(new O().f9000c), new O().f8999b);
    }
}
