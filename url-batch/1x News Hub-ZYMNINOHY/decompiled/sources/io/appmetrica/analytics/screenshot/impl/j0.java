package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9048a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f9049b;

    public j0(boolean z, k0 k0Var) {
        this.f9048a = z;
        this.f9049b = k0Var;
    }

    public final k0 a() {
        return this.f9049b;
    }

    public final boolean b() {
        return this.f9048a;
    }

    public final String toString() {
        return "ServiceSideRemoteScreenshotConfig(enabled=" + this.f9048a + ", config=" + this.f9049b + ')';
    }

    public j0() {
        this(new J());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(J j3) {
        this(r0, r3 != null ? new k0(r3) : null);
        boolean b3 = j3.b();
        W a3 = j3.a();
    }
}
