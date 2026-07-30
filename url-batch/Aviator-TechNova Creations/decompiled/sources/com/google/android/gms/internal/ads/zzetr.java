package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzetr {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzetq zzb;

    public final void zza(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }

    final void zzc(zzetq zzetqVar) {
        this.zzb = zzetqVar;
    }

    final zzetq zzd() {
        return this.zzb;
    }
}
