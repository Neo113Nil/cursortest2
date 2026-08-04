package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbox;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcl extends zzaxz implements IInterface {
    zzcl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, zzboxVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzde = zzde(1, zza);
        IBinder readStrongBinder = zzde.readStrongBinder();
        zzde.recycle();
        return readStrongBinder;
    }
}
