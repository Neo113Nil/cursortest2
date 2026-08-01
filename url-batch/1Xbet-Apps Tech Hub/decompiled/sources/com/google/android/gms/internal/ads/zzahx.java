package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzahx implements zzahv {
    private final int zza;
    private final int zzb;
    private final zzfj zzc;

    public zzahx(zzahr zzahrVar, zzam zzamVar) {
        zzfj zzfjVar = zzahrVar.zza;
        this.zzc = zzfjVar;
        zzfjVar.zzG(12);
        int zzo = zzfjVar.zzo();
        if ("audio/raw".equals(zzamVar.zzm)) {
            int zzl = zzfs.zzl(zzamVar.zzB, zzamVar.zzz);
            if (zzo == 0 || zzo % zzl != 0) {
                zzez.zzf("AtomParsers", "Audio sample size mismatch. stsd sample size: " + zzl + ", stsz sample size: " + zzo);
                zzo = zzl;
            }
        }
        this.zza = zzo == 0 ? -1 : zzo;
        this.zzb = zzfjVar.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzo() : i;
    }
}
