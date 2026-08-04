package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzxq implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ zzyd zza;

    zzxq(zzxs zzxsVar, zzyd zzydVar) {
        this.zza = zzydVar;
        Objects.requireNonNull(zzxsVar);
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.zza.zzl();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.zza.zzl();
    }
}
