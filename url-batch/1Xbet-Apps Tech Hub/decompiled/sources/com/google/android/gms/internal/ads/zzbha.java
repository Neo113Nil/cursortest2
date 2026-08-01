package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbha extends zzavg implements zzbhc {
    zzbha(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException {
        Parcel zzbh = zzbh(7, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final zzbgf zzf() throws RemoteException {
        zzbgf zzbgdVar;
        Parcel zzbh = zzbh(16, zza());
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzbgdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbgdVar = queryLocalInterface instanceof zzbgf ? (zzbgf) queryLocalInterface : new zzbgd(readStrongBinder);
        }
        zzbh.recycle();
        return zzbgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final zzbgi zzg(String str) throws RemoteException {
        zzbgi zzbggVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbh = zzbh(2, zza);
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzbggVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbggVar = queryLocalInterface instanceof zzbgi ? (zzbgi) queryLocalInterface : new zzbgg(readStrongBinder);
        }
        zzbh.recycle();
        return zzbggVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final IObjectWrapper zzh() throws RemoteException {
        Parcel zzbh = zzbh(9, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbh.readStrongBinder());
        zzbh.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final String zzi() throws RemoteException {
        Parcel zzbh = zzbh(4, zza());
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final String zzj(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbh = zzbh(1, zza);
        String readString = zzbh.readString();
        zzbh.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final List zzk() throws RemoteException {
        Parcel zzbh = zzbh(3, zza());
        ArrayList<String> createStringArrayList = zzbh.createStringArrayList();
        zzbh.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzl() throws RemoteException {
        zzbi(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzm() throws RemoteException {
        zzbi(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzn(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbi(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzo() throws RemoteException {
        zzbi(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final boolean zzq() throws RemoteException {
        Parcel zzbh = zzbh(12, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        Parcel zzbh = zzbh(17, zza);
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        Parcel zzbh = zzbh(10, zza);
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final boolean zzt() throws RemoteException {
        Parcel zzbh = zzbh(13, zza());
        boolean zzg = zzavi.zzg(zzbh);
        zzbh.recycle();
        return zzg;
    }
}
