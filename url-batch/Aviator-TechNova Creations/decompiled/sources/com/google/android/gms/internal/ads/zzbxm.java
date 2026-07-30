package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbxm extends zzbcs implements zzbxo {
    zzbxm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbxo
    public final zzbxl zze(IObjectWrapper iObjectWrapper, zzbtt zzbttVar, int i) throws RemoteException {
        zzbxl zzbxjVar;
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbxjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbxjVar = queryLocalInterface instanceof zzbxl ? (zzbxl) queryLocalInterface : new zzbxj(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbxjVar;
    }
}
