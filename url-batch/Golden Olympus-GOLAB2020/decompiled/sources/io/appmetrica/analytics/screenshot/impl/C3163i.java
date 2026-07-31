package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.screenshot.impl.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3163i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40761a;

    public C3163i(boolean z4) {
        this.f40761a = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C3163i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f40761a == ((C3163i) obj).f40761a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40761a);
    }

    public final String toString() {
        return "ClientSideApiCaptorConfig(enabled=" + this.f40761a + ')';
    }

    public C3163i(C3177x c3177x) {
        this(c3177x.a());
    }
}
