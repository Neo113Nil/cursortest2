package io.appmetrica.analytics.screenshot.impl;

import b2.AbstractC0279e;
import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1179k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10031a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10032b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10033c;

    public C1179k(boolean z, List list, long j2) {
        this.f10031a = z;
        this.f10032b = list;
        this.f10033c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1179k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        }
        C1179k c1179k = (C1179k) obj;
        return this.f10031a == c1179k.f10031a && kotlin.jvm.internal.i.a(this.f10032b, c1179k.f10032b) && this.f10033c == c1179k.f10033c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10033c) + ((this.f10032b.hashCode() + (Boolean.hashCode(this.f10031a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientSideContentObserverCaptorConfig(enabled=");
        sb.append(this.f10031a);
        sb.append(", mediaStoreColumnNames=");
        sb.append(this.f10032b);
        sb.append(", detectWindowSeconds=");
        return AbstractC0279e.g(sb, this.f10033c, ')');
    }

    public C1179k(B b6) {
        this(b6.b(), b6.c(), b6.a());
    }
}
