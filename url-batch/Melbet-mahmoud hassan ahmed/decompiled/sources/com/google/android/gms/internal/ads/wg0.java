package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import x3.c;

/* loaded from: classes.dex */
public final class wg0 extends x3.c<ch0> {
    public wg0() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // x3.c
    protected final /* synthetic */ ch0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof ch0 ? (ch0) queryLocalInterface : new ah0(iBinder);
    }

    public final zg0 c(Activity activity) {
        try {
            IBinder zze = b(activity).zze(x3.b.B3(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zg0 ? (zg0) queryLocalInterface : new xg0(zze);
        } catch (RemoteException e7) {
            io0.h("Could not create remote AdOverlay.", e7);
            return null;
        } catch (c.a e8) {
            io0.h("Could not create remote AdOverlay.", e8);
            return null;
        }
    }
}
