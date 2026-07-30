package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Kq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2648Kq implements InterfaceC3436jq {

    /* renamed from: b, reason: collision with root package name */
    public final Context f26043b;

    /* renamed from: c, reason: collision with root package name */
    public final C2628Jn f26044c;

    /* renamed from: d, reason: collision with root package name */
    public final C3226fu f26045d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f26046e;

    /* renamed from: f, reason: collision with root package name */
    public final C5107a f26047f;

    /* renamed from: g, reason: collision with root package name */
    public final C3153ec f26048g;
    public final BinderC2949aq i;

    /* renamed from: j, reason: collision with root package name */
    public final C3002bo f26050j;

    /* renamed from: k, reason: collision with root package name */
    public final C3165eo f26051k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f26052l;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26042a = 0;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26049h = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ja)).booleanValue();

    public C2648Kq(Context context, C5107a c5107a, C3226fu c3226fu, Executor executor, C3644ni c3644ni, C2628Jn c2628Jn, C3153ec c3153ec, BinderC2949aq binderC2949aq, C3002bo c3002bo, C3165eo c3165eo) {
        this.f26043b = context;
        this.f26045d = c3226fu;
        this.f26052l = c3644ni;
        this.f26046e = executor;
        this.f26047f = c5107a;
        this.f26044c = c2628Jn;
        this.f26048g = c3153ec;
        this.i = binderC2949aq;
        this.f26050j = c3002bo;
        this.f26051k = c3165eo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3436jq
    public final J3.a a(C2953au c2953au, Ut ut) {
        switch (this.f26042a) {
            case 0:
                C3431jl c3431jl = new C3431jl(21);
                OD od = OD.f26665u;
                C2624Jj c2624Jj = new C2624Jj(this, ut, c2953au, c3431jl, 7);
                Executor executor = this.f26046e;
                C3945tD y6 = C3686oN.y(od, c2624Jj, executor);
                y6.c(new U6(5), executor);
                return y6;
            default:
                C3431jl c3431jl2 = new C3431jl(21);
                OD od2 = OD.f26665u;
                C2624Jj c2624Jj2 = new C2624Jj(this, ut, c2953au, c3431jl2, 9);
                Executor executor2 = this.f26046e;
                C3945tD y8 = C3686oN.y(od2, c2624Jj2, executor2);
                y8.c(new U6(6), executor2);
                return y8;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3436jq
    public final boolean b(C2953au c2953au, Ut ut) {
        switch (this.f26042a) {
            case 0:
                Yt yt = ut.f28173s;
                if (yt == null || yt.f28906a == null) {
                }
                break;
            default:
                Yt yt2 = ut.f28173s;
                if (yt2 == null || yt2.f28906a == null) {
                }
                break;
        }
        return false;
    }

    public C2648Kq(Context context, C5107a c5107a, C3226fu c3226fu, Executor executor, C3806qi c3806qi, C2628Jn c2628Jn, C3153ec c3153ec, BinderC2949aq binderC2949aq, C3002bo c3002bo, C3165eo c3165eo) {
        this.f26043b = context;
        this.f26045d = c3226fu;
        this.f26052l = c3806qi;
        this.f26046e = executor;
        this.f26047f = c5107a;
        this.f26044c = c2628Jn;
        this.f26048g = c3153ec;
        this.i = binderC2949aq;
        this.f26050j = c3002bo;
        this.f26051k = c3165eo;
    }
}
