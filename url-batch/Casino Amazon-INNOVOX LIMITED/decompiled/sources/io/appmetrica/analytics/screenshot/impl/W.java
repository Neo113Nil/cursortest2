package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes3.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final C0693e f1717a;
    public final a0 b;
    public final C0704p c;

    public W(C0693e c0693e, a0 a0Var, C0704p c0704p) {
        this.f1717a = c0693e;
        this.b = a0Var;
        this.c = c0704p;
    }

    public final C0693e a() {
        return this.f1717a;
    }

    public final C0704p b() {
        return this.c;
    }

    public final a0 c() {
        return this.b;
    }

    public final String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.f1717a + ", serviceCaptorConfig=" + this.b + ", contentObserverCaptorConfig=" + this.c + ')';
    }

    public W() {
        this(new C0693e(), new a0(), new C0704p());
    }
}
