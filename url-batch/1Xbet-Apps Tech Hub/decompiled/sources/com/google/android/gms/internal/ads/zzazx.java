package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzazx extends zzgwm implements zzgxx {
    private static final zzazx zzb;
    private int zzd;
    private zzbbn zzf;
    private int zzg;
    private zzbbp zzh;
    private int zzi;
    private String zze = "";
    private int zzj = 1000;
    private int zzk = 1000;
    private int zzl = 1000;

    static {
        zzazx zzazxVar = new zzazx();
        zzb = zzazxVar;
        zzgwm.zzaU(zzazx.class, zzazxVar);
    }

    private zzazx() {
    }

    public static zzazx zzc() {
        return zzb;
    }

    static /* synthetic */ void zzd(zzazx zzazxVar, String str) {
        zzazxVar.zzd |= 1;
        zzazxVar.zze = str;
    }

    static /* synthetic */ void zze(zzazx zzazxVar, zzbbp zzbbpVar) {
        zzbbpVar.getClass();
        zzazxVar.zzh = zzbbpVar;
        zzazxVar.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgwq zzgwqVar = zzbac.zza;
            return zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgwqVar, "zzk", zzgwqVar, "zzl", zzgwqVar});
        }
        if (i2 == 3) {
            return new zzazx();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzazw(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
