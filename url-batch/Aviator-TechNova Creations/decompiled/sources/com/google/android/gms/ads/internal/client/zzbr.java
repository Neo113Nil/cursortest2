package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzblq;
import com.google.android.gms.internal.ads.zzblt;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbqs;
import com.google.android.gms.internal.ads.zzbrb;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbr extends zzbcs implements zzbt {
    zzbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final zzbq zze() throws RemoteException {
        zzbq zzboVar;
        Parcel zzcZ = zzcZ(1, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzboVar = queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(readStrongBinder);
        }
        zzcZ.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzf(zzbk zzbkVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbkVar);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzg(zzblq zzblqVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzh(zzblt zzbltVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzi(String str, zzblz zzblzVar, zzblw zzblwVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zze(zza, zzblzVar);
        zzbcu.zze(zza, zzblwVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzj(zzbkh zzbkhVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbkhVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzk(zzbmd zzbmdVar, zzr zzrVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbmdVar);
        zzbcu.zzc(zza, zzrVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzm(zzbmg zzbmgVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbmgVar);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzn(zzbqs zzbqsVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzo(zzbrb zzbrbVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, adManagerAdViewOptions);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzq(zzcs zzcsVar) throws RemoteException {
        throw null;
    }
}
