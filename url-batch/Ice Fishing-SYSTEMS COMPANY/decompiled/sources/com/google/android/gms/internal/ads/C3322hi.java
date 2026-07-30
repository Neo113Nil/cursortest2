package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3322hi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31243a;

    /* renamed from: b, reason: collision with root package name */
    public final C3214fi f31244b;

    /* renamed from: c, reason: collision with root package name */
    public Ct f31245c;

    /* renamed from: d, reason: collision with root package name */
    public C3924st f31246d;

    /* renamed from: e, reason: collision with root package name */
    public C3809ql f31247e;

    /* renamed from: f, reason: collision with root package name */
    public C3646nk f31248f;

    public /* synthetic */ C3322hi(C3214fi c3214fi, int i) {
        this.f31243a = i;
        this.f31244b = c3214fi;
    }

    public C3375ii a() {
        AbstractC3137eE.j(C3809ql.class, this.f31247e);
        AbstractC3137eE.j(C3646nk.class, this.f31248f);
        return new C3375ii(this.f31244b, new C3431jl(22), this.f31247e, this.f31248f, new C3562m7(26), this.f31245c, this.f31246d);
    }

    public C3806qi b() {
        AbstractC3137eE.j(C3809ql.class, this.f31247e);
        AbstractC3137eE.j(C3646nk.class, this.f31248f);
        return new C3806qi(this.f31244b, new C3431jl(22), this.f31247e, this.f31248f, new C3562m7(26), this.f31245c, this.f31246d);
    }

    public final /* bridge */ Object c() {
        switch (this.f31243a) {
            case 0:
                return a();
            default:
                return b();
        }
    }
}
