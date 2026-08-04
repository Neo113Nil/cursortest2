package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzgfi extends zzgeg {
    final /* synthetic */ zzgfk zza;
    private final zzgfp zzb;

    zzgfi(zzgfk zzgfkVar, zzgfp zzgfpVar) {
        Objects.requireNonNull(zzgfkVar);
        this.zza = zzgfkVar;
        this.zzb = zzgfpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i2 = bundle.getInt("uiMode", 0);
        zzgfn zzd = zzgfo.zzd();
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
