package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ej, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2539Ej implements InterfaceC3005br {

    /* renamed from: a, reason: collision with root package name */
    public final C2953au f24803a;

    /* renamed from: b, reason: collision with root package name */
    public final Ut f24804b;

    /* renamed from: c, reason: collision with root package name */
    public final C2540Ek f24805c;

    /* renamed from: d, reason: collision with root package name */
    public final C2591Hk f24806d;

    /* renamed from: e, reason: collision with root package name */
    public final C3439jt f24807e;

    /* renamed from: f, reason: collision with root package name */
    public final BinderC3754pk f24808f;

    /* renamed from: g, reason: collision with root package name */
    public final C2999bl f24809g;

    /* renamed from: h, reason: collision with root package name */
    public final C2625Jk f24810h;
    public final C4240yl i;

    /* renamed from: j, reason: collision with root package name */
    public final C3270gk f24811j;

    /* renamed from: k, reason: collision with root package name */
    public final C3758po f24812k;

    public AbstractC2539Ej(S0.q qVar) {
        this.f24803a = (C2953au) qVar.f2939a;
        this.f24804b = (Ut) qVar.f2940b;
        this.f24805c = (C2540Ek) qVar.f2941c;
        this.f24806d = (C2591Hk) qVar.f2942d;
        this.f24807e = (C3439jt) qVar.f2943e;
        this.f24808f = (BinderC3754pk) qVar.f2944f;
        this.f24809g = (C2999bl) qVar.f2945g;
        this.f24810h = (C2625Jk) qVar.f2946h;
        this.i = (C4240yl) qVar.i;
        this.f24811j = (C3270gk) qVar.f2947j;
        this.f24812k = (C3758po) qVar.f2948k;
    }

    public void a() {
        this.f24806d.e();
        this.f24810h.K(this);
    }

    public final void b() {
        C3758po c3758po;
        C3675oC c3675oC = this.f24804b.C0;
        if (c3675oC == null || c3675oC.isEmpty() || (c3758po = this.f24812k) == null) {
            return;
        }
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.I8)).booleanValue() || c3675oC.isEmpty()) {
            return;
        }
        SB listIterator = c3675oC.listIterator(0);
        while (listIterator.hasNext()) {
            C3812qo c3812qo = (C3812qo) listIterator.next();
            int[] iArr = c3812qo.f33879b;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 1) {
                    p2.j.f39798C.f39810k.getClass();
                    c3758po.a(1, c3812qo.f33878a, System.currentTimeMillis());
                    break;
                }
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3005br
    public final void m() {
        this.i.l();
    }
}
