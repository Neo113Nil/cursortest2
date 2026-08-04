package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbkm extends zzaxz implements zzbko {
    zzbkm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdf(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final void zzf() throws RemoteException {
        zzdf(2, zza());
    }
}
