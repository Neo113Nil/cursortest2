package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbbw implements Runnable {
    final /* synthetic */ zzbbx zza;

    zzbbw(zzbbx zzbbxVar) {
        Objects.requireNonNull(zzbbxVar);
        this.zza = zzbbxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
