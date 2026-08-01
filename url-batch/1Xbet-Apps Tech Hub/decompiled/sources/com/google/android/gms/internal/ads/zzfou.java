package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfou extends zzgwm implements zzgxx {
    private static final zzfou zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzfoq zzh;

    static {
        zzfou zzfouVar = new zzfou();
        zzb = zzfouVar;
        zzgwm.zzaU(zzfou.class, zzfouVar);
    }

    private zzfou() {
    }

    public static zzfos zza() {
        return (zzfos) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzfou zzfouVar, String str) {
        str.getClass();
        zzfouVar.zzd |= 2;
        zzfouVar.zzf = str;
    }

    static /* synthetic */ void zze(zzfou zzfouVar, zzfoq zzfoqVar) {
        zzfoqVar.getClass();
        zzfouVar.zzh = zzfoqVar;
        zzfouVar.zzd |= 8;
    }

    static /* synthetic */ void zzf(zzfou zzfouVar, int i) {
        zzfouVar.zze = 1;
        zzfouVar.zzd = 1 | zzfouVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", zzfot.zza, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzfou();
        }
        zzfor zzforVar = null;
        if (i2 == 4) {
            return new zzfos(zzforVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
