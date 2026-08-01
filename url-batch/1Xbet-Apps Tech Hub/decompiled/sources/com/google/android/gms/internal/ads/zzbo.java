package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbo {
    public final Uri zzc = null;
    public final String zzd = null;
    public static final zzbo zza = new zzbo(new zzbn());
    private static final String zze = Integer.toString(0, 36);
    private static final String zzf = Integer.toString(1, 36);
    private static final String zzg = Integer.toString(2, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzbm
    };

    private zzbo(zzbn zzbnVar) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbo)) {
            return false;
        }
        zzbo zzboVar = (zzbo) obj;
        Uri uri = zzboVar.zzc;
        if (zzfs.zzF(null, null)) {
            String str = zzboVar.zzd;
            if (zzfs.zzF(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}
