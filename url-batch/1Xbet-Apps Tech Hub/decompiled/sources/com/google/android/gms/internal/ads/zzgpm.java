package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgpm extends zzgwm implements zzgxx {
    private static final zzgpm zzb;
    private int zzd;
    private zzgps zze;
    private zzgre zzf;

    static {
        zzgpm zzgpmVar = new zzgpm();
        zzb = zzgpmVar;
        zzgwm.zzaU(zzgpm.class, zzgpmVar);
    }

    private zzgpm() {
    }

    public static zzgpl zza() {
        return (zzgpl) zzb.zzaA();
    }

    public static zzgpm zzd(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgpm) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
    }

    static /* synthetic */ void zzg(zzgpm zzgpmVar, zzgps zzgpsVar) {
        zzgpsVar.getClass();
        zzgpmVar.zze = zzgpsVar;
        zzgpmVar.zzd |= 1;
    }

    static /* synthetic */ void zzh(zzgpm zzgpmVar, zzgre zzgreVar) {
        zzgreVar.getClass();
        zzgpmVar.zzf = zzgreVar;
        zzgpmVar.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgpm();
        }
        zzgpk zzgpkVar = null;
        if (i2 == 4) {
            return new zzgpl(zzgpkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgps zze() {
        zzgps zzgpsVar = this.zze;
        return zzgpsVar == null ? zzgps.zze() : zzgpsVar;
    }

    public final zzgre zzf() {
        zzgre zzgreVar = this.zzf;
        return zzgreVar == null ? zzgre.zzf() : zzgreVar;
    }
}
