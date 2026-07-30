package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzfr extends zzlb implements zzmj {
    private static final zzfr zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        zzfr zzfrVar = new zzfr();
        zza = zzfrVar;
        zzlb.zzbO(zzfr.class, zzfrVar);
    }

    private zzfr() {
    }

    public static zzfq zzc() {
        return (zzfq) zza.zzbA();
    }

    static /* synthetic */ void zze(zzfr zzfrVar, int i8) {
        zzfrVar.zzd |= 1;
        zzfrVar.zze = i8;
    }

    static /* synthetic */ void zzf(zzfr zzfrVar, long j8) {
        zzfrVar.zzd |= 2;
        zzfrVar.zzf = j8;
    }

    public final int zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final boolean zzg() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzlb.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new zzfr();
        }
        zzfk zzfkVar = null;
        if (i9 == 4) {
            return new zzfq(zzfkVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }
}
