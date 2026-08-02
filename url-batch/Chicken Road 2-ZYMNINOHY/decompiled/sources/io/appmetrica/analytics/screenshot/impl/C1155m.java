package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1155m {

    /* renamed from: a, reason: collision with root package name */
    public final C1152j f13490a;

    /* renamed from: b, reason: collision with root package name */
    public final C1156n f13491b;

    /* renamed from: c, reason: collision with root package name */
    public final C1153k f13492c;

    public C1155m(C1152j c1152j, C1156n c1156n, C1153k c1153k) {
        this.f13490a = c1152j;
        this.f13491b = c1156n;
        this.f13492c = c1153k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1155m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        }
        C1155m c1155m = (C1155m) obj;
        return kotlin.jvm.internal.i.a(this.f13490a, c1155m.f13490a) && kotlin.jvm.internal.i.a(this.f13491b, c1155m.f13491b) && kotlin.jvm.internal.i.a(this.f13492c, c1155m.f13492c);
    }

    public final int hashCode() {
        C1152j c1152j = this.f13490a;
        int hashCode = (c1152j != null ? c1152j.hashCode() : 0) * 31;
        C1156n c1156n = this.f13491b;
        int hashCode2 = (hashCode + (c1156n != null ? c1156n.hashCode() : 0)) * 31;
        C1153k c1153k = this.f13492c;
        return hashCode2 + (c1153k != null ? c1153k.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.f13490a + ", serviceCaptorConfig=" + this.f13491b + ", contentObserverCaptorConfig=" + this.f13492c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1155m(F f4) {
        this(r2, r3, r5 != null ? new C1153k(r5) : null);
        C1167z a3 = f4.a();
        C1152j c1152j = a3 != null ? new C1152j(a3) : null;
        H c4 = f4.c();
        C1156n c1156n = c4 != null ? new C1156n(c4) : null;
        B b4 = f4.b();
    }
}
