package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3165k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40767a;

    /* renamed from: b, reason: collision with root package name */
    public final C3166l f40768b;

    public C3165k(boolean z4, C3166l c3166l) {
        this.f40767a = z4;
        this.f40768b = c3166l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C3165k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        }
        C3165k c3165k = (C3165k) obj;
        return this.f40767a == c3165k.f40767a && Intrinsics.areEqual(this.f40768b, c3165k.f40768b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f40767a) * 31;
        C3166l c3166l = this.f40768b;
        return hashCode + (c3166l != null ? c3166l.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.f40767a + ", config=" + this.f40768b + ')';
    }
}
