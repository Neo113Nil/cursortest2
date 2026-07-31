package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z82 implements j52<hs1, at2, y62> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15024a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f15025b;

    /* renamed from: c, reason: collision with root package name */
    private final ms1 f15026c;

    public z82(Context context, Executor executor, ms1 ms1Var) {
        this.f15024a = context;
        this.f15025b = executor;
        this.f15026c = ms1Var;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final /* bridge */ /* synthetic */ hs1 a(ds2 ds2Var, rr2 rr2Var, final d52<at2, y62> d52Var) {
        is1 f7 = this.f15026c.f(new l71(ds2Var, rr2Var, d52Var.f4071a), new js1(new pk1() { // from class: com.google.android.gms.internal.ads.y82
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.internal.ads.pk1
            public final void a(boolean z6, Context context, jb1 jb1Var) {
                d52 d52Var2 = d52.this;
                try {
                    ((at2) d52Var2.f4072b).x(z6);
                    ((at2) d52Var2.f4072b).A(context);
                } catch (ps2 e7) {
                    throw new ok1(e7.getCause());
                }
            }
        }));
        f7.c().D0(new g21(d52Var.f4072b), this.f15025b);
        d52Var.f4073c.t6(f7.m());
        return f7.k();
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final void b(ds2 ds2Var, rr2 rr2Var, d52<at2, y62> d52Var) {
        try {
            ks2 ks2Var = ds2Var.f4312a.f2953a;
            if (ks2Var.f7629o.f15240a == 3) {
                d52Var.f4072b.t(this.f15024a, ks2Var.f7618d, rr2Var.f11400w.toString(), d52Var.f4073c);
            } else {
                d52Var.f4072b.s(this.f15024a, ks2Var.f7618d, rr2Var.f11400w.toString(), d52Var.f4073c);
            }
        } catch (Exception e7) {
            String valueOf = String.valueOf(d52Var.f4071a);
            io0.h(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e7);
        }
    }
}
