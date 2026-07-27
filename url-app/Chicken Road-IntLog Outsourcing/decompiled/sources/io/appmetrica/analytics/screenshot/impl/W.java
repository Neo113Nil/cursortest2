package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final C1173e f9992a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f9993b;

    /* renamed from: c, reason: collision with root package name */
    public final C1184p f9994c;

    public W(C1173e c1173e, a0 a0Var, C1184p c1184p) {
        this.f9992a = c1173e;
        this.f9993b = a0Var;
        this.f9994c = c1184p;
    }

    public final C1173e a() {
        return this.f9992a;
    }

    public final C1184p b() {
        return this.f9994c;
    }

    public final a0 c() {
        return this.f9993b;
    }

    public final String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.f9992a + ", serviceCaptorConfig=" + this.f9993b + ", contentObserverCaptorConfig=" + this.f9994c + ')';
    }

    public W() {
        this(new C1173e(), new a0(), new C1184p());
    }
}
