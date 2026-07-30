package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzgg extends zzlb implements zzmj {
    private static final zzgg zza;
    private int zzd;
    private int zze = 1;
    private zzli zzf = zzlb.zzbH();

    static {
        zzgg zzggVar = new zzgg();
        zza = zzggVar;
        zzlb.zzbO(zzgg.class, zzggVar);
    }

    private zzgg() {
    }

    public static zzge zza() {
        return (zzge) zza.zzbA();
    }

    static /* synthetic */ void zzc(zzgg zzggVar, zzfv zzfvVar) {
        zzfvVar.getClass();
        zzli zzliVar = zzggVar.zzf;
        if (!zzliVar.zzc()) {
            zzggVar.zzf = zzlb.zzbI(zzliVar);
        }
        zzggVar.zzf.add(zzfvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzlb.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", zzgf.zza, "zzf", zzfv.class});
        }
        if (i9 == 3) {
            return new zzgg();
        }
        zzfk zzfkVar = null;
        if (i9 == 4) {
            return new zzge(zzfkVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}
