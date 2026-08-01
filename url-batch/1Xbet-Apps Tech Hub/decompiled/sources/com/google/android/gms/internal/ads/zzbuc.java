package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbuc extends zzavg implements zzbue {
    zzbuc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbue
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbi(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbue
    public final void zzf(List list) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbi(1, zza);
    }
}
