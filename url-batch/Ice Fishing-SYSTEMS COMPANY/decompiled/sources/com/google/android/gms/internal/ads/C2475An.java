package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.An, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2475An implements InterfaceC3530lc {

    /* renamed from: n, reason: collision with root package name */
    public final C2557Fk f23898n;

    /* renamed from: u, reason: collision with root package name */
    public final C2938af f23899u;

    /* renamed from: v, reason: collision with root package name */
    public final String f23900v;

    /* renamed from: w, reason: collision with root package name */
    public final String f23901w;

    public C2475An(C2557Fk c2557Fk, Ut ut) {
        this.f23898n = c2557Fk;
        this.f23899u = ut.f28160l;
        this.f23900v = ut.f28156j;
        this.f23901w = ut.f28158k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3530lc
    public final void F(C2938af c2938af) {
        int i;
        String str;
        C2938af c2938af2 = this.f23899u;
        if (c2938af2 != null) {
            c2938af = c2938af2;
        }
        if (c2938af != null) {
            str = c2938af.f29239n;
            i = c2938af.f29240u;
        } else {
            i = 1;
            str = "";
        }
        BinderC2772Se binderC2772Se = new BinderC2772Se(str, i);
        C2557Fk c2557Fk = this.f23898n;
        c2557Fk.getClass();
        c2557Fk.u1(new C3602mu(binderC2772Se, this.f23900v, this.f23901w, 8));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3530lc
    public final void a() {
        this.f23898n.u1(C2943ak.f29271A);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3530lc
    public final void x() {
        this.f23898n.u1(C2943ak.f29272B);
    }
}
