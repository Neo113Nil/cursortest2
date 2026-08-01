package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgsy extends zzgwm implements zzgxx {
    private static final zzgsy zzb;
    private int zzd;
    private zzgve zze = zzgve.zzb;

    static {
        zzgsy zzgsyVar = new zzgsy();
        zzb = zzgsyVar;
        zzgwm.zzaU(zzgsy.class, zzgsyVar);
    }

    private zzgsy() {
    }

    public static zzgsx zzc() {
        return (zzgsx) zzb.zzaA();
    }

    public static zzgsy zze(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgsy) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzgsy();
        }
        zzgsw zzgswVar = null;
        if (i2 == 4) {
            return new zzgsx(zzgswVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgve zzf() {
        return this.zze;
    }
}
