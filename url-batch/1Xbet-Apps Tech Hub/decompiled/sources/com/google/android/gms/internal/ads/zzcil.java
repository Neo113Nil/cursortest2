package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzcil extends zzavh implements zzcim {
    public zzcil() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) zzavi.zza(parcel, Bundle.CREATOR);
                zzavi.zzc(parcel);
                zzp(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) zzavi.zza(parcel, Bundle.CREATOR);
                zzavi.zzc(parcel);
                Bundle zzd = zzd(bundle2);
                parcel2.writeNoException();
                zzavi.zze(parcel2, zzd);
                return true;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle3 = (Bundle) zzavi.zza(parcel, Bundle.CREATOR);
                zzavi.zzc(parcel);
                zzo(readString, readString2, bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzavi.zzc(parcel);
                zzt(readString3, readString4, asInterface);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean zzg = zzavi.zzg(parcel);
                zzavi.zzc(parcel);
                Map zzk = zzk(readString5, readString6, zzg);
                parcel2.writeNoException();
                parcel2.writeMap(zzk);
                return true;
            case 6:
                String readString7 = parcel.readString();
                zzavi.zzc(parcel);
                int zzb = zzb(readString7);
                parcel2.writeNoException();
                parcel2.writeInt(zzb);
                return true;
            case 7:
                Bundle bundle4 = (Bundle) zzavi.zza(parcel, Bundle.CREATOR);
                zzavi.zzc(parcel);
                zzq(bundle4);
                parcel2.writeNoException();
                return true;
            case 8:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                Bundle bundle5 = (Bundle) zzavi.zza(parcel, Bundle.CREATOR);
                zzavi.zzc(parcel);
                zzm(readString8, readString9, bundle5);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                zzavi.zzc(parcel);
                List zzj = zzj(readString10, readString11);
                parcel2.writeNoException();
                parcel2.writeList(zzj);
                return true;
            case 10:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 11:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 12:
                long zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeLong(zzc);
                return true;
            case 13:
                String readString12 = parcel.readString();
                zzavi.zzc(parcel);
                zzl(readString12);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString13 = parcel.readString();
                zzavi.zzc(parcel);
                zzn(readString13);
                parcel2.writeNoException();
                return true;
            case 15:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                zzavi.zzc(parcel);
                zzs(asInterface2, readString14, readString15);
                parcel2.writeNoException();
                return true;
            case 16:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 17:
                String zzg2 = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg2);
                return true;
            case 18:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 19:
                Bundle bundle6 = (Bundle) zzavi.zza(parcel, Bundle.CREATOR);
                zzavi.zzc(parcel);
                zzr(bundle6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
