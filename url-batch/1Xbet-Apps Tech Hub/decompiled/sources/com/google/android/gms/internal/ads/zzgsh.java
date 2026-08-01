package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgsh extends zzgwm implements zzgxx {
    private static final zzgsh zzb;
    private int zzd;
    private int zze;
    private zzgsk zzf;

    static {
        zzgsh zzgshVar = new zzgsh();
        zzb = zzgshVar;
        zzgwm.zzaU(zzgsh.class, zzgshVar);
    }

    private zzgsh() {
    }

    public static zzgsg zzc() {
        return (zzgsg) zzb.zzaA();
    }

    public static zzgsh zze(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgsh) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
    }

    static /* synthetic */ void zzh(zzgsh zzgshVar, zzgsk zzgskVar) {
        zzgskVar.getClass();
        zzgshVar.zzf = zzgskVar;
        zzgshVar.zzd |= 1;
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
            return new zzgsh();
        }
        zzgsf zzgsfVar = null;
        if (i2 == 4) {
            return new zzgsg(zzgsfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgsk zzf() {
        zzgsk zzgskVar = this.zzf;
        return zzgskVar == null ? zzgsk.zzd() : zzgskVar;
    }
}
