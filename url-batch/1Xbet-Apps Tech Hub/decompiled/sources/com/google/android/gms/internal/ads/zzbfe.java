package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbfe {
    public static final zzbeh zza = zzbeh.zzb("gads:dynamite_load:fail:sample_rate", WorkRequest.MIN_BACKOFF_MILLIS);
    public static final zzbeh zzb = zzbeh.zzd("gads:report_dynamite_crash_in_background_thread", false);
    public static final zzbeh zzc = zzbeh.zzc("gads:public_beta:traffic_multiplier", "1.0");
    public static final zzbeh zzd = zzbeh.zzc("gads:sdk_crash_report_class_prefix", "com.google.");
    public static final zzbeh zze = zzbeh.zzd("gads:sdk_crash_report_enabled", false);
    public static final zzbeh zzf = zzbeh.zzd("gads:sdk_crash_report_full_stacktrace", false);
    public static final zzbeh zzg = zzbeh.zza("gads:trapped_exception_sample_rate", 0.01d);
}
