package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfkw implements Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza;
    final /* synthetic */ zzflb zzb;

    zzfkw(zzflb zzflbVar, com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zza = zzeaVar;
        Objects.requireNonNull(zzflbVar);
        this.zzb = zzflbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzx(this.zza);
    }
}
