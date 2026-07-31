package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class wt2 {

    /* renamed from: a, reason: collision with root package name */
    private final vt2 f13939a = new vt2();

    /* renamed from: b, reason: collision with root package name */
    private int f13940b;

    /* renamed from: c, reason: collision with root package name */
    private int f13941c;

    /* renamed from: d, reason: collision with root package name */
    private int f13942d;

    /* renamed from: e, reason: collision with root package name */
    private int f13943e;

    /* renamed from: f, reason: collision with root package name */
    private int f13944f;

    wt2() {
    }

    public final vt2 a() {
        vt2 clone = this.f13939a.clone();
        vt2 vt2Var = this.f13939a;
        vt2Var.f13495f = false;
        vt2Var.f13496g = false;
        return clone;
    }

    public final String b() {
        return "\n\tPool does not exist: " + this.f13942d + "\n\tNew pools created: " + this.f13940b + "\n\tPools removed: " + this.f13941c + "\n\tEntries added: " + this.f13944f + "\n\tNo entries retrieved: " + this.f13943e + "\n";
    }

    public final void c() {
        this.f13944f++;
    }

    public final void d() {
        this.f13940b++;
        this.f13939a.f13495f = true;
    }

    public final void e() {
        this.f13943e++;
    }

    public final void f() {
        this.f13942d++;
    }

    public final void g() {
        this.f13941c++;
        this.f13939a.f13496g = true;
    }
}
