package io.appmetrica.analytics.screenshot.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0699k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1735a;
    public final List b;
    public final long c;

    public C0699k(boolean z, List list, long j) {
        this.f1735a = z;
        this.b = list;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0699k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        }
        C0699k c0699k = (C0699k) obj;
        return this.f1735a == c0699k.f1735a && Intrinsics.areEqual(this.b, c0699k.b) && this.c == c0699k.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.f1735a) * 31)) * 31);
    }

    public final String toString() {
        return "ClientSideContentObserverCaptorConfig(enabled=" + this.f1735a + ", mediaStoreColumnNames=" + this.b + ", detectWindowSeconds=" + this.c + ')';
    }

    public C0699k(B b) {
        this(b.b(), b.c(), b.a());
    }
}
