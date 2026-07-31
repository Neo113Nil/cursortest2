package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qr0 {

    /* renamed from: a, reason: collision with root package name */
    private final wl f10801a = new wl(true, 65536);

    /* renamed from: b, reason: collision with root package name */
    private long f10802b = 15000000;

    /* renamed from: c, reason: collision with root package name */
    private long f10803c = 30000000;

    /* renamed from: d, reason: collision with root package name */
    private long f10804d = 2500000;

    /* renamed from: e, reason: collision with root package name */
    private long f10805e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    private int f10806f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10807g;

    qr0() {
    }

    public final void a() {
        e(false);
    }

    public final void b() {
        e(true);
    }

    public final void c() {
        e(true);
    }

    public final void d(cf[] cfVarArr, al alVar, ml mlVar) {
        this.f10806f = 0;
        for (int i7 = 0; i7 < 2; i7++) {
            if (mlVar.a(i7) != null) {
                this.f10806f += zm.f(cfVarArr[i7].c());
            }
        }
        this.f10801a.f(this.f10806f);
    }

    final void e(boolean z6) {
        this.f10806f = 0;
        this.f10807g = false;
        if (z6) {
            this.f10801a.e();
        }
    }

    public final synchronized void f(int i7) {
        this.f10804d = i7 * 1000;
    }

    public final synchronized void g(int i7) {
        this.f10805e = i7 * 1000;
    }

    public final synchronized void h(int i7) {
        this.f10803c = i7 * 1000;
    }

    public final synchronized void i(int i7) {
        this.f10802b = i7 * 1000;
    }

    public final synchronized boolean j(long j7) {
        boolean z6;
        z6 = true;
        char c7 = j7 > this.f10803c ? (char) 0 : j7 < this.f10802b ? (char) 2 : (char) 1;
        int a7 = this.f10801a.a();
        int i7 = this.f10806f;
        if (c7 != 2 && (c7 != 1 || !this.f10807g || a7 >= i7)) {
            z6 = false;
        }
        this.f10807g = z6;
        return z6;
    }

    public final synchronized boolean k(long j7, boolean z6) {
        long j8;
        j8 = z6 ? this.f10805e : this.f10804d;
        return j8 <= 0 || j7 >= j8;
    }

    public final wl l() {
        return this.f10801a;
    }
}
