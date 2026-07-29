package com.google.android.gms.games.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzx extends com.google.android.gms.internal.games.zzb implements zzw {
    public zzx() {
        super("com.google.android.gms.games.internal.IGamesClient");
    }

    @Override // com.google.android.gms.internal.games.zzb
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1001) {
            return false;
        }
        zzaa zzn = zzn();
        parcel2.writeNoException();
        com.google.android.gms.internal.games.zzc.zzb(parcel2, zzn);
        return true;
    }
}
