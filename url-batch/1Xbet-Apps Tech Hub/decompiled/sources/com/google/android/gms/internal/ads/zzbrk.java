package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbrk extends zzavg implements zzbrm {
    zzbrk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbi(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzeVar);
        zzbi(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzg() throws RemoteException {
        zzbi(2, zza());
    }
}
