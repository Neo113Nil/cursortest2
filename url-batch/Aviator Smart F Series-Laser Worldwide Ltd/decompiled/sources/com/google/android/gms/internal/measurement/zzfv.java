package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzfv extends zzlb implements zzmj {
    private static final zzfv zza;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        zzfv zzfvVar = new zzfv();
        zza = zzfvVar;
        zzlb.zzbO(zzfv.class, zzfvVar);
    }

    private zzfv() {
    }

    public static zzfu zza() {
        return (zzfu) zza.zzbA();
    }

    static /* synthetic */ void zzc(zzfv zzfvVar, String str) {
        str.getClass();
        zzfvVar.zzd |= 1;
        zzfvVar.zze = str;
    }

    static /* synthetic */ void zzd(zzfv zzfvVar, long j8) {
        zzfvVar.zzd |= 2;
        zzfvVar.zzf = j8;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzlb.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new zzfv();
        }
        zzfk zzfkVar = null;
        if (i9 == 4) {
            return new zzfu(zzfkVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}
