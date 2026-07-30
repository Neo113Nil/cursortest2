package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbvq extends zzbcs implements zzbvs {
    zzbvq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zze(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbvv zzbvvVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zzbcu.zzc(zza, bundle);
        zzbcu.zzc(zza, bundle2);
        zzbcu.zzc(zza, zzrVar);
        zzbcu.zze(zza, zzbvvVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final zzbwh zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        zzbwh zzbwhVar = (zzbwh) zzbcu.zzb(zzcZ, zzbwh.CREATOR);
        zzcZ.recycle();
        return zzbwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final zzbwh zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        zzbwh zzbwhVar = (zzbwh) zzbcu.zzb(zzcZ, zzbwh.CREATOR);
        zzcZ.recycle();
        return zzbwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final com.google.android.gms.ads.internal.client.zzed zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzed zzb = com.google.android.gms.ads.internal.client.zzec.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbvg zzbvgVar, zzbtz zzbtzVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zze(zza, zzbvgVar);
        zzbcu.zze(zza, zzbtzVar);
        zzbcu.zzc(zza, zzrVar);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zze(zza, zzbvjVar);
        zzbcu.zze(zza, zzbtzVar);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final boolean zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(15, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbvp zzbvpVar, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zze(zza, zzbvpVar);
        zzbcu.zze(zza, zzbtzVar);
        zzda(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(17, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbvm zzbvmVar, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zze(zza, zzbvmVar);
        zzbcu.zze(zza, zzbtzVar);
        zzda(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzo(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbvp zzbvpVar, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zze(zza, zzbvpVar);
        zzbcu.zze(zza, zzbtzVar);
        zzda(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzq(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbvg zzbvgVar, zzbtz zzbtzVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zze(zza, zzbvgVar);
        zzbcu.zze(zza, zzbtzVar);
        zzbcu.zzc(zza, zzrVar);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzr(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbvm zzbvmVar, zzbtz zzbtzVar, zzbkh zzbkhVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zze(zza, zzbvmVar);
        zzbcu.zze(zza, zzbtzVar);
        zzbcu.zzc(zza, zzbkhVar);
        zzda(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzs(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbvd zzbvdVar, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zze(zza, zzbvdVar);
        zzbcu.zze(zza, zzbtzVar);
        zzda(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(24, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }
}
