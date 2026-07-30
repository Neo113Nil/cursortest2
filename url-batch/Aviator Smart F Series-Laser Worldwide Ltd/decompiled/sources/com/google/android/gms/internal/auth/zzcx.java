package com.google.android.gms.internal.auth;

import android.util.Log;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzcx extends zzdc {
    zzcx(zzcz zzczVar, String str, Double d8, boolean z7) {
        super(zzczVar, str, d8, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    @Nullable
    final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid double value for " + super.zzc() + ": " + ((String) obj));
            return null;
        }
    }
}
