package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgpj extends zzgwm implements zzgxx {
    private static final zzgpj zzb;
    private int zzd;
    private int zze;
    private zzgpp zzf;
    private zzgrb zzg;

    static {
        zzgpj zzgpjVar = new zzgpj();
        zzb = zzgpjVar;
        zzgwm.zzaU(zzgpj.class, zzgpjVar);
    }

    private zzgpj() {
    }

    public static zzgpi zzc() {
        return (zzgpi) zzb.zzaA();
    }

    public static zzgpj zze(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgpj) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
    }

    static /* synthetic */ void zzi(zzgpj zzgpjVar, zzgpp zzgppVar) {
        zzgppVar.getClass();
        zzgpjVar.zzf = zzgppVar;
        zzgpjVar.zzd |= 1;
    }

    static /* synthetic */ void zzj(zzgpj zzgpjVar, zzgrb zzgrbVar) {
        zzgrbVar.getClass();
        zzgpjVar.zzg = zzgrbVar;
        zzgpjVar.zzd |= 2;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgpj();
        }
        zzgph zzgphVar = null;
        if (i2 == 4) {
            return new zzgpi(zzgphVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgpp zzf() {
        zzgpp zzgppVar = this.zzf;
        return zzgppVar == null ? zzgpp.zze() : zzgppVar;
    }

    public final zzgrb zzg() {
        zzgrb zzgrbVar = this.zzg;
        return zzgrbVar == null ? zzgrb.zze() : zzgrbVar;
    }
}
