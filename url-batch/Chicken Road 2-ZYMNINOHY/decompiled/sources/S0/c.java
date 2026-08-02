package S0;

import y0.AbstractC1569a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f2398a;

    /* renamed from: b, reason: collision with root package name */
    public int f2399b;

    /* renamed from: c, reason: collision with root package name */
    public int f2400c;

    /* renamed from: d, reason: collision with root package name */
    public long f2401d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2402e;

    /* renamed from: f, reason: collision with root package name */
    public final W.u f2403f;

    /* renamed from: g, reason: collision with root package name */
    public final W.u f2404g;

    /* renamed from: h, reason: collision with root package name */
    public int f2405h;

    /* renamed from: i, reason: collision with root package name */
    public int f2406i;

    public c(W.u uVar, W.u uVar2, boolean z) {
        this.f2404g = uVar;
        this.f2403f = uVar2;
        this.f2402e = z;
        uVar2.M(12);
        this.f2398a = uVar2.D();
        uVar.M(12);
        this.f2406i = uVar.D();
        AbstractC1569a.e("first_chunk must be 1", uVar.m() == 1);
        this.f2399b = -1;
    }

    public final boolean a() {
        int i4 = this.f2399b + 1;
        this.f2399b = i4;
        if (i4 == this.f2398a) {
            return false;
        }
        boolean z = this.f2402e;
        W.u uVar = this.f2403f;
        this.f2401d = z ? uVar.F() : uVar.B();
        if (this.f2399b == this.f2405h) {
            W.u uVar2 = this.f2404g;
            this.f2400c = uVar2.D();
            uVar2.N(4);
            int i5 = this.f2406i - 1;
            this.f2406i = i5;
            this.f2405h = i5 > 0 ? uVar2.D() - 1 : -1;
        }
        return true;
    }
}
