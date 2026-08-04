package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbxm {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzbxr zzd;

    private zzbxm() {
        throw null;
    }

    /* synthetic */ zzbxm(byte[] bArr) {
    }

    public final zzbxm zzc(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzbxm zzd(zzbxr zzbxrVar) {
        this.zzd = zzbxrVar;
        return this;
    }

    public final zzbxs zze() {
        zzhqf.zzc(this.zza, Context.class);
        zzhqf.zzc(this.zzb, Clock.class);
        zzhqf.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzhqf.zzc(this.zzd, zzbxr.class);
        return new zzbxn(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final zzbxm zza(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzbxm zzb(Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }
}
