package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9969a;

    /* renamed from: b, reason: collision with root package name */
    public final W f9970b;

    public J(boolean z, W w3) {
        this.f9969a = z;
        this.f9970b = w3;
    }

    public final W a() {
        return this.f9970b;
    }

    public final boolean b() {
        return this.f9969a;
    }

    public final String toString() {
        return "RemoteScreenshotConfig(enabled=" + this.f9969a + ", config=" + this.f9970b + ')';
    }

    public J() {
        this(new S().f9989a, new W());
    }
}
