package com.google.android.gms.internal.ads;

import java.util.Objects;
import m1.C4776c;
import q2.InterfaceC4921w0;

/* renamed from: com.google.android.gms.internal.ads.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3878s0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34154n = 2;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f34155u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f34156v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f34157w;

    public /* synthetic */ RunnableC3878s0(C3932t0 c3932t0, Object obj, long j9) {
        this.f34156v = c3932t0;
        this.f34157w = obj;
        this.f34155u = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j9 = this.f34155u;
        Object obj = this.f34156v;
        Object obj2 = this.f34157w;
        switch (this.f34154n) {
            case 0:
                C3932t0 c3932t0 = (C3932t0) obj;
                c3932t0.getClass();
                String str = AbstractC3548lu.f32613a;
                C3093dO c3093dO = c3932t0.f34333b.f28243n;
                OO oo = c3093dO.f30021L;
                KO z8 = oo.z();
                oo.s(z8, 26, new C4086vt(z8, obj2, j9));
                if (c3093dO.f30042u0 == obj2) {
                    C3307hK c3307hK = C3307hK.f31227v;
                    C3759pp c3759pp = c3093dO.f30013G;
                    c3759pp.c(26, c3307hK);
                    c3759pp.d();
                    break;
                }
                break;
            case 1:
                AbstractC3074d5 abstractC3074d5 = (AbstractC3074d5) obj2;
                abstractC3074d5.f29793n.a((String) obj, j9);
                abstractC3074d5.f29793n.b(abstractC3074d5.toString());
                break;
            case 2:
                Hv hv = (Hv) obj2;
                if (hv.f25461q != null) {
                    InterfaceC4921w0 interfaceC4921w0 = (InterfaceC4921w0) obj;
                    hv.f25461q.y("paa", "pano_ts", this.f34155u, hv.s(), hv.t(), !(interfaceC4921w0 instanceof BinderC3754pk) ? null : ((BinderC3754pk) interfaceC4921w0).f33487w, hv.f25463s, hv.g());
                    break;
                }
                break;
            default:
                C4776c c4776c = (C4776c) obj2;
                c4776c.f39562n.a((String) obj, j9);
                c4776c.f39562n.b(c4776c.toString());
                break;
        }
    }

    public RunnableC3878s0(AbstractC3074d5 abstractC3074d5, String str, long j9) {
        this.f34156v = str;
        this.f34155u = j9;
        Objects.requireNonNull(abstractC3074d5);
        this.f34157w = abstractC3074d5;
    }

    public RunnableC3878s0(Hv hv, long j9, InterfaceC4921w0 interfaceC4921w0) {
        this.f34155u = j9;
        this.f34156v = interfaceC4921w0;
        Objects.requireNonNull(hv);
        this.f34157w = hv;
    }

    public RunnableC3878s0(C4776c c4776c, String str, long j9) {
        this.f34157w = c4776c;
        this.f34156v = str;
        this.f34155u = j9;
    }
}
