package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbhk extends zzavg implements zzbhm {
    zzbhk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhm
    public final void zze(zzbhc zzbhcVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbhcVar);
        zza.writeString(str);
        zzbi(1, zza);
    }
}
