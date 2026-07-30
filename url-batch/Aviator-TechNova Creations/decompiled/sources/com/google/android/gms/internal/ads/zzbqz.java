package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbqz extends zzbcs implements zzbrb {
    zzbqz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zze(zzbqv zzbqvVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbqvVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzf(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzeVar);
        zzda(3, zza);
    }
}
