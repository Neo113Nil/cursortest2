package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbma extends zzaxz implements zzbmc {
    zzbma(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final void zze() throws RemoteException {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final void zzf(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzdf(2, zza);
    }
}
