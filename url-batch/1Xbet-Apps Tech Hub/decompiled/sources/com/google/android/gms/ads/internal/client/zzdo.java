package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzavi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdo extends zzavg implements zzdq {
    zzdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() throws RemoteException {
        Parcel zzbh = zzbh(5, zza());
        int readInt = zzbh.readInt();
        zzbh.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final zzdt zzi() throws RemoteException {
        zzdt zzdrVar;
        Parcel zzbh = zzbh(11, zza());
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzdrVar = queryLocalInterface instanceof zzdt ? (zzdt) queryLocalInterface : new zzdr(readStrongBinder);
        }
        zzbh.recycle();
        return zzdrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzavi.zza;
        zza.writeInt(z ? 1 : 0);
        zzbi(3, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() throws RemoteException {
        zzbi(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() throws RemoteException {
        zzbi(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(zzdt zzdtVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzdtVar);
        zzbi(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() throws RemoteException {
        zzbi(13, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() throws RemoteException {
        Parcel zzbh = zzbh(12, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() throws RemoteException {
        Parcel zzbh = zzbh(10, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() throws RemoteException {
        Parcel zzbh = zzbh(4, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }
}
