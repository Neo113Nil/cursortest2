package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzamq implements Runnable {
    private final zzana zza;
    private final zzang zzb;
    private final Runnable zzc;

    public zzamq(zzana zzanaVar, zzang zzangVar, Runnable runnable) {
        this.zza = zzanaVar;
        this.zzb = zzangVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzw();
        zzang zzangVar = this.zzb;
        if (zzangVar.zzc()) {
            this.zza.zzo(zzangVar.zza);
        } else {
            this.zza.zzn(zzangVar.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
