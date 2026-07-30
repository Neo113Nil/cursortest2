package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcf extends zzbcs implements zzch {
    zzcf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zze(String str, zzea zzeaVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zze(zza, zzeaVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzg(String str, zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zzc(zza, zzeVar);
        zzda(3, zza);
    }
}
