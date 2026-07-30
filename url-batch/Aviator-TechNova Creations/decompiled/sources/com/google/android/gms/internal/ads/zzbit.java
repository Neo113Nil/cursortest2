package com.google.android.gms.internal.ads;

import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import com.facebook.AuthenticationTokenClaims;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbit {
    public static final zzbio zza = zzbio.zzb("gads:app_permissions_caching_expiry_ms:expiry", 60000);
    public static final zzbio zzb = zzbio.zzb("gads:audio_caching_expiry_ms:expiry", 5000);
    public static final zzbio zzc = zzbio.zzb("gads:battery_caching_expiry_ms:expiry", WorkRequest.MIN_BACKOFF_MILLIS);
    public static final zzbio zzd = zzbio.zzb("gads:device_info_caching_expiry_ms:expiry", PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
    public static final zzbio zze = zzbio.zzb("gads:hsdp_caching_expiry_ms:expiry", AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED);
    public static final zzbio zzf = zzbio.zzb("gads:memory_caching_expiry_ms:expiry", 5000);
    public static final zzbio zzg = zzbio.zzb("gads:sdk_environment_caching_expiry_ms:expiry", AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED);
    public static final zzbio zzh = zzbio.zzb("gads:telephony_caching_expiry_ms:expiry", 5000);
}
