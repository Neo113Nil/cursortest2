package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzzn implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ zzaaa zza;

    zzzn(zzzp zzzpVar, zzaaa zzaaaVar) {
        this.zza = zzaaaVar;
        Objects.requireNonNull(zzzpVar);
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
