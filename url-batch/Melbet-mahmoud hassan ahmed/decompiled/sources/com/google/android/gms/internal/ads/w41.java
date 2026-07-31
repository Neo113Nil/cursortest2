package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class w41 extends t41 {

    /* renamed from: i, reason: collision with root package name */
    private final Context f13699i;

    /* renamed from: j, reason: collision with root package name */
    private final View f13700j;

    /* renamed from: k, reason: collision with root package name */
    private final eu0 f13701k;

    /* renamed from: l, reason: collision with root package name */
    private final sr2 f13702l;

    /* renamed from: m, reason: collision with root package name */
    private final t61 f13703m;

    /* renamed from: n, reason: collision with root package name */
    private final cn1 f13704n;

    /* renamed from: o, reason: collision with root package name */
    private final ri1 f13705o;

    /* renamed from: p, reason: collision with root package name */
    private final ev3<mb2> f13706p;

    /* renamed from: q, reason: collision with root package name */
    private final Executor f13707q;

    /* renamed from: r, reason: collision with root package name */
    private pv f13708r;

    w41(u61 u61Var, Context context, sr2 sr2Var, View view, eu0 eu0Var, t61 t61Var, cn1 cn1Var, ri1 ri1Var, ev3<mb2> ev3Var, Executor executor) {
        super(u61Var);
        this.f13699i = context;
        this.f13700j = view;
        this.f13701k = eu0Var;
        this.f13702l = sr2Var;
        this.f13703m = t61Var;
        this.f13704n = cn1Var;
        this.f13705o = ri1Var;
        this.f13706p = ev3Var;
        this.f13707q = executor;
    }

    public static /* synthetic */ void o(w41 w41Var) {
        if (w41Var.f13704n.e() == null) {
            return;
        }
        try {
            w41Var.f13704n.e().h4(w41Var.f13706p.a(), x3.b.B3(w41Var.f13699i));
        } catch (RemoteException e7) {
            io0.e("RemoteException when notifyAdLoad is called", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.v61
    public final void b() {
        this.f13707q.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.v41
            @Override // java.lang.Runnable
            public final void run() {
                w41.o(w41.this);
            }
        });
        super.b();
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int h() {
        if (((Boolean) sw.c().b(m10.I5)).booleanValue() && this.f13139b.f11376e0) {
            if (!((Boolean) sw.c().b(m10.J5)).booleanValue()) {
                return 0;
            }
        }
        return this.f13138a.f4313b.f3934b.f12948c;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final View i() {
        return this.f13700j;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final cz j() {
        try {
            return this.f13703m.zza();
        } catch (ps2 unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final sr2 k() {
        pv pvVar = this.f13708r;
        if (pvVar != null) {
            return os2.c(pvVar);
        }
        rr2 rr2Var = this.f13139b;
        if (rr2Var.Z) {
            for (String str : rr2Var.f11367a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new sr2(this.f13700j.getWidth(), this.f13700j.getHeight(), false);
        }
        return os2.b(this.f13139b.f11396s, this.f13702l);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final sr2 l() {
        return this.f13702l;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final void m() {
        this.f13705o.zza();
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final void n(ViewGroup viewGroup, pv pvVar) {
        eu0 eu0Var;
        if (viewGroup == null || (eu0Var = this.f13701k) == null) {
            return;
        }
        eu0Var.h0(vv0.c(pvVar));
        viewGroup.setMinimumHeight(pvVar.f10378h);
        viewGroup.setMinimumWidth(pvVar.f10381k);
        this.f13708r = pvVar;
    }
}
