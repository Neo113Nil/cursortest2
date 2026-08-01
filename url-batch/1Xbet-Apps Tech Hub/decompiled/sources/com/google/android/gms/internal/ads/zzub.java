package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzub {
    private static final AtomicLong zzd = new AtomicLong();
    public final zzgv zza;
    public final Uri zzb;
    public final Map zzc;

    public zzub(long j, zzgv zzgvVar, Uri uri, Map map, long j2, long j3, long j4) {
        this.zza = zzgvVar;
        this.zzb = uri;
        this.zzc = map;
    }

    public static long zza() {
        return zzd.getAndIncrement();
    }
}
