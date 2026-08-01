package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgrm extends zzgwm implements zzgxx {
    private static final zzgrm zzb;
    private String zzd = "";
    private zzgve zze = zzgve.zzb;
    private int zzf;

    static {
        zzgrm zzgrmVar = new zzgrm();
        zzb = zzgrmVar;
        zzgwm.zzaU(zzgrm.class, zzgrmVar);
    }

    private zzgrm() {
    }

    public static zzgrj zza() {
        return (zzgrj) zzb.zzaA();
    }

    public static zzgrm zze() {
        return zzb;
    }

    static /* synthetic */ void zzh(zzgrm zzgrmVar, String str) {
        str.getClass();
        zzgrmVar.zzd = str;
    }

    static /* synthetic */ void zzi(zzgrm zzgrmVar, zzgve zzgveVar) {
        zzgveVar.getClass();
        zzgrmVar.zze = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgrm();
        }
        zzgri zzgriVar = null;
        if (i2 == 4) {
            return new zzgrj(zzgriVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgrl zzc() {
        int i = this.zzf;
        zzgrl zzgrlVar = zzgrl.UNKNOWN_KEYMATERIAL;
        zzgrl zzgrlVar2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : zzgrl.REMOTE : zzgrl.ASYMMETRIC_PUBLIC : zzgrl.ASYMMETRIC_PRIVATE : zzgrl.SYMMETRIC : zzgrl.UNKNOWN_KEYMATERIAL;
        return zzgrlVar2 == null ? zzgrl.UNRECOGNIZED : zzgrlVar2;
    }

    public final zzgve zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzd;
    }
}
