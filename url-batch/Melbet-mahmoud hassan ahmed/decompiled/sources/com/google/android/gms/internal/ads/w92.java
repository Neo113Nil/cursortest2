package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class w92 implements j52<hs1, at2, z62> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13771a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f13772b;

    /* renamed from: c, reason: collision with root package name */
    private final ms1 f13773c;

    public w92(Context context, Executor executor, ms1 ms1Var) {
        this.f13771a = context;
        this.f13772b = executor;
        this.f13773c = ms1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ds2 ds2Var, rr2 rr2Var, d52<at2, z62> d52Var) {
        try {
            d52Var.f4072b.n(ds2Var.f4312a.f2953a.f7618d, rr2Var.f11400w.toString());
        } catch (Exception e7) {
            String valueOf = String.valueOf(d52Var.f4071a);
            io0.h(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final /* bridge */ /* synthetic */ hs1 a(ds2 ds2Var, rr2 rr2Var, final d52<at2, z62> d52Var) {
        is1 f7 = this.f13773c.f(new l71(ds2Var, rr2Var, d52Var.f4071a), new js1(new pk1() { // from class: com.google.android.gms.internal.ads.s92
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.internal.ads.pk1
            public final void a(boolean z6, Context context, jb1 jb1Var) {
                d52 d52Var2 = d52.this;
                try {
                    ((at2) d52Var2.f4072b).x(z6);
                    ((at2) d52Var2.f4072b).B();
                } catch (ps2 e7) {
                    io0.h("Cannot show rewarded video.", e7);
                    throw new ok1(e7.getCause());
                }
            }
        }));
        f7.c().D0(new g21(d52Var.f4072b), this.f13772b);
        dc1 d7 = f7.d();
        ta1 a7 = f7.a();
        d52Var.f4073c.t6(new v92(this, f7.h(), a7, d7, f7.i()));
        return f7.k();
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final void b(ds2 ds2Var, rr2 rr2Var, d52<at2, z62> d52Var) {
        if (d52Var.f4072b.a()) {
            e(ds2Var, rr2Var, d52Var);
            return;
        }
        d52Var.f4073c.u6(new u92(this, ds2Var, rr2Var, d52Var));
        d52Var.f4072b.k(this.f13771a, ds2Var.f4312a.f2953a.f7618d, null, d52Var.f4073c, rr2Var.f11400w.toString());
    }
}
