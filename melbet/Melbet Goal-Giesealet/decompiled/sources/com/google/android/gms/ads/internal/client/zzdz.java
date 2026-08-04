package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzdz extends zzaya implements zzea {
    public zzdz() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzea zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof zzea ? (zzea) queryLocalInterface : new zzdy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 2:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 3:
                List zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzg);
                return true;
            case 4:
                zzv zzh = zzh();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, zzh);
                return true;
            case 5:
                Bundle zzi = zzi();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, zzi);
                return true;
            case 6:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            default:
                return false;
        }
    }
}
