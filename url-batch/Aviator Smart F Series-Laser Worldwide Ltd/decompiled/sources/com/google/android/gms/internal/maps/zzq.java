package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class zzq extends zza implements zzs {
    zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IFeatureLayerDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzs
    public final String zzd() {
        Parcel zzJ = zzJ(6, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzs
    public final String zze() {
        Parcel zzJ = zzJ(1, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzs
    public final void zzf(zzaj zzajVar) {
        Parcel zza = zza();
        zzc.zzg(zza, zzajVar);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzs
    public final void zzg(zzaj zzajVar) {
        Parcel zza = zza();
        zzc.zzg(zza, zzajVar);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzs
    public final void zzh(zzar zzarVar) {
        Parcel zza = zza();
        zzc.zzg(zza, zzarVar);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzs
    public final boolean zzi() {
        Parcel zzJ = zzJ(2, zza());
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }
}
