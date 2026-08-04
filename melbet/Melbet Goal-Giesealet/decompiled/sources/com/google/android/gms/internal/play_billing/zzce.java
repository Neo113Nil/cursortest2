package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@8.0.0 */
/* loaded from: classes2.dex */
final class zzce extends zzbt {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzce(Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbg.zza(i, this.zzc, "index");
        return Objects.requireNonNull(this.zza[i + i + this.zzb]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    final boolean zzf() {
        return true;
    }
}
