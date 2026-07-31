package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.screenshot.impl.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0702n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1740a;
    public final long b;

    public C0702n(boolean z, long j) {
        this.f1740a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0702n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
        }
        C0702n c0702n = (C0702n) obj;
        return this.f1740a == c0702n.f1740a && this.b == c0702n.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Boolean.hashCode(this.f1740a) * 31);
    }

    public final String toString() {
        return "ClientSideServiceCaptorConfig(enabled=" + this.f1740a + ", delaySeconds=" + this.b + ')';
    }

    public C0702n(H h) {
        this(h.b(), h.a());
    }
}
