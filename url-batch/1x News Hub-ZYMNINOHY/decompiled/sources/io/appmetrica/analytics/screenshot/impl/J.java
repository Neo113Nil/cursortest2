package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8989a;

    /* renamed from: b, reason: collision with root package name */
    public final W f8990b;

    public J(boolean z, W w3) {
        this.f8989a = z;
        this.f8990b = w3;
    }

    public final W a() {
        return this.f8990b;
    }

    public final boolean b() {
        return this.f8989a;
    }

    public final String toString() {
        return "RemoteScreenshotConfig(enabled=" + this.f8989a + ", config=" + this.f8990b + ')';
    }

    public J() {
        this(new S().f9009a, new W());
    }
}
