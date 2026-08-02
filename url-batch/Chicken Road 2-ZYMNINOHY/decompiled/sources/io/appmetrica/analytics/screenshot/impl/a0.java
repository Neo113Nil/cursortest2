package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13455a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13456b;

    public a0(boolean z, long j4) {
        this.f13455a = z;
        this.f13456b = j4;
    }

    public final long a() {
        return this.f13456b;
    }

    public final boolean b() {
        return this.f13455a;
    }

    public final String toString() {
        return "ServiceCaptorConfig(enabled=" + this.f13455a + ", delaySeconds=" + this.f13456b + ')';
    }

    public a0() {
        this(new P().f13431a, new P().f13432b);
    }
}
