package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhcn extends zzgwm implements zzgxx {
    private static final zzhcn zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzhcn zzhcnVar = new zzhcn();
        zzb = zzhcnVar;
        zzgwm.zzaU(zzhcn.class, zzhcnVar);
    }

    private zzhcn() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzhcn();
        }
        zzhag zzhagVar = null;
        if (i2 == 4) {
            return new zzhcm(zzhagVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
