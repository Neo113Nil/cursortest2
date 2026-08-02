package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13418a;

    /* renamed from: b, reason: collision with root package name */
    public final W f13419b;

    public J(boolean z, W w4) {
        this.f13418a = z;
        this.f13419b = w4;
    }

    public final W a() {
        return this.f13419b;
    }

    public final boolean b() {
        return this.f13418a;
    }

    public final String toString() {
        return "RemoteScreenshotConfig(enabled=" + this.f13418a + ", config=" + this.f13419b + ')';
    }

    public J() {
        this(new S().f13438a, new W());
    }
}
