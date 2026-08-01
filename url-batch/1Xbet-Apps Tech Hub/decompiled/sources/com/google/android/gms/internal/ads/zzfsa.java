package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfsa extends zzfsm {
    final /* synthetic */ zzfsb zza;
    private final zzfsg zzb;

    zzfsa(zzfsb zzfsbVar, zzfsg zzfsgVar) {
        this.zza = zzfsbVar;
        this.zzb = zzfsgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsn
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfse zzc = zzfsf.zzc();
        zzc.zzb(i);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i == 8157) {
            this.zza.zzc();
        }
    }
}
