package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbjs {
    public static final zzbio zza;

    static {
        zzbio.zzb("gads:ad_loader:timeout_ms", 60000L);
        zza = zzbio.zzb("gads:rendering:timeout_ms", 60000L);
        zzbio.zzb("gads:resolve_future:default_timeout_ms", WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
    }
}
