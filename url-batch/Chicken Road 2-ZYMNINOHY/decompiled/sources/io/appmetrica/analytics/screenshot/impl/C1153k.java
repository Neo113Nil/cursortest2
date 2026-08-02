package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1153k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13480a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13481b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13482c;

    public C1153k(boolean z, List list, long j4) {
        this.f13480a = z;
        this.f13481b = list;
        this.f13482c = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1153k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        }
        C1153k c1153k = (C1153k) obj;
        return this.f13480a == c1153k.f13480a && kotlin.jvm.internal.i.a(this.f13481b, c1153k.f13481b) && this.f13482c == c1153k.f13482c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13482c) + ((this.f13481b.hashCode() + (Boolean.hashCode(this.f13480a) * 31)) * 31);
    }

    public final String toString() {
        return "ClientSideContentObserverCaptorConfig(enabled=" + this.f13480a + ", mediaStoreColumnNames=" + this.f13481b + ", detectWindowSeconds=" + this.f13482c + ')';
    }

    public C1153k(B b4) {
        this(b4.b(), b4.c(), b4.a());
    }
}
