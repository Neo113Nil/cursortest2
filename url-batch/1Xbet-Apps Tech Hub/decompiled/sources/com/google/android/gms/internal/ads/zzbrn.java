package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbrn extends zzavg implements zzbrp {
    zzbrn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException {
        Parcel zzbh = zzbh(5, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final zzbsd zzf() throws RemoteException {
        Parcel zzbh = zzbh(2, zza());
        zzbsd zzbsdVar = (zzbsd) zzavi.zza(zzbh, zzbsd.CREATOR);
        zzbh.recycle();
        return zzbsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final zzbsd zzg() throws RemoteException {
        Parcel zzbh = zzbh(3, zza());
        zzbsd zzbsdVar = (zzbsd) zzavi.zza(zzbh, zzbsd.CREATOR);
        zzbh.recycle();
        return zzbsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbrs zzbrsVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzavi.zzd(zza, bundle);
        zzavi.zzd(zza, bundle2);
        zzavi.zzd(zza, zzqVar);
        zzavi.zzf(zza, zzbrsVar);
        zzbi(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbra zzbraVar, zzbpx zzbpxVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzavi.zzd(zza, zzlVar);
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbraVar);
        zzavi.zzf(zza, zzbpxVar);
        zzbi(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbrd zzbrdVar, zzbpx zzbpxVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzavi.zzd(zza, zzlVar);
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbrdVar);
        zzavi.zzf(zza, zzbpxVar);
        zzavi.zzd(zza, zzqVar);
        zzbi(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbrd zzbrdVar, zzbpx zzbpxVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzavi.zzd(zza, zzlVar);
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbrdVar);
        zzavi.zzf(zza, zzbpxVar);
        zzavi.zzd(zza, zzqVar);
        zzbi(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbrg zzbrgVar, zzbpx zzbpxVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzavi.zzd(zza, zzlVar);
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbrgVar);
        zzavi.zzf(zza, zzbpxVar);
        zzbi(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbrj zzbrjVar, zzbpx zzbpxVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzavi.zzd(zza, zzlVar);
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbrjVar);
        zzavi.zzf(zza, zzbpxVar);
        zzbi(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbrj zzbrjVar, zzbpx zzbpxVar, zzbfw zzbfwVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzavi.zzd(zza, zzlVar);
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbrjVar);
        zzavi.zzf(zza, zzbpxVar);
        zzavi.zzd(zza, zzbfwVar);
        zzbi(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbrm zzbrmVar, zzbpx zzbpxVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzavi.zzd(zza, zzlVar);
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbrmVar);
        zzavi.zzf(zza, zzbpxVar);
        zzbi(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbrm zzbrmVar, zzbpx zzbpxVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzavi.zzd(zza, zzlVar);
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbrmVar);
        zzavi.zzf(zza, zzbpxVar);
        zzbi(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzq(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbi(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        Parcel zzbh = zzbh(24, zza);
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        Parcel zzbh = zzbh(15, zza);
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        Parcel zzbh = zzbh(17, zza);
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }
}
