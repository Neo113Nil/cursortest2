package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbpr;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcm extends zzavg implements zzco {
    zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final float zze() throws RemoteException {
        Parcel zzbh = zzbh(7, zza());
        float readFloat = zzbh.readFloat();
        zzbh.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() throws RemoteException {
        Parcel zzbh = zzbh(9, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() throws RemoteException {
        Parcel zzbh = zzbh(13, zza());
        ArrayList createTypedArrayList = zzbh.createTypedArrayList(zzbma.CREATOR);
        zzbh.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbi(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() throws RemoteException {
        zzbi(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzavi.zza;
        zza.writeInt(z ? 1 : 0);
        zzbi(17, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() throws RemoteException {
        zzbi(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(null);
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzdaVar);
        zzbi(16, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzbi(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbpr zzbprVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbprVar);
        zzbi(11, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzavi.zza;
        zza.writeInt(z ? 1 : 0);
        zzbi(4, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzbi(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbmh zzbmhVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbmhVar);
        zzbi(12, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbi(18, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzffVar);
        zzbi(14, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() throws RemoteException {
        Parcel zzbh = zzbh(8, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }
}
