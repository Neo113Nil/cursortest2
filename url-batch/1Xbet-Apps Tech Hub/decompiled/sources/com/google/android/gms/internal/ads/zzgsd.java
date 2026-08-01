package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgsd extends zzgwm implements zzgxx {
    private static final zzgsd zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgsd zzgsdVar = new zzgsd();
        zzb = zzgsdVar;
        zzgwm.zzaU(zzgsd.class, zzgsdVar);
    }

    private zzgsd() {
    }

    public static zzgsc zza() {
        return (zzgsc) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgsd zzgsdVar, String str) {
        str.getClass();
        zzgsdVar.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgsd();
        }
        zzgsa zzgsaVar = null;
        if (i2 == 4) {
            return new zzgsc(zzgsaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
