package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcku implements zzeyu {
    private final zzckm zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcku(zzckm zzckmVar, zzckt zzcktVar) {
        this.zza = zzckmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeyu
    public final /* synthetic */ zzeyu zza(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyu
    public final /* synthetic */ zzeyu zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyu
    public final zzeyv zzc() {
        zzhdx.zzc(this.zzb, Context.class);
        zzhdx.zzc(this.zzc, String.class);
        return new zzckw(this.zza, this.zzb, this.zzc, null);
    }
}
