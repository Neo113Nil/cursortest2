package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbg extends zzaya implements zzbh {
    public zzbg() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
