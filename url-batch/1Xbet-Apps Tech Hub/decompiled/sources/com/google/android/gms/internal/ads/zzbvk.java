package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbvk extends zzavg implements zzbvm {
    zzbvk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zze(zzbwa zzbwaVar, zzbvw zzbvwVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzbwaVar);
        zzavi.zzf(zza, zzbvwVar);
        zzbi(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzf(zzbwa zzbwaVar, zzbvw zzbvwVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzbwaVar);
        zzavi.zzf(zza, zzbvwVar);
        zzbi(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzg(zzbwa zzbwaVar, zzbvw zzbvwVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzbwaVar);
        zzavi.zzf(zza, zzbvwVar);
        zzbi(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzh(String str, zzbvw zzbvwVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzavi.zzf(zza, zzbvwVar);
        zzbi(7, zza);
    }
}
