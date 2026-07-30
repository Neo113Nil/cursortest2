package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbqc implements Runnable {
    final /* synthetic */ zzbqf zza;

    zzbqc(zzbqf zzbqfVar) {
        Objects.requireNonNull(zzbqfVar);
        this.zza = zzbqfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
