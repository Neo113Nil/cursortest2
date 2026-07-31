package com.google.android.gms.internal.auth;

import android.util.Log;

/* loaded from: classes.dex */
final class zzcx extends zzdc {
    zzcx(zzcz zzczVar, String str, Double d4, boolean z4) {
        super(zzczVar, str, d4, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid double value for " + super.zzc() + ": " + ((String) obj));
            return null;
        }
    }
}
