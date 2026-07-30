package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Mi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2674Mi implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26363a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4279zN f26364b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f26365c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4279zN f26366d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4279zN f26367e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4279zN f26368f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4279zN f26369g;

    public C2674Mi(C2860Xh c2860Xh, C2826Vh c2826Vh, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4009uN c4009uN4) {
        this.f26363a = 0;
        this.f26364b = c2860Xh;
        this.f26366d = c2826Vh;
        this.f26365c = c4009uN;
        this.f26367e = c4009uN2;
        this.f26368f = c4009uN3;
        this.f26369g = c4009uN4;
    }

    public S0.q a() {
        Context a9 = ((C2860Xh) this.f26364b).a();
        Yu yu = (Yu) this.f26365c.d();
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        return new S0.q(a9, yu, c3157eg, (ScheduledExecutorService) ((C4009uN) this.f26367e).d(), (InterfaceC2573Gj) ((C4009uN) this.f26368f).d(), (C2950ar) ((C4009uN) this.f26369g).d(), (C4304zv) ((C4009uN) this.f26366d).d());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f26363a) {
            case 0:
                Context a9 = ((C2860Xh) this.f26364b).a();
                t2.E b9 = ((C2826Vh) this.f26366d).b();
                C3383iq c3383iq = (C3383iq) this.f26365c.d();
                C2679Mn c2679Mn = (C2679Mn) ((C4009uN) this.f26367e).d();
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new C2657Li(a9, b9, c3383iq, c2679Mn, c3157eg, (SD) ((C4009uN) this.f26368f).d(), (ScheduledExecutorService) ((C4009uN) this.f26369g).d());
            case 1:
                C3807qj c3807qj = (C3807qj) this.f26366d;
                C2535Ef c2535Ef = new C2535Ef(c3807qj.f33854b.a(), c3807qj.f33855c.a().f30904g);
                Context a10 = ((C2860Xh) this.f26364b).a();
                C2569Gf c2569Gf = (C2569Gf) this.f26365c.d();
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) ((C2677Ml) this.f26367e).f26373b.f28863v;
                return new C2847Wl(c2535Ef, a10, c2569Gf, interfaceC3858rh == null ? null : interfaceC3858rh.s(), (EnumC2969b9) ((InterfaceC4063vN) this.f26368f).d(), ((C2675Mj) this.f26369g).a());
            case 2:
                C3214fi c3214fi = (C3214fi) ((C4117wN) this.f26364b).f34977a;
                C3646nk a11 = ((C3700ok) this.f26366d).f33188b.a();
                C3862rl c3862rl = (C3862rl) this.f26367e;
                C2898Zl c2898Zl = (C2898Zl) this.f26368f;
                C2863Xk a12 = ((C3323hj) this.f26369g).a();
                C2950ar c2950ar = (C2950ar) this.f26365c.d();
                C3214fi c3214fi2 = c3214fi.f30795b;
                C3646nk c3646nk = new C3646nk(a11);
                C3562m7 c3562m7 = null;
                C3761pr c3761pr = new C3761pr(0, c3562m7);
                C2881Yl c2881Yl = new C2881Yl(26, a12, c3562m7);
                Vx vx = new Vx(16, c3562m7);
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31839y4)).booleanValue()) {
                    c3562m7 = new C3562m7(26);
                    c3562m7.f32668u = c2950ar;
                }
                C3809ql c3809ql = c3862rl.f34104b;
                AbstractC3137eE.j(C3809ql.class, c3809ql);
                if (c3562m7 == null) {
                    c3562m7 = new C3562m7(26);
                }
                C2881Yl c2881Yl2 = c2898Zl.f29059b;
                AbstractC3137eE.j(C2881Yl.class, c2881Yl2);
                InterfaceC2573Gj interfaceC2573Gj = (InterfaceC2573Gj) new C3482ki(c3214fi2, vx, c2881Yl2, new C3431jl(22), c3809ql, c3646nk, c3562m7, c3761pr, c2881Yl, null, null).f32331H0.d();
                AbstractC3137eE.h(interfaceC2573Gj);
                return interfaceC2573Gj;
            case 3:
                Context a13 = ((C2860Xh) this.f26364b).a();
                C3226fu a14 = ((C3700ok) this.f26366d).a();
                C2637Kf c2637Kf = (C2637Kf) this.f26369g;
                C3157eg c3157eg2 = AbstractC3212fg.f30739b;
                AbstractC3137eE.h(c3157eg2);
                C3157eg c3157eg3 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg3);
                C2518Df c2518Df = new C2518Df(c3157eg2, c3157eg3, new C3866rp((Context) ((C3220fo) c2637Kf.f25995b).f30888b.d(), c3157eg3, 0), C4009uN.b((C4184xj) c2637Kf.f25996c), 16);
                AbstractC3137eE.h(c3157eg3);
                return new C3705op(a13, a14, c2518Df, c3157eg3, (ScheduledExecutorService) this.f26365c.d(), (C2749Qp) ((C4009uN) this.f26367e).d(), (Yu) ((C4009uN) this.f26368f).d());
            case 4:
                return a();
            case 5:
                C3214fi c3214fi3 = (C3214fi) ((C4117wN) this.f26364b).f34977a;
                C2898Zl c2898Zl2 = (C2898Zl) this.f26366d;
                return new C2818Uq(c3214fi3, c2898Zl2.f29059b, ((C3700ok) this.f26368f).f33188b.a(), ((C3862rl) this.f26369g).f34104b, (C2950ar) this.f26365c.d(), (C3706oq) ((C4009uN) this.f26367e).d());
            case 6:
                return new C2818Uq((C3214fi) ((C4117wN) this.f26364b).f34977a, ((C3700ok) this.f26366d).f33188b.a(), ((C3815qr) this.f26368f).f33898b, ((C3862rl) this.f26369g).f34104b, (C2950ar) this.f26365c.d(), (C3706oq) ((C4009uN) this.f26367e).d());
            case 7:
                return new C2818Uq((C3214fi) ((C4117wN) this.f26364b).f34977a, ((C3700ok) this.f26366d).f33188b.a(), ((C3862rl) this.f26368f).f34104b, ((C3700ok) this.f26369g).f33188b.f32993d, (C2950ar) this.f26365c.d(), (C3706oq) ((C4009uN) this.f26367e).d());
            case 8:
                t2.E b10 = ((C2826Vh) this.f26366d).b();
                Context a15 = ((C2860Xh) this.f26364b).a();
                C3157eg c3157eg4 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg4);
                return new Ws(b10, a15, c3157eg4, (ScheduledExecutorService) this.f26365c.d(), new C3550lw(((C2877Yh) this.f26367e).f28846b.a()), ((C3700ok) this.f26368f).a(), ((C2860Xh) this.f26369g).b());
            case 9:
                return new C3493kt((Context) ((C4117wN) this.f26364b).f34977a, (Executor) this.f26365c.d(), (C3214fi) ((C4117wN) this.f26366d).f34977a, ((C2495Bq) this.f26368f).a(), (C3439jt) ((C4009uN) this.f26367e).d(), new C3171eu(), ((C2860Xh) this.f26369g).b());
            case 10:
                return new Pt((Context) ((C4117wN) this.f26364b).f34977a, (Executor) this.f26365c.d(), (C3214fi) ((C4117wN) this.f26366d).f34977a, ((C2495Bq) this.f26369g).a(), (Jt) ((C4009uN) this.f26367e).d(), new C3171eu(), (C3008bu) ((C4009uN) this.f26368f).d());
            case 11:
                return new C3386iu((Av) this.f26365c.d(), (C4250yv) ((C4009uN) this.f26367e).d(), ((C2675Mj) this.f26364b).a(), ((C2675Mj) this.f26366d).f26371b.u(), (C2657Li) ((C4009uN) this.f26368f).d(), (Yu) ((C4009uN) this.f26369g).d());
            case 12:
                Context a16 = ((C2860Xh) this.f26364b).a();
                C3157eg c3157eg5 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg5);
                return new Av(a16, c3157eg5, (TD) this.f26365c.d(), (u2.l) this.f26366d.d(), (C4250yv) ((C4009uN) this.f26367e).d(), (Zu) ((C4009uN) this.f26368f).d(), (C2775Sh) ((C4009uN) this.f26369g).d());
            case 13:
                return new Gv((Sv) this.f26365c.d(), ((C2941ai) this.f26369g).c(), ((C2860Xh) this.f26364b).a(), (S2.a) ((C4009uN) this.f26367e).d(), (Ev) ((C4009uN) this.f26368f).d(), ((C2826Vh) this.f26366d).b());
            case 14:
                return new Qy(C4009uN.b(this.f26365c), C4009uN.b((C4009uN) this.f26367e), C4009uN.b((C4009uN) this.f26368f), (C3066cy) ((C4117wN) this.f26364b).f34977a, (ExecutorService) ((C4117wN) this.f26366d).f34977a, (C4158xA) ((C4009uN) this.f26369g).d());
            case 15:
                return new C3876rz((C3830r6) ((C4117wN) this.f26364b).f34977a, (C3391iz) this.f26365c.d(), (EnumC3714oy) ((C4117wN) this.f26366d).f34977a, (Context) ((C4117wN) this.f26368f).f34977a, (Map) ((C4117wN) this.f26369g).f34977a, (C4158xA) ((C4009uN) this.f26367e).d());
            case 16:
                InterfaceC3457kA interfaceC3457kA = (InterfaceC3457kA) this.f26365c.d();
                Uz uz = (Uz) ((C4009uN) this.f26367e).d();
                InterfaceC2970bA interfaceC2970bA = (InterfaceC2970bA) ((C4009uN) this.f26368f).d();
                C4158xA c4158xA = (C4158xA) ((C4009uN) this.f26369g).d();
                InterfaceC3929sy interfaceC3929sy = (InterfaceC3929sy) ((C4009uN) this.f26364b).d();
                C3066cy c3066cy = (C3066cy) ((C4117wN) this.f26366d).f34977a;
                return new Ez(interfaceC3457kA, uz, interfaceC2970bA, c4158xA, interfaceC3929sy, c3066cy.X().E(), c3066cy.X().F(), c3066cy.X().G());
            default:
                return new Zz((Context) ((C4117wN) this.f26364b).f34977a, (ExecutorService) ((C4117wN) this.f26366d).f34977a, (C3066cy) ((C4117wN) this.f26369g).f34977a, (C3875ry) this.f26365c.d(), (C4158xA) ((C4009uN) this.f26367e).d(), (C2915aA) ((C4009uN) this.f26368f).d());
        }
    }

    public C2674Mi(C2860Xh c2860Xh, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4009uN c4009uN4, C4009uN c4009uN5) {
        this.f26363a = 4;
        this.f26364b = c2860Xh;
        this.f26365c = c4009uN;
        this.f26367e = c4009uN2;
        this.f26368f = c4009uN3;
        this.f26369g = c4009uN4;
        this.f26366d = c4009uN5;
    }

    public C2674Mi(C2860Xh c2860Xh, C4009uN c4009uN, InterfaceC4279zN interfaceC4279zN, C4009uN c4009uN2, C4009uN c4009uN3, C4009uN c4009uN4) {
        this.f26363a = 12;
        this.f26364b = c2860Xh;
        this.f26365c = c4009uN;
        this.f26366d = interfaceC4279zN;
        this.f26367e = c4009uN2;
        this.f26368f = c4009uN3;
        this.f26369g = c4009uN4;
    }

    public C2674Mi(C4009uN c4009uN, C2941ai c2941ai, C2860Xh c2860Xh, C4009uN c4009uN2, C4009uN c4009uN3, C2826Vh c2826Vh) {
        this.f26363a = 13;
        this.f26365c = c4009uN;
        this.f26369g = c2941ai;
        this.f26364b = c2860Xh;
        this.f26367e = c4009uN2;
        this.f26368f = c4009uN3;
        this.f26366d = c2826Vh;
    }

    public C2674Mi(C4009uN c4009uN, C4009uN c4009uN2, C2675Mj c2675Mj, C2675Mj c2675Mj2, C4009uN c4009uN3, C4009uN c4009uN4) {
        this.f26363a = 11;
        this.f26365c = c4009uN;
        this.f26367e = c4009uN2;
        this.f26364b = c2675Mj;
        this.f26366d = c2675Mj2;
        this.f26368f = c4009uN3;
        this.f26369g = c4009uN4;
    }

    public C2674Mi(C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4009uN c4009uN4, C4009uN c4009uN5, C4117wN c4117wN) {
        this.f26363a = 16;
        this.f26365c = c4009uN;
        this.f26367e = c4009uN2;
        this.f26368f = c4009uN3;
        this.f26369g = c4009uN4;
        this.f26364b = c4009uN5;
        this.f26366d = c4117wN;
    }

    public C2674Mi(C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4117wN c4117wN, C4117wN c4117wN2, C4009uN c4009uN4) {
        this.f26363a = 14;
        this.f26365c = c4009uN;
        this.f26367e = c4009uN2;
        this.f26368f = c4009uN3;
        this.f26364b = c4117wN;
        this.f26366d = c4117wN2;
        this.f26369g = c4009uN4;
    }

    public /* synthetic */ C2674Mi(InterfaceC4063vN interfaceC4063vN, C2860Xh c2860Xh, C4009uN c4009uN, InterfaceC4063vN interfaceC4063vN2, InterfaceC4063vN interfaceC4063vN3, InterfaceC4063vN interfaceC4063vN4, int i) {
        this.f26363a = i;
        this.f26366d = interfaceC4063vN;
        this.f26364b = c2860Xh;
        this.f26365c = c4009uN;
        this.f26367e = interfaceC4063vN2;
        this.f26368f = interfaceC4063vN3;
        this.f26369g = interfaceC4063vN4;
    }

    public /* synthetic */ C2674Mi(InterfaceC4063vN interfaceC4063vN, InterfaceC4063vN interfaceC4063vN2, InterfaceC4063vN interfaceC4063vN3, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, int i) {
        this.f26363a = i;
        this.f26364b = interfaceC4063vN;
        this.f26366d = interfaceC4063vN2;
        this.f26369g = interfaceC4063vN3;
        this.f26365c = c4009uN;
        this.f26367e = c4009uN2;
        this.f26368f = c4009uN3;
    }

    public C2674Mi(C4117wN c4117wN, C3700ok c3700ok, C3862rl c3862rl, C2898Zl c2898Zl, C3323hj c3323hj, C4009uN c4009uN) {
        this.f26363a = 2;
        this.f26364b = c4117wN;
        this.f26366d = c3700ok;
        this.f26367e = c3862rl;
        this.f26368f = c2898Zl;
        this.f26369g = c3323hj;
        this.f26365c = c4009uN;
    }

    public C2674Mi(C4117wN c4117wN, C4009uN c4009uN, C4117wN c4117wN2, C2495Bq c2495Bq, C4009uN c4009uN2, C2860Xh c2860Xh) {
        this.f26363a = 9;
        this.f26364b = c4117wN;
        this.f26365c = c4009uN;
        this.f26366d = c4117wN2;
        this.f26368f = c2495Bq;
        this.f26367e = c4009uN2;
        this.f26369g = c2860Xh;
    }

    public C2674Mi(C4117wN c4117wN, C4009uN c4009uN, C4117wN c4117wN2, C2495Bq c2495Bq, C4009uN c4009uN2, C4009uN c4009uN3) {
        this.f26363a = 10;
        this.f26364b = c4117wN;
        this.f26365c = c4009uN;
        this.f26366d = c4117wN2;
        this.f26369g = c2495Bq;
        this.f26367e = c4009uN2;
        this.f26368f = c4009uN3;
    }

    public C2674Mi(C4117wN c4117wN, C4009uN c4009uN, C4117wN c4117wN2, C4117wN c4117wN3, C4117wN c4117wN4, C4009uN c4009uN2) {
        this.f26363a = 15;
        this.f26364b = c4117wN;
        this.f26365c = c4009uN;
        this.f26366d = c4117wN2;
        this.f26368f = c4117wN3;
        this.f26369g = c4117wN4;
        this.f26367e = c4009uN2;
    }

    public /* synthetic */ C2674Mi(C4117wN c4117wN, InterfaceC4063vN interfaceC4063vN, InterfaceC4063vN interfaceC4063vN2, InterfaceC4063vN interfaceC4063vN3, C4009uN c4009uN, C4009uN c4009uN2, int i) {
        this.f26363a = i;
        this.f26364b = c4117wN;
        this.f26366d = interfaceC4063vN;
        this.f26368f = interfaceC4063vN2;
        this.f26369g = interfaceC4063vN3;
        this.f26365c = c4009uN;
        this.f26367e = c4009uN2;
    }
}
