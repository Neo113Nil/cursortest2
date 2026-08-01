package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgpa extends zzgwm implements zzgxx {
    private static final zzgpa zzb;
    private int zzd;
    private int zze;
    private zzgve zzf = zzgve.zzb;
    private zzgpg zzg;

    static {
        zzgpa zzgpaVar = new zzgpa();
        zzb = zzgpaVar;
        zzgwm.zzaU(zzgpa.class, zzgpaVar);
    }

    private zzgpa() {
    }

    public static zzgoz zzc() {
        return (zzgoz) zzb.zzaA();
    }

    public static zzgpa zze(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgpa) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
    }

    static /* synthetic */ void zzj(zzgpa zzgpaVar, zzgpg zzgpgVar) {
        zzgpgVar.getClass();
        zzgpaVar.zzg = zzgpgVar;
        zzgpaVar.zzd |= 1;
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
            return zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgpa();
        }
        zzgoy zzgoyVar = null;
        if (i2 == 4) {
            return new zzgoz(zzgoyVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgpg zzf() {
        zzgpg zzgpgVar = this.zzg;
        return zzgpgVar == null ? zzgpg.zze() : zzgpgVar;
    }

    public final zzgve zzg() {
        return this.zzf;
    }
}
