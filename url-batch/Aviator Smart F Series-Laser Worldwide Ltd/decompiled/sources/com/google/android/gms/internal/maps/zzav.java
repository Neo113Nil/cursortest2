package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;

/* loaded from: classes3.dex */
public final class zzav extends zza implements zzax {
    zzav(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzax
    public final Tile zzb(int i8, int i9, int i10) {
        Parcel zza = zza();
        zza.writeInt(i8);
        zza.writeInt(i9);
        zza.writeInt(i10);
        Parcel zzJ = zzJ(1, zza);
        Tile tile = (Tile) zzc.zza(zzJ, Tile.CREATOR);
        zzJ.recycle();
        return tile;
    }
}
