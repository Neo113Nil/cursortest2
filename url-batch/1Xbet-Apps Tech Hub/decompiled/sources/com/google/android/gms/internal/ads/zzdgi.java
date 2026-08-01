package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdgi {
    private final List zza;
    private final zzfla zzb;
    private boolean zzc;

    public zzdgi(zzfdu zzfduVar, zzfla zzflaVar) {
        this.zza = zzfduVar.zzq;
        this.zzb = zzflaVar;
    }

    public final void zza() {
        if (this.zzc) {
            return;
        }
        this.zzb.zzd(this.zza);
        this.zzc = true;
    }
}
