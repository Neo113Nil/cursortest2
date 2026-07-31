package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import x3.c;

/* loaded from: classes.dex */
public final class hv extends x3.c<kx> {
    public hv() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // x3.c
    protected final /* synthetic */ kx a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof kx ? (kx) queryLocalInterface : new kx(iBinder);
    }

    public final jx c(Context context, String str, dd0 dd0Var) {
        try {
            IBinder C3 = b(context).C3(x3.b.B3(context), str, dd0Var, 214106000);
            if (C3 == null) {
                return null;
            }
            IInterface queryLocalInterface = C3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof jx ? (jx) queryLocalInterface : new hx(C3);
        } catch (RemoteException | c.a e7) {
            io0.h("Could not create remote builder for AdLoader.", e7);
            return null;
        }
    }
}
