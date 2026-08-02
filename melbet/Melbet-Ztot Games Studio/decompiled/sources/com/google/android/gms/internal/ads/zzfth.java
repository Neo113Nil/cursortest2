package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzfth extends zzfsk {
    final /* synthetic */ zzfti zza;
    private final zzftn zzb;

    zzfth(zzfti zzftiVar, zzftn zzftnVar) {
        this.zza = zzftiVar;
        this.zzb = zzftnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzftl zzc = zzftm.zzc();
        zzc.zzb(i);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i == 8157) {
            this.zza.zza();
        }
    }
}
