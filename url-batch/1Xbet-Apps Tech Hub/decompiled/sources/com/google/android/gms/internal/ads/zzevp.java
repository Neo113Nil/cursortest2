package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzevp implements zzeux {
    final String zza;
    final int zzb;

    /* synthetic */ zzevp(String str, int i, zzevo zzevoVar) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjJ)).booleanValue()) {
            if (!TextUtils.isEmpty(this.zza)) {
                bundle.putString("topics", this.zza);
            }
            int i = this.zzb;
            if (i != -1) {
                bundle.putInt("atps", i);
            }
        }
    }
}
