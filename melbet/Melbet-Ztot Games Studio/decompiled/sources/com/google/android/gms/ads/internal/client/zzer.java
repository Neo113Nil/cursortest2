package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
final class zzer implements Runnable {
    final /* synthetic */ zzet zza;

    zzer(zzet zzetVar) {
        this.zza = zzetVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbh zzbhVar;
        zzbh zzbhVar2;
        zzeu zzeuVar = this.zza.zza;
        zzbhVar = zzeuVar.zza;
        if (zzbhVar != null) {
            try {
                zzbhVar2 = zzeuVar.zza;
                zzbhVar2.zze(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
