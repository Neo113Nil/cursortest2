package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzfrq implements Runnable {
    final /* synthetic */ zzfsa zza;

    zzfrq(zzfsa zzfsaVar) {
        Objects.requireNonNull(zzfsaVar);
        this.zza = zzfsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzu();
    }
}
