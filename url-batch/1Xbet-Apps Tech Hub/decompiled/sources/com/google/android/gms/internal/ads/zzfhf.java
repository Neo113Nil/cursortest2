package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfhf {
    private final zzfgy zza;
    private final ListenableFuture zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfhf(final zzfgd zzfgdVar, final zzfgx zzfgxVar, final zzfgy zzfgyVar) {
        this.zza = zzfgyVar;
        this.zzb = zzgbb.zzf(zzgbb.zzn(zzfgxVar.zza(zzfgyVar), new zzgai() { // from class: com.google.android.gms.internal.ads.zzfhd
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzfhf.this.zzb(zzfgxVar, zzfgdVar, zzfgyVar, (zzfgm) obj);
            }
        }, zzfgyVar.zzb()), Exception.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzfhe
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzfhf.this.zzc(zzfgxVar, (Exception) obj);
            }
        }, zzfgyVar.zzb());
    }

    public final synchronized ListenableFuture zza(zzfgy zzfgyVar) {
        if (!this.zzd && !this.zzc && this.zza.zza() != null && zzfgyVar.zza() != null && this.zza.zza().equals(zzfgyVar.zza())) {
            this.zzc = true;
            return this.zzb;
        }
        return null;
    }

    final /* synthetic */ ListenableFuture zzb(zzfgx zzfgxVar, zzfgd zzfgdVar, zzfgy zzfgyVar, zzfgm zzfgmVar) throws Exception {
        synchronized (this) {
            this.zzd = true;
            zzfgxVar.zzb(zzfgmVar);
            if (this.zzc) {
                return zzgbb.zzh(new zzfgw(zzfgmVar, zzfgyVar));
            }
            zzfgdVar.zzd(zzfgyVar.zza(), zzfgmVar);
            return zzgbb.zzh(null);
        }
    }

    final /* synthetic */ ListenableFuture zzc(zzfgx zzfgxVar, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzgax zzgaxVar) {
        zzgbb.zzr(zzgbb.zzn(this.zzb, new zzgai() { // from class: com.google.android.gms.internal.ads.zzfhc
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzgbb.zzi();
            }
        }, this.zza.zzb()), zzgaxVar, this.zza.zzb());
    }
}
