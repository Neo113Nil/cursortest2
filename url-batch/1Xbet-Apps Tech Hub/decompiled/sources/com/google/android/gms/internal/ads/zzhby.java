package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhby extends zzgwm implements zzgxx {
    private static final zzhby zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzgve zzg = zzgve.zzb;
    private zzgve zzh = zzgve.zzb;

    static {
        zzhby zzhbyVar = new zzhby();
        zzb = zzhbyVar;
        zzgwm.zzaU(zzhby.class, zzhbyVar);
    }

    private zzhby() {
    }

    public static zzhbw zza() {
        return (zzhbw) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzhby zzhbyVar, String str) {
        zzhbyVar.zzd |= 2;
        zzhbyVar.zzf = "image/png";
    }

    static /* synthetic */ void zze(zzhby zzhbyVar, zzgve zzgveVar) {
        zzgveVar.getClass();
        zzhbyVar.zzd |= 4;
        zzhbyVar.zzg = zzgveVar;
    }

    static /* synthetic */ void zzf(zzhby zzhbyVar, int i) {
        zzhbyVar.zze = 1;
        zzhbyVar.zzd = 1 | zzhbyVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", zzhbx.zza, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzhby();
        }
        zzhag zzhagVar = null;
        if (i2 == 4) {
            return new zzhbw(zzhagVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
