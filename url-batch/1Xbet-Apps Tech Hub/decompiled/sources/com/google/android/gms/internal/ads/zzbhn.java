package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbhn extends zzavg implements zzbhp {
    zzbhn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zze(zzbhc zzbhcVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbhcVar);
        zzbi(1, zza);
    }
}
