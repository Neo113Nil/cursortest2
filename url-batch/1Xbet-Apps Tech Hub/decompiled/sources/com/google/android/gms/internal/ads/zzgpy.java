package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgpy extends zzgwm implements zzgxx {
    private static final zzgpy zzb;
    private int zzd;
    private int zze;
    private zzgqe zzf;
    private zzgve zzg = zzgve.zzb;

    static {
        zzgpy zzgpyVar = new zzgpy();
        zzb = zzgpyVar;
        zzgwm.zzaU(zzgpy.class, zzgpyVar);
    }

    private zzgpy() {
    }

    public static zzgpx zzc() {
        return (zzgpx) zzb.zzaA();
    }

    public static zzgpy zze(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgpy) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
    }

    static /* synthetic */ void zzi(zzgpy zzgpyVar, zzgqe zzgqeVar) {
        zzgqeVar.getClass();
        zzgpyVar.zzf = zzgqeVar;
        zzgpyVar.zzd |= 1;
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
            return new zzgpy();
        }
        zzgpw zzgpwVar = null;
        if (i2 == 4) {
            return new zzgpx(zzgpwVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgqe zzf() {
        zzgqe zzgqeVar = this.zzf;
        return zzgqeVar == null ? zzgqe.zze() : zzgqeVar;
    }

    public final zzgve zzg() {
        return this.zzg;
    }
}
