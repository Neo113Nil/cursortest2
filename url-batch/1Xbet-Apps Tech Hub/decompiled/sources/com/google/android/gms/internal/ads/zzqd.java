package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzqd {
    private Boolean zza;

    public zzqd() {
    }

    public zzqd(Context context) {
    }

    public final zzpa zza(zzam zzamVar, zzk zzkVar) {
        zzamVar.getClass();
        zzkVar.getClass();
        if (zzfs.zza < 29 || zzamVar.zzA == -1) {
            return zzpa.zza;
        }
        Boolean bool = this.zza;
        if (bool != null) {
            bool.booleanValue();
        } else {
            Boolean bool2 = false;
            this.zza = bool2;
            bool2.booleanValue();
        }
        String str = zzamVar.zzm;
        str.getClass();
        int zza = zzce.zza(str, zzamVar.zzj);
        if (zza == 0 || zzfs.zza < zzfs.zzf(zza)) {
            return zzpa.zza;
        }
        int zzg = zzfs.zzg(zzamVar.zzz);
        if (zzg == 0) {
            return zzpa.zza;
        }
        try {
            AudioFormat zzv = zzfs.zzv(zzamVar.zzA, zzg, zza);
            return zzfs.zza >= 31 ? zzqc.zza(zzv, zzkVar.zza().zza, false) : zzqb.zza(zzv, zzkVar.zza().zza, false);
        } catch (IllegalArgumentException unused) {
            return zzpa.zza;
        }
    }
}
