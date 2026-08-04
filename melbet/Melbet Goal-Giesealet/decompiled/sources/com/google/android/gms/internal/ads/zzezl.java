package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzezl implements zzgoq {
    zzezl(zzezo zzezoVar) {
        Objects.requireNonNull(zzezoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* synthetic */ void zzb(@NullableDecl Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit successful.");
    }
}
