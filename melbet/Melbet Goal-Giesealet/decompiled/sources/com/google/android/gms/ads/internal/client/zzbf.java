package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxz;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbf extends zzaxz implements zzbh {
    zzbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzb() throws RemoteException {
        zzdf(1, zza());
    }
}
