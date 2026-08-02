package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13478a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f13479b;

    public j0(boolean z, k0 k0Var) {
        this.f13478a = z;
        this.f13479b = k0Var;
    }

    public final k0 a() {
        return this.f13479b;
    }

    public final boolean b() {
        return this.f13478a;
    }

    public final String toString() {
        return "ServiceSideRemoteScreenshotConfig(enabled=" + this.f13478a + ", config=" + this.f13479b + ')';
    }

    public j0() {
        this(new J());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(J j4) {
        this(r0, r3 != null ? new k0(r3) : null);
        boolean b4 = j4.b();
        W a3 = j4.a();
    }
}
