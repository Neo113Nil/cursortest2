package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbgd extends zzavg implements zzbgf {
    zzbgd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final float zze() throws RemoteException {
        Parcel zzbh = zzbh(2, zza());
        float readFloat = zzbh.readFloat();
        zzbh.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final float zzf() throws RemoteException {
        Parcel zzbh = zzbh(6, zza());
        float readFloat = zzbh.readFloat();
        zzbh.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final float zzg() throws RemoteException {
        Parcel zzbh = zzbh(5, zza());
        float readFloat = zzbh.readFloat();
        zzbh.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel zzbh = zzbh(7, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final IObjectWrapper zzi() throws RemoteException {
        Parcel zzbh = zzbh(4, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbh.readStrongBinder());
        zzbh.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final boolean zzk() throws RemoteException {
        Parcel zzbh = zzbh(10, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final boolean zzl() throws RemoteException {
        Parcel zzbh = zzbh(8, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final void zzm(zzbhq zzbhqVar) throws RemoteException {
        throw null;
    }
}
