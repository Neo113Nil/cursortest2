package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbew {
    public static final zzbds zza;

    static {
        zzbds.zzb("gads:ad_loader:timeout_ms", 60000L);
        zza = zzbds.zzb("gads:rendering:timeout_ms", 60000L);
        zzbds.zzb("gads:resolve_future:default_timeout_ms", WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
    }
}
