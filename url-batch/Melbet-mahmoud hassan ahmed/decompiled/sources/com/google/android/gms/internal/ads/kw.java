package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class kw extends pw<jx> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f7667b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f7668c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ dd0 f7669d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ow f7670e;

    kw(ow owVar, Context context, String str, dd0 dd0Var) {
        this.f7670e = owVar;
        this.f7667b = context;
        this.f7668c = str;
        this.f7669d = dd0Var;
    }

    @Override // com.google.android.gms.internal.ads.pw
    protected final /* bridge */ /* synthetic */ jx a() {
        ow.n(this.f7667b, "native_ad");
        return new d00();
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ jx b(xx xxVar) {
        return xxVar.P1(x3.b.B3(this.f7667b), this.f7668c, this.f7669d, 214106000);
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ jx c() {
        zh0 zh0Var;
        hv hvVar;
        m10.c(this.f7667b);
        if (!((Boolean) sw.c().b(m10.h7)).booleanValue()) {
            hvVar = this.f7670e.f9842b;
            return hvVar.c(this.f7667b, this.f7668c, this.f7669d);
        }
        try {
            IBinder C3 = ((kx) no0.b(this.f7667b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new lo0() { // from class: com.google.android.gms.internal.ads.jw
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.lo0
                public final Object c(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return queryLocalInterface instanceof kx ? (kx) queryLocalInterface : new kx(obj);
                }
            })).C3(x3.b.B3(this.f7667b), this.f7668c, this.f7669d, 214106000);
            if (C3 == null) {
                return null;
            }
            IInterface queryLocalInterface = C3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof jx ? (jx) queryLocalInterface : new hx(C3);
        } catch (RemoteException | mo0 | NullPointerException e7) {
            this.f7670e.f9848h = xh0.c(this.f7667b);
            zh0Var = this.f7670e.f9848h;
            zh0Var.a(e7, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
