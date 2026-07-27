package io.appmetrica.analytics.screenshot.impl;

import b2.AbstractC0279e;
import java.util.List;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10025a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10026b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10027c;

    public i0(boolean z, List list, long j2) {
        this.f10025a = z;
        this.f10026b = list;
        this.f10027c = j2;
    }

    public final long a() {
        return this.f10027c;
    }

    public final boolean b() {
        return this.f10025a;
    }

    public final List c() {
        return this.f10026b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSideContentObserverCaptorConfig(enabled=");
        sb.append(this.f10025a);
        sb.append(", mediaStoreColumnNames=");
        sb.append(this.f10026b);
        sb.append(", detectWindowSeconds=");
        return AbstractC0279e.g(sb, this.f10027c, ')');
    }

    public i0(C1184p c1184p) {
        this(c1184p.b(), c1184p.c(), c1184p.a());
    }
}
