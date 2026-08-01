package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgre extends zzgwm implements zzgxx {
    private static final zzgre zzb;
    private int zzd;
    private zzgrh zze;
    private int zzf;
    private int zzg;

    static {
        zzgre zzgreVar = new zzgre();
        zzb = zzgreVar;
        zzgwm.zzaU(zzgre.class, zzgreVar);
    }

    private zzgre() {
    }

    public static zzgrd zzd() {
        return (zzgrd) zzb.zzaA();
    }

    public static zzgre zzf() {
        return zzb;
    }

    public static zzgre zzg(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgre) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
    }

    static /* synthetic */ void zzi(zzgre zzgreVar, zzgrh zzgrhVar) {
        zzgrhVar.getClass();
        zzgreVar.zze = zzgrhVar;
        zzgreVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgre();
        }
        zzgrc zzgrcVar = null;
        if (i2 == 4) {
            return new zzgrd(zzgrcVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzc() {
        return this.zzg;
    }

    public final zzgrh zzh() {
        zzgrh zzgrhVar = this.zze;
        return zzgrhVar == null ? zzgrh.zzf() : zzgrhVar;
    }
}
