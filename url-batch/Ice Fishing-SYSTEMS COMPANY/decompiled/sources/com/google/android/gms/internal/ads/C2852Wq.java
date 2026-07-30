package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Wq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2852Wq extends AbstractC2835Vq {

    /* renamed from: a, reason: collision with root package name */
    public final C3214fi f28474a;

    /* renamed from: b, reason: collision with root package name */
    public final C3646nk f28475b;

    /* renamed from: c, reason: collision with root package name */
    public final C3809ql f28476c;

    /* renamed from: d, reason: collision with root package name */
    public final C2950ar f28477d;

    /* renamed from: e, reason: collision with root package name */
    public final C3706oq f28478e;

    public C2852Wq(C3214fi c3214fi, C3646nk c3646nk, C3809ql c3809ql, C2950ar c2950ar, C3706oq c3706oq) {
        this.f28474a = c3214fi;
        this.f28475b = c3646nk;
        this.f28476c = c3809ql;
        this.f28477d = c2950ar;
        this.f28478e = c3706oq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2835Vq
    public final Ku c(C3226fu c3226fu, Bundle bundle, Ut ut, C2953au c2953au) {
        C3646nk c3646nk = this.f28475b;
        c3646nk.f32991b = c3226fu;
        c3646nk.f32992c = bundle;
        c3646nk.f32994e = new C4017ue(c2953au, ut, this.f28477d, 8);
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31811v4)).booleanValue()) {
            c3646nk.f32995f = this.f28478e;
        }
        C3214fi c3214fi = this.f28474a.f30795b;
        C3646nk c3646nk2 = new C3646nk(c3646nk);
        C3809ql c3809ql = this.f28476c;
        AbstractC3137eE.j(C3809ql.class, c3809ql);
        C2709Oj a9 = new C3375ii(c3214fi, new C3431jl(22), c3809ql, c3646nk2, new C3562m7(26), null, null).a();
        return a9.c(a9.b());
    }
}
