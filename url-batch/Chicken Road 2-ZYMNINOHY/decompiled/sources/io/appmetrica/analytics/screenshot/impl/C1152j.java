package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1152j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13477a;

    public C1152j(boolean z) {
        this.f13477a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1152j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f13477a == ((C1152j) obj).f13477a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13477a);
    }

    public final String toString() {
        return "ClientSideApiCaptorConfig(enabled=" + this.f13477a + ')';
    }

    public C1152j(C1167z c1167z) {
        this(c1167z.a());
    }
}
