package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgpp extends zzgwm implements zzgxx {
    private static final zzgpp zzb;
    private int zzd;
    private int zze;
    private zzgpv zzf;
    private zzgve zzg = zzgve.zzb;

    static {
        zzgpp zzgppVar = new zzgpp();
        zzb = zzgppVar;
        zzgwm.zzaU(zzgpp.class, zzgppVar);
    }

    private zzgpp() {
    }

    public static zzgpo zzc() {
        return (zzgpo) zzb.zzaA();
    }

    public static zzgpp zze() {
        return zzb;
    }

    public static zzgpp zzf(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgpp) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
    }

    static /* synthetic */ void zzj(zzgpp zzgppVar, zzgpv zzgpvVar) {
        zzgpvVar.getClass();
        zzgppVar.zzf = zzgpvVar;
        zzgppVar.zzd |= 1;
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
            return new zzgpp();
        }
        zzgpn zzgpnVar = null;
        if (i2 == 4) {
            return new zzgpo(zzgpnVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgpv zzg() {
        zzgpv zzgpvVar = this.zzf;
        return zzgpvVar == null ? zzgpv.zze() : zzgpvVar;
    }

    public final zzgve zzh() {
        return this.zzg;
    }
}
