package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzcfo implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcfs zzb;

    zzcfo(zzcfs zzcfsVar, boolean z) {
        this.zza = z;
        Objects.requireNonNull(zzcfsVar);
        this.zzb = zzcfsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", new String[]{"isVisible", String.valueOf(this.zza)});
    }
}
