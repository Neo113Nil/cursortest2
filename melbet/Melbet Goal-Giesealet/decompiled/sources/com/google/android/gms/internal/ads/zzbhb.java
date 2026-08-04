package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbhb extends zzaxz implements zzbhd {
    zzbhb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zze(zzbgq zzbgqVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzbgqVar);
        zzdf(1, zza);
    }
}
