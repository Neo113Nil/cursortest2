package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes3.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40697a;

    /* renamed from: b, reason: collision with root package name */
    public final T f40698b;

    public G(boolean z4, T t4) {
        this.f40697a = z4;
        this.f40698b = t4;
    }

    public final T a() {
        return this.f40698b;
    }

    public final boolean b() {
        return this.f40697a;
    }

    public final String toString() {
        return "RemoteScreenshotConfig(enabled=" + this.f40697a + ", config=" + this.f40698b + ')';
    }

    public G() {
        this(new O().f40717a, new T());
    }
}
