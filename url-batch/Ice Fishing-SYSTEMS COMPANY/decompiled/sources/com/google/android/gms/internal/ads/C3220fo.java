package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.fo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3220fo implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30887a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f30888b;

    public C3220fo(C3431jl c3431jl, C4009uN c4009uN) {
        this.f30887a = 5;
        this.f30888b = c4009uN;
    }

    public C3278gs a() {
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        return new C3278gs(0, c3157eg, (C2892Zf) this.f30888b.d());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        Object obj;
        int i = 0;
        int i4 = 4;
        C4009uN c4009uN = this.f30888b;
        switch (this.f30887a) {
            case 0:
                C3381io c3381io = (C3381io) c4009uN.d();
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new C3165eo(c3381io, c3157eg);
            case 1:
                return new C3596mo((S2.a) c4009uN.d());
            case 2:
                C3650no c3650no = (C3650no) c4009uN.d();
                C3157eg c3157eg2 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg2);
                Set k6 = C3431jl.k(c3650no, c3157eg2);
                AbstractC3137eE.h(k6);
                return k6;
            case 3:
                C3650no c3650no2 = (C3650no) c4009uN.d();
                C3157eg c3157eg3 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg3);
                Set k9 = C3431jl.k(c3650no2, c3157eg3);
                AbstractC3137eE.h(k9);
                return k9;
            case 4:
                C3650no c3650no3 = (C3650no) c4009uN.d();
                C3157eg c3157eg4 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg4);
                Set k10 = C3431jl.k(c3650no3, c3157eg4);
                AbstractC3137eE.h(k10);
                return k10;
            case 5:
                C3650no c3650no4 = (C3650no) c4009uN.d();
                C3157eg c3157eg5 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg5);
                Set k11 = C3431jl.k(c3650no4, c3157eg5);
                AbstractC3137eE.h(k11);
                return k11;
            case 6:
                C3650no c3650no5 = (C3650no) c4009uN.d();
                C3157eg c3157eg6 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg6);
                Set k12 = C3431jl.k(c3650no5, c3157eg6);
                AbstractC3137eE.h(k12);
                return k12;
            case 7:
                C3650no c3650no6 = (C3650no) c4009uN.d();
                C3157eg c3157eg7 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg7);
                Set k13 = C3431jl.k(c3650no6, c3157eg7);
                AbstractC3137eE.h(k13);
                return k13;
            case 8:
                C3650no c3650no7 = (C3650no) c4009uN.d();
                C3157eg c3157eg8 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg8);
                Set k14 = C3431jl.k(c3650no7, c3157eg8);
                AbstractC3137eE.h(k14);
                return k14;
            case 9:
                C3650no c3650no8 = (C3650no) c4009uN.d();
                C3157eg c3157eg9 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg9);
                Set k15 = C3431jl.k(c3650no8, c3157eg9);
                AbstractC3137eE.h(k15);
                return k15;
            case 10:
                C3650no c3650no9 = (C3650no) c4009uN.d();
                C3157eg c3157eg10 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg10);
                Set k16 = C3431jl.k(c3650no9, c3157eg10);
                AbstractC3137eE.h(k16);
                return k16;
            case 11:
                C2612Io c2612Io = (C2612Io) c4009uN.d();
                C3157eg c3157eg11 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg11);
                return new C2473Al(c2612Io, c3157eg11);
            case 12:
                C2612Io c2612Io2 = (C2612Io) c4009uN.d();
                C3157eg c3157eg12 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg12);
                return new C2473Al(c2612Io2, c3157eg12);
            case 13:
                C2612Io c2612Io3 = (C2612Io) c4009uN.d();
                C3157eg c3157eg13 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg13);
                return new C2473Al(c2612Io3, c3157eg13);
            case 14:
                return new C2473Al((C3382ip) c4009uN.d(), AbstractC3212fg.f30745h);
            case 15:
                return new C2473Al((C3382ip) c4009uN.d(), AbstractC3212fg.f30745h);
            case 16:
                return new C2473Al((C3382ip) c4009uN.d(), AbstractC3212fg.f30745h);
            case 17:
                Context context = (Context) c4009uN.d();
                C3157eg c3157eg14 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg14);
                return new C3866rp(context, c3157eg14, 0);
            case 18:
                C2732Pp c2732Pp = (C2732Pp) c4009uN.d();
                C3157eg c3157eg15 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg15);
                return new C2473Al(c2732Pp, c3157eg15);
            case 19:
                C2732Pp c2732Pp2 = (C2732Pp) c4009uN.d();
                C3157eg c3157eg16 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg16);
                return new C2473Al(c2732Pp2, c3157eg16);
            case 20:
                return new C3922sr((C2781Sn) c4009uN.d());
            case 21:
                return new Fr((C3165eo) c4009uN.d());
            case 22:
                return a();
            case 23:
                C3157eg c3157eg17 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg17);
                C3923ss c3923ss = new C3923ss(c3157eg17, i);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) c4009uN.d();
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31592X4)).booleanValue()) {
                    Sr sr = new Sr(c3923ss, ((Integer) r2.f40119c.a(AbstractC3368ia.f31600Y4)).intValue(), scheduledExecutorService);
                    int i9 = AbstractC2917aC.f29181v;
                    obj = new C2972bC(sr);
                } else {
                    int i10 = AbstractC2917aC.f29181v;
                    obj = C3998uC.f34563C;
                }
                AbstractC3137eE.h(obj);
                return obj;
            case 24:
                C3157eg c3157eg18 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg18);
                return new Sr(new C3923ss(c3157eg18, 1), ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Id)).intValue(), (ScheduledExecutorService) c4009uN.d());
            case 25:
                C3157eg c3157eg19 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg19);
                return new C3278gs(3, c3157eg19, (C2748Qo) c4009uN.d());
            case 26:
                return new Or(4, (Tt) c4009uN.d());
            case 27:
                C3157eg c3157eg20 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg20);
                return new C3278gs(i4, c3157eg20, (C3758po) c4009uN.d());
            case 28:
                return new Or(6, (String) c4009uN.d());
            default:
                return new C3439jt((C3818qu) c4009uN.d());
        }
    }

    public /* synthetic */ C3220fo(C4009uN c4009uN, int i) {
        this.f30887a = i;
        this.f30888b = c4009uN;
    }
}
