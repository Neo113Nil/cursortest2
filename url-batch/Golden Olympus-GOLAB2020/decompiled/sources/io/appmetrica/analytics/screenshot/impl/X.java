package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes3.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40733a;

    /* renamed from: b, reason: collision with root package name */
    public final long f40734b;

    public X(boolean z4, long j4) {
        this.f40733a = z4;
        this.f40734b = j4;
    }

    public final long a() {
        return this.f40734b;
    }

    public final boolean b() {
        return this.f40733a;
    }

    public final String toString() {
        return "ServiceCaptorConfig(enabled=" + this.f40733a + ", delaySeconds=" + this.f40734b + ')';
    }

    public X() {
        this(new M().f40710a, new M().f40711b);
    }
}
