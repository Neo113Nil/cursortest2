package com.unity3d.player;

/* loaded from: classes2.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f9381a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9382b = !h.f9362c;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9383c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9384d = false;
    private boolean e = true;

    l() {
    }

    static void a() {
        f9381a = true;
    }

    static void b() {
        f9381a = false;
    }

    static boolean c() {
        return f9381a;
    }

    final void a(boolean z) {
        this.f9383c = z;
    }

    final void b(boolean z) {
        this.e = z;
    }

    final void c(boolean z) {
        this.f9384d = z;
    }

    final void d() {
        this.f9382b = true;
    }

    final boolean e() {
        return this.e;
    }

    final boolean f() {
        return f9381a && this.f9383c && this.f9382b && !this.e && !this.f9384d;
    }

    final boolean g() {
        return this.f9384d;
    }

    public final String toString() {
        return super.toString();
    }
}
