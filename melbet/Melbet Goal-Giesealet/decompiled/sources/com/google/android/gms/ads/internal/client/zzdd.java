package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxz;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdd extends zzaxz implements zzdf {
    zzdd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdf
    public final void zze() throws RemoteException {
        zzdf(1, zza());
    }
}
