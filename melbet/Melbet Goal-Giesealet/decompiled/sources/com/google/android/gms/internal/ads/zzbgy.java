package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbgy extends zzaxz implements zzbha {
    zzbgy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zze(zzbgq zzbgqVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzbgqVar);
        zza.writeString(str);
        zzdf(1, zza);
    }
}
