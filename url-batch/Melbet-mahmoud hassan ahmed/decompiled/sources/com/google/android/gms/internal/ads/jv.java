package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import x3.c;

/* loaded from: classes.dex */
public final class jv extends x3.c<ox> {

    /* renamed from: c, reason: collision with root package name */
    private zh0 f7256c;

    public jv() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // x3.c
    protected final /* synthetic */ ox a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof ox ? (ox) queryLocalInterface : new ox(iBinder);
    }

    public final nx c(Context context, pv pvVar, String str, dd0 dd0Var, int i7) {
        m10.c(context);
        if (!((Boolean) sw.c().b(m10.h7)).booleanValue()) {
            try {
                IBinder C3 = b(context).C3(x3.b.B3(context), pvVar, str, dd0Var, 214106000, i7);
                if (C3 == null) {
                    return null;
                }
                IInterface queryLocalInterface = C3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof nx ? (nx) queryLocalInterface : new lx(C3);
            } catch (RemoteException | c.a e7) {
                io0.c("Could not create remote AdManager.", e7);
                return null;
            }
        }
        try {
            IBinder C32 = ((ox) no0.b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new lo0() { // from class: com.google.android.gms.internal.ads.iv
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.lo0
                public final Object c(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface2 = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return queryLocalInterface2 instanceof ox ? (ox) queryLocalInterface2 : new ox(obj);
                }
            })).C3(x3.b.B3(context), pvVar, str, dd0Var, 214106000, i7);
            if (C32 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = C32.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof nx ? (nx) queryLocalInterface2 : new lx(C32);
        } catch (RemoteException | mo0 | NullPointerException e8) {
            zh0 c7 = xh0.c(context);
            this.f7256c = c7;
            c7.a(e8, "AdManagerCreator.newAdManagerByDynamiteLoader");
            io0.i("#007 Could not call remote method.", e8);
            return null;
        }
    }
}
