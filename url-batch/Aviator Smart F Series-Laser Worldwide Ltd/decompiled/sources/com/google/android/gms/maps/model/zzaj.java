package com.google.android.gms.maps.model;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.maps.zzaw;

/* loaded from: classes3.dex */
final class zzaj extends zzaw {
    final /* synthetic */ TileProvider zza;

    zzaj(TileOverlayOptions tileOverlayOptions, TileProvider tileProvider) {
        this.zza = tileProvider;
    }

    @Override // com.google.android.gms.internal.maps.zzax
    @Nullable
    public final Tile zzb(int i8, int i9, int i10) {
        return this.zza.getTile(i8, i9, i10);
    }
}
