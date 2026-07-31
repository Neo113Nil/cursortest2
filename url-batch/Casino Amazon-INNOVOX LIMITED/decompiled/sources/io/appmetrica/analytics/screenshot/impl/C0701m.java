package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0701m {

    /* renamed from: a, reason: collision with root package name */
    public final C0698j f1739a;
    public final C0702n b;
    public final C0699k c;

    public C0701m(C0698j c0698j, C0702n c0702n, C0699k c0699k) {
        this.f1739a = c0698j;
        this.b = c0702n;
        this.c = c0699k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0701m.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        }
        C0701m c0701m = (C0701m) obj;
        return Intrinsics.areEqual(this.f1739a, c0701m.f1739a) && Intrinsics.areEqual(this.b, c0701m.b) && Intrinsics.areEqual(this.c, c0701m.c);
    }

    public final int hashCode() {
        C0698j c0698j = this.f1739a;
        int hashCode = (c0698j != null ? c0698j.hashCode() : 0) * 31;
        C0702n c0702n = this.b;
        int hashCode2 = (hashCode + (c0702n != null ? c0702n.hashCode() : 0)) * 31;
        C0699k c0699k = this.c;
        return hashCode2 + (c0699k != null ? c0699k.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.f1739a + ", serviceCaptorConfig=" + this.b + ", contentObserverCaptorConfig=" + this.c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0701m(F f) {
        this(r2, r3, r5 != null ? new C0699k(r5) : null);
        C0713z a2 = f.a();
        C0698j c0698j = a2 != null ? new C0698j(a2) : null;
        H c = f.c();
        C0702n c0702n = c != null ? new C0702n(c) : null;
        B b = f.b();
    }
}
