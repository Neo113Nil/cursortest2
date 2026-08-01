package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcbs;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzca extends zzb {
    private final zzcbs zza;
    private final String zzb;

    public zzca(Context context, String str, String str2) {
        this.zza = new zzcbs(com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str));
        this.zzb = str2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        this.zza.zza(this.zzb);
    }
}
