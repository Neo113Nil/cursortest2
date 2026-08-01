package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbvu extends zzavg implements zzbvw {
    zzbvu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzbbVar);
        zzbi(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, parcelFileDescriptor);
        zzbi(1, zza);
    }
}
