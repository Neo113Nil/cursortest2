package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class zv extends pw<zg0> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f15268b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ow f15269c;

    zv(ow owVar, Activity activity) {
        this.f15269c = owVar;
        this.f15268b = activity;
    }

    @Override // com.google.android.gms.internal.ads.pw
    protected final /* bridge */ /* synthetic */ zg0 a() {
        ow.n(this.f15268b, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ zg0 b(xx xxVar) {
        return xxVar.U(x3.b.B3(this.f15268b));
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ zg0 c() {
        zh0 zh0Var;
        wg0 wg0Var;
        m10.c(this.f15268b);
        if (!((Boolean) sw.c().b(m10.h7)).booleanValue()) {
            wg0Var = this.f15269c.f9846f;
            return wg0Var.c(this.f15268b);
        }
        try {
            return yg0.s6(((ch0) no0.b(this.f15268b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new lo0() { // from class: com.google.android.gms.internal.ads.yv
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.lo0
                public final Object c(Object obj) {
                    return bh0.s6(obj);
                }
            })).zze(x3.b.B3(this.f15268b)));
        } catch (RemoteException | mo0 | NullPointerException e7) {
            this.f15269c.f9848h = xh0.c(this.f15268b.getApplicationContext());
            zh0Var = this.f15269c.f9848h;
            zh0Var.a(e7, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
