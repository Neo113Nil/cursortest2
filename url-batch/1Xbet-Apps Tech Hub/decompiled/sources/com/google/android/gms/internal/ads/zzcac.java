package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcac extends zzavg implements zzcae {
    zzcac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zze(IObjectWrapper iObjectWrapper, zzcai zzcaiVar, zzcab zzcabVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzd(zza, zzcaiVar);
        zzavi.zzf(zza, zzcabVar);
        zzbi(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzf(zzbun zzbunVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzbunVar);
        zzbi(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbue zzbueVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbueVar);
        zzbi(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbue zzbueVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbueVar);
        zzbi(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbue zzbueVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbueVar);
        zzbi(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbue zzbueVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbueVar);
        zzbi(5, zza);
    }
}
