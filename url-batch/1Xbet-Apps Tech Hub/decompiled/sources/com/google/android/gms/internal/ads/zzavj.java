package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzavj extends zzavg implements zzavl {
    zzavj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final void zze(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zza.writeString("GMA_SDK");
        zzbi(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final void zzf() throws RemoteException {
        zzbi(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final void zzg(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbi(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final void zzh(int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzbi(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final void zzi(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(0);
        zzbi(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final void zzj(byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzbi(5, zza);
    }
}
