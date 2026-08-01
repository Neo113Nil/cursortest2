package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbmf extends zzavg implements zzbmh {
    zzbmf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final void zzb(List list) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbi(1, zza);
    }
}
