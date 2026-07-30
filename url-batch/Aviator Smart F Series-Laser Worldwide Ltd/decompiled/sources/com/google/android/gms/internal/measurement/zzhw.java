package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzhw extends zzib {
    zzhw(zzhy zzhyVar, String str, Double d8, boolean z7) {
        super(zzhyVar, "measurement.test.double_flag", d8, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    @Nullable
    final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid double value for " + this.zzb + ": " + ((String) obj));
            return null;
        }
    }
}
