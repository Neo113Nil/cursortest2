package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfle {
    private boolean zza;

    final void zza(Context context) {
        zzfmv.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfme.zzb().zzd(context);
        zzflw.zza().zzd(context);
        zzfmp.zzb(context);
        zzfmq.zzd(context);
        zzfmt.zza(context);
        zzfmb.zzb().zzc(context);
        zzflv.zza().zzd(context);
    }

    final boolean zzb() {
        return this.zza;
    }
}
