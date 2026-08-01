package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbvl extends zzavh implements zzbvm {
    public zzbvl() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbvw zzbvwVar = null;
        if (i == 1) {
            zzavi.zzc(parcel);
            parcel2.writeNoException();
            zzavi.zze(parcel2, null);
        } else if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof zzbvn) {
                }
            }
            zzavi.zzc(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzbwa zzbwaVar = (zzbwa) zzavi.zza(parcel, zzbwa.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbvwVar = queryLocalInterface2 instanceof zzbvw ? (zzbvw) queryLocalInterface2 : new zzbvu(readStrongBinder2);
            }
            zzavi.zzc(parcel);
            zzg(zzbwaVar, zzbvwVar);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzbwa zzbwaVar2 = (zzbwa) zzavi.zza(parcel, zzbwa.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbvwVar = queryLocalInterface3 instanceof zzbvw ? (zzbvw) queryLocalInterface3 : new zzbvu(readStrongBinder3);
            }
            zzavi.zzc(parcel);
            zzf(zzbwaVar2, zzbvwVar);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzbwa zzbwaVar3 = (zzbwa) zzavi.zza(parcel, zzbwa.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbvwVar = queryLocalInterface4 instanceof zzbvw ? (zzbvw) queryLocalInterface4 : new zzbvu(readStrongBinder4);
            }
            zzavi.zzc(parcel);
            zze(zzbwaVar3, zzbvwVar);
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbvwVar = queryLocalInterface5 instanceof zzbvw ? (zzbvw) queryLocalInterface5 : new zzbvu(readStrongBinder5);
            }
            zzavi.zzc(parcel);
            zzh(readString, zzbvwVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
