package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1028k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9050a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9051b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9052c;

    public C1028k(boolean z, List list, long j3) {
        this.f9050a = z;
        this.f9051b = list;
        this.f9052c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1028k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        }
        C1028k c1028k = (C1028k) obj;
        return this.f9050a == c1028k.f9050a && kotlin.jvm.internal.j.a(this.f9051b, c1028k.f9051b) && this.f9052c == c1028k.f9052c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9052c) + ((this.f9051b.hashCode() + (Boolean.hashCode(this.f9050a) * 31)) * 31);
    }

    public final String toString() {
        return "ClientSideContentObserverCaptorConfig(enabled=" + this.f9050a + ", mediaStoreColumnNames=" + this.f9051b + ", detectWindowSeconds=" + this.f9052c + ')';
    }

    public C1028k(B b3) {
        this(b3.b(), b3.c(), b3.a());
    }
}
