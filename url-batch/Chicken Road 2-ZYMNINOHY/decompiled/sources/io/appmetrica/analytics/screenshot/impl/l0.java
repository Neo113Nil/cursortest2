package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13488a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13489b;

    public l0(boolean z, long j4) {
        this.f13488a = z;
        this.f13489b = j4;
    }

    public final long a() {
        return this.f13489b;
    }

    public final boolean b() {
        return this.f13488a;
    }

    public final String toString() {
        return "ServiceSideServiceCaptorConfig(enabled=" + this.f13488a + ", delaySeconds=" + this.f13489b + ')';
    }

    public l0(a0 a0Var) {
        this(a0Var.b(), a0Var.a());
    }
}
