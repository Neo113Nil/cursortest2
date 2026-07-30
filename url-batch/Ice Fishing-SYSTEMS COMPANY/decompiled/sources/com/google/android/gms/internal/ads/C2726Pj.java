package com.google.android.gms.internal.ads;

import B2.C0279m;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Pj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2726Pj implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27018a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f27019b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f27020c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f27021d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4279zN f27022e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4279zN f27023f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4279zN f27024g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC4279zN f27025h;
    public final InterfaceC4279zN i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC4279zN f27026j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC4279zN f27027k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC4279zN f27028l;

    public C2726Pj(C3483kj c3483kj, C3700ok c3700ok, C4009uN c4009uN, C2637Kf c2637Kf, C0279m c0279m, C4009uN c4009uN2, C4117wN c4117wN, C2637Kf c2637Kf2, C2726Pj c2726Pj, C2637Kf c2637Kf3, C4009uN c4009uN3) {
        this.f27018a = 0;
        this.f27022e = c3483kj;
        this.f27023f = c3700ok;
        this.f27019b = c4009uN;
        this.f27024g = c2637Kf;
        this.f27025h = c0279m;
        this.f27020c = c4009uN2;
        this.i = c4117wN;
        this.f27026j = c2637Kf2;
        this.f27027k = c2726Pj;
        this.f27028l = c2637Kf3;
        this.f27021d = c4009uN3;
    }

    public C3.j a() {
        Ou ou = (Ou) this.f27019b.d();
        C5107a b9 = ((C2860Xh) this.f27022e).b();
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f27020c.d();
        String packageName = ((C2877Yh) this.f27024g).f28846b.a().getPackageName();
        AbstractC3137eE.h(packageName);
        C3151ea c3151ea = AbstractC3368ia.f31613a;
        ArrayList B8 = q2.r.f40116e.f40117a.B();
        PackageInfo packageInfo = (PackageInfo) this.f27021d.d();
        InterfaceC3901sN b10 = C4009uN.b((C4009uN) this.f27025h);
        t2.E b11 = ((C2826Vh) this.i).b();
        String str = (String) ((C4009uN) this.f27026j).d();
        C2518Df a9 = ((Is) this.f27027k).a();
        C3226fu a10 = ((C3700ok) this.f27023f).a();
        C3593ml c3593ml = (C3593ml) ((C4009uN) this.f27028l).d();
        C3.j jVar = new C3.j();
        jVar.f421a = ou;
        jVar.f422b = b9;
        jVar.f423c = applicationInfo;
        jVar.f424d = packageName;
        jVar.f425e = B8;
        jVar.f426f = packageInfo;
        jVar.f427g = b10;
        jVar.f428h = str;
        jVar.i = a9;
        jVar.f429j = b11;
        jVar.f430k = a10;
        jVar.f431l = c3593ml;
        return jVar;
    }

    public S0.q b() {
        return new S0.q(((C2675Mj) this.f27022e).b(), ((C2675Mj) this.f27023f).a(), (C2540Ek) this.f27019b.d(), (C2591Hk) this.f27024g.d(), ((C3862rl) this.f27025h).f34104b.f33869o, ((C4184xj) this.i).a(), (C2999bl) this.f27020c.d(), new C2625Jk(((C3861rk) this.f27026j).f34102b.d()), (C4240yl) this.f27021d.d(), (C3270gk) ((C4009uN) this.f27027k).d(), (C3758po) ((C4009uN) this.f27028l).d());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f27018a) {
            case 0:
                C3813qp b9 = ((C3483kj) this.f27022e).b();
                C3226fu a9 = ((C3700ok) this.f27023f).a();
                Ou ou = (Ou) this.f27019b.d();
                C2637Kf c2637Kf = (C2637Kf) this.f27024g;
                C4237yi c4237yi = new C4237yi(((C4171xN) c2637Kf.f25995b).d(), ((C4171xN) c2637Kf.f25996c).d());
                C3113dr a10 = ((C0279m) this.f27025h).a();
                C3485kl c3485kl = (C3485kl) this.f27020c.d();
                C2953au c2953au = (C2953au) ((C4117wN) this.i).f34977a;
                C2637Kf c2637Kf2 = (C2637Kf) this.f27026j;
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                C4017ue c4017ue = new C4017ue(c3157eg, ((C2877Yh) c2637Kf2.f25995b).a(), C4009uN.b((C4184xj) c2637Kf2.f25996c), 11);
                C3.j a11 = ((C2726Pj) this.f27027k).a();
                AbstractC3137eE.h(c3157eg);
                C2637Kf c2637Kf3 = (C2637Kf) this.f27028l;
                C4225yN c4225yN = (C4225yN) c2637Kf3.f25995b;
                AbstractC3137eE.h(c3157eg);
                return new C2709Oj(b9, a9, ou, c4237yi, a10, c3485kl, c2953au, c4017ue, a11, c3157eg, new C4298zp(c4225yN.f34408a, c3157eg, new C2897Zk(((C3861rk) c2637Kf3.f25996c).f34102b.d())), (C3706oq) this.f27021d.d());
            case 1:
                return b();
            case 2:
                return a();
            case 3:
                C4017ue c4017ue2 = ((C2746Qm) this.f27022e).f27212b;
                C4017ue c4017ue3 = ((C2746Qm) this.f27024g).f27212b;
                C4017ue c4017ue4 = ((C2746Qm) this.f27025h).f27212b;
                return new C2729Pm((C3801qd) c4017ue2.f34632w, (C3854rd) c4017ue3.f34631v, (InterfaceC3962td) c4017ue4.f34630u, (C2489Bk) this.f27019b.d(), (C2778Sk) this.f27020c.d(), (C3808qk) this.f27021d.d(), (C2507Cl) ((C4009uN) this.i).d(), (Context) ((C4009uN) this.f27026j).d(), ((C2675Mj) this.f27027k).a(), ((C2860Xh) this.f27028l).b(), ((C3700ok) this.f27023f).a());
            case 4:
                Context context = (Context) this.f27019b.d();
                C3348i7 c3348i7 = (C3348i7) this.f27020c.d();
                C4175xa c4175xa = (C4175xa) this.f27021d.d();
                C5107a b10 = ((C2860Xh) this.f27022e).b();
                Object obj = ((C3913si) this.f27023f).f34260b;
                return new C2628Jn(context, c3348i7, c4175xa, b10, C3913si.b(), (C2914a9) ((C4009uN) this.f27024g).d(), (C2863Xk) ((InterfaceC4063vN) this.f27025h).d(), (BinderC2949aq) ((C4009uN) this.i).d(), (C3280gu) ((C4009uN) this.f27026j).d(), (C3165eo) ((C4009uN) this.f27027k).d(), (C2690Nh) ((C4009uN) this.f27028l).d());
            default:
                return new BinderC3277gr((C3808qk) this.f27019b.d(), (C2507Cl) this.f27020c.d(), (C2489Bk) this.f27021d.d(), (C2557Fk) ((C4009uN) this.f27022e).d(), (C2591Hk) ((C4009uN) this.f27023f).d(), (C4293zk) ((C4009uN) this.f27024g).d(), (C3325hl) ((C4009uN) this.f27025h).d(), (C2626Jl) ((C4009uN) this.i).d(), (C2727Pk) ((C4009uN) this.f27026j).d(), (C2575Gl) ((C4009uN) this.f27027k).d(), (C3162el) ((C4009uN) this.f27028l).d());
        }
    }

    public C2726Pj(C2675Mj c2675Mj, C2675Mj c2675Mj2, C4009uN c4009uN, InterfaceC4279zN interfaceC4279zN, C3862rl c3862rl, C4184xj c4184xj, C4009uN c4009uN2, C3861rk c3861rk, C4009uN c4009uN3, C4009uN c4009uN4, C4009uN c4009uN5) {
        this.f27018a = 1;
        this.f27022e = c2675Mj;
        this.f27023f = c2675Mj2;
        this.f27019b = c4009uN;
        this.f27024g = interfaceC4279zN;
        this.f27025h = c3862rl;
        this.i = c4184xj;
        this.f27020c = c4009uN2;
        this.f27026j = c3861rk;
        this.f27021d = c4009uN3;
        this.f27027k = c4009uN4;
        this.f27028l = c4009uN5;
    }

    public C2726Pj(C2746Qm c2746Qm, C2746Qm c2746Qm2, C2746Qm c2746Qm3, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4009uN c4009uN4, C4009uN c4009uN5, C2675Mj c2675Mj, C2860Xh c2860Xh, C3700ok c3700ok) {
        this.f27018a = 3;
        this.f27022e = c2746Qm;
        this.f27024g = c2746Qm2;
        this.f27025h = c2746Qm3;
        this.f27019b = c4009uN;
        this.f27020c = c4009uN2;
        this.f27021d = c4009uN3;
        this.i = c4009uN4;
        this.f27026j = c4009uN5;
        this.f27027k = c2675Mj;
        this.f27028l = c2860Xh;
        this.f27023f = c3700ok;
    }

    public C2726Pj(C4009uN c4009uN, C2860Xh c2860Xh, C4009uN c4009uN2, C2877Yh c2877Yh, C4009uN c4009uN3, C4009uN c4009uN4, C2826Vh c2826Vh, C4009uN c4009uN5, Is is, C3700ok c3700ok, C4009uN c4009uN6) {
        this.f27018a = 2;
        this.f27019b = c4009uN;
        this.f27022e = c2860Xh;
        this.f27020c = c4009uN2;
        this.f27024g = c2877Yh;
        this.f27021d = c4009uN3;
        this.f27025h = c4009uN4;
        this.i = c2826Vh;
        this.f27026j = c4009uN5;
        this.f27027k = is;
        this.f27023f = c3700ok;
        this.f27028l = c4009uN6;
    }

    public /* synthetic */ C2726Pj(C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, InterfaceC4279zN interfaceC4279zN, InterfaceC4279zN interfaceC4279zN2, C4009uN c4009uN4, InterfaceC4279zN interfaceC4279zN3, C4009uN c4009uN5, C4009uN c4009uN6, C4009uN c4009uN7, C4009uN c4009uN8, int i) {
        this.f27018a = i;
        this.f27019b = c4009uN;
        this.f27020c = c4009uN2;
        this.f27021d = c4009uN3;
        this.f27022e = interfaceC4279zN;
        this.f27023f = interfaceC4279zN2;
        this.f27024g = c4009uN4;
        this.f27025h = interfaceC4279zN3;
        this.i = c4009uN5;
        this.f27026j = c4009uN6;
        this.f27027k = c4009uN7;
        this.f27028l = c4009uN8;
    }
}
