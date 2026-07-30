package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzcay;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzci extends zzbcs implements zzck {
    zzci(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zze(List list, zzce zzceVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbcu.zze(zza, zzceVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(2, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzcaz zzg(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(3, zza);
        zzcaz zzt = zzcay.zzt(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(4, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbex zzi(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(5, zza);
        zzbex zzb = zzbew.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzj(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(6, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbx zzk(String str) throws RemoteException {
        zzbx zzbvVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(7, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = queryLocalInterface instanceof zzbx ? (zzbx) queryLocalInterface : new zzbv(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzl(zzbtt zzbttVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbttVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzm(String str, zzft zzftVar, zzch zzchVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zzc(zza, zzftVar);
        zzbcu.zze(zza, zzchVar);
        Parcel zzcZ = zzcZ(9, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzn(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        Parcel zzcZ = zzcZ(10, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbx zzo(String str) throws RemoteException {
        zzbx zzbvVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(11, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = queryLocalInterface instanceof zzbx ? (zzbx) queryLocalInterface : new zzbv(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbex zzp(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(12, zza);
        zzbex zzb = zzbew.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzcaz zzq(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(13, zza);
        zzcaz zzt = zzcay.zzt(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzft zzr(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        Parcel zzcZ = zzcZ(14, zza);
        zzft zzftVar = (zzft) zzbcu.zzb(zzcZ, zzft.CREATOR);
        zzcZ.recycle();
        return zzftVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final Bundle zzs(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        Parcel zzcZ = zzcZ(15, zza);
        Bundle bundle = (Bundle) zzbcu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final int zzt(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        Parcel zzcZ = zzcZ(16, zza);
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzu(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        Parcel zzcZ = zzcZ(17, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzv(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(18, zza);
    }
}
