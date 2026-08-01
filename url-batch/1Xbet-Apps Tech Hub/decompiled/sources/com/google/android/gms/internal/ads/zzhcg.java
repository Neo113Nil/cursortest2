package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhcg extends zzgwm implements zzgxx {
    private static final zzhcg zzb;
    private int zzd;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzhcg zzhcgVar = new zzhcg();
        zzb = zzhcgVar;
        zzgwm.zzaU(zzhcg.class, zzhcgVar);
    }

    private zzhcg() {
    }

    public static zzhcf zza() {
        return (zzhcf) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzhcg zzhcgVar, String str) {
        zzhcgVar.zzd |= 1;
        zzhcgVar.zze = str;
    }

    static /* synthetic */ void zze(zzhcg zzhcgVar, long j) {
        zzhcgVar.zzd |= 2;
        zzhcgVar.zzf = j;
    }

    static /* synthetic */ void zzf(zzhcg zzhcgVar, boolean z) {
        zzhcgVar.zzd |= 4;
        zzhcgVar.zzg = z;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzhch.zza, "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzhcg();
        }
        zzhag zzhagVar = null;
        if (i2 == 4) {
            return new zzhcf(zzhagVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
