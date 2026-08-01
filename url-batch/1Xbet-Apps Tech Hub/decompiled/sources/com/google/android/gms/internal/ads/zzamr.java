package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzamr {
    private final Executor zza;

    public zzamr(Handler handler) {
        this.zza = new zzamp(this, handler);
    }

    public final void zza(zzana zzanaVar, zzanj zzanjVar) {
        zzanaVar.zzm("post-error");
        ((zzamp) this.zza).zza.post(new zzamq(zzanaVar, zzang.zza(zzanjVar), null));
    }

    public final void zzb(zzana zzanaVar, zzang zzangVar, Runnable runnable) {
        zzanaVar.zzq();
        zzanaVar.zzm("post-response");
        ((zzamp) this.zza).zza.post(new zzamq(zzanaVar, zzangVar, runnable));
    }
}
