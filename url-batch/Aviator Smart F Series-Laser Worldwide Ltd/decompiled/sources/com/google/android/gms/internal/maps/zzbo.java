package com.google.android.gms.internal.maps;

import java.util.Objects;

/* loaded from: classes3.dex */
final class zzbo extends zzbi {
    static final zzbi zza = new zzbo(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzbo(Object[] objArr, int i8) {
        this.zzb = objArr;
        this.zzc = i8;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        zzba.zza(i8, this.zzc, "index");
        Object obj = this.zzb[i8];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.maps.zzbi, com.google.android.gms.internal.maps.zzbf
    final int zza(Object[] objArr, int i8) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    final Object[] zze() {
        return this.zzb;
    }
}
