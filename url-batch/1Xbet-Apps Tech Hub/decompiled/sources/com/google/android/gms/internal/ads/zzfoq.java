package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfoq extends zzgwm implements zzgxx {
    private static final zzgws zzb = new zzfon();
    private static final zzfoq zzd;
    private int zze;
    private zzgwr zzf = zzaJ();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzfoq zzfoqVar = new zzfoq();
        zzd = zzfoqVar;
        zzgwm.zzaU(zzfoq.class, zzfoqVar);
    }

    private zzfoq() {
    }

    public static zzfop zza() {
        return (zzfop) zzd.zzaA();
    }

    static /* synthetic */ void zzd(zzfoq zzfoqVar, String str) {
        str.getClass();
        zzfoqVar.zze |= 1;
        zzfoqVar.zzg = str;
    }

    static /* synthetic */ void zze(zzfoq zzfoqVar, int i) {
        zzgwr zzgwrVar = zzfoqVar.zzf;
        if (!zzgwrVar.zzc()) {
            zzfoqVar.zzf = zzgwm.zzaK(zzgwrVar);
        }
        zzfoqVar.zzf.zzh(2);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", zzfoo.zza, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzfoq();
        }
        zzfon zzfonVar = null;
        if (i2 == 4) {
            return new zzfop(zzfonVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
