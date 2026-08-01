package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzov {
    public static final zzov zza;
    private final zzou zzb;

    static {
        zza = zzfs.zza < 31 ? new zzov() : new zzov(zzou.zza);
    }

    public zzov() {
        zzef.zzf(zzfs.zza < 31);
        this.zzb = null;
    }

    private zzov(zzou zzouVar) {
        this.zzb = zzouVar;
    }

    public final LogSessionId zza() {
        zzou zzouVar = this.zzb;
        zzouVar.getClass();
        return zzouVar.zzb;
    }

    public zzov(LogSessionId logSessionId) {
        this.zzb = new zzou(logSessionId);
    }
}
