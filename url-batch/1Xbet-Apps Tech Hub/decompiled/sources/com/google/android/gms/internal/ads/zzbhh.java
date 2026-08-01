package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbhh extends zzavg implements zzbhj {
    zzbhh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final void zze(zzbgz zzbgzVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbgzVar);
        zzbi(1, zza);
    }
}
