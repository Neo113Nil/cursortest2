package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1029l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9056a;

    /* renamed from: b, reason: collision with root package name */
    public final C1030m f9057b;

    public C1029l(boolean z, C1030m c1030m) {
        this.f9056a = z;
        this.f9057b = c1030m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1029l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        }
        C1029l c1029l = (C1029l) obj;
        return this.f9056a == c1029l.f9056a && kotlin.jvm.internal.j.a(this.f9057b, c1029l.f9057b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f9056a) * 31;
        C1030m c1030m = this.f9057b;
        return hashCode + (c1030m != null ? c1030m.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.f9056a + ", config=" + this.f9057b + ')';
    }
}
