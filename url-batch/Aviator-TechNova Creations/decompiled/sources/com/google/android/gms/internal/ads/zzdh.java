package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdh {
    private static Executor zza;

    public static synchronized Executor zza() {
        Executor executor;
        synchronized (zzdh.class) {
            if (zza == null) {
                zza = zzfj.zzf("ExoPlayer:BackgroundExecutor");
            }
            executor = zza;
        }
        return executor;
    }
}
