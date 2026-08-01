package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbfq extends zzavg implements IInterface {
    zzbfq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbuz zzbuzVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbuzVar);
        zzbi(1, zza);
    }
}
