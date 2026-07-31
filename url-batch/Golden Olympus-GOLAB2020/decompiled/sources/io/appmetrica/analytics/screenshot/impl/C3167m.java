package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3167m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40772a;

    /* renamed from: b, reason: collision with root package name */
    public final long f40773b;

    public C3167m(boolean z4, long j4) {
        this.f40772a = z4;
        this.f40773b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C3167m.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
        }
        C3167m c3167m = (C3167m) obj;
        return this.f40772a == c3167m.f40772a && this.f40773b == c3167m.f40773b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40773b) + (Boolean.hashCode(this.f40772a) * 31);
    }

    public final String toString() {
        return "ClientSideServiceCaptorConfig(enabled=" + this.f40772a + ", delaySeconds=" + this.f40773b + ')';
    }

    public C3167m(F f4) {
        this(f4.b(), f4.a());
    }
}
