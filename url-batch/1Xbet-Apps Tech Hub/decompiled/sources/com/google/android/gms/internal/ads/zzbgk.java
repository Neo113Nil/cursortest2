package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbgk extends zzavg implements zzbgm {
    zzbgk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final IObjectWrapper zzb(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbh = zzbh(2, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbh.readStrongBinder());
        zzbh.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzbA(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzbB(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzbC(zzbgf zzbgfVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbgfVar);
        zzbi(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzbD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzbE(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzc() throws RemoteException {
        zzbi(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zza.writeInt(i);
        zzbi(5, zza);
    }
}
