package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import q2.InterfaceC4922x;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.xj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4184xj implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35231a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f35232b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4279zN f35233c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f35234d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4279zN f35235e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4279zN f35236f;

    public C4184xj(C2860Xh c2860Xh, C2860Xh c2860Xh2, C2675Mj c2675Mj, InterfaceC4063vN interfaceC4063vN, C4009uN c4009uN) {
        this.f35231a = 9;
        this.f35234d = c2860Xh;
        this.f35236f = c2860Xh2;
        this.f35233c = c2675Mj;
        this.f35235e = interfaceC4063vN;
        this.f35232b = c4009uN;
    }

    public BinderC3754pk a() {
        return new BinderC3754pk(((C2675Mj) this.f35233c).a(), (String) ((C2675Mj) this.f35234d).f26371b.f32776w, (C3706oq) this.f35232b.d(), ((C2675Mj) this.f35235e).f26371b.u(), (String) ((C4009uN) this.f35236f).d());
    }

    public C2783Sp b() {
        return new C2783Sp(((C2860Xh) this.f35234d).a(), ((C2726Pj) this.f35235e).a(), (C2749Qp) this.f35232b.d(), ((C2637Kf) this.f35233c).a(), ((C2826Vh) this.f35236f).b());
    }

    public Ys c() {
        C2837Wb c2837Wb = new C2837Wb(18);
        Context a9 = ((C2860Xh) this.f35234d).a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f35232b.d();
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        G1.a aVar = ((C3115dt) this.f35235e).f30253b;
        return new Ys(c2837Wb, a9, scheduledExecutorService, c3157eg, aVar.f1194u, ((C2687Ne) ((C3115dt) this.f35233c).f30253b.f1195v).f26577E, ((C2687Ne) ((C3115dt) this.f35236f).f30253b.f1195v).f26576D);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f35231a) {
            case 0:
                return new C4130wj(((C2860Xh) this.f35234d).a(), (InterfaceC3858rh) ((C3699oj) this.f35235e).f33186b.f24456x, ((C2675Mj) this.f35233c).a(), ((C2860Xh) this.f35236f).b(), (C3276gq) this.f35232b.d());
            case 1:
                C2489Bk c2489Bk = (C2489Bk) this.f35232b.d();
                Ut a9 = ((C2675Mj) this.f35233c).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((C4009uN) this.f35234d).d();
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new C3216fk(c2489Bk, a9, scheduledExecutorService, c3157eg, (String) ((C2675Mj) this.f35235e).f26371b.f32776w, (C2778Sk) ((C4009uN) this.f35236f).d());
            case 2:
                return new C3484kk(((C2675Mj) this.f35234d).b(), ((C2675Mj) this.f35233c).a(), (S2.a) this.f35232b.d(), (C3165eo) ((C4009uN) this.f35235e).d(), (ScheduledExecutorService) ((C4009uN) this.f35236f).d());
            case 3:
                return a();
            case 4:
                return new C2796Tl(((C2860Xh) this.f35234d).a(), (InterfaceC3858rh) ((C2677Ml) this.f35235e).f26373b.f28863v, ((C2675Mj) this.f35233c).a(), ((C2860Xh) this.f35236f).b(), (C3276gq) this.f35232b.d());
            case 5:
                Map d2 = ((C4171xN) this.f35234d).d();
                Map d3 = ((C4171xN) this.f35235e).d();
                Map d9 = ((C4171xN) this.f35233c).d();
                C4133wm c4133wm = (C4133wm) ((C2898Zl) this.f35236f).f29059b.f28862u;
                AbstractC3137eE.h(c4133wm);
                return new C2864Xl(d2, d3, d9, this.f35232b, c4133wm);
            case 6:
                Context a10 = ((C2860Xh) this.f35234d).a();
                String packageName = ((C2877Yh) this.f35235e).f28846b.a().getPackageName();
                AbstractC3137eE.h(packageName);
                C5107a b9 = ((C2860Xh) this.f35236f).b();
                EnumC2969b9 enumC2969b9 = (EnumC2969b9) this.f35233c.d();
                String str = (String) this.f35232b.d();
                C2914a9 c2914a9 = new C2914a9(new com.bumptech.glide.manager.o(a10, 6));
                C3833r9 B8 = C3887s9.B();
                int i = b9.f41218u;
                B8.h();
                ((C3887s9) B8.f30000u).C(i);
                int i4 = b9.f41219v;
                B8.h();
                ((C3887s9) B8.f30000u).D(i4);
                int i9 = true != b9.f41220w ? 2 : 0;
                B8.h();
                ((C3887s9) B8.f30000u).A(i9);
                c2914a9.a(new C2518Df(enumC2969b9, packageName, (C3887s9) B8.j(), str, 15));
                return c2914a9;
            case 7:
                Context a11 = ((C2860Xh) this.f35234d).a();
                C3157eg c3157eg2 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg2);
                C2837Wb c2837Wb = new C2837Wb(16);
                C3214fi c3214fi = (C3214fi) ((C2996bi) this.f35235e).f29551b.f34977a;
                AbstractC3137eE.h(c3214fi);
                return new BinderC2630Jp(a11, c3157eg2, c2837Wb, c3214fi, new Rx(28, ((C2941ai) ((C3913si) this.f35233c).f34260b).a()), (ArrayDeque) this.f35232b.d(), (Zu) ((C4009uN) this.f35236f).d());
            case 8:
                return b();
            case 9:
                return new C3276gq(((C2860Xh) this.f35234d).a(), ((C2860Xh) this.f35236f).b(), ((C2675Mj) this.f35233c).a(), (InterfaceC3858rh) ((InterfaceC4063vN) this.f35235e).d(), (C3165eo) this.f35232b.d());
            case 10:
                return new C2852Wq((C3214fi) ((C4117wN) this.f35234d).f34977a, ((C3700ok) this.f35235e).f33188b.a(), ((C3862rl) this.f35233c).f34104b, (C2950ar) this.f35232b.d(), (C3706oq) ((C4009uN) this.f35236f).d());
            case 11:
                S2.a aVar = (S2.a) this.f35232b.d();
                C3323hj c3323hj = (C3323hj) this.f35235e;
                C3602mu c3602mu = new C3602mu((C3494ku) c3323hj.f31250b.d(), (C2764Rn) c3323hj.f31251c.d(), (C3165eo) c3323hj.f31252d.d(), 14);
                C3706oq c3706oq = (C3706oq) ((C4009uN) this.f35233c).d();
                Av av = (Av) ((C4009uN) this.f35236f).d();
                C2950ar c2950ar = (C2950ar) ((C3562m7) this.f35234d).f32668u;
                return c2950ar != null ? c2950ar : new C2950ar(aVar, c3602mu, c3706oq, av);
            case 12:
                return new C2563Fq((Context) this.f35232b.d(), (C3482ki) ((C4117wN) this.f35234d).f34977a, (Ou) ((C4009uN) this.f35235e).d(), (SD) ((C4009uN) this.f35233c).d(), (C3744pa) ((C3815qr) this.f35236f).f33898b.f33523u);
            case 13:
                return new BinderC4300zr((Context) this.f35232b.d(), (InterfaceC4922x) ((C2898Zl) this.f35234d).f29059b.f28863v, ((C3700ok) this.f35235e).a(), ((C3483kj) ((C3913si) this.f35233c).f34260b).a(), (C3165eo) ((C4009uN) this.f35236f).d());
            case 14:
                return c();
            default:
                return e();
        }
    }

    public C3170et e() {
        C2892Zf c2892Zf = (C2892Zf) this.f35232b.d();
        boolean z8 = ((C2687Ne) ((C3115dt) this.f35234d).f30253b.f1195v).f26576D;
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        AbstractC3137eE.h(((C2687Ne) ((C3115dt) this.f35235e).f30253b.f1195v).f26582w);
        return new C3170et(c2892Zf, z8, c3157eg, (ScheduledExecutorService) ((C4009uN) this.f35233c).d(), ((C3115dt) this.f35236f).a().intValue());
    }

    public C4184xj(C2860Xh c2860Xh, C2877Yh c2877Yh, C2860Xh c2860Xh2, InterfaceC4279zN interfaceC4279zN, C4009uN c4009uN) {
        this.f35231a = 6;
        this.f35234d = c2860Xh;
        this.f35235e = c2877Yh;
        this.f35236f = c2860Xh2;
        this.f35233c = interfaceC4279zN;
        this.f35232b = c4009uN;
    }

    public C4184xj(C2860Xh c2860Xh, C2726Pj c2726Pj, C4009uN c4009uN, C2637Kf c2637Kf, C2826Vh c2826Vh) {
        this.f35231a = 8;
        this.f35234d = c2860Xh;
        this.f35235e = c2726Pj;
        this.f35232b = c4009uN;
        this.f35233c = c2637Kf;
        this.f35236f = c2826Vh;
    }

    public /* synthetic */ C4184xj(C2860Xh c2860Xh, InterfaceC4063vN interfaceC4063vN, C2675Mj c2675Mj, C2860Xh c2860Xh2, C4009uN c4009uN, int i) {
        this.f35231a = i;
        this.f35234d = c2860Xh;
        this.f35235e = interfaceC4063vN;
        this.f35233c = c2675Mj;
        this.f35236f = c2860Xh2;
        this.f35232b = c4009uN;
    }

    public C4184xj(C2675Mj c2675Mj, C2675Mj c2675Mj2, C4009uN c4009uN, C2675Mj c2675Mj3, C4009uN c4009uN2) {
        this.f35231a = 3;
        this.f35233c = c2675Mj;
        this.f35234d = c2675Mj2;
        this.f35232b = c4009uN;
        this.f35235e = c2675Mj3;
        this.f35236f = c4009uN2;
    }

    public C4184xj(C2675Mj c2675Mj, C2675Mj c2675Mj2, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3) {
        this.f35231a = 2;
        this.f35234d = c2675Mj;
        this.f35233c = c2675Mj2;
        this.f35232b = c4009uN;
        this.f35235e = c4009uN2;
        this.f35236f = c4009uN3;
    }

    public C4184xj(C4009uN c4009uN, C2675Mj c2675Mj, C4009uN c4009uN2, C2675Mj c2675Mj2, C4009uN c4009uN3) {
        this.f35231a = 1;
        this.f35232b = c4009uN;
        this.f35233c = c2675Mj;
        this.f35234d = c4009uN2;
        this.f35235e = c2675Mj2;
        this.f35236f = c4009uN3;
    }

    public /* synthetic */ C4184xj(C4009uN c4009uN, InterfaceC4063vN interfaceC4063vN, InterfaceC4279zN interfaceC4279zN, InterfaceC4279zN interfaceC4279zN2, InterfaceC4279zN interfaceC4279zN3, int i) {
        this.f35231a = i;
        this.f35232b = c4009uN;
        this.f35234d = interfaceC4063vN;
        this.f35235e = interfaceC4279zN;
        this.f35233c = interfaceC4279zN2;
        this.f35236f = interfaceC4279zN3;
    }

    public /* synthetic */ C4184xj(InterfaceC4063vN interfaceC4063vN, InterfaceC4063vN interfaceC4063vN2, InterfaceC4063vN interfaceC4063vN3, C4009uN c4009uN, InterfaceC4279zN interfaceC4279zN, int i) {
        this.f35231a = i;
        this.f35234d = interfaceC4063vN;
        this.f35235e = interfaceC4063vN2;
        this.f35233c = interfaceC4063vN3;
        this.f35232b = c4009uN;
        this.f35236f = interfaceC4279zN;
    }

    public /* synthetic */ C4184xj(Object obj, C4009uN c4009uN, InterfaceC4063vN interfaceC4063vN, InterfaceC4279zN interfaceC4279zN, InterfaceC4279zN interfaceC4279zN2, int i) {
        this.f35231a = i;
        this.f35234d = obj;
        this.f35232b = c4009uN;
        this.f35235e = interfaceC4063vN;
        this.f35233c = interfaceC4279zN;
        this.f35236f = interfaceC4279zN2;
    }
}
