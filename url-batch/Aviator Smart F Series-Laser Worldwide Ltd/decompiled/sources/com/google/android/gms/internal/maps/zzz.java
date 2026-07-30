package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class zzz extends zza implements zzab {
    zzz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzab
    public final int zzd() {
        Parcel zzJ = zzJ(5, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzab
    public final String zze() {
        Parcel zzJ = zzJ(1, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzab
    public final String zzf() {
        Parcel zzJ = zzJ(2, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzab
    public final void zzg() {
        zzc(3, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzab
    public final boolean zzh(zzab zzabVar) {
        Parcel zza = zza();
        zzc.zzg(zza, zzabVar);
        Parcel zzJ = zzJ(4, zza);
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }
}
