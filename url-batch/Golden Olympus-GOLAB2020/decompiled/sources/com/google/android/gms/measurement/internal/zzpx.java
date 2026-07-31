package com.google.android.gms.measurement.internal;

import java.util.Map;

/* loaded from: classes.dex */
final class zzpx {
    private long zza;
    private com.google.android.gms.internal.measurement.zzhv zzb;
    private String zzc;
    private Map zzd;
    private zzmf zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private int zzi;

    zzpx() {
    }

    public final zzpx zza(long j4) {
        this.zzg = j4;
        return this;
    }

    public final zzpx zzb(long j4) {
        this.zzf = j4;
        return this;
    }

    public final zzpx zzc(long j4) {
        this.zzh = j4;
        return this;
    }

    public final zzpx zzd(com.google.android.gms.internal.measurement.zzhv zzhvVar) {
        this.zzb = zzhvVar;
        return this;
    }

    public final zzpx zze(int i4) {
        this.zzi = i4;
        return this;
    }

    public final zzpx zzf(long j4) {
        this.zza = j4;
        return this;
    }

    public final zzpx zzg(Map map) {
        this.zzd = map;
        return this;
    }

    public final zzpx zzh(zzmf zzmfVar) {
        this.zze = zzmfVar;
        return this;
    }

    public final zzpx zzi(String str) {
        this.zzc = str;
        return this;
    }

    public final zzpz zzj() {
        return new zzpz(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, null);
    }
}
