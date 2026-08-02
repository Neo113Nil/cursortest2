package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f9053a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f9054b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f9055c;

    public k0(h0 h0Var, l0 l0Var, i0 i0Var) {
        this.f9053a = h0Var;
        this.f9054b = l0Var;
        this.f9055c = i0Var;
    }

    public final h0 a() {
        return this.f9053a;
    }

    public final i0 b() {
        return this.f9055c;
    }

    public final l0 c() {
        return this.f9054b;
    }

    public final String toString() {
        return "ServiceSideScreenshotConfig(apiCaptorConfig=" + this.f9053a + ", serviceCaptorConfig=" + this.f9054b + ", contentObserverCaptorConfig=" + this.f9055c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(W w3) {
        this(r2, r3, r5 != null ? new i0(r5) : null);
        C1022e a3 = w3.a();
        h0 h0Var = a3 != null ? new h0(a3) : null;
        a0 c3 = w3.c();
        l0 l0Var = c3 != null ? new l0(c3) : null;
        C1033p b3 = w3.b();
    }
}
