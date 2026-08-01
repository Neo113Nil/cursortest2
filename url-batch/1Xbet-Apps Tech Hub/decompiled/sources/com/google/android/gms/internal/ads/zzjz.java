package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzjz {
    public static zzov zza(Context context, zzki zzkiVar, boolean z) {
        zzor zzb = zzor.zzb(context);
        if (zzb == null) {
            zzez.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zzov(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            zzkiVar.zzz(zzb);
        }
        return new zzov(zzb.zza());
    }
}
