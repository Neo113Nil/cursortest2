package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgse extends zzgwm implements zzgxx {
    private static final zzgse zzb;
    private int zzd;
    private zzgwv zze = zzaN();

    static {
        zzgse zzgseVar = new zzgse();
        zzb = zzgseVar;
        zzgwm.zzaU(zzgse.class, zzgseVar);
    }

    private zzgse() {
    }

    public static zzgsb zza() {
        return (zzgsb) zzb.zzaA();
    }

    static /* synthetic */ void zze(zzgse zzgseVar, zzgsd zzgsdVar) {
        zzgsdVar.getClass();
        zzgwv zzgwvVar = zzgseVar.zze;
        if (!zzgwvVar.zzc()) {
            zzgseVar.zze = zzgwm.zzaO(zzgwvVar);
        }
        zzgseVar.zze.add(zzgsdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzgsd.class});
        }
        if (i2 == 3) {
            return new zzgse();
        }
        zzgsa zzgsaVar = null;
        if (i2 == 4) {
            return new zzgsb(zzgsaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
