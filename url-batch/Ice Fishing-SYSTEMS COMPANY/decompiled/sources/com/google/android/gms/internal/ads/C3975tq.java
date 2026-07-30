package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.tq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3975tq implements InterfaceC2779Sl {

    /* renamed from: A, reason: collision with root package name */
    public final BinderC2949aq f34473A;

    /* renamed from: B, reason: collision with root package name */
    public final C3165eo f34474B;

    /* renamed from: n, reason: collision with root package name */
    public final C5107a f34475n;

    /* renamed from: u, reason: collision with root package name */
    public final C3320hg f34476u;

    /* renamed from: v, reason: collision with root package name */
    public final Ut f34477v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC3858rh f34478w;

    /* renamed from: x, reason: collision with root package name */
    public final C3226fu f34479x;

    /* renamed from: y, reason: collision with root package name */
    public final C3153ec f34480y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f34481z;

    public C3975tq(C5107a c5107a, C3320hg c3320hg, Ut ut, InterfaceC3858rh interfaceC3858rh, C3226fu c3226fu, boolean z8, C3153ec c3153ec, BinderC2949aq binderC2949aq, C3165eo c3165eo) {
        this.f34475n = c5107a;
        this.f34476u = c3320hg;
        this.f34477v = ut;
        this.f34478w = interfaceC3858rh;
        this.f34479x = c3226fu;
        this.f34481z = z8;
        this.f34480y = c3153ec;
        this.f34473A = binderC2949aq;
        this.f34474B = c3165eo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2779Sl
    public final Ut d() {
        return this.f34477v;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003b  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2779Sl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(boolean z8, Context context, C4293zk c4293zk) {
        boolean z9;
        float f6;
        int i;
        boolean z10;
        C3268gi c3268gi = (C3268gi) C3686oN.I(this.f34476u);
        InterfaceC3858rh interfaceC3858rh = this.f34478w;
        interfaceC3858rh.d1(true);
        C3153ec c3153ec = this.f34480y;
        boolean z11 = this.f34481z;
        boolean a9 = z11 ? c3153ec.a(true) : true;
        boolean z12 = false;
        if (z11) {
            synchronized (c3153ec) {
                z10 = c3153ec.f30442b;
            }
            if (!z10) {
                z9 = false;
                z12 = true;
                if (z12) {
                    f6 = 0.0f;
                } else {
                    synchronized (c3153ec) {
                        f6 = c3153ec.f30443c;
                    }
                }
                float f9 = f6;
                Ut ut = this.f34477v;
                p2.f fVar = new p2.f(a9, true, z9, f9, z8, ut.f28128O, false);
                if (c4293zk != null) {
                    c4293zk.v1();
                }
                L2.i iVar = p2.j.f39798C.f39802b;
                C2745Ql c2745Ql = (C2745Ql) c3268gi.f31073S0.d();
                C3226fu c3226fu = this.f34479x;
                i = ut.f28130Q;
                if (i == -1) {
                    q2.j1 j1Var = c3226fu.f30907k;
                    if (j1Var != null) {
                        int i4 = j1Var.f40090n;
                        if (i4 == 1) {
                            i = 7;
                        } else if (i4 == 2) {
                            i = 6;
                        }
                    }
                    int i9 = t2.C.f40822b;
                    u2.i.a("Error setting app open orientation; no targeting orientation available.");
                }
                Yt yt = ut.f28173s;
                L2.i.y(context, new AdOverlayInfoParcel(c2745Ql, interfaceC3858rh, i, this.f34475n, ut.f28109B, fVar, yt.f28907b, yt.f28906a, c3226fu.f30904g, c4293zk, !ut.b() ? this.f34473A : null, interfaceC3858rh.p()), true, this.f34474B);
            }
            z12 = true;
        }
        z9 = z12;
        if (z12) {
        }
        float f92 = f6;
        Ut ut2 = this.f34477v;
        p2.f fVar2 = new p2.f(a9, true, z9, f92, z8, ut2.f28128O, false);
        if (c4293zk != null) {
        }
        L2.i iVar2 = p2.j.f39798C.f39802b;
        C2745Ql c2745Ql2 = (C2745Ql) c3268gi.f31073S0.d();
        C3226fu c3226fu2 = this.f34479x;
        i = ut2.f28130Q;
        if (i == -1) {
        }
        Yt yt2 = ut2.f28173s;
        L2.i.y(context, new AdOverlayInfoParcel(c2745Ql2, interfaceC3858rh, i, this.f34475n, ut2.f28109B, fVar2, yt2.f28907b, yt2.f28906a, c3226fu2.f30904g, c4293zk, !ut2.b() ? this.f34473A : null, interfaceC3858rh.p()), true, this.f34474B);
    }
}
