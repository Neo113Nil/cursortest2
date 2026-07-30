package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcdb extends zzbcs implements zzcdd {
    zzcdb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zze(IObjectWrapper iObjectWrapper, zzcdh zzcdhVar, zzcda zzcdaVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zzc(zza, zzcdhVar);
        zzbcu.zze(zza, zzcdaVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzi(zzbyk zzbykVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zze(zza, iObjectWrapper2);
        zza.writeString(str);
        zzbcu.zze(zza, iObjectWrapper3);
        Parcel zzcZ = zzcZ(11, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }
}
