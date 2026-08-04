package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbpe extends zzaxz implements zzbpg {
    zzbpe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final IObjectWrapper zze() throws RemoteException {
        Parcel zzde = zzde(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzde.readStrongBinder());
        zzde.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final boolean zzf() throws RemoteException {
        Parcel zzde = zzde(2, zza());
        boolean zza = zzayb.zza(zzde);
        zzde.recycle();
        return zza;
    }
}
