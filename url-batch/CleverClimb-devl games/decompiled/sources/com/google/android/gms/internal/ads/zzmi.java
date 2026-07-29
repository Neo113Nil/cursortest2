package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzmi implements Runnable {
    private final /* synthetic */ zzmh zzatj;

    zzmi(zzmh zzmhVar) {
        this.zzatj = zzmhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkh zzkhVar;
        zzkh zzkhVar2;
        zzkhVar = this.zzatj.zzati.zzxs;
        if (zzkhVar != null) {
            try {
                zzkhVar2 = this.zzatj.zzati.zzxs;
                zzkhVar2.onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzane.zzc("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
