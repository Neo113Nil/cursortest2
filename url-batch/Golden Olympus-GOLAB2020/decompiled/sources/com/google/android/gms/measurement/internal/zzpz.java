package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzpz {
    private final long zza;
    private final com.google.android.gms.internal.measurement.zzhv zzb;
    private final String zzc;
    private final Map zzd;
    private final zzmf zze;
    private final long zzf;
    private final long zzg;
    private final int zzh;

    /* synthetic */ zzpz(long j4, com.google.android.gms.internal.measurement.zzhv zzhvVar, String str, Map map, zzmf zzmfVar, long j5, long j6, long j7, int i4, zzpy zzpyVar) {
        this.zza = j4;
        this.zzb = zzhvVar;
        this.zzc = str;
        this.zzd = map;
        this.zze = zzmfVar;
        this.zzf = j6;
        this.zzg = j7;
        this.zzh = i4;
    }

    public final int zza() {
        return this.zzh;
    }

    public final long zzb() {
        return this.zzg;
    }

    public final long zzc() {
        return this.zza;
    }

    public final zzmf zzd() {
        return this.zze;
    }

    public final zzpa zze() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.zzd.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j4 = this.zza;
        com.google.android.gms.internal.measurement.zzhv zzhvVar = this.zzb;
        String str = this.zzc;
        zzmf zzmfVar = this.zze;
        return new zzpa(j4, zzhvVar.zzcd(), str, bundle, zzmfVar.zza(), this.zzf, "");
    }

    public final zzph zzf() {
        return new zzph(this.zzc, this.zzd, this.zze, null);
    }

    public final com.google.android.gms.internal.measurement.zzhv zzg() {
        return this.zzb;
    }

    public final String zzh() {
        return this.zzc;
    }
}
