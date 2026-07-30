package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzfum implements Runnable {
    final /* synthetic */ zzfur zza;

    zzfum(zzfur zzfurVar) {
        Objects.requireNonNull(zzfurVar);
        this.zza = zzfurVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzh().zzc();
    }
}
