package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.rq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3867rq implements InterfaceC3436jq {

    /* renamed from: a, reason: collision with root package name */
    public final C3375ii f34113a;

    /* renamed from: b, reason: collision with root package name */
    public final C2628Jn f34114b;

    /* renamed from: c, reason: collision with root package name */
    public final C3226fu f34115c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f34116d;

    /* renamed from: e, reason: collision with root package name */
    public final C5107a f34117e;

    /* renamed from: f, reason: collision with root package name */
    public final C3153ec f34118f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f34119g = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ja)).booleanValue();

    /* renamed from: h, reason: collision with root package name */
    public final BinderC2949aq f34120h;
    public final C3002bo i;

    /* renamed from: j, reason: collision with root package name */
    public final C3165eo f34121j;

    public C3867rq(C3375ii c3375ii, Executor executor, C2628Jn c2628Jn, C3226fu c3226fu, C5107a c5107a, C3153ec c3153ec, BinderC2949aq binderC2949aq, C3002bo c3002bo, C3165eo c3165eo) {
        this.f34113a = c3375ii;
        this.f34116d = executor;
        this.f34114b = c2628Jn;
        this.f34115c = c3226fu;
        this.f34117e = c5107a;
        this.f34118f = c3153ec;
        this.f34120h = binderC2949aq;
        this.i = c3002bo;
        this.f34121j = c3165eo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3436jq
    public final J3.a a(C2953au c2953au, Ut ut) {
        C3431jl c3431jl = new C3431jl(21);
        OD od = OD.f26665u;
        C2624Jj c2624Jj = new C2624Jj(this, ut, c2953au, c3431jl, 3);
        Executor executor = this.f34116d;
        C3945tD y6 = C3686oN.y(od, c2624Jj, executor);
        y6.c(new U6(4), executor);
        return y6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3436jq
    public final boolean b(C2953au c2953au, Ut ut) {
        Yt yt = ut.f28173s;
        return (yt == null || yt.f28906a == null) ? false : true;
    }
}
