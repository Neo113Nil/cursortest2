package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbsn extends zzaxz implements zzbsp {
    zzbsn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zze(Intent intent) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, intent);
        zzdf(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzf(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzg() throws RemoteException {
        zzdf(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzi(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzayb.zze(zza, iObjectWrapper);
        zzdf(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zzc(zza, zzaVar);
        zzdf(6, zza);
    }
}
