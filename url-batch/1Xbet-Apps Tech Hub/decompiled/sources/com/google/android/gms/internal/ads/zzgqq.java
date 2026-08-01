package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgqq extends zzgwm implements zzgxx {
    private static final zzgqq zzb;
    private int zzd;
    private int zze;

    static {
        zzgqq zzgqqVar = new zzgqq();
        zzb = zzgqqVar;
        zzgwm.zzaU(zzgqq.class, zzgqqVar);
    }

    private zzgqq() {
    }

    public static zzgqp zzd() {
        return (zzgqp) zzb.zzaA();
    }

    public static zzgqq zzf(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgqq) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
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
            return zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        }
        if (i2 == 3) {
            return new zzgqq();
        }
        zzgqo zzgqoVar = null;
        if (i2 == 4) {
            return new zzgqp(zzgqoVar);
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
