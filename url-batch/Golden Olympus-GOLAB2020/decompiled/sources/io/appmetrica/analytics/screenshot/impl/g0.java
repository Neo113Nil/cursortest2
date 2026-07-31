package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40756a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f40757b;

    public g0(boolean z4, h0 h0Var) {
        this.f40756a = z4;
        this.f40757b = h0Var;
    }

    public final h0 a() {
        return this.f40757b;
    }

    public final boolean b() {
        return this.f40756a;
    }

    public final String toString() {
        return "ServiceSideRemoteScreenshotConfig(enabled=" + this.f40756a + ", config=" + this.f40757b + ')';
    }

    public g0() {
        this(new G());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g0(G g4) {
        this(r0, r3 != null ? new h0(r3) : null);
        boolean b4 = g4.b();
        T a4 = g4.a();
    }
}
