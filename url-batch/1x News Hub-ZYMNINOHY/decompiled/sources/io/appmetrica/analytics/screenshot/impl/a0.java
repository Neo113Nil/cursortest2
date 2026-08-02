package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9026a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9027b;

    public a0(boolean z, long j3) {
        this.f9026a = z;
        this.f9027b = j3;
    }

    public final long a() {
        return this.f9027b;
    }

    public final boolean b() {
        return this.f9026a;
    }

    public final String toString() {
        return "ServiceCaptorConfig(enabled=" + this.f9026a + ", delaySeconds=" + this.f9027b + ')';
    }

    public a0() {
        this(new P().f9002a, new P().f9003b);
    }
}
