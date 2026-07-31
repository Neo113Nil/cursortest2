package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzhq {
    final String zza;
    final /* synthetic */ zzht zzb;
    private final String zzc;
    private final String zzd;
    private final long zze;

    /* synthetic */ zzhq(zzht zzhtVar, String str, long j4, zzhs zzhsVar) {
        this.zzb = zzhtVar;
        Preconditions.checkNotEmpty("health_monitor");
        Preconditions.checkArgument(j4 > 0);
        this.zza = "health_monitor:start";
        this.zzc = "health_monitor:count";
        this.zzd = "health_monitor:value";
        this.zze = j4;
    }

    private final long zzc() {
        return this.zzb.zzb().getLong(this.zza, 0L);
    }

    private final void zzd() {
        zzht zzhtVar = this.zzb;
        zzhtVar.zzg();
        long currentTimeMillis = zzhtVar.zzu.zzaU().currentTimeMillis();
        SharedPreferences.Editor edit = zzhtVar.zzb().edit();
        edit.remove(this.zzc);
        edit.remove(this.zzd);
        edit.putLong(this.zza, currentTimeMillis);
        edit.apply();
    }

    public final Pair zza() {
        long abs;
        zzht zzhtVar = this.zzb;
        zzhtVar.zzg();
        zzhtVar.zzg();
        long zzc = zzc();
        if (zzc == 0) {
            zzd();
            abs = 0;
        } else {
            abs = Math.abs(zzc - zzhtVar.zzu.zzaU().currentTimeMillis());
        }
        long j4 = this.zze;
        if (abs < j4) {
            return null;
        }
        if (abs > j4 + j4) {
            zzd();
            return null;
        }
        String string = zzhtVar.zzb().getString(this.zzd, null);
        long j5 = zzhtVar.zzb().getLong(this.zzc, 0L);
        zzd();
        return (string == null || j5 <= 0) ? zzht.zza : new Pair(string, Long.valueOf(j5));
    }

    public final void zzb(String str, long j4) {
        zzht zzhtVar = this.zzb;
        zzhtVar.zzg();
        if (zzc() == 0) {
            zzd();
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences zzb = zzhtVar.zzb();
        String str2 = this.zzc;
        long j5 = zzb.getLong(str2, 0L);
        if (j5 <= 0) {
            SharedPreferences.Editor edit = zzhtVar.zzb().edit();
            edit.putString(this.zzd, str);
            edit.putLong(str2, 1L);
            edit.apply();
            return;
        }
        long nextLong = zzhtVar.zzu.zzw().zzJ().nextLong() & Long.MAX_VALUE;
        long j6 = j5 + 1;
        long j7 = Long.MAX_VALUE / j6;
        SharedPreferences.Editor edit2 = zzhtVar.zzb().edit();
        if (nextLong < j7) {
            edit2.putString(this.zzd, str);
        }
        edit2.putLong(str2, j6);
        edit2.apply();
    }
}
