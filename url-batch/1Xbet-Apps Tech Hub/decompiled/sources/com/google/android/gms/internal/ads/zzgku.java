package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgku {
    private static final zzgku zza = (zzgku) zzgmc.zza(new zzgmb() { // from class: com.google.android.gms.internal.ads.zzgks
        @Override // com.google.android.gms.internal.ads.zzgmb
        public final Object zza() {
            zzgku zzgkuVar = new zzgku();
            zzgkuVar.zzf(new zzgjz(zzgkg.class, zzglo.class, new zzgka() { // from class: com.google.android.gms.internal.ads.zzgkt
            }));
            return zzgkuVar;
        }
    });
    private final AtomicReference zzb = new AtomicReference(new zzgma(new zzglu(), null));

    public static zzgku zzc() {
        return zza;
    }

    public final zzgcp zza(zzglo zzgloVar, @Nullable zzgdp zzgdpVar) throws GeneralSecurityException {
        return !((zzgma) this.zzb.get()).zzh(zzgloVar) ? new zzgkg(zzgloVar, zzgdpVar) : ((zzgma) this.zzb.get()).zza(zzgloVar, zzgdpVar);
    }

    public final zzgdd zzb(zzglt zzgltVar) throws GeneralSecurityException {
        return ((zzgma) this.zzb.get()).zzb(zzgltVar);
    }

    public final zzglt zzd(zzgdd zzgddVar, Class cls) throws GeneralSecurityException {
        return ((zzgma) this.zzb.get()).zzc(zzgddVar, cls);
    }

    public final synchronized void zze(zzgjy zzgjyVar) throws GeneralSecurityException {
        zzglu zzgluVar = new zzglu((zzgma) this.zzb.get());
        zzgluVar.zza(zzgjyVar);
        this.zzb.set(new zzgma(zzgluVar, null));
    }

    public final synchronized void zzf(zzgkc zzgkcVar) throws GeneralSecurityException {
        zzglu zzgluVar = new zzglu((zzgma) this.zzb.get());
        zzgluVar.zzb(zzgkcVar);
        this.zzb.set(new zzgma(zzgluVar, null));
    }

    public final synchronized void zzg(zzgky zzgkyVar) throws GeneralSecurityException {
        zzglu zzgluVar = new zzglu((zzgma) this.zzb.get());
        zzgluVar.zzc(zzgkyVar);
        this.zzb.set(new zzgma(zzgluVar, null));
    }

    public final synchronized void zzh(zzglc zzglcVar) throws GeneralSecurityException {
        zzglu zzgluVar = new zzglu((zzgma) this.zzb.get());
        zzgluVar.zzd(zzglcVar);
        this.zzb.set(new zzgma(zzgluVar, null));
    }

    public final boolean zzi(zzglt zzgltVar) {
        return ((zzgma) this.zzb.get()).zzi(zzgltVar);
    }
}
