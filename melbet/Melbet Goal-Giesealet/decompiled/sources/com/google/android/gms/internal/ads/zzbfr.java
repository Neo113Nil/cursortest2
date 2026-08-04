package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbfr extends zzaxz implements zzbft {
    zzbfr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zze() throws RemoteException {
        Parcel zzde = zzde(2, zza());
        float readFloat = zzde.readFloat();
        zzde.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final IObjectWrapper zzg() throws RemoteException {
        Parcel zzde = zzde(4, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzde.readStrongBinder());
        zzde.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zzh() throws RemoteException {
        Parcel zzde = zzde(5, zza());
        float readFloat = zzde.readFloat();
        zzde.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zzi() throws RemoteException {
        Parcel zzde = zzde(6, zza());
        float readFloat = zzde.readFloat();
        zzde.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final com.google.android.gms.ads.internal.client.zzed zzj() throws RemoteException {
        Parcel zzde = zzde(7, zza());
        com.google.android.gms.ads.internal.client.zzed zzb = com.google.android.gms.ads.internal.client.zzec.zzb(zzde.readStrongBinder());
        zzde.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final boolean zzk() throws RemoteException {
        Parcel zzde = zzde(8, zza());
        boolean zza = zzayb.zza(zzde);
        zzde.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final boolean zzl() throws RemoteException {
        Parcel zzde = zzde(10, zza());
        boolean zza = zzayb.zza(zzde);
        zzde.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzm(zzbhe zzbheVar) throws RemoteException {
        throw null;
    }
}
