package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.vn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4080vn implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34853a = 3;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f34854b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4063vN f34855c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f34856d;

    /* renamed from: e, reason: collision with root package name */
    public final C4009uN f34857e;

    /* renamed from: f, reason: collision with root package name */
    public final C4009uN f34858f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4279zN f34859g;

    /* renamed from: h, reason: collision with root package name */
    public final C4009uN f34860h;
    public final InterfaceC4279zN i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC4279zN f34861j;

    public C4080vn(C2860Xh c2860Xh, C2760Rj c2760Rj, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C3700ok c3700ok, C4009uN c4009uN4, C4009uN c4009uN5, C4009uN c4009uN6) {
        this.f34855c = c2860Xh;
        this.f34861j = c2760Rj;
        this.f34854b = c4009uN;
        this.f34856d = c4009uN2;
        this.f34857e = c4009uN3;
        this.f34859g = c3700ok;
        this.f34858f = c4009uN4;
        this.f34860h = c4009uN5;
        this.i = c4009uN6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f34853a) {
            case 0:
                return new CallableC3972tn(((C2860Xh) this.f34855c).a(), (Executor) this.f34854b.d(), (C3348i7) this.f34856d.d(), ((C2860Xh) this.f34859g).b(), C3913si.b(), (C2834Vp) this.f34857e.d(), (Av) this.f34858f.d(), (C3165eo) this.f34860h.d(), (BinderC2949aq) ((C4009uN) this.i).d(), (C3280gu) ((C4009uN) this.f34861j).d());
            case 1:
                Executor executor = (Executor) this.f34854b.d();
                Context a9 = ((C2860Xh) this.f34855c).a();
                WeakReference weakReference = ((C2860Xh) this.i).f28669b.f28062d;
                AbstractC3137eE.h(weakReference);
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new C2527Do(executor, a9, weakReference, c3157eg, (C2781Sn) this.f34856d.d(), (ScheduledExecutorService) this.f34857e.d(), (C3542lo) this.f34858f.d(), ((C2860Xh) this.f34859g).b(), new C3916sl(((C3861rk) this.f34861j).f34102b.d()), (Zu) this.f34860h.d());
            case 2:
                return new Ir((Context) ((C4117wN) this.f34855c).f34977a, (q2.g1) ((C4117wN) this.i).f34977a, (String) ((C4117wN) this.f34861j).f34977a, (Gt) this.f34854b.d(), (Fr) this.f34856d.d(), (Jt) this.f34857e.d(), ((C2860Xh) this.f34859g).b(), (C3348i7) this.f34858f.d(), (C3165eo) this.f34860h.d());
            case 3:
                Context a10 = ((C2860Xh) this.f34855c).a();
                String str = ((C2743Qj) ((C2760Rj) this.f34861j).f27417b.d()).f27205u.f28275e;
                AbstractC3137eE.h(str);
                return new C3492ks(a10, str, (String) this.f34854b.d(), (C2743Qj) this.f34856d.d(), (C3764pu) this.f34857e.d(), ((C3700ok) this.f34859g).a(), (C3002bo) this.f34858f.d(), (C2862Xj) this.f34860h.d(), ((Long) ((C4009uN) this.i).d()).longValue());
            case 4:
                C2950ar c2950ar = (C2950ar) this.f34854b.d();
                C5107a b9 = ((C2860Xh) this.f34859g).b();
                String str2 = ((C2743Qj) ((C2760Rj) this.i).f27417b.d()).f27205u.f28275e;
                AbstractC3137eE.h(str2);
                return new C4304zv(c2950ar, b9, str2, (String) this.f34856d.d(), ((C2860Xh) this.f34855c).a(), ((C3700ok) this.f34861j).f33188b.f32993d, (C3116du) this.f34857e.d(), (S2.a) this.f34858f.d(), (C3348i7) this.f34860h.d());
            default:
                return new C3133eA((C4307zy) this.f34854b.d(), (C4307zy) this.f34856d.d(), C4009uN.b(this.f34857e), (C4307zy) this.f34858f.d(), (C4307zy) this.f34860h.d(), C4009uN.b((C4009uN) this.i), (File) ((C4009uN) this.f34861j).d(), (ExecutorService) ((C4117wN) this.f34855c).f34977a, (C4158xA) ((C4009uN) this.f34859g).d());
        }
    }

    public C4080vn(C2860Xh c2860Xh, C4009uN c4009uN, C4009uN c4009uN2, C2860Xh c2860Xh2, C3913si c3913si, C4009uN c4009uN3, C4009uN c4009uN4, C4009uN c4009uN5, C4009uN c4009uN6, C4009uN c4009uN7) {
        this.f34855c = c2860Xh;
        this.f34854b = c4009uN;
        this.f34856d = c4009uN2;
        this.f34859g = c2860Xh2;
        this.f34857e = c4009uN3;
        this.f34858f = c4009uN4;
        this.f34860h = c4009uN5;
        this.i = c4009uN6;
        this.f34861j = c4009uN7;
    }

    public C4080vn(C4009uN c4009uN, C2860Xh c2860Xh, C2860Xh c2860Xh2, C4009uN c4009uN2, C4009uN c4009uN3, C4009uN c4009uN4, C2860Xh c2860Xh3, C3861rk c3861rk, C4009uN c4009uN5) {
        this.f34854b = c4009uN;
        this.f34855c = c2860Xh;
        this.i = c2860Xh2;
        this.f34856d = c4009uN2;
        this.f34857e = c4009uN3;
        this.f34858f = c4009uN4;
        this.f34859g = c2860Xh3;
        this.f34861j = c3861rk;
        this.f34860h = c4009uN5;
    }

    public C4080vn(C4009uN c4009uN, C2860Xh c2860Xh, C2760Rj c2760Rj, C4009uN c4009uN2, C2860Xh c2860Xh2, C3700ok c3700ok, C4009uN c4009uN3, C4009uN c4009uN4, C4009uN c4009uN5) {
        this.f34854b = c4009uN;
        this.f34859g = c2860Xh;
        this.i = c2760Rj;
        this.f34856d = c4009uN2;
        this.f34855c = c2860Xh2;
        this.f34861j = c3700ok;
        this.f34857e = c4009uN3;
        this.f34858f = c4009uN4;
        this.f34860h = c4009uN5;
    }

    public C4080vn(C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4009uN c4009uN4, C4009uN c4009uN5, C4009uN c4009uN6, C4009uN c4009uN7, C4117wN c4117wN, C4009uN c4009uN8) {
        this.f34854b = c4009uN;
        this.f34856d = c4009uN2;
        this.f34857e = c4009uN3;
        this.f34858f = c4009uN4;
        this.f34860h = c4009uN5;
        this.i = c4009uN6;
        this.f34861j = c4009uN7;
        this.f34855c = c4117wN;
        this.f34859g = c4009uN8;
    }

    public C4080vn(C4117wN c4117wN, C4117wN c4117wN2, C4117wN c4117wN3, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C2860Xh c2860Xh, C4009uN c4009uN4, C4009uN c4009uN5) {
        this.f34855c = c4117wN;
        this.i = c4117wN2;
        this.f34861j = c4117wN3;
        this.f34854b = c4009uN;
        this.f34856d = c4009uN2;
        this.f34857e = c4009uN3;
        this.f34859g = c2860Xh;
        this.f34858f = c4009uN4;
        this.f34860h = c4009uN5;
    }
}
