package com.google.android.gms.internal.auth;

import android.util.Log;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzcv extends zzdc {
    zzcv(zzcz zzczVar, String str, Long l8, boolean z7) {
        super(zzczVar, str, l8, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    @Nullable
    final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid long value for " + super.zzc() + ": " + ((String) obj));
            return null;
        }
    }
}
