package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class mw extends pw<fy> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f8736b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ow f8737c;

    mw(ow owVar, Context context) {
        this.f8737c = owVar;
        this.f8736b = context;
    }

    @Override // com.google.android.gms.internal.ads.pw
    protected final /* bridge */ /* synthetic */ fy a() {
        ow.n(this.f8736b, "mobile_ads_settings");
        return new i00();
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ fy b(xx xxVar) {
        return xxVar.G0(x3.b.B3(this.f8736b), 214106000);
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ fy c() {
        zh0 zh0Var;
        zz zzVar;
        m10.c(this.f8736b);
        if (!((Boolean) sw.c().b(m10.h7)).booleanValue()) {
            zzVar = this.f8737c.f9843c;
            return zzVar.c(this.f8736b);
        }
        try {
            IBinder C3 = ((gy) no0.b(this.f8736b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new lo0() { // from class: com.google.android.gms.internal.ads.lw
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.lo0
                public final Object c(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return queryLocalInterface instanceof gy ? (gy) queryLocalInterface : new gy(obj);
                }
            })).C3(x3.b.B3(this.f8736b), 214106000);
            if (C3 == null) {
                return null;
            }
            IInterface queryLocalInterface = C3.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof fy ? (fy) queryLocalInterface : new cy(C3);
        } catch (RemoteException | mo0 | NullPointerException e7) {
            this.f8737c.f9848h = xh0.c(this.f8736b);
            zh0Var = this.f8737c.f9848h;
            zh0Var.a(e7, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
