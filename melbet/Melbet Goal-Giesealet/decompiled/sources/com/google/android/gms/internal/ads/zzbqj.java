package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbqj extends zzaya implements zzbqk {
    public zzbqj() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzayb.zzh(parcel);
            zze(asInterface);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzayb.zzh(parcel);
            zzf(readString);
        } else if (i == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzayb.zzh(parcel);
            zzg(zzeVar);
        } else {
            if (i != 4) {
                return false;
            }
            zzbpg zzb = zzbpf.zzb(parcel.readStrongBinder());
            zzayb.zzh(parcel);
            zzh(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
