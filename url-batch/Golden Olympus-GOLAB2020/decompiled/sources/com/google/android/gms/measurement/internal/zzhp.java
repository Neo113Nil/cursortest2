package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzhp {
    final /* synthetic */ zzht zza;
    private final String zzb;
    private final long zzc;
    private boolean zzd;
    private long zze;

    public zzhp(zzht zzhtVar, String str, long j4) {
        this.zza = zzhtVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = j4;
    }

    public final long zza() {
        if (!this.zzd) {
            this.zzd = true;
            zzht zzhtVar = this.zza;
            this.zze = zzhtVar.zzb().getLong(this.zzb, this.zzc);
        }
        return this.zze;
    }

    public final void zzb(long j4) {
        SharedPreferences.Editor edit = this.zza.zzb().edit();
        edit.putLong(this.zzb, j4);
        edit.apply();
        this.zze = j4;
    }
}
