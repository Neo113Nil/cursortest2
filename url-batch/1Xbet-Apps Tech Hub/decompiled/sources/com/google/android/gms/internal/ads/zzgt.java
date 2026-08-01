package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgt {
    private Uri zza;
    private Map zzb = Collections.emptyMap();
    private long zzc;
    private int zzd;

    public final zzgt zza(int i) {
        this.zzd = 6;
        return this;
    }

    public final zzgt zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzgt zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final zzgt zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzgv zze() {
        if (this.zza != null) {
            return new zzgv(this.zza, this.zzb, this.zzc, this.zzd);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
