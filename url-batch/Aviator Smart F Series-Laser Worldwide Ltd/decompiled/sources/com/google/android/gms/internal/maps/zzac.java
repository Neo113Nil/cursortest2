package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class zzac extends zza implements zzae {
    zzac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzae
    public final boolean zzd() {
        Parcel zzJ = zzJ(1, zza());
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzae
    public final boolean zze() {
        Parcel zzJ = zzJ(2, zza());
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }
}
