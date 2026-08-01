package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzsp {
    public static void zza(zzsi zzsiVar, zzov zzovVar) {
        LogSessionId zza = zzovVar.zza();
        if (zza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        zzsiVar.zzb.setString("log-session-id", zza.getStringId());
    }
}
