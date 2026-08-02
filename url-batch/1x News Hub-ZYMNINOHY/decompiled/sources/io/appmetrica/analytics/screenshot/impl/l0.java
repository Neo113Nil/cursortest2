package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9058a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9059b;

    public l0(boolean z, long j3) {
        this.f9058a = z;
        this.f9059b = j3;
    }

    public final long a() {
        return this.f9059b;
    }

    public final boolean b() {
        return this.f9058a;
    }

    public final String toString() {
        return "ServiceSideServiceCaptorConfig(enabled=" + this.f9058a + ", delaySeconds=" + this.f9059b + ')';
    }

    public l0(a0 a0Var) {
        this(a0Var.b(), a0Var.a());
    }
}
