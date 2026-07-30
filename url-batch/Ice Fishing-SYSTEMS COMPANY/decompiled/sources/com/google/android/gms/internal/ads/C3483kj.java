package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.kj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3483kj implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32438a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f32439b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f32440c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f32441d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4279zN f32442e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4279zN f32443f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4279zN f32444g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC4279zN f32445h;
    public final InterfaceC4279zN i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC4279zN f32446j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC4279zN f32447k;

    public C3483kj(C2726Pj c2726Pj, C4009uN c4009uN, C3699oj c3699oj, C3699oj c3699oj2, C3699oj c3699oj3, C3699oj c3699oj4, C2898Zl c2898Zl, C4009uN c4009uN2, C3006bs c3006bs, C4009uN c4009uN3) {
        this.f32438a = 0;
        this.f32442e = c2726Pj;
        this.f32439b = c4009uN;
        this.f32443f = c3699oj;
        this.f32444g = c3699oj2;
        this.f32445h = c3699oj3;
        this.i = c3699oj4;
        this.f32446j = c2898Zl;
        this.f32440c = c4009uN2;
        this.f32447k = c3006bs;
        this.f32441d = c4009uN3;
    }

    public C3429jj a() {
        S0.q b9 = ((C2726Pj) this.f32442e).b();
        Context context = (Context) this.f32439b.d();
        Vt vt = (Vt) ((C3699oj) this.f32443f).f33186b.f24455w;
        AbstractC3137eE.h(vt);
        View view = (View) ((C3699oj) this.f32444g).f33186b.f24454v;
        AbstractC3137eE.h(view);
        C2518Df c2518Df = ((C3699oj) this.f32445h).f33186b;
        InterfaceC2505Cj interfaceC2505Cj = (InterfaceC2505Cj) ((C3699oj) this.i).f33186b.f24453u;
        C4133wm c4133wm = (C4133wm) ((C2898Zl) this.f32446j).f29059b.f28862u;
        AbstractC3137eE.h(c4133wm);
        return new C3429jj(b9, context, vt, view, (InterfaceC3858rh) c2518Df.f24456x, interfaceC2505Cj, c4133wm, (C2541El) this.f32440c.d(), C4009uN.b((C3006bs) this.f32447k), (Executor) this.f32441d.d());
    }

    public C3813qp b() {
        C3214fi c3214fi = (C3214fi) ((C4117wN) this.f32442e).f34977a;
        Context a9 = ((C2860Xh) this.f32443f).a();
        C5107a b9 = ((C2860Xh) this.f32444g).b();
        C3226fu a10 = ((C3700ok) this.f32445h).a();
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        return new C3813qp(c3214fi, a9, b9, a10, c3157eg, (String) ((InterfaceC4063vN) this.i).d(), (Yu) this.f32439b.d(), (C3002bo) this.f32440c.d(), new C2837Wb(16), (ScheduledExecutorService) this.f32441d.d(), (Av) ((C4009uN) this.f32446j).d(), new C2897Zk(((C3861rk) this.f32447k).f34102b.d()));
    }

    public C2869Xq c() {
        C3214fi c3214fi = (C3214fi) ((C4117wN) this.f32442e).f34977a;
        C3646nk a9 = ((C3700ok) this.f32443f).f33188b.a();
        C3815qr c3815qr = (C3815qr) this.f32444g;
        C3862rl c3862rl = (C3862rl) this.f32445h;
        C2898Zl c2898Zl = (C2898Zl) this.i;
        return new C2869Xq(c3214fi, a9, c3815qr.f33898b, c3862rl.f34104b, c2898Zl.f29059b, (C2863Xk) ((C2471Aj) this.f32446j).f23885b.f28862u, (FrameLayout) ((Vx) ((C3913si) this.f32447k).f34260b).f28329u, (C3378il) this.f32439b.d(), (C2950ar) this.f32440c.d(), (C3706oq) this.f32441d.d());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f32438a) {
            case 0:
                return a();
            case 1:
                return new C3327hn(((C3700ok) this.f32442e).a(), (Executor) this.f32439b.d(), (C2628Jn) this.f32440c.d(), (Context) this.f32441d.d(), (C3165eo) ((C4009uN) this.f32443f).d(), (Av) ((C4009uN) this.f32444g).d(), (C2834Vp) ((C4009uN) this.f32445h).d(), (C4242yn) ((C4009uN) this.i).d(), (C3002bo) ((C4009uN) this.f32446j).d(), (C3758po) ((C4009uN) this.f32447k).d());
            case 2:
                return new C4188xn((C3808qk) this.f32439b.d(), (C2557Fk) this.f32440c.d(), (C2659Lk) this.f32441d.d(), (C2727Pk) ((C4009uN) this.f32442e).d(), (C3325hl) ((C4009uN) this.f32443f).d(), (C2507Cl) ((C4009uN) this.f32444g).d(), (C3165eo) ((C4009uN) this.f32445h).d(), (Av) ((C4009uN) this.i).d(), (C2834Vp) ((C4009uN) this.f32446j).d(), (C2657Li) ((C4009uN) this.f32447k).d());
            case 3:
                return b();
            case 4:
                return c();
            default:
                return new Yy((SD) this.f32439b.d(), (Zy) this.f32440c.d(), (C3391iz) this.f32441d.d(), (EnumC3714oy) ((C4117wN) this.f32442e).f34977a, (String) ((C4117wN) this.f32443f).f34977a, (C3830r6) ((C4117wN) this.f32444g).f34977a, (AN) this.f32445h, (AN) this.i, (AN) this.f32446j, (C4158xA) ((C4009uN) this.f32447k).d());
        }
    }

    public C3483kj(C3700ok c3700ok, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4009uN c4009uN4, C4009uN c4009uN5, C4009uN c4009uN6, C4009uN c4009uN7, C4009uN c4009uN8, C4009uN c4009uN9) {
        this.f32438a = 1;
        this.f32442e = c3700ok;
        this.f32439b = c4009uN;
        this.f32440c = c4009uN2;
        this.f32441d = c4009uN3;
        this.f32443f = c4009uN4;
        this.f32444g = c4009uN5;
        this.f32445h = c4009uN6;
        this.i = c4009uN7;
        this.f32446j = c4009uN8;
        this.f32447k = c4009uN9;
    }

    public /* synthetic */ C3483kj(C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, Object obj, Object obj2, Object obj3, InterfaceC4279zN interfaceC4279zN, InterfaceC4279zN interfaceC4279zN2, InterfaceC4279zN interfaceC4279zN3, C4009uN c4009uN4, int i) {
        this.f32438a = i;
        this.f32439b = c4009uN;
        this.f32440c = c4009uN2;
        this.f32441d = c4009uN3;
        this.f32442e = (InterfaceC4279zN) obj;
        this.f32443f = (InterfaceC4279zN) obj2;
        this.f32444g = (InterfaceC4279zN) obj3;
        this.f32445h = interfaceC4279zN;
        this.i = interfaceC4279zN2;
        this.f32446j = interfaceC4279zN3;
        this.f32447k = c4009uN4;
    }

    public C3483kj(C4117wN c4117wN, C2860Xh c2860Xh, C2860Xh c2860Xh2, C3700ok c3700ok, InterfaceC4063vN interfaceC4063vN, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4009uN c4009uN4, C3861rk c3861rk) {
        this.f32438a = 3;
        this.f32442e = c4117wN;
        this.f32443f = c2860Xh;
        this.f32444g = c2860Xh2;
        this.f32445h = c3700ok;
        this.i = interfaceC4063vN;
        this.f32439b = c4009uN;
        this.f32440c = c4009uN2;
        this.f32441d = c4009uN3;
        this.f32446j = c4009uN4;
        this.f32447k = c3861rk;
    }

    public C3483kj(C4117wN c4117wN, C3700ok c3700ok, C3815qr c3815qr, C3862rl c3862rl, C2898Zl c2898Zl, C2471Aj c2471Aj, C3913si c3913si, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3) {
        this.f32438a = 4;
        this.f32442e = c4117wN;
        this.f32443f = c3700ok;
        this.f32444g = c3815qr;
        this.f32445h = c3862rl;
        this.i = c2898Zl;
        this.f32446j = c2471Aj;
        this.f32447k = c3913si;
        this.f32439b = c4009uN;
        this.f32440c = c4009uN2;
        this.f32441d = c4009uN3;
    }
}
