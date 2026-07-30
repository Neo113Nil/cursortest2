package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfmb {
    private final zzflt zza;
    private final ListenableFuture zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfmb(final zzfkz zzfkzVar, final zzfls zzflsVar, final zzflt zzfltVar) {
        this.zza = zzfltVar;
        this.zzb = zzgzo.zzh(zzgzo.zzj(zzflsVar.zza(zzfltVar), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfma
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfmb.this.zzc(zzflsVar, zzfkzVar, zzfltVar, (zzfli) obj);
            }
        }, zzfltVar.zza()), Exception.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfly
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfmb.this.zzd(zzflsVar, (Exception) obj);
            }
        }, zzfltVar.zza());
    }

    public final synchronized void zza(zzgzl zzgzlVar) {
        zzflt zzfltVar = this.zza;
        zzgzo.zzr(zzgzo.zzj(this.zzb, zzflz.zza, zzfltVar.zza()), zzgzlVar, zzfltVar.zza());
    }

    public final synchronized ListenableFuture zzb(zzflt zzfltVar) {
        if (!this.zzd && !this.zzc) {
            zzflt zzfltVar2 = this.zza;
            if (zzfltVar2.zzb() != null && zzfltVar.zzb() != null && zzfltVar2.zzb().equals(zzfltVar.zzb())) {
                this.zzc = true;
                return this.zzb;
            }
        }
        return null;
    }

    final /* synthetic */ ListenableFuture zzc(zzfls zzflsVar, zzfkz zzfkzVar, zzflt zzfltVar, zzfli zzfliVar) {
        synchronized (this) {
            this.zzd = true;
            zzflsVar.zzb(zzfliVar);
            if (this.zzc) {
                return zzgzo.zza(new zzflr(zzfliVar, zzfltVar));
            }
            zzfkzVar.zzb(zzfltVar.zzb(), zzfliVar);
            return zzgzo.zza(null);
        }
    }

    final /* synthetic */ ListenableFuture zzd(zzfls zzflsVar, Exception exc) {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }
}
