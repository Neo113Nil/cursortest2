package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbyx {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzbzs zzd;

    private zzbyx() {
    }

    /* synthetic */ zzbyx(zzbyw zzbywVar) {
    }

    public final zzbyx zza(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzbyx zzb(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzbyx zzc(Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }

    public final zzbyx zzd(zzbzs zzbzsVar) {
        this.zzd = zzbzsVar;
        return this;
    }

    public final zzbzt zze() {
        zzhdx.zzc(this.zza, Context.class);
        zzhdx.zzc(this.zzb, Clock.class);
        zzhdx.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzhdx.zzc(this.zzd, zzbzs.class);
        return new zzbyz(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
