package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgqk extends zzgwm implements zzgxx {
    private static final zzgqk zzb;
    private int zzd;
    private int zze;

    static {
        zzgqk zzgqkVar = new zzgqk();
        zzb = zzgqkVar;
        zzgwm.zzaU(zzgqk.class, zzgqkVar);
    }

    private zzgqk() {
    }

    public static zzgqj zzd() {
        return (zzgqj) zzb.zzaA();
    }

    public static zzgqk zzf(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgqk) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
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
            return zzaR(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzgqk();
        }
        zzgqi zzgqiVar = null;
        if (i2 == 4) {
            return new zzgqj(zzgqiVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzc() {
        return this.zze;
    }
}
