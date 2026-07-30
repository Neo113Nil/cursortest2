package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzpq {
    public static final zzpq zza;
    public final String zzb;
    private final zzpp zzc;

    static {
        new zzpq("");
        zza = new zzpq("preload");
    }

    public zzpq(String str) {
        this.zzb = str;
        this.zzc = Build.VERSION.SDK_INT >= 31 ? new zzpp() : null;
    }

    public final synchronized LogSessionId zza() {
        zzpp zzppVar;
        zzppVar = this.zzc;
        if (zzppVar == null) {
            throw null;
        }
        zzpp zzppVar2 = zzppVar;
        return zzppVar.zza;
    }

    public final synchronized void zzb(LogSessionId logSessionId) {
        zzpp zzppVar = this.zzc;
        if (zzppVar == null) {
            throw null;
        }
        zzpp zzppVar2 = zzppVar;
        zzgrc.zzi(zzppVar.zza.equals(LogSessionId.LOG_SESSION_ID_NONE));
        zzppVar.zza = logSessionId;
    }
}
