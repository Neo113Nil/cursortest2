package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzub {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private zzfz zzc;

    public zzub(zzada zzadaVar, zzajt zzajtVar) {
    }

    public final void zza(zzfz zzfzVar) {
        if (zzfzVar != this.zzc) {
            this.zzc = zzfzVar;
            this.zza.clear();
            this.zzb.clear();
        }
    }
}
