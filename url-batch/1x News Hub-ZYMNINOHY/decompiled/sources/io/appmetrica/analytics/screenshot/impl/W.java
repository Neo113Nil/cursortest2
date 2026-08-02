package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final C1022e f9012a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f9013b;

    /* renamed from: c, reason: collision with root package name */
    public final C1033p f9014c;

    public W(C1022e c1022e, a0 a0Var, C1033p c1033p) {
        this.f9012a = c1022e;
        this.f9013b = a0Var;
        this.f9014c = c1033p;
    }

    public final C1022e a() {
        return this.f9012a;
    }

    public final C1033p b() {
        return this.f9014c;
    }

    public final a0 c() {
        return this.f9013b;
    }

    public final String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.f9012a + ", serviceCaptorConfig=" + this.f9013b + ", contentObserverCaptorConfig=" + this.f9014c + ')';
    }

    public W() {
        this(new C1022e(), new a0(), new C1033p());
    }
}
