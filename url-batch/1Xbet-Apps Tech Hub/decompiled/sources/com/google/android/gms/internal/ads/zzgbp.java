package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzp;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgbp extends zzfzp.zzi implements Runnable {
    private final Runnable zza;

    public zzgbp(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    protected final String zza() {
        return "task=[" + this.zza.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Error | RuntimeException e) {
            zzd(e);
            throw e;
        }
    }
}
