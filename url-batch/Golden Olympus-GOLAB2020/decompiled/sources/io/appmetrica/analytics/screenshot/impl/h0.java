package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f40758a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f40759b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f40760c;

    public h0(e0 e0Var, i0 i0Var, f0 f0Var) {
        this.f40758a = e0Var;
        this.f40759b = i0Var;
        this.f40760c = f0Var;
    }

    public final e0 a() {
        return this.f40758a;
    }

    public final f0 b() {
        return this.f40760c;
    }

    public final i0 c() {
        return this.f40759b;
    }

    public final String toString() {
        return "ServiceSideScreenshotConfig(apiCaptorConfig=" + this.f40758a + ", serviceCaptorConfig=" + this.f40759b + ", contentObserverCaptorConfig=" + this.f40760c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h0(T t4) {
        this(r2, r3, r5 != null ? new f0(r5) : null);
        C3159e a4 = t4.a();
        e0 e0Var = a4 != null ? new e0(a4) : null;
        X c4 = t4.c();
        i0 i0Var = c4 != null ? new i0(c4) : null;
        C3169o b4 = t4.b();
    }
}
