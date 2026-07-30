package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Bm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2491Bm implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24069a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f24070b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f24071c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4279zN f24072d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4279zN f24073e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4279zN f24074f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4279zN f24075g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC4279zN f24076h;
    public final InterfaceC4279zN i;

    public C2491Bm(C2826Vh c2826Vh, C3700ok c3700ok, InterfaceC4279zN interfaceC4279zN, C3913si c3913si, InterfaceC4063vN interfaceC4063vN, InterfaceC4063vN interfaceC4063vN2, C4009uN c4009uN, C4009uN c4009uN2) {
        this.f24069a = 0;
        this.f24072d = c2826Vh;
        this.f24073e = c3700ok;
        this.f24074f = interfaceC4279zN;
        this.f24075g = c3913si;
        this.f24076h = interfaceC4063vN;
        this.i = interfaceC4063vN2;
        this.f24070b = c4009uN;
        this.f24071c = c4009uN2;
    }

    public C2474Am a() {
        t2.E b9 = ((C2826Vh) this.f24072d).b();
        C3226fu a9 = ((C3700ok) this.f24073e).a();
        C4025um c4025um = (C4025um) this.f24074f.d();
        C3917sm a10 = ((C3913si) this.f24075g).a();
        C2610Im c2610Im = (C2610Im) ((InterfaceC4063vN) this.f24076h).d();
        C2661Lm c2661Lm = (C2661Lm) ((InterfaceC4063vN) this.i).d();
        Executor executor = (Executor) this.f24070b.d();
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        return new C2474Am(b9, a9, c4025um, a10, c2610Im, c2661Lm, executor, c3157eg, (C3756pm) this.f24071c.d());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f24069a) {
            case 0:
                return a();
            case 1:
                return new C3918sn((C3808qk) this.f24070b.d(), (C2557Fk) this.f24071c.d(), (C2659Lk) ((C4009uN) this.f24072d).d(), (C2727Pk) ((C4009uN) this.f24073e).d(), (C3325hl) ((C4009uN) this.f24074f).d(), ((C2675Mj) this.f24075g).a(), ((C2675Mj) this.f24076h).f26371b.u(), (C2657Li) ((C4009uN) this.i).d());
            case 2:
                return new C3002bo(((C2860Xh) this.f24072d).a(), (C3381io) this.f24070b.d(), ((C2826Vh) this.f24075g).a(), ((C3700ok) this.f24073e).a(), (String) this.f24071c.d(), (String) this.f24074f.d(), (C3348i7) ((C4009uN) this.f24076h).d(), (A2.d) ((C4009uN) this.i).d());
            case 3:
                return new C2748Qo((C2799To) this.f24070b.d(), (C3057cp) this.f24071c.d(), (C2578Go) ((C4009uN) this.f24072d).d(), ((C2860Xh) this.f24073e).a(), ((C2860Xh) this.f24074f).b(), (C2680Mo) ((C4009uN) this.f24075g).d(), (BinderC2948ap) ((C4009uN) this.f24076h).d(), new SharedPreferencesOnSharedPreferenceChangeListenerC2586Hf(), new SharedPreferencesOnSharedPreferenceChangeListenerC2586Hf(), ((C2877Yh) this.i).c());
            case 4:
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new Ls(c3157eg, (ScheduledExecutorService) this.f24070b.d(), (String) this.f24074f.d(), (C4084vr) this.f24071c.d(), (Context) ((C4009uN) this.f24072d).d(), ((C3700ok) this.f24073e).a(), (C3922sr) ((C4009uN) this.f24075g).d(), (C2781Sn) ((C4009uN) this.f24076h).d(), (C2544Eo) ((C4009uN) this.i).d());
            case 5:
                return new Rt((String) ((C4117wN) this.f24072d).f34977a, (Pt) this.f24070b.d(), (Context) ((C4117wN) this.f24073e).f34977a, (Jt) this.f24071c.d(), (C3008bu) ((C4009uN) this.f24074f).d(), ((C2860Xh) this.f24075g).b(), (C3348i7) ((C4009uN) this.f24076h).d(), (C3165eo) ((C4009uN) this.i).d());
            default:
                return new Sv(((C2860Xh) this.f24072d).a(), ((C2860Xh) this.f24073e).b(), (ScheduledExecutorService) this.f24070b.d(), (Iu) this.f24071c.d(), C3602mu.e(((C2877Yh) this.f24074f).f28846b.a()), (S2.a) ((C4009uN) this.f24075g).d(), (Ev) ((C4009uN) this.f24076h).d(), ((C2941ai) this.i).c());
        }
    }

    public C2491Bm(C2860Xh c2860Xh, C2860Xh c2860Xh2, C4009uN c4009uN, C4009uN c4009uN2, C2877Yh c2877Yh, C4009uN c4009uN3, C4009uN c4009uN4, C2941ai c2941ai) {
        this.f24069a = 6;
        this.f24072d = c2860Xh;
        this.f24073e = c2860Xh2;
        this.f24070b = c4009uN;
        this.f24071c = c4009uN2;
        this.f24074f = c2877Yh;
        this.f24075g = c4009uN3;
        this.f24076h = c4009uN4;
        this.i = c2941ai;
    }

    public C2491Bm(C2860Xh c2860Xh, C4009uN c4009uN, C2826Vh c2826Vh, C3700ok c3700ok, C4009uN c4009uN2, InterfaceC4279zN interfaceC4279zN, C4009uN c4009uN3, C4009uN c4009uN4) {
        this.f24069a = 2;
        this.f24072d = c2860Xh;
        this.f24070b = c4009uN;
        this.f24075g = c2826Vh;
        this.f24073e = c3700ok;
        this.f24071c = c4009uN2;
        this.f24074f = interfaceC4279zN;
        this.f24076h = c4009uN3;
        this.i = c4009uN4;
    }

    public /* synthetic */ C2491Bm(C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, InterfaceC4279zN interfaceC4279zN, InterfaceC4279zN interfaceC4279zN2, InterfaceC4279zN interfaceC4279zN3, InterfaceC4279zN interfaceC4279zN4, InterfaceC4279zN interfaceC4279zN5, int i) {
        this.f24069a = i;
        this.f24070b = c4009uN;
        this.f24071c = c4009uN2;
        this.f24072d = c4009uN3;
        this.f24073e = interfaceC4279zN;
        this.f24074f = interfaceC4279zN2;
        this.f24075g = interfaceC4279zN3;
        this.f24076h = interfaceC4279zN4;
        this.i = interfaceC4279zN5;
    }

    public C2491Bm(C4009uN c4009uN, InterfaceC4279zN interfaceC4279zN, C4009uN c4009uN2, C4009uN c4009uN3, C3700ok c3700ok, C4009uN c4009uN4, C4009uN c4009uN5, C4009uN c4009uN6) {
        this.f24069a = 4;
        this.f24070b = c4009uN;
        this.f24074f = interfaceC4279zN;
        this.f24071c = c4009uN2;
        this.f24072d = c4009uN3;
        this.f24073e = c3700ok;
        this.f24075g = c4009uN4;
        this.f24076h = c4009uN5;
        this.i = c4009uN6;
    }

    public C2491Bm(C4117wN c4117wN, C4009uN c4009uN, C4117wN c4117wN2, C4009uN c4009uN2, C4009uN c4009uN3, C2860Xh c2860Xh, C4009uN c4009uN4, C4009uN c4009uN5) {
        this.f24069a = 5;
        this.f24072d = c4117wN;
        this.f24070b = c4009uN;
        this.f24073e = c4117wN2;
        this.f24071c = c4009uN2;
        this.f24074f = c4009uN3;
        this.f24075g = c2860Xh;
        this.f24076h = c4009uN4;
        this.i = c4009uN5;
    }
}
