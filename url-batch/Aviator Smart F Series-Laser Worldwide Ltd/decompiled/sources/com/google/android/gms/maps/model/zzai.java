package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.maps.zzax;

/* loaded from: classes3.dex */
final class zzai implements TileProvider {
    final /* synthetic */ TileOverlayOptions zza;
    private final zzax zzb;

    zzai(TileOverlayOptions tileOverlayOptions) {
        zzax zzaxVar;
        this.zza = tileOverlayOptions;
        zzaxVar = tileOverlayOptions.zza;
        this.zzb = zzaxVar;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    @Nullable
    public final Tile getTile(int i8, int i9, int i10) {
        try {
            return this.zzb.zzb(i8, i9, i10);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
