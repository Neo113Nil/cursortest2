package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgsq extends zzgwm implements zzgxx {
    private static final zzgsq zzb;
    private int zzd;
    private String zze = "";
    private zzgrr zzf;

    static {
        zzgsq zzgsqVar = new zzgsq();
        zzb = zzgsqVar;
        zzgwm.zzaU(zzgsq.class, zzgsqVar);
    }

    private zzgsq() {
    }

    public static zzgsp zzc() {
        return (zzgsp) zzb.zzaA();
    }

    public static zzgsq zze() {
        return zzb;
    }

    public static zzgsq zzf(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzgsq) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
    }

    static /* synthetic */ void zzh(zzgsq zzgsqVar, String str) {
        str.getClass();
        zzgsqVar.zze = str;
    }

    static /* synthetic */ void zzi(zzgsq zzgsqVar, zzgrr zzgrrVar) {
        zzgrrVar.getClass();
        zzgsqVar.zzf = zzgrrVar;
        zzgsqVar.zzd |= 1;
    }

    public final zzgrr zza() {
        zzgrr zzgrrVar = this.zzf;
        return zzgrrVar == null ? zzgrr.zzd() : zzgrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgsq();
        }
        zzgso zzgsoVar = null;
        if (i2 == 4) {
            return new zzgsp(zzgsoVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzg() {
        return this.zze;
    }

    public final boolean zzj() {
        return (this.zzd & 1) != 0;
    }
}
