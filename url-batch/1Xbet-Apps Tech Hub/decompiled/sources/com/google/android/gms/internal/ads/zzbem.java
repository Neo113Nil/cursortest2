package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbem {
    public static final zzbeh zza = zzbei.zzf("gads:consent:gmscore:dsid:enabled", true);
    public static final zzbeh zzb = zzbei.zzf("gads:consent:gmscore:lat:enabled", true);
    public static final zzbeh zzc = new zzbei("gads:consent:gmscore:backend_url", "https://adservice.google.com/getconfig/pubvendors", 4);
    public static final zzbeh zzd = new zzbei("gads:consent:gmscore:time_out", Long.valueOf(WorkRequest.MIN_BACKOFF_MILLIS), 2);
    public static final zzbeh zze = zzbei.zzf("gads:consent:gmscore:enabled", true);
}
