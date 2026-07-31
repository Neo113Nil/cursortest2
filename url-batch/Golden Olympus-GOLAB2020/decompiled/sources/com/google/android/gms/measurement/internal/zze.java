package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class zze {
    private final zzju zza;

    zze(zzju zzjuVar) {
        this.zza = zzjuVar;
    }

    static zze zza(String str) {
        return new zze((TextUtils.isEmpty(str) || str.length() > 1) ? zzju.UNINITIALIZED : zzjx.zzg(str.charAt(0)));
    }

    final zzju zzb() {
        return this.zza;
    }

    final String zzc() {
        return String.valueOf(zzjx.zza(this.zza));
    }
}
