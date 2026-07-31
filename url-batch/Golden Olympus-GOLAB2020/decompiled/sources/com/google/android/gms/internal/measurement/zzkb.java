package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes.dex */
final class zzkb extends zzki {
    zzkb(zzkf zzkfVar, String str, Long l4, boolean z4) {
        super(zzkfVar, str, l4, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid long value for " + this.zzb + ": " + obj.toString());
        return null;
    }
}
