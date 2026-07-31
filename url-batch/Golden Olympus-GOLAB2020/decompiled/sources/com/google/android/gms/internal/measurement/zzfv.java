package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class zzfv extends zzmd implements zzni {
    private static final zzfv zzb;
    private int zzd;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private zzmj zzh = zzmd.zzcn();

    static {
        zzfv zzfvVar = new zzfv();
        zzb = zzfvVar;
        zzmd.zzct(zzfv.class, zzfvVar);
    }

    private zzfv() {
    }

    public static zzfv zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zzh.size();
    }

    public final String zzd() {
        return this.zzf;
    }

    public final List zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    public final int zzj() {
        int zza = zzfu.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final Object zzl(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", zzft.zza, "zzf", "zzg", "zzh"});
        }
        if (i5 == 3) {
            return new zzfv();
        }
        zzfw zzfwVar = null;
        if (i5 == 4) {
            return new zzfs(zzfwVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
