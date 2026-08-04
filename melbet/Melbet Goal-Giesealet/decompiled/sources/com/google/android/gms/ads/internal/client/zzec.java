package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzec extends zzaya implements zzed {
    public zzec() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzed zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof zzed ? (zzed) queryLocalInterface : new zzeb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzeg zzeeVar;
        switch (i) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                zzf();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zza = zzayb.zza(parcel);
                zzayb.zzh(parcel);
                zzg(zza);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zzh = zzh();
                parcel2.writeNoException();
                int i3 = zzayb.zza;
                parcel2.writeInt(zzh ? 1 : 0);
                return true;
            case 5:
                int zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeInt(zzi);
                return true;
            case 6:
                float zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeFloat(zzj);
                return true;
            case 7:
                float zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(zzk);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzeeVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    zzeeVar = queryLocalInterface instanceof zzeg ? (zzeg) queryLocalInterface : new zzee(readStrongBinder);
                }
                zzayb.zzh(parcel);
                zzl(zzeeVar);
                parcel2.writeNoException();
                return true;
            case 9:
                float zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeFloat(zzm);
                return true;
            case 10:
                boolean zzn = zzn();
                parcel2.writeNoException();
                int i4 = zzayb.zza;
                parcel2.writeInt(zzn ? 1 : 0);
                return true;
            case 11:
                zzeg zzo = zzo();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzo);
                return true;
            case 12:
                boolean zzp = zzp();
                parcel2.writeNoException();
                int i5 = zzayb.zza;
                parcel2.writeInt(zzp ? 1 : 0);
                return true;
            case 13:
                zzq();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
