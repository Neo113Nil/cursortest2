package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import x3.c;

/* loaded from: classes.dex */
public final class zz extends x3.c<gy> {
    public zz() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // x3.c
    protected final /* synthetic */ gy a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof gy ? (gy) queryLocalInterface : new gy(iBinder);
    }

    public final fy c(Context context) {
        try {
            IBinder C3 = b(context).C3(x3.b.B3(context), 214106000);
            if (C3 == null) {
                return null;
            }
            IInterface queryLocalInterface = C3.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof fy ? (fy) queryLocalInterface : new cy(C3);
        } catch (RemoteException | c.a e7) {
            io0.h("Could not get remote MobileAdsSettingManager.", e7);
            return null;
        }
    }
}
