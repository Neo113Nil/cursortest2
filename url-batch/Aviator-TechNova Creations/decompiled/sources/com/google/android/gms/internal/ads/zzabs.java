package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzabs {
    final /* synthetic */ zzabt zza;
    private zzv zzb;

    /* synthetic */ zzabs(zzabt zzabtVar, byte[] bArr) {
        Objects.requireNonNull(zzabtVar);
        this.zza = zzabtVar;
    }

    public final void zza(final zzbv zzbvVar) {
        zzt zztVar = new zzt();
        zztVar.zzt(zzbvVar.zzb);
        zztVar.zzu(zzbvVar.zzc);
        zztVar.zzm("video/raw");
        this.zzb = zztVar.zzM();
        this.zza.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzabs.this.zza.zzB().zzd(zzbvVar);
            }
        });
    }

    public final void zzb(long j, long j2, boolean z) {
        if (z) {
            zzabt zzabtVar = this.zza;
            if (zzabtVar.zzA() != null) {
                zzabtVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzabs.this.zza.zzB().zzb();
                    }
                });
            }
        }
        zzv zzvVar = this.zzb;
        if (zzvVar == null) {
            zzvVar = new zzt().zzM();
        }
        zzv zzvVar2 = zzvVar;
        zzabt zzabtVar2 = this.zza;
        zzabtVar2.zzD().zzcS(j2, j, zzvVar2, null);
        ((zzadp) zzabtVar2.zzz().remove()).zza(j);
    }
}
