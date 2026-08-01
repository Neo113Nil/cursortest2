package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgqn extends zzgwm implements zzgxx {
    private static final zzgqn zzb;
    private int zzd;
    private zzgve zze = zzgve.zzb;

    static {
        zzgqn zzgqnVar = new zzgqn();
        zzb = zzgqnVar;
        zzgwm.zzaU(zzgqn.class, zzgqnVar);
    }

    private zzgqn() {
    }

    public static zzgqm zzc() {
        return (zzgqm) zzb.zzaA();
    }

    public static zzgqn zze(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgqn) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
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
            return new zzgqn();
        }
        zzgql zzgqlVar = null;
        if (i2 == 4) {
            return new zzgqm(zzgqlVar);
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
