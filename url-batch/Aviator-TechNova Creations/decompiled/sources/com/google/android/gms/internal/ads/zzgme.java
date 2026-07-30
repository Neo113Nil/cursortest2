package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgme implements zzgky {
    private final zzgjd zza;
    private final ExecutorService zzb;
    private final zzgoe zzc;

    zzgme(zzgjd zzgjdVar, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzgjdVar;
        this.zzb = executorService;
        this.zzc = zzgoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zza() {
        return zzgzo.zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zzb() {
        ListenableFuture zzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgme.this.zzf();
            }
        }, this.zzb);
        this.zzc.zze(15302, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zzc(final zzgdu zzgduVar, final byte[] bArr, final byte[] bArr2) {
        ListenableFuture zzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgme.this.zzi(zzgduVar, bArr, bArr2);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15321, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final ListenableFuture zzd(final zzgdu zzgduVar, final byte[] bArr) {
        ListenableFuture zzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgme.this.zzh(zzgduVar, bArr);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15305, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgky
    public final ListenableFuture zze() {
        ListenableFuture zzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgma
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgme.this.zzg();
            }
        }, this.zzb);
        this.zzc.zze(15314, zzd);
        return zzd;
    }

    final /* synthetic */ zzgdu zzf() {
        zzgdu zzc = this.zza.zzc(1);
        return zzc == null ? zzgdu.zzg() : zzc;
    }

    final /* synthetic */ zzfwq zzg() {
        return this.zza.zzb(1);
    }

    final /* synthetic */ Void zzh(zzgdu zzgduVar, byte[] bArr) {
        this.zza.zza(zzgduVar, null, bArr);
        return null;
    }

    final /* synthetic */ Void zzi(zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        this.zza.zza(zzgduVar, bArr, bArr2);
        return null;
    }
}
