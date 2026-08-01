package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbtn extends zzavg implements zzbtp {
    zzbtn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final boolean zzH() throws RemoteException {
        Parcel zzbh = zzbh(11, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzh(int i, int i2, Intent intent) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i2);
        zzavi.zzd(zza, intent);
        zzbi(12, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzi() throws RemoteException {
        zzbi(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzl(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, bundle);
        zzbi(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzm() throws RemoteException {
        zzbi(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzo() throws RemoteException {
        zzbi(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzp(int i, String[] strArr, int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzbi(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzq() throws RemoteException {
        zzbi(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzr() throws RemoteException {
        zzbi(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzs(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, bundle);
        Parcel zzbh = zzbh(6, zza);
        if (zzbh.readInt() != 0) {
            bundle.readFromParcel(zzbh);
        }
        zzbh.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzt() throws RemoteException {
        zzbi(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzu() throws RemoteException {
        zzbi(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzv() throws RemoteException {
        zzbi(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzx() throws RemoteException {
        zzbi(9, zza());
    }
}
