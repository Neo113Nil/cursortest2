package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzhk extends zzmd implements zzni {
    private static final zzhk zzb;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        zzhk zzhkVar = new zzhk();
        zzb = zzhkVar;
        zzmd.zzct(zzhk.class, zzhkVar);
    }

    private zzhk() {
    }

    public static zzhj zzc() {
        return (zzhj) zzb.zzcg();
    }

    static /* synthetic */ void zze(zzhk zzhkVar, long j4) {
        zzhkVar.zzd |= 2;
        zzhkVar.zzf = j4;
    }

    static /* synthetic */ void zzf(zzhk zzhkVar, int i4) {
        zzhkVar.zzd |= 1;
        zzhkVar.zze = i4;
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

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final Object zzl(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i5 == 3) {
            return new zzhk();
        }
        zzip zzipVar = null;
        if (i5 == 4) {
            return new zzhj(zzipVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
