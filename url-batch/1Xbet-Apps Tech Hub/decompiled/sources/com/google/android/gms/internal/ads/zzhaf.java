package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhaf extends zzgwm implements zzgxx {
    private static final zzhaf zzb;
    private zzgwv zzd = zzaN();

    static {
        zzhaf zzhafVar = new zzhaf();
        zzb = zzhafVar;
        zzgwm.zzaU(zzhaf.class, zzhafVar);
    }

    private zzhaf() {
    }

    public static zzhae zza() {
        return (zzhae) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzhaf zzhafVar, zzhad zzhadVar) {
        zzhadVar.getClass();
        zzgwv zzgwvVar = zzhafVar.zzd;
        if (!zzgwvVar.zzc()) {
            zzhafVar.zzd = zzgwm.zzaO(zzgwvVar);
        }
        zzhafVar.zzd.add(zzhadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzhad.class});
        }
        if (i2 == 3) {
            return new zzhaf();
        }
        zzhab zzhabVar = null;
        if (i2 == 4) {
            return new zzhae(zzhabVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
