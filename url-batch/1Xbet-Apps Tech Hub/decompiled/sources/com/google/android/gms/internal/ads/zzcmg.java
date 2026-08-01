package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcmg implements zzfdn {
    private final zzckm zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcmg(zzckm zzckmVar, zzcmf zzcmfVar) {
        this.zza = zzckmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdn
    public final /* synthetic */ zzfdn zza(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfdn
    public final /* synthetic */ zzfdn zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfdn
    public final zzfdo zzc() {
        zzhdx.zzc(this.zzb, Context.class);
        return new zzcmi(this.zza, this.zzb, this.zzc, null);
    }
}
