package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3166l {

    /* renamed from: a, reason: collision with root package name */
    public final C3163i f40769a;

    /* renamed from: b, reason: collision with root package name */
    public final C3167m f40770b;

    /* renamed from: c, reason: collision with root package name */
    public final C3164j f40771c;

    public C3166l(C3163i c3163i, C3167m c3167m, C3164j c3164j) {
        this.f40769a = c3163i;
        this.f40770b = c3167m;
        this.f40771c = c3164j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C3166l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        }
        C3166l c3166l = (C3166l) obj;
        return Intrinsics.areEqual(this.f40769a, c3166l.f40769a) && Intrinsics.areEqual(this.f40770b, c3166l.f40770b) && Intrinsics.areEqual(this.f40771c, c3166l.f40771c);
    }

    public final int hashCode() {
        C3163i c3163i = this.f40769a;
        int hashCode = (c3163i != null ? c3163i.hashCode() : 0) * 31;
        C3167m c3167m = this.f40770b;
        int hashCode2 = (hashCode + (c3167m != null ? c3167m.hashCode() : 0)) * 31;
        C3164j c3164j = this.f40771c;
        return hashCode2 + (c3164j != null ? c3164j.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.f40769a + ", serviceCaptorConfig=" + this.f40770b + ", contentObserverCaptorConfig=" + this.f40771c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3166l(D d4) {
        this(r2, r3, r5 != null ? new C3164j(r5) : null);
        C3177x a4 = d4.a();
        C3163i c3163i = a4 != null ? new C3163i(a4) : null;
        F c4 = d4.c();
        C3167m c3167m = c4 != null ? new C3167m(c4) : null;
        C3179z b4 = d4.b();
    }
}
