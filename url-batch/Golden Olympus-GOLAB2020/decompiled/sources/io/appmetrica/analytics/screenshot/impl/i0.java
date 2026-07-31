package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40762a;

    /* renamed from: b, reason: collision with root package name */
    public final long f40763b;

    public i0(boolean z4, long j4) {
        this.f40762a = z4;
        this.f40763b = j4;
    }

    public final long a() {
        return this.f40763b;
    }

    public final boolean b() {
        return this.f40762a;
    }

    public final String toString() {
        return "ServiceSideServiceCaptorConfig(enabled=" + this.f40762a + ", delaySeconds=" + this.f40763b + ')';
    }

    public i0(X x4) {
        this(x4.b(), x4.a());
    }
}
