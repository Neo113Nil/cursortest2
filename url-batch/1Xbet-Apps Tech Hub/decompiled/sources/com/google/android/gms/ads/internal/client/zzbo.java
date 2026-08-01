package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbhg;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbhm;
import com.google.android.gms.internal.ads.zzbhp;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbmm;
import com.google.android.gms.internal.ads.zzbmv;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbo extends zzavg implements zzbq {
    zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() throws RemoteException {
        zzbn zzblVar;
        Parcel zzbh = zzbh(1, zza());
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzblVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzblVar = queryLocalInterface instanceof zzbn ? (zzbn) queryLocalInterface : new zzbl(readStrongBinder);
        }
        zzbh.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbhg zzbhgVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbhj zzbhjVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, zzbhp zzbhpVar, zzbhm zzbhmVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzavi.zzf(zza, zzbhpVar);
        zzavi.zzf(zza, zzbhmVar);
        zzbi(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzbmv zzbmvVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbht zzbhtVar, zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbhtVar);
        zzavi.zzd(zza, zzqVar);
        zzbi(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbhw zzbhwVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbhwVar);
        zzbi(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(zzbh zzbhVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbhVar);
        zzbi(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, adManagerAdViewOptions);
        zzbi(15, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbmm zzbmmVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbfw zzbfwVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzbfwVar);
        zzbi(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcf zzcfVar) throws RemoteException {
        throw null;
    }
}
