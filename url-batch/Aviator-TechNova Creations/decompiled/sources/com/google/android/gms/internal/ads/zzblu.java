package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzblu extends zzbcs implements zzblw {
    zzblu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zze(zzblm zzblmVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzblmVar);
        zza.writeString(str);
        zzda(1, zza);
    }
}
