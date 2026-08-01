package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcmc implements zzfbz {
    private final zzckm zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    /* synthetic */ zzcmc(zzckm zzckmVar, zzcmb zzcmbVar) {
        this.zza = zzckmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfbz
    public final /* synthetic */ zzfbz zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzqVar.getClass();
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbz
    public final /* synthetic */ zzfbz zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbz
    public final /* synthetic */ zzfbz zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbz
    public final zzfca zzd() {
        zzhdx.zzc(this.zzb, Context.class);
        zzhdx.zzc(this.zzc, String.class);
        zzhdx.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzcme(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
