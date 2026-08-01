package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgya implements zzgyp {
    private final zzgxw zza;
    private final zzgzg zzb;
    private final boolean zzc;
    private final zzgvz zzd;

    private zzgya(zzgzg zzgzgVar, zzgvz zzgvzVar, zzgxw zzgxwVar) {
        this.zzb = zzgzgVar;
        this.zzc = zzgvzVar.zzh(zzgxwVar);
        this.zzd = zzgvzVar;
        this.zza = zzgxwVar;
    }

    static zzgya zzc(zzgzg zzgzgVar, zzgvz zzgvzVar, zzgxw zzgxwVar) {
        return new zzgya(zzgzgVar, zzgvzVar, zzgxwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final int zza(Object obj) {
        zzgzg zzgzgVar = this.zzb;
        int zzb = zzgzgVar.zzb(zzgzgVar.zzd(obj));
        if (!this.zzc) {
            return zzb;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final Object zze() {
        zzgxw zzgxwVar = this.zza;
        return zzgxwVar instanceof zzgwm ? ((zzgwm) zzgxwVar).zzaD() : zzgxwVar.zzaP().zzan();
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final void zzg(Object obj, Object obj2) {
        zzgyr.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            this.zzd.zza(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final void zzh(Object obj, zzgyh zzgyhVar, zzgvy zzgvyVar) throws IOException {
        boolean zzO;
        zzgzg zzgzgVar = this.zzb;
        Object zzc = zzgzgVar.zzc(obj);
        zzgvz zzgvzVar = this.zzd;
        zzgwd zzb = zzgvzVar.zzb(obj);
        while (zzgyhVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzgyhVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzc2 = zzgvzVar.zzc(zzgvyVar, this.zza, zzd >>> 3);
                        if (zzc2 != null) {
                            zzgvzVar.zzf(zzgyhVar, zzc2, zzgvyVar, zzb);
                        } else {
                            zzO = zzgzgVar.zzp(zzc, zzgyhVar);
                        }
                    } else {
                        zzO = zzgyhVar.zzO();
                    }
                    if (!zzO) {
                        break;
                    }
                } else {
                    Object obj2 = null;
                    int i = 0;
                    zzgve zzgveVar = null;
                    while (zzgyhVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzgyhVar.zzd();
                        if (zzd2 == 16) {
                            i = zzgyhVar.zzj();
                            obj2 = zzgvzVar.zzc(zzgvyVar, this.zza, i);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                zzgvzVar.zzf(zzgyhVar, obj2, zzgvyVar, zzb);
                            } else {
                                zzgveVar = zzgyhVar.zzp();
                            }
                        } else if (!zzgyhVar.zzO()) {
                            break;
                        }
                    }
                    if (zzgyhVar.zzd() != 12) {
                        throw zzgwy.zzb();
                    }
                    if (zzgveVar != null) {
                        if (obj2 != null) {
                            zzgvzVar.zzg(zzgveVar, obj2, zzgvyVar, zzb);
                        } else {
                            zzgzgVar.zzk(zzc, i, zzgveVar);
                        }
                    }
                }
            } finally {
                zzgzgVar.zzn(obj, zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzguq zzguqVar) throws IOException {
        zzgwm zzgwmVar = (zzgwm) obj;
        if (zzgwmVar.zzc == zzgzh.zzc()) {
            zzgwmVar.zzc = zzgzh.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final boolean zzj(Object obj, Object obj2) {
        zzgzg zzgzgVar = this.zzb;
        if (!zzgzgVar.zzd(obj).equals(zzgzgVar.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final void zzm(Object obj, zzgvu zzgvuVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
