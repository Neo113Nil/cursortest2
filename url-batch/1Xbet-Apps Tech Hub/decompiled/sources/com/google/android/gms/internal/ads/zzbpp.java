package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbpp extends zzavg implements zzbpr {
    zzbpp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbpu zzb(String str) throws RemoteException {
        zzbpu zzbpsVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbh = zzbh(1, zza);
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbpsVar = queryLocalInterface instanceof zzbpu ? (zzbpu) queryLocalInterface : new zzbps(readStrongBinder);
        }
        zzbh.recycle();
        return zzbpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbrp zzc(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbh = zzbh(3, zza);
        zzbrp zzb = zzbro.zzb(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final boolean zzd(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbh = zzbh(4, zza);
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final boolean zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbh = zzbh(2, zza);
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }
}
