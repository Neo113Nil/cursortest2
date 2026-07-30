package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class zzab extends com.google.android.gms.internal.common.zza implements IGmsCallbacks {
    zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i8, IBinder iBinder, Bundle bundle) {
        Parcel zza = zza();
        zza.writeInt(i8);
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.common.zzc.zzc(zza, bundle);
        zzC(1, zza);
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int i8, Bundle bundle) {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int i8, IBinder iBinder, zzk zzkVar) {
        throw null;
    }
}
