package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdn {
    private final zzfwu zzd;
    public static final zzdn zza = new zzdn(zzfwu.zzl());
    private static final String zzc = Integer.toString(0, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzdk
    };

    public zzdn(List list) {
        this.zzd = zzfwu.zzj(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzd.equals(((zzdn) obj).zzd);
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final zzfwu zza() {
        return this.zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzb(int i) {
        for (int i2 = 0; i2 < this.zzd.size(); i2++) {
            zzdm zzdmVar = (zzdm) this.zzd.get(i2);
            if (zzdmVar.zzc() && zzdmVar.zza() == i) {
                return true;
            }
        }
        return false;
    }
}
