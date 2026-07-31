package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g62 implements j52<t41, at2, y62> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5467a;

    /* renamed from: b, reason: collision with root package name */
    private final r51 f5468b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f5469c;

    public g62(Context context, r51 r51Var, Executor executor) {
        this.f5467a = context;
        this.f5468b = r51Var;
        this.f5469c = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.j52
    public final /* bridge */ /* synthetic */ t41 a(ds2 ds2Var, final rr2 rr2Var, d52<at2, y62> d52Var) {
        final View d7;
        if (((Boolean) sw.c().b(m10.I5)).booleanValue() && rr2Var.f11376e0) {
            md0 f7 = d52Var.f4072b.f();
            if (f7 == null) {
                io0.d("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new ps2(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                d7 = (View) x3.b.O0(f7.b());
                boolean d8 = f7.d();
                if (d7 == null) {
                    throw new ps2(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (d8) {
                    try {
                        d7 = (View) rb3.n(rb3.i(null), new xa3() { // from class: com.google.android.gms.internal.ads.f62
                            @Override // com.google.android.gms.internal.ads.xa3
                            public final cc3 c(Object obj) {
                                return g62.this.c(d7, rr2Var, obj);
                            }
                        }, wo0.f13898e).get();
                    } catch (InterruptedException | ExecutionException e7) {
                        throw new ps2(e7);
                    }
                }
            } catch (RemoteException e8) {
                throw new ps2(e8);
            }
        } else {
            d7 = d52Var.f4072b.d();
        }
        r51 r51Var = this.f5468b;
        l71 l71Var = new l71(ds2Var, rr2Var, d52Var.f4071a);
        final at2 at2Var = d52Var.f4072b;
        u41 a7 = r51Var.a(l71Var, new b51(d7, null, new t61() { // from class: com.google.android.gms.internal.ads.e62
            @Override // com.google.android.gms.internal.ads.t61
            public final cz zza() {
                return at2.this.e();
            }
        }, rr2Var.f11399v.get(0)));
        a7.i().S0(d7);
        a7.c().D0(new g21(d52Var.f4072b), this.f5469c);
        d52Var.f4073c.t6(a7.g());
        return a7.h();
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final void b(ds2 ds2Var, rr2 rr2Var, d52<at2, y62> d52Var) {
        pv pvVar;
        pv pvVar2 = ds2Var.f4312a.f2953a.f7619e;
        if (pvVar2.f10389s) {
            pvVar = new pv(this.f5467a, r2.y.d(pvVar2.f10380j, pvVar2.f10377g));
        } else {
            pvVar = (((Boolean) sw.c().b(m10.I5)).booleanValue() && rr2Var.f11376e0) ? new pv(this.f5467a, r2.y.e(pvVar2.f10380j, pvVar2.f10377g)) : os2.a(this.f5467a, rr2Var.f11399v);
        }
        pv pvVar3 = pvVar;
        if (((Boolean) sw.c().b(m10.I5)).booleanValue() && rr2Var.f11376e0) {
            d52Var.f4072b.p(this.f5467a, pvVar3, ds2Var.f4312a.f2953a.f7618d, rr2Var.f11400w.toString(), a3.a1.l(rr2Var.f11397t), d52Var.f4073c);
        } else {
            d52Var.f4072b.o(this.f5467a, pvVar3, ds2Var.f4312a.f2953a.f7618d, rr2Var.f11400w.toString(), a3.a1.l(rr2Var.f11397t), d52Var.f4073c);
        }
    }

    final /* synthetic */ cc3 c(View view, rr2 rr2Var, Object obj) {
        return rb3.i(k61.a(this.f5467a, view, rr2Var));
    }
}
