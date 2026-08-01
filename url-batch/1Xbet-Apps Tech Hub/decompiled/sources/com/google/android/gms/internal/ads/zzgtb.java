package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgtb extends zzgwm implements zzgxx {
    private static final zzgtb zzb;
    private int zzd;

    static {
        zzgtb zzgtbVar = new zzgtb();
        zzb = zzgtbVar;
        zzgwm.zzaU(zzgtb.class, zzgtbVar);
    }

    private zzgtb() {
    }

    public static zzgtb zzd() {
        return zzb;
    }

    public static zzgtb zze(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgtb) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
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
            return zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzgtb();
        }
        zzgsz zzgszVar = null;
        if (i2 == 4) {
            return new zzgta(zzgszVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
