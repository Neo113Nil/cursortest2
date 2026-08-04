package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxz;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdh extends zzaxz implements zzdj {
    zzdh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdj
    public final String zze() throws RemoteException {
        Parcel zzde = zzde(1, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdj
    public final String zzf() throws RemoteException {
        Parcel zzde = zzde(2, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }
}
