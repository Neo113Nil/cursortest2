package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaf {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzaf zza(int i) {
        zzef.zzf(!this.zzb);
        this.zza.append(i, true);
        return this;
    }

    public final zzah zzb() {
        zzef.zzf(!this.zzb);
        this.zzb = true;
        return new zzah(this.zza, null);
    }
}
