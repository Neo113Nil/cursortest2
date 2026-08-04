package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbgo extends zzaxz implements zzbgq {
    zzbgo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final String zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzde = zzde(1, zza);
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final zzbfw zzf(String str) throws RemoteException {
        zzbfw zzbfuVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzde = zzde(2, zza);
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfuVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbfuVar = queryLocalInterface instanceof zzbfw ? (zzbfw) queryLocalInterface : new zzbfu(readStrongBinder);
        }
        zzde.recycle();
        return zzbfuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final List zzg() throws RemoteException {
        Parcel zzde = zzde(3, zza());
        ArrayList<String> createStringArrayList = zzde.createStringArrayList();
        zzde.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final String zzh() throws RemoteException {
        Parcel zzde = zzde(4, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzi(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdf(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzj() throws RemoteException {
        zzdf(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final com.google.android.gms.ads.internal.client.zzed zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzl() throws RemoteException {
        zzdf(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel zzde = zzde(9, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzde.readStrongBinder());
        zzde.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        Parcel zzde = zzde(10, zza);
        boolean zza2 = zzayb.zza(zzde);
        zzde.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzo() throws RemoteException {
        Parcel zzde = zzde(12, zza());
        boolean zza = zzayb.zza(zzde);
        zzde.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzp() throws RemoteException {
        Parcel zzde = zzde(13, zza());
        boolean zza = zzayb.zza(zzde);
        zzde.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzr() throws RemoteException {
        zzdf(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final zzbft zzs() throws RemoteException {
        zzbft zzbfrVar;
        Parcel zzde = zzde(16, zza());
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbfrVar = queryLocalInterface instanceof zzbft ? (zzbft) queryLocalInterface : new zzbfr(readStrongBinder);
        }
        zzde.recycle();
        return zzbfrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        Parcel zzde = zzde(17, zza);
        boolean zza2 = zzayb.zza(zzde);
        zzde.recycle();
        return zza2;
    }
}
