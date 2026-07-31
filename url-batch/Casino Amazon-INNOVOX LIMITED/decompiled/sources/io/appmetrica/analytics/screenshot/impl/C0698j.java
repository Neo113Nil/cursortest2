package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0698j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1733a;

    public C0698j(boolean z) {
        this.f1733a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0698j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f1733a == ((C0698j) obj).f1733a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1733a);
    }

    public final String toString() {
        return "ClientSideApiCaptorConfig(enabled=" + this.f1733a + ')';
    }

    public C0698j(C0713z c0713z) {
        this(c0713z.a());
    }
}
