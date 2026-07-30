package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcde extends zzbcs implements zzcdg {
    zzcde(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzcdg
    public final zzcdd zze(IObjectWrapper iObjectWrapper, zzbtt zzbttVar, int i) throws RemoteException {
        zzcdd zzcdbVar;
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(2, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzcdbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcdbVar = queryLocalInterface instanceof zzcdd ? (zzcdd) queryLocalInterface : new zzcdb(readStrongBinder);
        }
        zzcZ.recycle();
        return zzcdbVar;
    }
}
