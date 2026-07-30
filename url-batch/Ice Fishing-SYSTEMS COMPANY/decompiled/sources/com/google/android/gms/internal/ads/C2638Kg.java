package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Kg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2638Kg extends d1.f {

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC3858rh f25997v;

    /* renamed from: w, reason: collision with root package name */
    public final AbstractC2791Tg f25998w;

    /* renamed from: x, reason: collision with root package name */
    public final String f25999x;

    /* renamed from: y, reason: collision with root package name */
    public final String[] f26000y;

    public C2638Kg(InterfaceC3858rh interfaceC3858rh, AbstractC2791Tg abstractC2791Tg, String str, String[] strArr) {
        super(2);
        this.f25997v = interfaceC3858rh;
        this.f25998w = abstractC2791Tg;
        this.f25999x = str;
        this.f26000y = strArr;
        p2.j.f39798C.f39799A.f26358n.add(this);
    }

    @Override // d1.f
    public final void k() {
        try {
            this.f25998w.c(this.f25999x, this.f26000y);
        } finally {
            t2.G.f40858l.post(new RunnableC3068d(this));
        }
    }

    @Override // d1.f
    public final J3.a l() {
        return (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31419D2)).booleanValue() && (this.f25998w instanceof C2859Xg)) ? AbstractC3212fg.f30743f.b(new CallableC3454k7(2, this)) : super.l();
    }
}
