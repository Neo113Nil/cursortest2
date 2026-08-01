package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbrh extends zzavg implements zzbrj {
    zzbrh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbi(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzeVar);
        zzbi(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final void zzg(zzbqg zzbqgVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbqgVar);
        zzbi(1, zza);
    }
}
