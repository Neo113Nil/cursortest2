package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgpm extends zzgok {
    final /* synthetic */ zzgpo zza;
    private final zzgpt zzb;

    zzgpm(zzgpo zzgpoVar, zzgpt zzgptVar) {
        Objects.requireNonNull(zzgpoVar);
        this.zza = zzgpoVar;
        this.zzb = zzgptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgol
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i2 = bundle.getInt("uiMode", 0);
        zzgpr zzd = zzgps.zzd();
        zzd.zza(i);
        if (string != null) {
            zzd.zzb(string);
        }
        zzd.zzc(i2);
        this.zzb.zza(zzd.zzd());
        if (i == 8157) {
            this.zza.zzd();
        }
    }
}
