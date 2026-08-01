package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgrb extends zzgwm implements zzgxx {
    private static final zzgrb zzb;
    private int zzd;
    private int zze;
    private zzgrh zzf;
    private zzgve zzg = zzgve.zzb;

    static {
        zzgrb zzgrbVar = new zzgrb();
        zzb = zzgrbVar;
        zzgwm.zzaU(zzgrb.class, zzgrbVar);
    }

    private zzgrb() {
    }

    public static zzgra zzc() {
        return (zzgra) zzb.zzaA();
    }

    public static zzgrb zze() {
        return zzb;
    }

    public static zzgrb zzf(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgrb) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
    }

    static /* synthetic */ void zzj(zzgrb zzgrbVar, zzgrh zzgrhVar) {
        zzgrhVar.getClass();
        zzgrbVar.zzf = zzgrhVar;
        zzgrbVar.zzd |= 1;
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
            return zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgrb();
        }
        zzgqz zzgqzVar = null;
        if (i2 == 4) {
            return new zzgra(zzgqzVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgrh zzg() {
        zzgrh zzgrhVar = this.zzf;
        return zzgrhVar == null ? zzgrh.zzf() : zzgrhVar;
    }

    public final zzgve zzh() {
        return this.zzg;
    }
}
