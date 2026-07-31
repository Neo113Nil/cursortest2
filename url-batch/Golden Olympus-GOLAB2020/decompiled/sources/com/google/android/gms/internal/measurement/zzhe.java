package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzhe extends zzmd implements zzni {
    private static final zzhe zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzhe zzheVar = new zzhe();
        zzb = zzheVar;
        zzmd.zzct(zzhe.class, zzheVar);
    }

    private zzhe() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final Object zzl(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i5 == 3) {
            return new zzhe();
        }
        zzip zzipVar = null;
        if (i5 == 4) {
            return new zzhd(zzipVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
