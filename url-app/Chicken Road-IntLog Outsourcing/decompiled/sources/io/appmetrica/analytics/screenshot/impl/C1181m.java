package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1181m {

    /* renamed from: a, reason: collision with root package name */
    public final C1178j f10041a;

    /* renamed from: b, reason: collision with root package name */
    public final C1182n f10042b;

    /* renamed from: c, reason: collision with root package name */
    public final C1179k f10043c;

    public C1181m(C1178j c1178j, C1182n c1182n, C1179k c1179k) {
        this.f10041a = c1178j;
        this.f10042b = c1182n;
        this.f10043c = c1179k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1181m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        }
        C1181m c1181m = (C1181m) obj;
        return kotlin.jvm.internal.i.a(this.f10041a, c1181m.f10041a) && kotlin.jvm.internal.i.a(this.f10042b, c1181m.f10042b) && kotlin.jvm.internal.i.a(this.f10043c, c1181m.f10043c);
    }

    public final int hashCode() {
        C1178j c1178j = this.f10041a;
        int hashCode = (c1178j != null ? c1178j.hashCode() : 0) * 31;
        C1182n c1182n = this.f10042b;
        int hashCode2 = (hashCode + (c1182n != null ? c1182n.hashCode() : 0)) * 31;
        C1179k c1179k = this.f10043c;
        return hashCode2 + (c1179k != null ? c1179k.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.f10041a + ", serviceCaptorConfig=" + this.f10042b + ", contentObserverCaptorConfig=" + this.f10043c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1181m(F f3) {
        this(r2, r3, r5 != null ? new C1179k(r5) : null);
        C1193z a6 = f3.a();
        C1178j c1178j = a6 != null ? new C1178j(a6) : null;
        H c2 = f3.c();
        C1182n c1182n = c2 != null ? new C1182n(c2) : null;
        B b6 = f3.b();
    }
}
