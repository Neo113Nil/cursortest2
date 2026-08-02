package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzaz {
    public static final zzaz zza = new zzaz(new zzay());
    public final Uri zzb = null;
    public final String zzc = null;
    public final Bundle zzd = null;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    private zzaz(zzay zzayVar) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaz)) {
            return false;
        }
        zzaz zzazVar = (zzaz) obj;
        Uri uri = zzazVar.zzb;
        if (zzet.zzG(null, null)) {
            String str = zzazVar.zzc;
            if (zzet.zzG(null, null)) {
                Bundle bundle = zzazVar.zzd;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}
