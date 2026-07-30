package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzblo extends zzbcs implements zzblq {
    zzblo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final void zze(zzblh zzblhVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzblhVar);
        zzda(1, zza);
    }
}
