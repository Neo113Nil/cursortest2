package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10029a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f10030b;

    public j0(boolean z, k0 k0Var) {
        this.f10029a = z;
        this.f10030b = k0Var;
    }

    public final k0 a() {
        return this.f10030b;
    }

    public final boolean b() {
        return this.f10029a;
    }

    public final String toString() {
        return "ServiceSideRemoteScreenshotConfig(enabled=" + this.f10029a + ", config=" + this.f10030b + ')';
    }

    public j0() {
        this(new J());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(J j2) {
        this(r0, r3 != null ? new k0(r3) : null);
        boolean b6 = j2.b();
        W a6 = j2.a();
    }
}
