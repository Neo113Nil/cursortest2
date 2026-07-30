package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzblq;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzblt;
import com.google.android.gms.internal.ads.zzblv;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbly;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmc;
import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzbmf;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbqs;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbrb;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzbs extends zzbct implements zzbt {
    public zzbs() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbk zzbkVar = null;
        zzcs zzcsVar = null;
        switch (i) {
            case 1:
                zzbq zze = zze();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbkVar = queryLocalInterface instanceof zzbk ? (zzbk) queryLocalInterface : new zzbi(readStrongBinder);
                }
                zzbcu.zzh(parcel);
                zzf(zzbkVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzblq zzb = zzblp.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzg(zzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzblt zzb2 = zzbls.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzh(zzb2);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                zzblz zzb3 = zzbly.zzb(parcel.readStrongBinder());
                zzblw zzb4 = zzblv.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzi(readString, zzb3, zzb4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbkh zzbkhVar = (zzbkh) zzbcu.zzb(parcel, zzbkh.CREATOR);
                zzbcu.zzh(parcel);
                zzj(zzbkhVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcsVar = queryLocalInterface2 instanceof zzcs ? (zzcs) queryLocalInterface2 : new zzcs(readStrongBinder2);
                }
                zzbcu.zzh(parcel);
                zzq(zzcsVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbmd zzb5 = zzbmc.zzb(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzbcu.zzb(parcel, zzr.CREATOR);
                zzbcu.zzh(parcel);
                zzk(zzb5, zzrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzbcu.zzb(parcel, PublisherAdViewOptions.CREATOR);
                zzbcu.zzh(parcel);
                zzl(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbmg zzb6 = zzbmf.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzm(zzb6);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbqs zzbqsVar = (zzbqs) zzbcu.zzb(parcel, zzbqs.CREATOR);
                zzbcu.zzh(parcel);
                zzn(zzbqsVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbrb zzb7 = zzbra.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzo(zzb7);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzbcu.zzb(parcel, AdManagerAdViewOptions.CREATOR);
                zzbcu.zzh(parcel);
                zzp(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
