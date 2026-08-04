package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzr {
    private final SparseBooleanArray zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzr) {
            return this.zza.equals(((zzr) obj).zza);
        }
        return false;
    }

    public final boolean zza(int i) {
        return this.zza.get(i);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final int zzc(int i) {
        SparseBooleanArray sparseBooleanArray = this.zza;
        zzghc.zzm(i, sparseBooleanArray.size(), "index");
        return sparseBooleanArray.keyAt(i);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }
}
