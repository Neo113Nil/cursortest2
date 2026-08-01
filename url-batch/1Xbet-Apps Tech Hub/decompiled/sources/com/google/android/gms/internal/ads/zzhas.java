package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhas extends zzgwm implements zzgxx {
    private static final zzhas zzb;
    private int zzd;
    private String zze = "";

    static {
        zzhas zzhasVar = new zzhas();
        zzb = zzhasVar;
        zzgwm.zzaU(zzhas.class, zzhasVar);
    }

    private zzhas() {
    }

    public static zzhar zza() {
        return (zzhar) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzhas zzhasVar, String str) {
        zzhasVar.zzd |= 1;
        zzhasVar.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzhas();
        }
        zzhag zzhagVar = null;
        if (i2 == 4) {
            return new zzhar(zzhagVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
