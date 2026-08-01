package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfsj extends zzavg implements zzfsl {
    zzfsj(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    public final void zze(Bundle bundle, zzfsn zzfsnVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, bundle);
        zzavi.zzf(zza, zzfsnVar);
        zzbj(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    public final void zzf(String str, Bundle bundle, zzfsn zzfsnVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzavi.zzd(zza, bundle);
        zzavi.zzf(zza, zzfsnVar);
        zzbj(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    public final void zzg(Bundle bundle, zzfsn zzfsnVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, bundle);
        zzavi.zzf(zza, zzfsnVar);
        zzbj(3, zza);
    }
}
