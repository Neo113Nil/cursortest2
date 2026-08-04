package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzzu {
    final /* synthetic */ zzzv zza;
    private zzu zzb;

    /* synthetic */ zzzu(zzzv zzzvVar, byte[] bArr) {
        Objects.requireNonNull(zzzvVar);
        this.zza = zzzvVar;
    }

    public final void zza(final zzbu zzbuVar) {
        zzs zzsVar = new zzs();
        zzsVar.zzt(zzbuVar.zzb);
        zzsVar.zzu(zzbuVar.zzc);
        zzsVar.zzm("video/raw");
        this.zzb = zzsVar.zzM();
        this.zza.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzzu.this.zza.zzB().zzd(zzbuVar);
            }
        });
    }

    public final void zzb(long j, long j2, boolean z) {
        if (z) {
            zzzv zzzvVar = this.zza;
            if (zzzvVar.zzA() != null) {
                zzzvVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzzu.this.zza.zzB().zzb();
                    }
                });
            }
        }
        zzu zzuVar = this.zzb;
        if (zzuVar == null) {
            zzuVar = new zzs().zzM();
        }
        zzu zzuVar2 = zzuVar;
        zzzv zzzvVar2 = this.zza;
        zzzvVar2.zzD().zzcS(j2, j, zzuVar2, null);
        ((zzabp) zzzvVar2.zzz().remove()).zza(j);
    }
}
