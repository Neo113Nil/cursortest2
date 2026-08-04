package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzded {
    private final List zza;
    private final zzfjv zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private boolean zzd;

    public zzded(zzfcj zzfcjVar, zzfjv zzfjvVar) {
        this.zza = zzfcjVar.zzp;
        this.zzb = zzfjvVar;
        this.zzc = zzfcjVar.zzax;
    }

    public final void zza() {
        if (this.zzd) {
            return;
        }
        this.zzb.zza(this.zza, this.zzc);
        this.zzd = true;
    }
}
