package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfnm implements Runnable {
    final /* synthetic */ zzfnr zza;

    zzfnm(zzfnr zzfnrVar) {
        Objects.requireNonNull(zzfnrVar);
        this.zza = zzfnrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzh().zzc();
    }
}
