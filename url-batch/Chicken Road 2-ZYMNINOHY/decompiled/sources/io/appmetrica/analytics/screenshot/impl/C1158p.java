package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1158p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13497a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13498b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13499c;

    public C1158p(boolean z, List list, long j4) {
        this.f13497a = z;
        this.f13498b = list;
        this.f13499c = j4;
    }

    public final long a() {
        return this.f13499c;
    }

    public final boolean b() {
        return this.f13497a;
    }

    public final List c() {
        return this.f13498b;
    }

    public final String toString() {
        return "ContentObserverCaptorConfig(enabled=" + this.f13497a + ", mediaStoreColumnNames='" + this.f13498b + "', detectWindowSeconds=" + this.f13499c + ')';
    }

    public C1158p() {
        this(new O().f13427a, d3.g.Y(new O().f13429c), new O().f13428b);
    }
}
