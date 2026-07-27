package io.appmetrica.analytics.screenshot.impl;

import b2.AbstractC0279e;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10006a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10007b;

    public a0(boolean z, long j2) {
        this.f10006a = z;
        this.f10007b = j2;
    }

    public final long a() {
        return this.f10007b;
    }

    public final boolean b() {
        return this.f10006a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceCaptorConfig(enabled=");
        sb.append(this.f10006a);
        sb.append(", delaySeconds=");
        return AbstractC0279e.g(sb, this.f10007b, ')');
    }

    public a0() {
        this(new P().f9982a, new P().f9983b);
    }
}
