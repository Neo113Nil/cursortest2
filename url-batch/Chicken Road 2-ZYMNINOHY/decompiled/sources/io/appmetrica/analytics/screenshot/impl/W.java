package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final C1147e f13441a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f13442b;

    /* renamed from: c, reason: collision with root package name */
    public final C1158p f13443c;

    public W(C1147e c1147e, a0 a0Var, C1158p c1158p) {
        this.f13441a = c1147e;
        this.f13442b = a0Var;
        this.f13443c = c1158p;
    }

    public final C1147e a() {
        return this.f13441a;
    }

    public final C1158p b() {
        return this.f13443c;
    }

    public final a0 c() {
        return this.f13442b;
    }

    public final String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.f13441a + ", serviceCaptorConfig=" + this.f13442b + ", contentObserverCaptorConfig=" + this.f13443c + ')';
    }

    public W() {
        this(new C1147e(), new a0(), new C1158p());
    }
}
