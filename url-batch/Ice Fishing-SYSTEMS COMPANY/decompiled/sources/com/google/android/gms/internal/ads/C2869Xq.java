package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.widget.FrameLayout;

/* renamed from: com.google.android.gms.internal.ads.Xq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2869Xq extends AbstractC2835Vq {

    /* renamed from: a, reason: collision with root package name */
    public final C3214fi f28701a;

    /* renamed from: b, reason: collision with root package name */
    public final C3646nk f28702b;

    /* renamed from: c, reason: collision with root package name */
    public final C3761pr f28703c;

    /* renamed from: d, reason: collision with root package name */
    public final C3809ql f28704d;

    /* renamed from: e, reason: collision with root package name */
    public final C2881Yl f28705e;

    /* renamed from: f, reason: collision with root package name */
    public final C2863Xk f28706f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f28707g;

    /* renamed from: h, reason: collision with root package name */
    public final C3378il f28708h;
    public final C2950ar i;

    /* renamed from: j, reason: collision with root package name */
    public final C3706oq f28709j;

    public C2869Xq(C3214fi c3214fi, C3646nk c3646nk, C3761pr c3761pr, C3809ql c3809ql, C2881Yl c2881Yl, C2863Xk c2863Xk, FrameLayout frameLayout, C3378il c3378il, C2950ar c2950ar, C3706oq c3706oq) {
        this.f28701a = c3214fi;
        this.f28702b = c3646nk;
        this.f28703c = c3761pr;
        this.f28704d = c3809ql;
        this.f28705e = c2881Yl;
        this.f28706f = c2863Xk;
        this.f28707g = frameLayout;
        this.f28708h = c3378il;
        this.i = c2950ar;
        this.f28709j = c3706oq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2835Vq
    public final Ku c(C3226fu c3226fu, Bundle bundle, Ut ut, C2953au c2953au) {
        C3646nk c3646nk = this.f28702b;
        c3646nk.f32991b = c3226fu;
        c3646nk.f32992c = bundle;
        c3646nk.f32994e = new C4017ue(c2953au, ut, this.i, 8);
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31811v4)).booleanValue()) {
            c3646nk.f32995f = this.f28709j;
        }
        C3214fi c3214fi = this.f28701a.f30795b;
        C3646nk c3646nk2 = new C3646nk(c3646nk);
        C2881Yl c2881Yl = new C2881Yl(26, this.f28706f, this.f28708h);
        Vx vx = new Vx(16, this.f28707g);
        C3809ql c3809ql = this.f28704d;
        AbstractC3137eE.j(C3809ql.class, c3809ql);
        C3761pr c3761pr = this.f28703c;
        AbstractC3137eE.j(C3761pr.class, c3761pr);
        C3562m7 c3562m7 = new C3562m7(26);
        C2881Yl c2881Yl2 = this.f28705e;
        AbstractC3137eE.j(C2881Yl.class, c2881Yl2);
        C2709Oj c2709Oj = (C2709Oj) new C3482ki(c3214fi, vx, c2881Yl2, new C3431jl(22), c3809ql, c3646nk2, c3562m7, c3761pr, c2881Yl, null, null).f32333I0.d();
        return c2709Oj.c(c2709Oj.b());
    }
}
