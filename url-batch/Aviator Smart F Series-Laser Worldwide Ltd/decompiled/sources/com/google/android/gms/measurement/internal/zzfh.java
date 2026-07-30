package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzfh {
    final String zza;
    final /* synthetic */ zzfj zzb;
    private final String zzc;
    private final String zzd;
    private final long zze;

    /* synthetic */ zzfh(zzfj zzfjVar, String str, long j8, zzfg zzfgVar) {
        this.zzb = zzfjVar;
        Preconditions.checkNotEmpty("health_monitor");
        Preconditions.checkArgument(j8 > 0);
        this.zza = "health_monitor:start";
        this.zzc = "health_monitor:count";
        this.zzd = "health_monitor:value";
        this.zze = j8;
    }

    @WorkerThread
    private final long zzc() {
        return this.zzb.zza().getLong(this.zza, 0L);
    }

    @WorkerThread
    private final void zzd() {
        this.zzb.zzg();
        long currentTimeMillis = this.zzb.zzt.zzax().currentTimeMillis();
        SharedPreferences.Editor edit = this.zzb.zza().edit();
        edit.remove(this.zzc);
        edit.remove(this.zzd);
        edit.putLong(this.zza, currentTimeMillis);
        edit.apply();
    }

    @WorkerThread
    public final Pair zza() {
        long abs;
        this.zzb.zzg();
        this.zzb.zzg();
        long zzc = zzc();
        if (zzc == 0) {
            zzd();
            abs = 0;
        } else {
            abs = Math.abs(zzc - this.zzb.zzt.zzax().currentTimeMillis());
        }
        long j8 = this.zze;
        if (abs < j8) {
            return null;
        }
        if (abs > j8 + j8) {
            zzd();
            return null;
        }
        String string = this.zzb.zza().getString(this.zzd, null);
        long j9 = this.zzb.zza().getLong(this.zzc, 0L);
        zzd();
        return (string == null || j9 <= 0) ? zzfj.zza : new Pair(string, Long.valueOf(j9));
    }

    @WorkerThread
    public final void zzb(String str, long j8) {
        this.zzb.zzg();
        if (zzc() == 0) {
            zzd();
        }
        if (str == null) {
            str = "";
        }
        long j9 = this.zzb.zza().getLong(this.zzc, 0L);
        if (j9 <= 0) {
            SharedPreferences.Editor edit = this.zzb.zza().edit();
            edit.putString(this.zzd, str);
            edit.putLong(this.zzc, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.zzb.zzt.zzv().zzG().nextLong() & Long.MAX_VALUE;
        long j10 = j9 + 1;
        long j11 = Long.MAX_VALUE / j10;
        SharedPreferences.Editor edit2 = this.zzb.zza().edit();
        if (nextLong < j11) {
            edit2.putString(this.zzd, str);
        }
        edit2.putLong(this.zzc, j10);
        edit2.apply();
    }
}
