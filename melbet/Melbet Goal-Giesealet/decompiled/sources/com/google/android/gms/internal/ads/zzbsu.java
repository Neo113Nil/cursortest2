package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbsu extends zzaxz implements zzbsw {
    zzbsu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzH(int i, String[] strArr, int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzdf(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zze() throws RemoteException {
        zzdf(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzf() throws RemoteException {
        zzdf(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final boolean zzg() throws RemoteException {
        Parcel zzde = zzde(11, zza());
        boolean zza = zzayb.zza(zzde);
        zzde.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzh(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, bundle);
        zzdf(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzi() throws RemoteException {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzj() throws RemoteException {
        zzdf(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzk() throws RemoteException {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzl() throws RemoteException {
        zzdf(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzm(int i, int i2, Intent intent) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i2);
        zzayb.zzc(zza, intent);
        zzdf(12, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzo(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, bundle);
        Parcel zzde = zzde(6, zza);
        if (zzde.readInt() != 0) {
            bundle.readFromParcel(zzde);
        }
        zzde.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzp() throws RemoteException {
        zzdf(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzq() throws RemoteException {
        zzdf(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzs() throws RemoteException {
        zzdf(9, zza());
    }
}
