package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgw implements zzgp {
    private final Context zza;
    private final zzgp zzb;

    public zzgw(Context context) {
        zzgy zzgyVar = new zzgy();
        this.zza = context.getApplicationContext();
        this.zzb = zzgyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgp
    public final /* bridge */ /* synthetic */ zzgq zza() {
        return new zzgx(this.zza, ((zzgy) this.zzb).zza());
    }
}
