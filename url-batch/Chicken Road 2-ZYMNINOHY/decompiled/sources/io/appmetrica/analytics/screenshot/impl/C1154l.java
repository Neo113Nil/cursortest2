package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1154l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13486a;

    /* renamed from: b, reason: collision with root package name */
    public final C1155m f13487b;

    public C1154l(boolean z, C1155m c1155m) {
        this.f13486a = z;
        this.f13487b = c1155m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1154l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        }
        C1154l c1154l = (C1154l) obj;
        return this.f13486a == c1154l.f13486a && kotlin.jvm.internal.i.a(this.f13487b, c1154l.f13487b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f13486a) * 31;
        C1155m c1155m = this.f13487b;
        return hashCode + (c1155m != null ? c1155m.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.f13486a + ", config=" + this.f13487b + ')';
    }
}
