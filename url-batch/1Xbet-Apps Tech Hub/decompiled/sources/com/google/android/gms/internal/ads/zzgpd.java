package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgpd extends zzgwm implements zzgxx {
    private static final zzgpd zzb;
    private int zzd;
    private int zze;
    private zzgpg zzf;

    static {
        zzgpd zzgpdVar = new zzgpd();
        zzb = zzgpdVar;
        zzgwm.zzaU(zzgpd.class, zzgpdVar);
    }

    private zzgpd() {
    }

    public static zzgpc zzc() {
        return (zzgpc) zzb.zzaA();
    }

    public static zzgpd zze(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgpd) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
    }

    static /* synthetic */ void zzh(zzgpd zzgpdVar, zzgpg zzgpgVar) {
        zzgpgVar.getClass();
        zzgpdVar.zzf = zzgpgVar;
        zzgpdVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgpd();
        }
        zzgpb zzgpbVar = null;
        if (i2 == 4) {
            return new zzgpc(zzgpbVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgpg zzf() {
        zzgpg zzgpgVar = this.zzf;
        return zzgpgVar == null ? zzgpg.zze() : zzgpgVar;
    }
}
