package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes3.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final C3159e f40720a;

    /* renamed from: b, reason: collision with root package name */
    public final X f40721b;

    /* renamed from: c, reason: collision with root package name */
    public final C3169o f40722c;

    public T(C3159e c3159e, X x4, C3169o c3169o) {
        this.f40720a = c3159e;
        this.f40721b = x4;
        this.f40722c = c3169o;
    }

    public final C3159e a() {
        return this.f40720a;
    }

    public final C3169o b() {
        return this.f40722c;
    }

    public final X c() {
        return this.f40721b;
    }

    public final String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.f40720a + ", serviceCaptorConfig=" + this.f40721b + ", contentObserverCaptorConfig=" + this.f40722c + ')';
    }

    public T() {
        this(new C3159e(), new X(), new C3169o());
    }
}
