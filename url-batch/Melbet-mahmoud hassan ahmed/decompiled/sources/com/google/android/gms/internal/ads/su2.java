package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class su2 {

    /* renamed from: a, reason: collision with root package name */
    private final long f11972a;

    /* renamed from: c, reason: collision with root package name */
    private long f11974c;

    /* renamed from: b, reason: collision with root package name */
    private final ru2 f11973b = new ru2();

    /* renamed from: d, reason: collision with root package name */
    private int f11975d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f11976e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f11977f = 0;

    public su2() {
        long b7 = y2.t.a().b();
        this.f11972a = b7;
        this.f11974c = b7;
    }

    public final int a() {
        return this.f11975d;
    }

    public final long b() {
        return this.f11972a;
    }

    public final long c() {
        return this.f11974c;
    }

    public final ru2 d() {
        ru2 clone = this.f11973b.clone();
        ru2 ru2Var = this.f11973b;
        ru2Var.f11422f = false;
        ru2Var.f11423g = 0;
        return clone;
    }

    public final String e() {
        return "Created: " + this.f11972a + " Last accessed: " + this.f11974c + " Accesses: " + this.f11975d + "\nEntries retrieved: Valid: " + this.f11976e + " Stale: " + this.f11977f;
    }

    public final void f() {
        this.f11974c = y2.t.a().b();
        this.f11975d++;
    }

    public final void g() {
        this.f11977f++;
        this.f11973b.f11423g++;
    }

    public final void h() {
        this.f11976e++;
        this.f11973b.f11422f = true;
    }
}
