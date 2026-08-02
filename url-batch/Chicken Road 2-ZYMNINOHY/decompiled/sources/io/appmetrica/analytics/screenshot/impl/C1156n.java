package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1156n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13493a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13494b;

    public C1156n(boolean z, long j4) {
        this.f13493a = z;
        this.f13494b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1156n.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
        }
        C1156n c1156n = (C1156n) obj;
        return this.f13493a == c1156n.f13493a && this.f13494b == c1156n.f13494b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13494b) + (Boolean.hashCode(this.f13493a) * 31);
    }

    public final String toString() {
        return "ClientSideServiceCaptorConfig(enabled=" + this.f13493a + ", delaySeconds=" + this.f13494b + ')';
    }

    public C1156n(H h2) {
        this(h2.b(), h2.a());
    }
}
