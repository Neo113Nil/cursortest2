package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcle implements zzfai {
    private final zzckm zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    /* synthetic */ zzcle(zzckm zzckmVar, zzcld zzcldVar) {
        this.zza = zzckmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfai
    public final /* synthetic */ zzfai zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzqVar.getClass();
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfai
    public final /* synthetic */ zzfai zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfai
    public final /* synthetic */ zzfai zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfai
    public final zzfaj zzd() {
        zzhdx.zzc(this.zzb, Context.class);
        zzhdx.zzc(this.zzc, String.class);
        zzhdx.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzclg(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
