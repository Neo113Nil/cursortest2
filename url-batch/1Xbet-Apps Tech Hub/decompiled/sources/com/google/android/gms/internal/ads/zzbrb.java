package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbrb extends zzavg implements zzbrd {
    zzbrb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbi(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzeVar);
        zzbi(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzh(zzbqa zzbqaVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbqaVar);
        zzbi(4, zza);
    }
}
