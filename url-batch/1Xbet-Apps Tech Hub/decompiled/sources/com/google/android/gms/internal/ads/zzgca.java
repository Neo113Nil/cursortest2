package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgca extends zzgar implements RunnableFuture {

    @CheckForNull
    private volatile zzgbk zza;

    zzgca(zzgah zzgahVar) {
        this.zza = new zzgby(this, zzgahVar);
    }

    static zzgca zze(Runnable runnable, Object obj) {
        return new zzgca(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgbk zzgbkVar = this.zza;
        if (zzgbkVar != null) {
            zzgbkVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    @CheckForNull
    protected final String zza() {
        zzgbk zzgbkVar = this.zza;
        if (zzgbkVar == null) {
            return super.zza();
        }
        return "task=[" + zzgbkVar.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    protected final void zzb() {
        zzgbk zzgbkVar;
        if (zzt() && (zzgbkVar = this.zza) != null) {
            zzgbkVar.zzh();
        }
        this.zza = null;
    }

    zzgca(Callable callable) {
        this.zza = new zzgbz(this, callable);
    }
}
