package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgqb extends zzgwm implements zzgxx {
    private static final zzgqb zzb;
    private int zzd;
    private zzgqe zze;
    private int zzf;

    static {
        zzgqb zzgqbVar = new zzgqb();
        zzb = zzgqbVar;
        zzgwm.zzaU(zzgqb.class, zzgqbVar);
    }

    private zzgqb() {
    }

    public static zzgqa zzc() {
        return (zzgqa) zzb.zzaA();
    }

    public static zzgqb zze(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgqb) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
    }

    static /* synthetic */ void zzg(zzgqb zzgqbVar, zzgqe zzgqeVar) {
        zzgqeVar.getClass();
        zzgqbVar.zze = zzgqeVar;
        zzgqbVar.zzd |= 1;
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
            return new zzgqb();
        }
        zzgpz zzgpzVar = null;
        if (i2 == 4) {
            return new zzgqa(zzgpzVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgqe zzf() {
        zzgqe zzgqeVar = this.zze;
        return zzgqeVar == null ? zzgqe.zze() : zzgqeVar;
    }
}
