package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcls implements zzduy {
    private final zzckm zza;
    private Context zzb;
    private zzblb zzc;

    /* synthetic */ zzcls(zzckm zzckmVar, zzclr zzclrVar) {
        this.zza = zzckmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzduy
    public final /* synthetic */ zzduy zza(zzblb zzblbVar) {
        zzblbVar.getClass();
        this.zzc = zzblbVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzduy
    public final /* synthetic */ zzduy zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzduy
    public final zzduz zzc() {
        zzhdx.zzc(this.zzb, Context.class);
        zzhdx.zzc(this.zzc, zzblb.class);
        return new zzclu(this.zza, this.zzb, this.zzc, null);
    }
}
