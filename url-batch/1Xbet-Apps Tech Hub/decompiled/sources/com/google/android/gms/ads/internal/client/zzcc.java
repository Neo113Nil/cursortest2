package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzbgl;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbgr;
import com.google.android.gms.internal.ads.zzbgs;
import com.google.android.gms.internal.ads.zzblb;
import com.google.android.gms.internal.ads.zzbld;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzbpr;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbti;
import com.google.android.gms.internal.ads.zzbto;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbwt;
import com.google.android.gms.internal.ads.zzbxi;
import com.google.android.gms.internal.ads.zzbxj;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcae;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcc extends zzavg implements zzce {
    zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbpr zzbprVar, int i) throws RemoteException {
        zzbq zzboVar;
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzavi.zzf(zza, zzbprVar);
        zza.writeInt(234310000);
        Parcel zzbh = zzbh(3, zza);
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(readStrongBinder);
        }
        zzbh.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbpr zzbprVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzd(zza, zzqVar);
        zza.writeString(str);
        zzavi.zzf(zza, zzbprVar);
        zza.writeInt(234310000);
        Parcel zzbh = zzbh(13, zza);
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzbh.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbpr zzbprVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzd(zza, zzqVar);
        zza.writeString(str);
        zzavi.zzf(zza, zzbprVar);
        zza.writeInt(234310000);
        Parcel zzbh = zzbh(1, zza);
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzbh.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbpr zzbprVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzd(zza, zzqVar);
        zza.writeString(str);
        zzavi.zzf(zza, zzbprVar);
        zza.writeInt(234310000);
        Parcel zzbh = zzbh(2, zza);
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzbh.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzd(zza, zzqVar);
        zza.writeString(str);
        zza.writeInt(234310000);
        Parcel zzbh = zzbh(10, zza);
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzbh.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzco zzcmVar;
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zza.writeInt(234310000);
        Parcel zzbh = zzbh(9, zza);
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcmVar = queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(readStrongBinder);
        }
        zzbh.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbpr zzbprVar, int i) throws RemoteException {
        zzdj zzdhVar;
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbprVar);
        zza.writeInt(234310000);
        Parcel zzbh = zzbh(17, zza);
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdhVar = queryLocalInterface instanceof zzdj ? (zzdj) queryLocalInterface : new zzdh(readStrongBinder);
        }
        zzbh.recycle();
        return zzdhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbgm zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, iObjectWrapper2);
        Parcel zzbh = zzbh(5, zza);
        zzbgm zzbF = zzbgl.zzbF(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzbF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbgs zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, iObjectWrapper2);
        zzavi.zzf(zza, iObjectWrapper3);
        Parcel zzbh = zzbh(11, zza);
        zzbgs zze = zzbgr.zze(zzbh.readStrongBinder());
        zzbh.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzble zzk(IObjectWrapper iObjectWrapper, zzbpr zzbprVar, int i, zzblb zzblbVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbprVar);
        zza.writeInt(234310000);
        zzavi.zzf(zza, zzblbVar);
        Parcel zzbh = zzbh(16, zza);
        zzble zzb = zzbld.zzb(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbti zzl(IObjectWrapper iObjectWrapper, zzbpr zzbprVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbprVar);
        zza.writeInt(234310000);
        Parcel zzbh = zzbh(15, zza);
        zzbti zzb = zzbth.zzb(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbtp zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        Parcel zzbh = zzbh(8, zza);
        zzbtp zzI = zzbto.zzI(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbwt zzn(IObjectWrapper iObjectWrapper, zzbpr zzbprVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbxj zzo(IObjectWrapper iObjectWrapper, String str, zzbpr zzbprVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzavi.zzf(zza, zzbprVar);
        zza.writeInt(234310000);
        Parcel zzbh = zzbh(12, zza);
        zzbxj zzq = zzbxi.zzq(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzcae zzp(IObjectWrapper iObjectWrapper, zzbpr zzbprVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzbprVar);
        zza.writeInt(234310000);
        Parcel zzbh = zzbh(14, zza);
        zzcae zzb = zzcad.zzb(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzb;
    }
}
