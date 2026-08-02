package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1031n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9063a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9064b;

    public C1031n(boolean z, long j3) {
        this.f9063a = z;
        this.f9064b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1031n.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
        }
        C1031n c1031n = (C1031n) obj;
        return this.f9063a == c1031n.f9063a && this.f9064b == c1031n.f9064b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9064b) + (Boolean.hashCode(this.f9063a) * 31);
    }

    public final String toString() {
        return "ClientSideServiceCaptorConfig(enabled=" + this.f9063a + ", delaySeconds=" + this.f9064b + ')';
    }

    public C1031n(H h3) {
        this(h3.b(), h3.a());
    }
}
