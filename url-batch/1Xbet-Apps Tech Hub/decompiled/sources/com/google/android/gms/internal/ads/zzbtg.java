package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbtg extends zzavg implements zzbti {
    zzbtg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zze(Intent intent) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, intent);
        zzbi(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzh() throws RemoteException {
        zzbi(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(str2);
        zzbi(2, zza);
    }
}
