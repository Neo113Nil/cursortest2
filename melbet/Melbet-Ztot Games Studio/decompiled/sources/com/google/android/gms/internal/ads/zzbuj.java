package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public abstract class zzbuj extends zzaxn implements zzbuk {
    public zzbuj() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbuu zzbuuVar = null;
        if (i == 1) {
            zzaxo.zzc(parcel);
            parcel2.writeNoException();
            zzaxo.zze(parcel2, null);
        } else if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof zzbul) {
                }
            }
            zzaxo.zzc(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzbvb zzbvbVar = (zzbvb) zzaxo.zza(parcel, zzbvb.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbuuVar = queryLocalInterface2 instanceof zzbuu ? (zzbuu) queryLocalInterface2 : new zzbus(readStrongBinder2);
            }
            zzaxo.zzc(parcel);
            zzg(zzbvbVar, zzbuuVar);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzbvb zzbvbVar2 = (zzbvb) zzaxo.zza(parcel, zzbvb.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbuuVar = queryLocalInterface3 instanceof zzbuu ? (zzbuu) queryLocalInterface3 : new zzbus(readStrongBinder3);
            }
            zzaxo.zzc(parcel);
            zzf(zzbvbVar2, zzbuuVar);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzbvb zzbvbVar3 = (zzbvb) zzaxo.zza(parcel, zzbvb.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbuuVar = queryLocalInterface4 instanceof zzbuu ? (zzbuu) queryLocalInterface4 : new zzbus(readStrongBinder4);
            }
            zzaxo.zzc(parcel);
            zze(zzbvbVar3, zzbuuVar);
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbuuVar = queryLocalInterface5 instanceof zzbuu ? (zzbuu) queryLocalInterface5 : new zzbus(readStrongBinder5);
            }
            zzaxo.zzc(parcel);
            zzh(readString, zzbuuVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
