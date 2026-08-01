package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgsn extends zzgwm implements zzgxx {
    private static final zzgsn zzb;
    private int zzd;
    private int zze;
    private zzgsq zzf;

    static {
        zzgsn zzgsnVar = new zzgsn();
        zzb = zzgsnVar;
        zzgwm.zzaU(zzgsn.class, zzgsnVar);
    }

    private zzgsn() {
    }

    public static zzgsm zzc() {
        return (zzgsm) zzb.zzaA();
    }

    public static zzgsn zze(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgsn) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
    }

    static /* synthetic */ void zzh(zzgsn zzgsnVar, zzgsq zzgsqVar) {
        zzgsqVar.getClass();
        zzgsnVar.zzf = zzgsqVar;
        zzgsnVar.zzd |= 1;
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
            return zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgsn();
        }
        zzgsl zzgslVar = null;
        if (i2 == 4) {
            return new zzgsm(zzgslVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgsq zzf() {
        zzgsq zzgsqVar = this.zzf;
        return zzgsqVar == null ? zzgsq.zze() : zzgsqVar;
    }
}
