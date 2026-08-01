package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzavi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbi extends zzavg implements zzbk {
    zzbi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzeVar);
        zzbi(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc() throws RemoteException {
        zzbi(1, zza());
    }
}
