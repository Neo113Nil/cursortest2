package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcdd;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzcq extends zzbct implements zzcr {
    public zzcq() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzbcu.zzb(parcel, zzr.CREATOR);
                String readString = parcel.readString();
                zzbtt zzf = zzbts.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbx zzb = zzb(asInterface, zzrVar, readString, zzf, readInt);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzb);
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) zzbcu.zzb(parcel, zzr.CREATOR);
                String readString2 = parcel.readString();
                zzbtt zzf2 = zzbts.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbx zzc = zzc(asInterface2, zzrVar2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzc);
                return true;
            case 3:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbtt zzf3 = zzbts.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbt zzd = zzd(asInterface3, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzd);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 5:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzbkw zze = zze(asInterface4, asInterface5);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zze);
                return true;
            case 6:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzf4 = zzbts.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzcaj zzf5 = zzf(asInterface6, zzf4, readInt4);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzf5);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 8:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzbxs zzg = zzg(asInterface7);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzg);
                return true;
            case 9:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzdb zzi = zzi(asInterface8, readInt5);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzi);
                return true;
            case 10:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) zzbcu.zzb(parcel, zzr.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbx zzj = zzj(asInterface9, zzrVar3, readString4, readInt6);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzj);
                return true;
            case 11:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzblc zzk = zzk(asInterface10, asInterface11, asInterface12);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzk);
                return true;
            case 12:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbtt zzf6 = zzbts.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzcaz zzl = zzl(asInterface13, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzl);
                return true;
            case 13:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar4 = (zzr) zzbcu.zzb(parcel, zzr.CREATOR);
                String readString6 = parcel.readString();
                zzbtt zzf7 = zzbts.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbx zzm = zzm(asInterface14, zzrVar4, readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzm);
                return true;
            case 14:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzf8 = zzbts.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzcdd zzn = zzn(asInterface15, zzf8, readInt9);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzn);
                return true;
            case 15:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzf9 = zzbts.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbxl zzo = zzo(asInterface16, zzf9, readInt10);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzo);
                return true;
            case 16:
                IObjectWrapper asInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzf10 = zzbts.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbph zzc2 = zzbpg.zzc(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzbpk zzp = zzp(asInterface17, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzp);
                return true;
            case 17:
                IObjectWrapper asInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzf11 = zzbts.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzdw zzq = zzq(asInterface18, zzf11, readInt12);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzq);
                return true;
            case 18:
                IObjectWrapper asInterface19 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzf12 = zzbts.zzf(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzck zzh = zzh(asInterface19, zzf12, readInt13);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzh);
                return true;
            default:
                return false;
        }
    }
}
