package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzblx extends zzbcs implements zzblz {
    zzblx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzblz
    public final void zze(zzblm zzblmVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzblmVar);
        zzda(1, zza);
    }
}
