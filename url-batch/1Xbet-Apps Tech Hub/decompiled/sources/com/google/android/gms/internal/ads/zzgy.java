package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgy implements zzgp {
    private zzhs zzb;
    private String zzc;
    private boolean zzf;
    private final zzhm zza = new zzhm();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzgy zzb(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzgy zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzgy zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzgy zze(zzhs zzhsVar) {
        this.zzb = zzhsVar;
        return this;
    }

    public final zzgy zzf(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgp
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzhd zza() {
        zzhd zzhdVar = new zzhd(this.zzc, this.zzd, this.zze, this.zzf, this.zza);
        zzhs zzhsVar = this.zzb;
        if (zzhsVar != null) {
            zzhdVar.zzf(zzhsVar);
        }
        return zzhdVar;
    }
}
