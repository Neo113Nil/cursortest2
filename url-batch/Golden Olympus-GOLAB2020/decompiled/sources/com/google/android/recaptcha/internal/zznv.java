package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes.dex */
final class zznv {
    zznv() {
    }

    public static final List zza(Object obj, long j4) {
        zznk zznkVar = (zznk) zzps.zzf(obj, j4);
        if (zznkVar.zzc()) {
            return zznkVar;
        }
        int size = zznkVar.size();
        zznk zzd = zznkVar.zzd(size == 0 ? 10 : size + size);
        zzps.zzs(obj, j4, zzd);
        return zzd;
    }
}
