package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzavh;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbhf;
import com.google.android.gms.internal.ads.zzbhg;
import com.google.android.gms.internal.ads.zzbhi;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbhl;
import com.google.android.gms.internal.ads.zzbhm;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhp;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbmm;
import com.google.android.gms.internal.ads.zzbmu;
import com.google.android.gms.internal.ads.zzbmv;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbp extends zzavh implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbh zzbhVar = null;
        zzcf zzcfVar = null;
        switch (i) {
            case 1:
                zzbn zze = zze();
                parcel2.writeNoException();
                zzavi.zzf(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbhVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
                }
                zzavi.zzc(parcel);
                zzl(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbhg zzb = zzbhf.zzb(parcel.readStrongBinder());
                zzavi.zzc(parcel);
                zzf(zzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbhj zzb2 = zzbhi.zzb(parcel.readStrongBinder());
                zzavi.zzc(parcel);
                zzg(zzb2);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                zzbhp zzb3 = zzbho.zzb(parcel.readStrongBinder());
                zzbhm zzb4 = zzbhl.zzb(parcel.readStrongBinder());
                zzavi.zzc(parcel);
                zzh(readString, zzb3, zzb4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbfw zzbfwVar = (zzbfw) zzavi.zza(parcel, zzbfw.CREATOR);
                zzavi.zzc(parcel);
                zzo(zzbfwVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcfVar = queryLocalInterface2 instanceof zzcf ? (zzcf) queryLocalInterface2 : new zzcf(readStrongBinder2);
                }
                zzavi.zzc(parcel);
                zzq(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbht zzb5 = zzbhs.zzb(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzavi.zza(parcel, zzq.CREATOR);
                zzavi.zzc(parcel);
                zzj(zzb5, zzqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzavi.zza(parcel, PublisherAdViewOptions.CREATOR);
                zzavi.zzc(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbhw zzb6 = zzbhv.zzb(parcel.readStrongBinder());
                zzavi.zzc(parcel);
                zzk(zzb6);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbmm zzbmmVar = (zzbmm) zzavi.zza(parcel, zzbmm.CREATOR);
                zzavi.zzc(parcel);
                zzn(zzbmmVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbmv zzb7 = zzbmu.zzb(parcel.readStrongBinder());
                zzavi.zzc(parcel);
                zzi(zzb7);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzavi.zza(parcel, AdManagerAdViewOptions.CREATOR);
                zzavi.zzc(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
