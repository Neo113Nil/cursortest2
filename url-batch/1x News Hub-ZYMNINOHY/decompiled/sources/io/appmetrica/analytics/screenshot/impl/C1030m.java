package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1030m {

    /* renamed from: a, reason: collision with root package name */
    public final C1027j f9060a;

    /* renamed from: b, reason: collision with root package name */
    public final C1031n f9061b;

    /* renamed from: c, reason: collision with root package name */
    public final C1028k f9062c;

    public C1030m(C1027j c1027j, C1031n c1031n, C1028k c1028k) {
        this.f9060a = c1027j;
        this.f9061b = c1031n;
        this.f9062c = c1028k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1030m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        }
        C1030m c1030m = (C1030m) obj;
        return kotlin.jvm.internal.j.a(this.f9060a, c1030m.f9060a) && kotlin.jvm.internal.j.a(this.f9061b, c1030m.f9061b) && kotlin.jvm.internal.j.a(this.f9062c, c1030m.f9062c);
    }

    public final int hashCode() {
        C1027j c1027j = this.f9060a;
        int hashCode = (c1027j != null ? c1027j.hashCode() : 0) * 31;
        C1031n c1031n = this.f9061b;
        int hashCode2 = (hashCode + (c1031n != null ? c1031n.hashCode() : 0)) * 31;
        C1028k c1028k = this.f9062c;
        return hashCode2 + (c1028k != null ? c1028k.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.f9060a + ", serviceCaptorConfig=" + this.f9061b + ", contentObserverCaptorConfig=" + this.f9062c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1030m(F f) {
        this(r2, r3, r5 != null ? new C1028k(r5) : null);
        C1042z a3 = f.a();
        C1027j c1027j = a3 != null ? new C1027j(a3) : null;
        H c3 = f.c();
        C1031n c1031n = c3 != null ? new C1031n(c3) : null;
        B b3 = f.b();
    }
}
