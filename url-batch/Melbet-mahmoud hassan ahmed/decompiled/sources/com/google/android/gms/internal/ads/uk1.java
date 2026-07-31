package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* loaded from: classes.dex */
public final class uk1 implements va1, zh1 {

    /* renamed from: f, reason: collision with root package name */
    private final xl0 f12833f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f12834g;

    /* renamed from: h, reason: collision with root package name */
    private final pm0 f12835h;

    /* renamed from: i, reason: collision with root package name */
    private final View f12836i;

    /* renamed from: j, reason: collision with root package name */
    private String f12837j;

    /* renamed from: k, reason: collision with root package name */
    private final jr f12838k;

    public uk1(xl0 xl0Var, Context context, pm0 pm0Var, View view, jr jrVar) {
        this.f12833f = xl0Var;
        this.f12834g = context;
        this.f12835h = pm0Var;
        this.f12836i = view;
        this.f12838k = jrVar;
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void d() {
        String i7 = this.f12835h.i(this.f12834g);
        this.f12837j = i7;
        String valueOf = String.valueOf(i7);
        String str = this.f12838k == jr.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.f12837j = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void h(mj0 mj0Var, String str, String str2) {
        if (this.f12835h.z(this.f12834g)) {
            try {
                pm0 pm0Var = this.f12835h;
                Context context = this.f12834g;
                pm0Var.t(context, pm0Var.f(context), this.f12833f.a(), mj0Var.c(), mj0Var.a());
            } catch (RemoteException e7) {
                io0.h("Remote Exception to get reward item.", e7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void i() {
        this.f12833f.b(false);
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void n() {
        View view = this.f12836i;
        if (view != null && this.f12837j != null) {
            this.f12835h.x(view.getContext(), this.f12837j);
        }
        this.f12833f.b(true);
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void o() {
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void t() {
    }
}
