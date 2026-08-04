package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbge extends zzaxz implements zzbgg {
    zzbge(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final void zzc() throws RemoteException {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(3, zza);
    }
}
