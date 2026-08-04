package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzavu implements Runnable {
    final /* synthetic */ zzavx zza;

    zzavu(zzavx zzavxVar) {
        Objects.requireNonNull(zzavxVar);
        this.zza = zzavxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzr();
    }
}
