package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1178j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10028a;

    public C1178j(boolean z) {
        this.f10028a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1178j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f10028a == ((C1178j) obj).f10028a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10028a);
    }

    public final String toString() {
        return "ClientSideApiCaptorConfig(enabled=" + this.f10028a + ')';
    }

    public C1178j(C1193z c1193z) {
        this(c1193z.a());
    }
}
