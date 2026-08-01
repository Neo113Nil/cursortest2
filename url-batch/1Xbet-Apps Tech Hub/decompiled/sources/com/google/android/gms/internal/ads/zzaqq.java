package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaqq extends zzgwm implements zzgxx {
    private static final zzaqq zzb;
    private int zzd;
    private zzgwv zze = zzaN();
    private zzgve zzf = zzgve.zzb;
    private int zzg = 1;
    private int zzh = 1;

    static {
        zzaqq zzaqqVar = new zzaqq();
        zzb = zzaqqVar;
        zzgwm.zzaU(zzaqq.class, zzaqqVar);
    }

    private zzaqq() {
    }

    public static zzaqp zza() {
        return (zzaqp) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzaqq zzaqqVar, zzgve zzgveVar) {
        zzgwv zzgwvVar = zzaqqVar.zze;
        if (!zzgwvVar.zzc()) {
            zzaqqVar.zze = zzgwm.zzaO(zzgwvVar);
        }
        zzaqqVar.zze.add(zzgveVar);
    }

    static /* synthetic */ void zze(zzaqq zzaqqVar, zzgve zzgveVar) {
        zzaqqVar.zzd |= 1;
        zzaqqVar.zzf = zzgveVar;
    }

    static /* synthetic */ void zzf(zzaqq zzaqqVar, int i) {
        zzaqqVar.zzh = 4;
        zzaqqVar.zzd = 4 | zzaqqVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzaqk.zza, "zzh", zzaqi.zza});
        }
        if (i2 == 3) {
            return new zzaqq();
        }
        zzapf zzapfVar = null;
        if (i2 == 4) {
            return new zzaqp(zzapfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
