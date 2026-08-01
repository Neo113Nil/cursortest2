package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzejo {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;
    final Integer zze;

    zzejo(String str, String str2, int i, long j, Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = j;
        this.zze = num;
    }

    public final String toString() {
        String str = this.zza + "." + this.zzc + "." + this.zzd;
        if (!TextUtils.isEmpty(this.zzb)) {
            str = str + "." + this.zzb;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbA)).booleanValue() || this.zze == null || TextUtils.isEmpty(this.zzb)) {
            return str;
        }
        return str + "." + this.zze;
    }
}
