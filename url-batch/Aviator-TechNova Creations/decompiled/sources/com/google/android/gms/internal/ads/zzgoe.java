package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzgoe {
    private final zzgdh zza;
    private final zzgao zzb;

    zzgoe(zzgao zzgaoVar, zzgdh zzgdhVar) {
        this.zza = zzgdhVar;
        this.zzb = zzgaoVar;
    }

    public final zzgoc zza(int i) {
        return new zzgoc(i, this.zzb, this.zza);
    }

    public final void zzb(int i) {
        this.zza.zzb(i - 1, -1L, null, null);
    }

    public final void zzc(int i, String str) {
        this.zza.zzb(i - 1, -1L, null, str);
    }

    public final void zzd(int i, Throwable th) {
        this.zza.zzb(i - 1, -1L, th, null);
    }

    public final ListenableFuture zze(int i, ListenableFuture listenableFuture) {
        zzgoc zza = zza(i);
        zza.zza();
        zzgzo.zzr(listenableFuture, new zzgod(this, zza), zzhaf.zza());
        return listenableFuture;
    }

    public final void zzf(int i, Runnable runnable) {
        try {
            zza(i).zza();
            runnable.run();
        } finally {
        }
    }
}
