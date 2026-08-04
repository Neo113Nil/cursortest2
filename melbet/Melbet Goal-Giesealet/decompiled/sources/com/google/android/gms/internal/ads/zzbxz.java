package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbxz extends zzaxz implements zzbyb {
    zzbxz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzb(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdf(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzc(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayb.zzc(zza, bundle);
        zzdf(3, zza);
    }
}
