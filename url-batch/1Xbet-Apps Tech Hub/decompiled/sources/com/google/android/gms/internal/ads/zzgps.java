package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgps extends zzgwm implements zzgxx {
    private static final zzgps zzb;
    private int zzd;
    private zzgpv zze;
    private int zzf;

    static {
        zzgps zzgpsVar = new zzgps();
        zzb = zzgpsVar;
        zzgwm.zzaU(zzgps.class, zzgpsVar);
    }

    private zzgps() {
    }

    public static zzgpr zzc() {
        return (zzgpr) zzb.zzaA();
    }

    public static zzgps zze() {
        return zzb;
    }

    public static zzgps zzf(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgps) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
    }

    static /* synthetic */ void zzh(zzgps zzgpsVar, zzgpv zzgpvVar) {
        zzgpvVar.getClass();
        zzgpsVar.zze = zzgpvVar;
        zzgpsVar.zzd |= 1;
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
            return zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgps();
        }
        zzgpq zzgpqVar = null;
        if (i2 == 4) {
            return new zzgpr(zzgpqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgpv zzg() {
        zzgpv zzgpvVar = this.zze;
        return zzgpvVar == null ? zzgpv.zze() : zzgpvVar;
    }
}
