package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1027j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9047a;

    public C1027j(boolean z) {
        this.f9047a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1027j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f9047a == ((C1027j) obj).f9047a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9047a);
    }

    public final String toString() {
        return "ClientSideApiCaptorConfig(enabled=" + this.f9047a + ')';
    }

    public C1027j(C1042z c1042z) {
        this(c1042z.a());
    }
}
