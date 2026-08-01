package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbgy extends zzavh implements zzbgz {
    public zzbgy() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper zzg = zzg();
                parcel2.writeNoException();
                zzavi.zzf(parcel2, zzg);
                return true;
            case 3:
                String zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeList(zzm);
                return true;
            case 5:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 6:
                zzbgi zze = zze();
                parcel2.writeNoException();
                zzavi.zzf(parcel2, zze);
                return true;
            case 7:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 8:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 9:
                Bundle zzb = zzb();
                parcel2.writeNoException();
                zzavi.zze(parcel2, zzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzdq zzc = zzc();
                parcel2.writeNoException();
                zzavi.zzf(parcel2, zzc);
                return true;
            case 12:
                Bundle bundle = (Bundle) zzavi.zza(parcel, Bundle.CREATOR);
                zzavi.zzc(parcel);
                zzo(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) zzavi.zza(parcel, Bundle.CREATOR);
                zzavi.zzc(parcel);
                boolean zzq = zzq(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zzq ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) zzavi.zza(parcel, Bundle.CREATOR);
                zzavi.zzc(parcel);
                zzp(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbga zzd = zzd();
                parcel2.writeNoException();
                zzavi.zzf(parcel2, zzd);
                return true;
            case 16:
                IObjectWrapper zzf = zzf();
                parcel2.writeNoException();
                zzavi.zzf(parcel2, zzf);
                return true;
            case 17:
                String zzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            default:
                return false;
        }
    }
}
