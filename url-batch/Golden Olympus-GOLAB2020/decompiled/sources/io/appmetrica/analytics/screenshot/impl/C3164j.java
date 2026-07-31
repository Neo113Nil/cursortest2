package io.appmetrica.analytics.screenshot.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3164j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40764a;

    /* renamed from: b, reason: collision with root package name */
    public final List f40765b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40766c;

    public C3164j(boolean z4, List list, long j4) {
        this.f40764a = z4;
        this.f40765b = list;
        this.f40766c = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C3164j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        }
        C3164j c3164j = (C3164j) obj;
        return this.f40764a == c3164j.f40764a && Intrinsics.areEqual(this.f40765b, c3164j.f40765b) && this.f40766c == c3164j.f40766c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40766c) + ((this.f40765b.hashCode() + (Boolean.hashCode(this.f40764a) * 31)) * 31);
    }

    public final String toString() {
        return "ClientSideContentObserverCaptorConfig(enabled=" + this.f40764a + ", mediaStoreColumnNames=" + this.f40765b + ", detectWindowSeconds=" + this.f40766c + ')';
    }

    public C3164j(C3179z c3179z) {
        this(c3179z.b(), c3179z.c(), c3179z.a());
    }
}
