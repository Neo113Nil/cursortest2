package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k72 implements j52<ij1, at2, y62> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7405a;

    /* renamed from: b, reason: collision with root package name */
    private final gk1 f7406b;

    /* renamed from: c, reason: collision with root package name */
    private final po0 f7407c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f7408d;

    public k72(Context context, po0 po0Var, gk1 gk1Var, Executor executor) {
        this.f7405a = context;
        this.f7407c = po0Var;
        this.f7406b = gk1Var;
        this.f7408d = executor;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final /* bridge */ /* synthetic */ ij1 a(ds2 ds2Var, rr2 rr2Var, final d52<at2, y62> d52Var) {
        jj1 c7 = this.f7406b.c(new l71(ds2Var, rr2Var, d52Var.f4071a), new nj1(new pk1() { // from class: com.google.android.gms.internal.ads.i72
            @Override // com.google.android.gms.internal.ads.pk1
            public final void a(boolean z6, Context context, jb1 jb1Var) {
                k72.this.c(d52Var, z6, context, jb1Var);
            }
        }, null));
        c7.c().D0(new g21(d52Var.f4072b), this.f7408d);
        d52Var.f4073c.t6(c7.g());
        return c7.i();
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final void b(ds2 ds2Var, rr2 rr2Var, d52<at2, y62> d52Var) {
        d52Var.f4072b.q(this.f7405a, ds2Var.f4312a.f2953a.f7618d, rr2Var.f11400w.toString(), a3.a1.l(rr2Var.f11397t), d52Var.f4073c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void c(d52 d52Var, boolean z6, Context context, jb1 jb1Var) {
        try {
            ((at2) d52Var.f4072b).x(z6);
            if (this.f7407c.f10303h < ((Integer) sw.c().b(m10.f8333x0)).intValue()) {
                ((at2) d52Var.f4072b).y();
            } else {
                ((at2) d52Var.f4072b).z(context);
            }
        } catch (ps2 e7) {
            io0.f("Cannot show interstitial.");
            throw new ok1(e7.getCause());
        }
    }
}
