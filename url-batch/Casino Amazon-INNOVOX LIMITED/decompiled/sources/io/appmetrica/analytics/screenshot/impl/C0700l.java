package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0700l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1737a;
    public final C0701m b;

    public C0700l(boolean z, C0701m c0701m) {
        this.f1737a = z;
        this.b = c0701m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0700l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        }
        C0700l c0700l = (C0700l) obj;
        return this.f1737a == c0700l.f1737a && Intrinsics.areEqual(this.b, c0700l.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f1737a) * 31;
        C0701m c0701m = this.b;
        return hashCode + (c0701m != null ? c0701m.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.f1737a + ", config=" + this.b + ')';
    }
}
