package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbpw extends zzavh implements zzbpx {
    public zzbpw() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbpx zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof zzbpx ? (zzbpx) queryLocalInterface : new zzbpv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int readInt = parcel.readInt();
                zzavi.zzc(parcel);
                zzg(readInt);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof zzbqb) {
                    }
                }
                zzavi.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzavi.zzc(parcel);
                zzq(readString, readString2);
                break;
            case 10:
                zzbhb.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzavi.zzc(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                zzavi.zzc(parcel);
                break;
            case 13:
                zzy();
                break;
            case 14:
                zzbxc zzbxcVar = (zzbxc) zzavi.zza(parcel, zzbxc.CREATOR);
                zzavi.zzc(parcel);
                zzs(zzbxcVar);
                break;
            case 15:
                zzw();
                break;
            case 16:
                zzbxg zzb = zzbxf.zzb(parcel.readStrongBinder());
                zzavi.zzc(parcel);
                zzt(zzb);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                zzavi.zzc(parcel);
                zzj(readInt2);
                break;
            case 18:
                zzu();
                break;
            case 19:
                zzavi.zzc(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String readString3 = parcel.readString();
                zzavi.zzc(parcel);
                zzl(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zzavi.zzc(parcel);
                zzi(readInt3, readString4);
                break;
            case 23:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzavi.zzc(parcel);
                zzh(zzeVar);
                break;
            case 24:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzavi.zzc(parcel);
                zzk(zzeVar2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
