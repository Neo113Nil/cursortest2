package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzhan extends zzgzf implements RunnableFuture {
    private volatile zzgzv zza;

    zzhan(zzgyv zzgyvVar) {
        this.zza = new zzhal(this, zzgyvVar);
    }

    static zzhan zze(Runnable runnable, Object obj) {
        return new zzhan(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgzv zzgzvVar = this.zza;
        if (zzgzvVar != null) {
            zzgzvVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final void zzc() {
        zzgzv zzgzvVar;
        if (zzj() && (zzgzvVar = this.zza) != null) {
            zzgzvVar.zzh();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final String zzd() {
        zzgzv zzgzvVar = this.zza;
        if (zzgzvVar == null) {
            return super.zzd();
        }
        String obj = zzgzvVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    zzhan(Callable callable) {
        this.zza = new zzham(this, callable);
    }
}
