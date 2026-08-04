package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgnm;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzgpi extends zzgnm.zzf implements Runnable {
    private final Runnable zza;

    @Override // com.google.android.gms.internal.ads.zzgnm
    protected final String zzd() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    zzgpi(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzb(th);
            throw th;
        }
    }
}
