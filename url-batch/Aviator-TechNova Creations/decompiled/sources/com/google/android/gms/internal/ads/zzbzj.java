package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbzj extends zzbcs implements zzbzl {
    zzbzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, parcelFileDescriptor);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbaVar);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbzu zzbzuVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, parcelFileDescriptor);
        zzbcu.zzc(zza, zzbzuVar);
        zzda(3, zza);
    }
}
