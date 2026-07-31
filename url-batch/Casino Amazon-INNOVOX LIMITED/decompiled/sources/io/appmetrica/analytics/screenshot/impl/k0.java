package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f1736a;
    public final l0 b;
    public final i0 c;

    public k0(h0 h0Var, l0 l0Var, i0 i0Var) {
        this.f1736a = h0Var;
        this.b = l0Var;
        this.c = i0Var;
    }

    public final h0 a() {
        return this.f1736a;
    }

    public final i0 b() {
        return this.c;
    }

    public final l0 c() {
        return this.b;
    }

    public final String toString() {
        return "ServiceSideScreenshotConfig(apiCaptorConfig=" + this.f1736a + ", serviceCaptorConfig=" + this.b + ", contentObserverCaptorConfig=" + this.c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(W w) {
        this(r2, r3, r5 != null ? new i0(r5) : null);
        C0693e a2 = w.a();
        h0 h0Var = a2 != null ? new h0(a2) : null;
        a0 c = w.c();
        l0 l0Var = c != null ? new l0(c) : null;
        C0704p b = w.b();
    }
}
