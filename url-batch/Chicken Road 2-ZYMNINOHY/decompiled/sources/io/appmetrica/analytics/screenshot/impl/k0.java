package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f13483a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f13484b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f13485c;

    public k0(h0 h0Var, l0 l0Var, i0 i0Var) {
        this.f13483a = h0Var;
        this.f13484b = l0Var;
        this.f13485c = i0Var;
    }

    public final h0 a() {
        return this.f13483a;
    }

    public final i0 b() {
        return this.f13485c;
    }

    public final l0 c() {
        return this.f13484b;
    }

    public final String toString() {
        return "ServiceSideScreenshotConfig(apiCaptorConfig=" + this.f13483a + ", serviceCaptorConfig=" + this.f13484b + ", contentObserverCaptorConfig=" + this.f13485c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(W w4) {
        this(r2, r3, r5 != null ? new i0(r5) : null);
        C1147e a3 = w4.a();
        h0 h0Var = a3 != null ? new h0(a3) : null;
        a0 c4 = w4.c();
        l0 l0Var = c4 != null ? new l0(c4) : null;
        C1158p b4 = w4.b();
    }
}
