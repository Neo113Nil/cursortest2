package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class n62 implements j52<t41, cf0, y62> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8951a;

    /* renamed from: b, reason: collision with root package name */
    private final r51 f8952b;

    /* renamed from: c, reason: collision with root package name */
    private View f8953c;

    /* renamed from: d, reason: collision with root package name */
    private md0 f8954d;

    public n62(Context context, r51 r51Var) {
        this.f8951a = context;
        this.f8952b = r51Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.j52
    public final /* bridge */ /* synthetic */ t41 a(ds2 ds2Var, final rr2 rr2Var, final d52<cf0, y62> d52Var) {
        final View view;
        if (((Boolean) sw.c().b(m10.I5)).booleanValue() && rr2Var.f11376e0) {
            try {
                view = (View) x3.b.O0(this.f8954d.b());
                boolean d7 = this.f8954d.d();
                if (view == null) {
                    throw new ps2(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (d7) {
                    try {
                        view = (View) rb3.n(rb3.i(null), new xa3() { // from class: com.google.android.gms.internal.ads.k62
                            @Override // com.google.android.gms.internal.ads.xa3
                            public final cc3 c(Object obj) {
                                return n62.this.c(view, rr2Var, obj);
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
            view = this.f8953c;
        }
        u41 a7 = this.f8952b.a(new l71(ds2Var, rr2Var, d52Var.f4071a), new b51(view, null, new t61() { // from class: com.google.android.gms.internal.ads.j62
            @Override // com.google.android.gms.internal.ads.t61
            public final cz zza() {
                try {
                    return ((cf0) d52.this.f4072b).b();
                } catch (RemoteException e9) {
                    throw new ps2(e9);
                }
            }
        }, rr2Var.f11399v.get(0)));
        a7.i().S0(view);
        d52Var.f4073c.t6(a7.f());
        return a7.h();
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final void b(ds2 ds2Var, rr2 rr2Var, d52<cf0, y62> d52Var) {
        try {
            d52Var.f4072b.h0(rr2Var.W);
            l62 l62Var = null;
            if (((Boolean) sw.c().b(m10.I5)).booleanValue() && rr2Var.f11376e0) {
                d52Var.f4072b.y4(rr2Var.R, rr2Var.f11400w.toString(), ds2Var.f4312a.f2953a.f7618d, x3.b.B3(this.f8951a), new m62(this, d52Var, l62Var), d52Var.f4073c, ds2Var.f4312a.f2953a.f7619e);
            } else {
                d52Var.f4072b.t3(rr2Var.R, rr2Var.f11400w.toString(), ds2Var.f4312a.f2953a.f7618d, x3.b.B3(this.f8951a), new m62(this, d52Var, l62Var), d52Var.f4073c, ds2Var.f4312a.f2953a.f7619e);
            }
        } catch (RemoteException e7) {
            throw new ps2(e7);
        }
    }

    final /* synthetic */ cc3 c(View view, rr2 rr2Var, Object obj) {
        return rb3.i(k61.a(this.f8951a, view, rr2Var));
    }
}
