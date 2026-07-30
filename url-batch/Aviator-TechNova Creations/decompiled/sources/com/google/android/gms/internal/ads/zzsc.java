package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzsc {
    final /* synthetic */ zzsd zza;
    private final Handler zzb;
    private final AudioTrack.StreamEventCallback zzc;

    /* synthetic */ zzsc(zzsd zzsdVar, byte[] bArr) {
        Objects.requireNonNull(zzsdVar);
        this.zza = zzsdVar;
        final Handler zzc = zzfj.zzc(null);
        this.zzb = zzc;
        zzsa zzsaVar = new zzsa(this);
        this.zzc = zzsaVar;
        Objects.requireNonNull(zzc);
        zzsdVar.zzr().registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.zzsb
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzc.post(runnable);
            }
        }, zzsaVar);
    }

    final /* synthetic */ void zza() {
        this.zza.zzr().unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}
