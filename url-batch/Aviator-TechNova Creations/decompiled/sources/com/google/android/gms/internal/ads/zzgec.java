package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgec {
    private final zzika zza;
    private final zzika zzb;
    private final zzika zzc;
    private final ExecutorService zzd;
    private final zzgoe zze;

    zzgec(zzika zzikaVar, zzika zzikaVar2, zzika zzikaVar3, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzikaVar;
        this.zzb = zzikaVar2;
        this.zzc = zzikaVar3;
        this.zzd = executorService;
        this.zze = zzgoeVar;
    }

    private final ListenableFuture zze(final int i) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgdy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgec.this.zzc(i);
            }
        }, this.zzd)), zzgdz.zza, zzhaf.zza());
    }

    final /* synthetic */ zzgoe zza() {
        return this.zze;
    }

    final ListenableFuture zzb(int i, boolean z) {
        ListenableFuture zze = zze(i);
        return (!z || i == 2) ? zze : (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzg(zzgzg.zzw(zze), Throwable.class, zzgeb.zza, zzhaf.zza()), new zzgdx(this), zzhaf.zza());
    }

    final /* synthetic */ ListenableFuture zzd(int i) {
        return zze(2);
    }

    final /* synthetic */ zzgdv zzc(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return (zzgdv) this.zza.zzb();
        }
        if (i2 == 2) {
            return (zzgdv) this.zzb.zzb();
        }
        if (i2 == 3) {
            return (zzgdv) this.zzc.zzb();
        }
        throw new IllegalArgumentException();
    }
}
