package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzfh extends zzlb implements zzmj {
    private static final zzfh zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzfh zzfhVar = new zzfh();
        zza = zzfhVar;
        zzlb.zzbO(zzfh.class, zzfhVar);
    }

    private zzfh() {
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzlb.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new zzfh();
        }
        zzez zzezVar = null;
        if (i9 == 4) {
            return new zzfg(zzezVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}
