package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzavc extends zzgwm implements zzgxx {
    private static final zzavc zzb;
    private int zzd;
    private zzavf zze;
    private zzgve zzf = zzgve.zzb;
    private zzgve zzg = zzgve.zzb;

    static {
        zzavc zzavcVar = new zzavc();
        zzb = zzavcVar;
        zzgwm.zzaU(zzavc.class, zzavcVar);
    }

    private zzavc() {
    }

    public static zzavc zzc(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzavc) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzavc();
        }
        zzava zzavaVar = null;
        if (i2 == 4) {
            return new zzavb(zzavaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzavf zzd() {
        zzavf zzavfVar = this.zze;
        return zzavfVar == null ? zzavf.zzg() : zzavfVar;
    }

    public final zzgve zze() {
        return this.zzg;
    }

    public final zzgve zzf() {
        return this.zzf;
    }
}
