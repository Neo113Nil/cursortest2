package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzhn {
    final /* synthetic */ zzht zza;
    private final String zzb;
    private final boolean zzc;
    private boolean zzd;
    private boolean zze;

    public zzhn(zzht zzhtVar, String str, boolean z4) {
        this.zza = zzhtVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = z4;
    }

    public final void zza(boolean z4) {
        SharedPreferences.Editor edit = this.zza.zzb().edit();
        edit.putBoolean(this.zzb, z4);
        edit.apply();
        this.zze = z4;
    }

    public final boolean zzb() {
        if (!this.zzd) {
            this.zzd = true;
            zzht zzhtVar = this.zza;
            this.zze = zzhtVar.zzb().getBoolean(this.zzb, this.zzc);
        }
        return this.zze;
    }
}
