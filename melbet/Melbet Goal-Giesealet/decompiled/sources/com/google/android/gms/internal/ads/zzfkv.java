package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfkv implements Runnable {
    final /* synthetic */ zzflb zza;

    zzfkv(zzflb zzflbVar) {
        Objects.requireNonNull(zzflbVar);
        this.zza = zzflbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzq();
    }
}
