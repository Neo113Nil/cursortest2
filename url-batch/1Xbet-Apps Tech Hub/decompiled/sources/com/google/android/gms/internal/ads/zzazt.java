package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzazt extends zzgwm implements zzgxx {
    private static final zzazt zzb;
    private int zzd;
    private String zze = "";
    private zzgwv zzf = zzaN();
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        zzazt zzaztVar = new zzazt();
        zzb = zzaztVar;
        zzgwm.zzaU(zzazt.class, zzaztVar);
    }

    private zzazt() {
    }

    public static zzazt zzc() {
        return zzb;
    }

    static /* synthetic */ void zzd(zzazt zzaztVar, String str) {
        str.getClass();
        zzaztVar.zzd |= 1;
        zzaztVar.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgwq zzgwqVar = zzbac.zza;
            return zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzd", "zze", "zzf", zzazp.class, "zzg", zzgwqVar, "zzh", zzgwqVar, "zzi", zzgwqVar});
        }
        if (i2 == 3) {
            return new zzazt();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzazs(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
