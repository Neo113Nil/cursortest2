package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzcfn implements Runnable {
    final /* synthetic */ zzcfs zza;

    zzcfn(zzcfs zzcfsVar) {
        Objects.requireNonNull(zzcfsVar);
        this.zza = zzcfsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceDestroyed", new String[0]);
    }
}
