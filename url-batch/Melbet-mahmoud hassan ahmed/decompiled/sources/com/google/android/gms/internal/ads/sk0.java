package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class sk0 {
    public static final fk0 a(Context context, String str, dd0 dd0Var) {
        try {
            IBinder C3 = ((kk0) no0.b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new lo0() { // from class: com.google.android.gms.internal.ads.rk0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.lo0
                public final Object c(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return queryLocalInterface instanceof kk0 ? (kk0) queryLocalInterface : new kk0(obj);
                }
            })).C3(x3.b.B3(context), str, dd0Var, 214106000);
            if (C3 == null) {
                return null;
            }
            IInterface queryLocalInterface = C3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof fk0 ? (fk0) queryLocalInterface : new dk0(C3);
        } catch (RemoteException | mo0 e7) {
            io0.i("#007 Could not call remote method.", e7);
            return null;
        }
    }
}
